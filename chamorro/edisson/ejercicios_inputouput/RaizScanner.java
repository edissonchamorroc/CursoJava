package chamorro.edisson.ejercicios_inputouput;

import java.util.Scanner;

import chamorro.edisson.entrada_salida.EntradaScanner;

public class RaizScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println(" Introduce un n�mero: ");
		double numero=entrada.nextDouble();
		System.out.println(" La ra�z es = "+Math.sqrt(numero));
		entrada.close();
	}

}
