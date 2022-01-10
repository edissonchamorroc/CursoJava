package chamorro.edisson.ficherosexternos;

import java.io.File;
import java.io.IOException;

public class CreandoDirectorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		File archivoNew=new File("C:"+File.separator+"Users"+File.separator+"marce"+File.separator+"Documents"+File.separator+"Edisson"+File.separator+"crearDirectorioJava"+File.separator+"creandoArchivo.txt");
		
		//archivoNew.mkdir();
		try {
			archivoNew.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
