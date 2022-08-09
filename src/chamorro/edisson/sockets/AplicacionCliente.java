package chamorro.edisson.sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AplicacionCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCliente marco = new MarcoCliente();
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoCliente extends JFrame {

	public MarcoCliente() {
		setBounds(200, 200, 300, 400);
		add(new LaminaCliente());
		estableceConexionServidor();
		setVisible(true);
	}

	public void estableceConexionServidor() {
		try {
			Socket socket = new Socket("192.168.10.24", 2005);
			EnvioPaqueteDatos datos = new EnvioPaqueteDatos();
			datos.setTextoCliente("Conectados");
			ObjectOutputStream paqueteSalida = new ObjectOutputStream(socket.getOutputStream());
			paqueteSalida.writeObject(datos);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class LaminaCliente extends JPanel implements Runnable {

	private JLabel cliente, nick;
	private JTextField aCliente;
	private JComboBox ip;
	private JButton enviar;
	private JTextArea areaChat;
	private List<String> ipOnline = new ArrayList<String>();

	public LaminaCliente() {

		nick = new JLabel();
		nick.setText(JOptionPane.showInputDialog("Nick: "));
		add(nick);
		cliente = new JLabel(" Online ");
		aCliente = new JTextField(10);
		enviar = new JButton("Enviar");
		areaChat = new JTextArea(15, 25);

		enviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					Socket socket = new Socket("192.168.10.24", 2005);

					EnvioPaqueteDatos datos = new EnvioPaqueteDatos();

					datos.setIp(ip.getSelectedItem().toString());

					datos.setNick(nick.getText());

					datos.setTextoCliente(aCliente.getText());

					ObjectOutputStream paqueteSalida = new ObjectOutputStream(socket.getOutputStream());

					paqueteSalida.writeObject(datos);

					socket.close();

					/*
					 * DataOutputStream flujoSalida= new DataOutputStream(socket.getOutputStream());
					 * 
					 * flujoSalida.writeUTF(aCliente.getText());
					 * 
					 * socket.close();
					 */
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				Thread hilo = new Thread();
				hilo.start();
			}

		});

		ip = new JComboBox();

		add(cliente);
		add(ip);
		add(areaChat);
		add(aCliente);
		add(enviar);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			ServerSocket escucha = new ServerSocket(9090);

			Socket clienteEscucha;

			EnvioPaqueteDatos paqueteRecibido;

			while (true) {

				clienteEscucha = escucha.accept();

				ObjectInputStream paqueteEntrada = new ObjectInputStream(clienteEscucha.getInputStream());

				paqueteRecibido = (EnvioPaqueteDatos) paqueteEntrada.readObject();

				if (paqueteRecibido.getTextoCliente().equals("Conectados")) {
					System.out.println("Entra aqui mostrando . " + ipOnline);
					ipOnline = paqueteRecibido.getIpConectados();
					ip.removeAllItems();
					for (String e : ipOnline) {
						ip.addItem(e);
					}

				}
				clienteEscucha.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // puerto a la escucha
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class EnvioPaqueteDatos implements Serializable {

	private String nick, ip, textoCliente;
	private List<String> ipConectados;

	public List<String> getIpConectados() {
		return ipConectados;
	}

	public void setIpConectados(List<String> ipConectados) {
		this.ipConectados = ipConectados;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getTextoCliente() {
		return textoCliente;
	}

	public void setTextoCliente(String textoCliente) {
		this.textoCliente = textoCliente;
	}

}
