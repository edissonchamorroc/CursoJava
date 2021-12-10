package chamorro.edisson.flujo;

import javax.swing.JOptionPane;

public class Ejercicio_Condicional_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero=JOptionPane.showInputDialog(" Ingrese genero hombre o mujer: ");
		if(genero.equalsIgnoreCase("mujer")){
			int altura=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese altura en cm: "));
			//(altura>=120)? JOptionPane.showMessageDialog(null, "peso ideal"):JOptionPane.showMessageDialog(null, "no es peso ideal");
			if(altura==120)JOptionPane.showMessageDialog(null, "peso ideal");
			else JOptionPane.showMessageDialog(null, "no es peso ideal");
		}
		else {
			int altura=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese altura en cm: "));
			if(altura==110)JOptionPane.showMessageDialog(null, "peso ideal");
			else JOptionPane.showMessageDialog(null, "no es peso ideal");
		}
	}

}
