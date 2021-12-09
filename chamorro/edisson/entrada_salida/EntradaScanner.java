package chamorro.edisson.entrada_salida;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cuidado con el metodo nextline
		Scanner entrada=new Scanner(System.in);//objeto memoria dinámica
		System.out.println(" Introduce tu edad, por favor: ");
		int edad=entrada.nextInt();
		System.out.println(" Introduce tu nombre, por favor: ");
		entrada.nextLine();//nextline avanza a la sgt linea y guarda el enter, en este caso no se almacena en ninguna variable
		String nombre=entrada.nextLine();
		System.out.println(" Te llamas "+nombre+" y tienes "+edad);
		
		entrada.close();//cerramos constructor como delete en c++
		
		
	}

}
