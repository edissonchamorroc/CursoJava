package chamorro.edisson.swing;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
public class CompruebeEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPrincipal ejercicio = new MarcoPrincipal();
		ejercicio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoPrincipal extends JFrame{
	 
	public MarcoPrincipal() {
		
		setBounds(300,400,400,400);
		
		add(new LaminaPrincipal());
		
		setVisible(true);
	}
}

class LaminaPrincipal extends JPanel {
	
	JTextField cuadroEmail;
	JButton boton;
	JLabel etiqueta;
	
	public LaminaPrincipal() {
	
		setLayout(new GridLayout(3,0));
		
		cuadroEmail= new JTextField(20);
		
		add(cuadroEmail);
		
		boton= new JButton("Validar Email");
		
		boton.addActionListener(new VerificarEmail());
		
		add(boton);
		
		etiqueta=new JLabel("");
		
		add(etiqueta);
		
	}
	private class VerificarEmail implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(cuadroEmail.getText().contains("@")) {
				etiqueta.setText("Email correcto");
			}
			else {
				etiqueta.setText("Email incorrecto");
			}
		}
		
	}
	
}
