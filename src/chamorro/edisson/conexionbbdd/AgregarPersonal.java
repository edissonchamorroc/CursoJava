package chamorro.edisson.conexionbbdd;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AgregarPersonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco ventana = new Marco();
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class Marco extends JFrame{
	
	public Marco() {
		setBounds(200,100,500,500);
		
		add(new Lamina());
		
		setVisible(true);
		
	}
}

class Lamina extends JPanel{
	
	public JPanel datosEntrada = new JPanel();
	public JPanel datosSalida = new JPanel();
	public JPanel botones = new JPanel();
	
	
	public JButton crearTabla= new JButton("Crear tabla");
	public JButton eliminarTabla= new JButton("eliminar tabla");
	public JButton agregarUsuario= new JButton("Agregar");
	public JButton borrarUsuario= new JButton("Borrar");
	
	
	public JTextField nombre= new JTextField(20);
	public JTextField apellido= new JTextField(20);
	public JTextField email= new JTextField(20);
	
	
	public JLabel labelNombre= new JLabel("Nombre");
	public JLabel labelApellido= new JLabel("Apellido");
	public JLabel labelEmail= new JLabel("Email");
	public JLabel labelNameEnBD = new JLabel("Nombre");
	public JLabel labelApellidoEnBD = new JLabel("Apellido");
	public JLabel labelEmailEnBD = new JLabel("Email");
	public JTextArea nameEnBD= new JTextArea();
	public JTextArea apellidoEnBD= new JTextArea();
	public JTextArea emailEnBD= new JTextArea();
	public conexionOracle ddBB = new conexionOracle();;
	
	public Lamina() {
		ddBB.conectar();
		setLayout(new BorderLayout());
		datosEntrada.setLayout(new GridLayout(4,2));
		datosSalida.setLayout(new GridLayout(2,3));
		botones.setLayout(new GridLayout(1,2));
		
		addJLabel(datosEntrada,labelNombre);
		addJText(datosEntrada,nombre);
		addJLabel(datosEntrada,labelApellido);
		addJText(datosEntrada,apellido);
		addJLabel(datosEntrada,labelEmail);		
		addJText(datosEntrada,email);
		
		addJLabel(datosSalida,labelNameEnBD);
		addJLabel(datosSalida,labelApellidoEnBD);
		addJLabel(datosSalida,labelEmailEnBD);
		addJArea(datosSalida,nameEnBD);
		addJArea(datosSalida,apellidoEnBD);
		addJArea(datosSalida,emailEnBD);
		
		addButton(agregarUsuario);
		addButton(borrarUsuario);

		crearTabla.addActionListener(new eventosBBDD());
		eliminarTabla.addActionListener(new eventosBBDD());
		
		add(datosEntrada,BorderLayout.NORTH);
		add(crearTabla,BorderLayout.WEST);
		add(eliminarTabla,BorderLayout.EAST);
		add(datosSalida,BorderLayout.CENTER);
		add(botones,BorderLayout.SOUTH);
		
		
	}
	private void addJArea(JPanel panel,JTextArea area) {
		panel.add(area);
		panel.setBorder(getBorder());
	}
		
	private void addButton(JButton boton) {
		
		boton.addActionListener(new eventosBBDD());
		botones.add(boton);
		
	}
	private void addJLabel(JPanel panel,JLabel label) {
		
		panel.add(label);
	}
	private void addJText(JPanel panel,JTextField field) {
				
		panel.add(field);
	}
	private class eventosBBDD implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==crearTabla) {
				ddBB.crearTabla();
			}else if(e.getSource()==eliminarTabla){
				ddBB.borrarTabla();
			}
			else if(e.getSource()==agregarUsuario){
				ddBB.agregarUser(nombre.getText(), apellido.getText(), email.getText());
				nameEnBD.setText(ddBB.nombreUsuario(apellido.getText()));

			}
			else if(e.getSource()==borrarUsuario) {
				ddBB.borrarUsuario(email.getText());
			}
		}
		
	}
	
}
