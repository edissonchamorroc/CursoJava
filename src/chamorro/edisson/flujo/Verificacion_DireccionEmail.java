package chamorro.edisson.flujo;

import javax.swing.JOptionPane;

public class Verificacion_DireccionEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int caracteres=0,arrobas=0,puntos=0;boolean bandera=true;
		
		do {
			bandera=true;
			String email=JOptionPane.showInputDialog(" Ingrese su direccion de email: ");
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					arrobas++;				
				}
				if(arrobas<1) {
					caracteres++;				
				}
				if(email.charAt(i)=='.') {
					puntos++;				
				}
				
			}
			if(caracteres<4 || arrobas>1 || puntos>1) {
				bandera=false;
				caracteres=0;
				arrobas=0;
				puntos=0;
				System.out.println(" Correo incorrecto");
			}
			
			
		}while(!bandera);
		System.out.println(" Correo correcto");
	}

}
