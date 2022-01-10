package chamorro.edisson.exceptions;

import javax.swing.JOptionPane;

public class VariasExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			division();
		}catch(ArithmeticException e) {
			System.out.println("Se intenta realizar division por cero");
		}catch(NumberFormatException e) {
			System.out.println("Se ha ingresado caracteres y no un numero");
		}
		
	}
	static void division() {
		
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		System.out.println("El resultado es : "+num1/num2);
	}

}
