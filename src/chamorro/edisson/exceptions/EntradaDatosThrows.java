package chamorro.edisson.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatosThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Que deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");

		Scanner entrada = new Scanner(System.in);

		int decision = entrada.nextInt();

		if (decision == 1) {
			try {
				pedirDatos();
			}catch(Exception e) {
				
				System.out.println("Introducción erronea");
				e.printStackTrace();
			}
			
		} else {
			System.out.println("Adios");
			System.exit(0);
		}

		entrada.close();
		System.out.println("Hemos terminado");

	}
	static void pedirDatos() throws InputMismatchException {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		
		String nombre=entrada.nextLine();
		
		System.out.println("Introduce tu edad");
		
		int edad=entrada.nextInt();
		
		System.out.println(nombre+" "+edad);
		
		entrada.close();
	}

}
