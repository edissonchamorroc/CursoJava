package chamorro.edisson.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccesoLecturaFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerFichero accesoAFichero = new LeerFichero();

		accesoAFichero.leerDatos();
	}

}

class LeerFichero {

	public void leerDatos() {
		try {
			FileReader entrada = new FileReader("C:/Users/marce/Documents/Edisson/documento.txt");
			/*int caracter = entrada.read();

			while (caracter > 0) {
				System.out.print((char)caracter);
				caracter=entrada.read();
				
			}
			entrada.close();*/
			BufferedReader buffer = new BufferedReader(entrada);
			String linea="";
			while (linea!=null) {
				System.out.println(linea);
				linea=buffer.readLine();
								
			}
			entrada.close();
			//-----codigo cuando se usa buffer
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
