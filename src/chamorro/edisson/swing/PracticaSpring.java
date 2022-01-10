package chamorro.edisson.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class PracticaSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSpring marco = new MarcoSpring();
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}


}
class MarcoSpring extends JFrame{
	
	public MarcoSpring() {
		
		setBounds(100,200,1000,350);
		
		add(new LaminaSpring());
		
		setVisible(true);
		
	}
}
class LaminaSpring extends JPanel{
	
	public LaminaSpring() {
		
		JButton boton1 = new JButton("Boton 1");
		JButton boton2 = new JButton("Boton 2");
		JButton boton3 = new JButton("Boton 3");
		
		SpringLayout miLayout = new SpringLayout();
		
		setLayout(miLayout);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		Spring muelle = Spring.constant(0,10,100);
		
		miLayout.putConstraint(SpringLayout.WEST, boton1, muelle,SpringLayout.WEST , this);
		
		miLayout.putConstraint(SpringLayout.WEST, boton2, muelle,SpringLayout.EAST , boton1);
		
		miLayout.putConstraint(SpringLayout.WEST, boton3, muelle,SpringLayout.EAST , boton2);
		
		miLayout.putConstraint(SpringLayout.EAST, this, muelle,SpringLayout.EAST , boton3);
	}
}