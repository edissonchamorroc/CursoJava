package chamorro.edisson.ficheros;

import java.io.*;
public class Lectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directorio=new File("C:"+File.separator+"Users"+File.separator+"edisson"+File.separator+"Documents"+File.separator+"pago credito cesde");
		//System.out.println(archivo.exists());
		String [] list=directorio.list();
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
			File f=new File(directorio.getAbsoluteFile(),list[i]);
			if(f.isDirectory()) {
				String [] subArchivos=f.list();
				for(int j=0;j<subArchivos.length;j++) {
					System.out.println(subArchivos[j]);
				}
			}
		}
	}

}
