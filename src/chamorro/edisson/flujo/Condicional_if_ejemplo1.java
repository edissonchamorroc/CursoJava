package chamorro.edisson.flujo;

import javax.swing.JOptionPane;

public class Condicional_if_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad=Integer.parseInt(JOptionPane.showInputDialog(" Introduce tu edad, por favor: "));
		if(edad>=18){
			System.out.println(" Eres mayor de edad, pasa.");
		}
		else{
			System.out.println(" No eres mayor de edad, no pasa.");
		}
	}

}
