package chamorro.edisson.stream;

import java.io.FileWriter;
import java.io.IOException;

public class EscrituraFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escritura crearFicheroNuevo = new Escritura();
		crearFicheroNuevo.escribiendo();
	}

}
class Escritura{
	public void escribiendo() {
		
		String texto="/n Esta es una nueva frase";
		
		try {
			FileWriter escritura = new FileWriter("C:/Users/marce/Documents/Edisson/streamNuevo.txt",true);
			
			for(int i=0;i<texto.length();i++) {
				escritura.write(texto.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}