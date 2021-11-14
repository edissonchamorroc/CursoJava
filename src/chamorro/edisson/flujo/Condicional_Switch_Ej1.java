package chamorro.edisson.flujo;

import javax.swing.JOptionPane;

public class Condicional_Switch_Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hijos=Integer.parseInt(JOptionPane.showInputDialog(" Ingresar numero de hijos: "));
		switch (hijos){
		case 0:
			JOptionPane.showMessageDialog(null, " no tienes hijos");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "tienes 1 hijo");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "tienes 2 hijos");
			break;
	    default:
	    	JOptionPane.showMessageDialog(null, "tienes muchos hijos");
			break;
			
		}
	}
}
