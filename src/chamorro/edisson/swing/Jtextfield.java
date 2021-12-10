package chamorro.edisson.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.TreeExpansionListener;

import java.awt.event.*;

public class Jtextfield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCuadroTexto marco = new MarcoCuadroTexto();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCuadroTexto extends JFrame{
	
	public MarcoCuadroTexto() {
		setBounds(500,300,600,400);
		add(new LaminaCuadroTexto());
		setVisible(true);
	}
}

class LaminaCuadroTexto extends JPanel{
	
	JTextField cuadroTexto1;
	JTextField cuadroTexto2;
	public LaminaCuadroTexto() {
		
		cuadroTexto1 = new JTextField(20);
		cuadroTexto2 = new JTextField(20);
		
		add(cuadroTexto1);
		
		JButton boton = new JButton("Obtener texto");
		
		boton.addActionListener(new ObtenerTexto());
		
		add(boton);
		
		add(cuadroTexto2);
		
		
	}
	private class ObtenerTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cuadroTexto2.setText(cuadroTexto1.getText());
		}
		
	}
	
}