package chamorro.edisson.ejercicios_inputouput;

import javax.swing.JOptionPane;

public class CalculoPotenciaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double base=Integer.parseInt(JOptionPane.showInputDialog(" Introduce la base: "));
		double exponente=Integer.parseInt(JOptionPane.showInputDialog(" Introduce el exponente: "));
		//System.out.println(" El resultado de "+Math.round(base)+" elevado a "+Math.round(exponente)+" es "+Math.pow(base,exponente));
		System.out.println(" El resultado es "+Math.pow(base,exponente));
	}

}
