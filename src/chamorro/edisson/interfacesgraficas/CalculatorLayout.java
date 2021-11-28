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

		setBounds(500, 300, 400, 350);

		add(new PanelCalculator());

		setVisible(true);
	}
}

class PanelCalculator extends JPanel {

	private JPanel numeration = new JPanel();

	private JButton display;

	private boolean start = false;

	private String operation;
	private String operationSaved="";

	private double firstNumber;

	private double result;

	public PanelCalculator() {

		start = true;

		setLayout(new BorderLayout());

		numeration.setLayout(new GridLayout(4, 4));

		display = new JButton("0");

		display.setEnabled(false);

		add(display, BorderLayout.NORTH);

		textIntoDisplay addToDisplay = new textIntoDisplay();

		Operation addOperation = new Operation();

		addButtton("7", addToDisplay);
		addButtton("8", addToDisplay);
		addButtton("9", addToDisplay);
		addOperation("X", addOperation);
		addButtton("4", addToDisplay);
		addButtton("5", addToDisplay);
		addButtton("6", addToDisplay);
		addOperation("-", addOperation);
		addButtton("1", addToDisplay);
		addButtton("2", addToDisplay);
		addButtton("3", addToDisplay);
		addOperation("+", addOperation);
		addButtton("0", addToDisplay);
		addButtton(".", addToDisplay);
		addOperation("=", addOperation);
		addOperation("/", addOperation);

		add(numeration, BorderLayout.CENTER);

	}

	private void addButtton(String nombre, textIntoDisplay oyente) {

		JButton boton = new JButton(nombre);

		boton.addActionListener(oyente);

		numeration.add(boton);

	}

	private void addOperation(String operation, Operation oyente) {

		JButton boton = new JButton(operation);

		boton.addActionListener(oyente);

		numeration.add(boton);

	}

	private class textIntoDisplay implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String input = e.getActionCommand();

			if (start) {
				display.setText(input);

				start = false;
			} else {

				display.setText(display.getText() + input);
			}

			firstNumber = Double.parseDouble(display.getText());

		}

	}

	private class Operation implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			operation = e.getActionCommand();
						
			if (operation!="=") {

				result = firstNumber;

				display.setText("" + result);

				start = true;
				
				operationSaved=operation;

			}

			if (operation.equalsIgnoreCase("="))

			{

				if (operationSaved.equalsIgnoreCase("+")) {
					result += firstNumber;
					display.setText("" + result);
				} else if (operationSaved.equalsIgnoreCase("-")) {
					result -= firstNumber;
					display.setText("" + result);
				} else if (operationSaved.equalsIgnoreCase("X")) {
					result *= firstNumber;
					display.setText("" + result);
				} else if (operationSaved.equalsIgnoreCase("/")) {
					if (firstNumber != 0.0) {
						result/=firstNumber;
						display.setText("" + result);
					}
					else {
						display.setText("Error");
					}
					
				}

				start = true;
			}

		}

	}
}
