package chamorro.edisson.interfacesgraficas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculatorLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorFrame frame = new CalculatorFrame();

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}

class CalculatorFrame extends JFrame {

	public CalculatorFrame() {

		setTitle("Calculadora");

		setBounds(500, 300, 300, 350);

		add(new PanelCalculator());

		setVisible(true);
	}
}

class PanelCalculator extends JPanel {
	
	private JPanel numeracion = new JPanel();
	
	private JButton display;
	
	private boolean start=false;

	public PanelCalculator() {
		
		start=true;
		
		setLayout(new BorderLayout());

		display = new JButton("0");

		display.setEnabled(false);

		add(display, BorderLayout.NORTH);
		
		InsertarNumero addToDisplay = new InsertarNumero();

		ponerBoton("7",addToDisplay);
		ponerBoton("8",addToDisplay);
		ponerBoton("9",addToDisplay);
		ponerBoton("X",addToDisplay);
		ponerBoton("4",addToDisplay);
		ponerBoton("5",addToDisplay);
		ponerBoton("6",addToDisplay);
		ponerBoton("-",addToDisplay);
		ponerBoton("1",addToDisplay);
		ponerBoton("2",addToDisplay);
		ponerBoton("3",addToDisplay);
		ponerBoton("+",addToDisplay);
		ponerBoton("0",addToDisplay);
		ponerBoton(".",addToDisplay);
		ponerBoton("=",addToDisplay);
		
		add(numeracion, BorderLayout.CENTER);
		

	}

	private void ponerBoton(String nombre, InsertarNumero oyente) {
				
		numeracion.setLayout(new GridLayout(4,4));
		
		JButton boton = new JButton(nombre);
		
		boton.addActionListener(oyente);
		
		numeracion.add(boton);
		
		
	}
	

	private class InsertarNumero implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String entrada=e.getActionCommand();
		
		if(start) {
			display.setText(entrada);
			
			start=false;
		}
		else{
			display.setText(display.getText()+entrada);
		}
		
		
		
	}
	
}
}
