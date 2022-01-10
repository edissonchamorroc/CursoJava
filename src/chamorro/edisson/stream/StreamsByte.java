package chamorro.edisson.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StreamsByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listBytes = new ArrayList<Integer>();
		try {
			FileInputStream lecturaArchivo = new FileInputStream("C:/Users/marce/Documents/Edisson/firmaDigitalEdisson.png");
			
			boolean isEnd=false;
			
			while(!isEnd) {
				
				int byteImagenEntrada=lecturaArchivo.read();
				
				if(byteImagenEntrada==-1)isEnd=true;
				
				if(byteImagenEntrada!=-1)listBytes.add(byteImagenEntrada);
				
			}
			lecturaArchivo.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CrearFichero(listBytes);
	}
	static void CrearFichero(List<Integer> listBytes) {
		
		try {
			FileOutputStream ficheroExterno = new FileOutputStream("C:/Users/marce/Documents/Edisson/firmaDigitalEdisson2.png");
			
			for(int i=0;i<listBytes.size();i++) {
				
				ficheroExterno.write(listBytes.get(i));
			}
			ficheroExterno.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
