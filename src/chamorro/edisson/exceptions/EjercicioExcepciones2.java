package chamorro.edisson.exceptions;

import javax.swing.JOptionPane;

public class EjercicioExcepciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un Numero entre 1 y 100"));
		try {
			verificarNumero(numero);
		} catch (NumeroFueraRango e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static void verificarNumero(int numero) throws NumeroFueraRango{
		if(numero>=1 && numero<=100) System.out.println("N° correcto");
		else {
			
			NumeroFueraRango errorRango= new NumeroFueraRango("El n° está fuera de rango");
			throw errorRango;
			
		}
	}

}

class NumeroFueraRango extends Exception {

	public NumeroFueraRango() {

	}

	public NumeroFueraRango(String message) {
		super(message);
	}
}
