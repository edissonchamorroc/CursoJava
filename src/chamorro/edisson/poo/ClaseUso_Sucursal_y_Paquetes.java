package chamorro.edisson.poo;

import javax.swing.JOptionPane;

public class ClaseUso_Sucursal_y_Paquetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " Bienvenido al sistema de mensajeria");
		int numSucursal=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese número de sucursal: "));
		String direccion=JOptionPane.showInputDialog(" Ingrese direccion: ");
		String ciudad=JOptionPane.showInputDialog(" Ingrese Ciudad");
		ClaseSucursal sucursal=new ClaseSucursal(direccion,ciudad,numSucursal);
		int numPaquetes=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese cantidad de paquetes a enviar: "));
		ClasePaquete [] paq= new ClasePaquete[numPaquetes];
		for(int i=0;i<numPaquetes;i++) {
			JOptionPane.showMessageDialog(null, " Ingrese por favor los datos del paquete"+(i+1));
			String referencia=JOptionPane.showInputDialog(" Ingrese numero de referencia: ");
			String DNI=JOptionPane.showInputDialog(" Ingrese DNI: ");
			float peso=Float.parseFloat(JOptionPane.showInputDialog(" Ingrese el peso del paquete: "));
			byte prioridad=Byte.parseByte(JOptionPane.showInputDialog(" Ingrese la prioridad de envio: "));
		    paq[i]=new ClasePaquete(referencia,DNI,peso,prioridad);
		    sucursal.calcular(paq[i]);
		}
		System.out.println("N°sucursal:"+sucursal.getNumSucursal()+"\nDireccion: "+sucursal.getDireccion()+"\nCiudad: "+sucursal.getCiudad());
		for(int i=0;i<numPaquetes;i++) {
		  System.out.println(" Datos el paquete"+(i+1));
		  System.out.println(" Referencia: "+paq[i].getReferencia()+"\nPeso: "+paq[i].getPeso()+"\nPrioridad: "+paq[i].getPrioridad()+"\nPrecio: "+sucursal.calcular(paq[i]));
		}
		
	}
}
