package chamorro.edisson.flujo;

import javax.swing.JOptionPane;

public class Ejercicio_Bucle_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroAleatorio=(int)(Math.random()*100);//n° aleatorio entre 0y100
		int numeroIng=0,numeroIntentos=0;
		
		while(numeroIng!=numeroAleatorio) {
			numeroIng=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese numero entre 1 y 100: "));
			numeroIntentos++;
			if(numeroIng>numeroAleatorio)JOptionPane.showMessageDialog(null, " EL numero"+numeroIng+" Es mayor");
			else if(numeroIng<numeroAleatorio)JOptionPane.showMessageDialog(null, " EL numero"+numeroIng+" Es menor");
			else JOptionPane.showMessageDialog(null, " EL numero"+numeroIng+" Es correcto");
			
		}
		System.out.println(" Numero de intentos = "+numeroIntentos);
	}

}
