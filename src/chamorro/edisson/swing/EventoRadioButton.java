package chamorro.edisson.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EventoRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRadioButton marco = new MarcoRadioButton();
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class MarcoRadioButton extends JFrame {

	public MarcoRadioButton() {
		setBounds(600, 300, 600, 400);
		add(new LaminaRadioButton());
		setVisible(true);
	}
}

class LaminaRadioButton extends JPanel{
	
	private JRadioButton boton1,boton2,boton3;
	private JLabel texto;
	
	
	public LaminaRadioButton() {
		
		ButtonGroup grupoBotones = new ButtonGroup();
		
		boton1= new JRadioButton("Masculino");
		boton2= new JRadioButton("Femenino");
		boton3= new JRadioButton("Prefiero no decirlo");
		grupoBotones.add(boton1);
		grupoBotones.add(boton2);
		grupoBotones.add(boton3);
		
		
		
		add(boton1);
		add(boton2);
		add(boton3);


		
	}
	private class ManejaRadioButton implements ActionListener{
		
		private int negrita_cursiva=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
		}
		
	}
}