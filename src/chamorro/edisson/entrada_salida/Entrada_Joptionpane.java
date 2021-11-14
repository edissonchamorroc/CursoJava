package chamorro.edisson.entrada_salida;

import javax.swing.JOptionPane;
public class Entrada_Joptionpane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre=JOptionPane.showInputDialog(" Introduce tu nombre, por favor: ");
		int edad=Integer.parseInt(JOptionPane.showInputDialog(" Ingresa tu edad, por favor: "));
		System.out.println(" tu te llamas "+nombre+" y tienes "+edad);
	}

}
