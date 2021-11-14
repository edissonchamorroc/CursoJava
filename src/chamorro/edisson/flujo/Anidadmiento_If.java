package chamorro.edisson.flujo;

import javax.swing.JOptionPane;

public class Anidadmiento_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad=Integer.parseInt(JOptionPane.showInputDialog(" Introduce tu edad, por favor: "));
		if(edad >=18) {
			String carnet=JOptionPane.showInputDialog("¿tines carnet?: ");

			if(carnet.equalsIgnoreCase("si")) {
				JOptionPane.showMessageDialog(null, " Puedes comprar coche");
			}else {
				JOptionPane.showMessageDialog(null, " No puedes comprar coche");
			}
				
		}else {
			JOptionPane.showMessageDialog(null, " Eres menor de edad");
		}
	}

}
