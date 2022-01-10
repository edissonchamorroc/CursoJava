package chamorro.edisson.exceptions;

import javax.swing.JOptionPane;

public class Comprueba_Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = JOptionPane.showInputDialog("Introduce mail");

		try {
			examinaMail(email);
		} catch (LongitudMailErronea e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void examinaMail(String email) throws  LongitudMailErronea {

		String[] arroba = email.split("@");

		if (email.length() > 3) {
			if (arroba.length > 2) {
				System.out.println("El correo es invalido, tiene dos @");
			}

		}
		else {
			LongitudMailErronea errorLongitud= new LongitudMailErronea("mail con 3 o menos caracteres");
			throw errorLongitud;
		}

	}

}

class LongitudMailErronea extends Exception {

	public LongitudMailErronea() {

	}

	public LongitudMailErronea(String messageError) {
		super(messageError);
	}

}
