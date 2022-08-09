package chamorro.edisson.sockets;

import java.awt.BorderLayout;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AplicacionServidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoServidor marco = new MarcoServidor();
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoServidor extends JFrame implements Runnable {
	private JTextArea aCliente;
	private JPanel lamina;
	
	public MarcoServidor() {
		setBounds(200, 200, 300, 400);
		aCliente = new JTextArea(300, 400);
		lamina = new JPanel();
		lamina.setLayout(new BorderLayout());
		lamina.add(aCliente, BorderLayout.CENTER);
		add(lamina);
		setVisible(true);

		Thread hilo = new Thread(this);

		hilo.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			ServerSocket servidor = new ServerSocket(2005);// puerto a la escucha

			EnvioPaqueteDatos paqueteRecibido = new EnvioPaqueteDatos();
			
			List<String> ipOnline= new ArrayList<String>();

			while (true) {

				Socket socket = servidor.accept();// acepta conexiones que viajan por socket

				ObjectInputStream paqueteEntrada = new ObjectInputStream(socket.getInputStream());

				paqueteRecibido = (EnvioPaqueteDatos) paqueteEntrada.readObject();

				/*
				 * DataInputStream flujoEntrada = new DataInputStream(socket.getInputStream());
				 * 
				 * String entrada = flujoEntrada.readUTF();
				 * 
				 * aCliente.append("\n"+entrada);
				 */
				
				if (!paqueteRecibido.getTextoCliente().equals("Conectados")) {
					
					aCliente.append("\n" + paqueteRecibido.getNick() + " : " + paqueteRecibido.getTextoCliente() + " : "
							+ paqueteRecibido.getIp());

					Socket reenvioPuente = new Socket(paqueteRecibido.getIp(), 9090);

					ObjectOutputStream paqueteReenvio = new ObjectOutputStream(reenvioPuente.getOutputStream());

					paqueteReenvio.writeObject(paqueteRecibido.getTextoCliente());

					reenvioPuente.close();

					socket.close();

				} else {

					ipOnline.add(socket.getInetAddress().getHostAddress());
					
					paqueteRecibido.setIpConectados(ipOnline);
					System.out.println("---"+paqueteRecibido.getTextoCliente()+"--"+ipOnline.get(0));
					for (String e : ipOnline) {
						
						Socket reenvioPuente = new Socket(e,9090);
						System.out.println("--se creo socket con ip: "+e+" y puerto 9090");
						ObjectOutputStream paqueteReenvio = new ObjectOutputStream(reenvioPuente.getOutputStream());
						System.out.println("--se recibe crea stream de salida");
						paqueteReenvio.writeObject(paqueteRecibido.getTextoCliente());
						System.out.println("--se enviael stream de salida");
						reenvioPuente.close();

						socket.close();
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
