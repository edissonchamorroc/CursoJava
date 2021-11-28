package chamorro.edisson.interfacesgraficas;

import java.awt.BorderLayout;
import java.awt.GridLayout;

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
	
	public PanelCalculator() {
		
		setLayout(new BorderLayout());
		
		JButton display = new JButton("0");
		
		display.setEnabled(false);
		
		add(display,BorderLayout.NORTH);
		
		JPanel numeracion = new JPanel();
		
		numeracion.setLayout(new GridLayout(4,4));
		
		numeracion.add(new JButton("7"));
		numeracion.add(new JButton("8"));
		numeracion.add(new JButton("9"));
		numeracion.add(new JButton("X"));
		numeracion.add(new JButton("4"));
		numeracion.add(new JButton("5"));
		numeracion.add(new JButton("6"));
		numeracion.add(new JButton("-"));
		numeracion.add(new JButton("1"));
		numeracion.add(new JButton("2"));
		numeracion.add(new JButton("3"));
		numeracion.add(new JButton("+"));
		numeracion.add(new JButton("0"));
		numeracion.add(new JButton("."));
		numeracion.add(new JButton("="));
		numeracion.add(new JButton(""));
		
		add(numeracion,BorderLayout.CENTER);
		
	}

}
