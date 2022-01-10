package chamorro.edisson.ficherosexternos;

import java.io.File;
import java.io.IOException;

public class CreandoDirectorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivoNew=new File("C:"+File.separator+"Users"+File.separator+"edisson"+File.separator+"Documents"+File.separator+"pago credito cesde"+File.separator+"DatosNuevos"+File.separator+"archivo.txt");
		try {
			archivoNew.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//directorio.mkdir();
		
	}

}
