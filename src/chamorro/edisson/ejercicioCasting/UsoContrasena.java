package chamorro.edisson.ejercicioCasting;

import javax.swing.JOptionPane;

public class UsoContrasena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contrasenas=0, tamano;
		contrasenas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de contrasenas: "));
		tamano=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano de las contrasenas: "));
		CrearContrasena array[]=new CrearContrasena[contrasenas];
		for(int i=0;i<contrasenas;i++) {
			array[i]=new CrearContrasena(tamano);
			System.out.println(array[i].getContrasena());
		}
		
	}

}
