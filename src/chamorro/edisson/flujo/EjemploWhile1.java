package chamorro.edisson.flujo;

import javax.swing.JOptionPane;

public class EjemploWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave="Edisson",acceso="";
		while(!acceso.equals(clave)) {
			acceso=JOptionPane.showInputDialog(" Ingrese la clave: ");
			JOptionPane.showMessageDialog(null, " No es la clave.");
		}
		
	}

}
