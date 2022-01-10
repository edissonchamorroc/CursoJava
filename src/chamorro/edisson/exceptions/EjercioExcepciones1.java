package chamorro.edisson.exceptions;

import javax.swing.JOptionPane;

public class EjercioExcepciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		try {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un Numero"));
			if (numero % 2 == 0) {
				JOptionPane.showMessageDialog(null, "El numero es par");
			} else {
				JOptionPane.showMessageDialog(null, "El numero es impar");
			}

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "No es un numero, el programa se cerrara");
		}

	}

}
