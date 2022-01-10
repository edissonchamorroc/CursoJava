package chamorro.edisson.ficherosexternos;

import java.io.*;

import javax.swing.JOptionPane;


public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Dir=JOptionPane.showInputDialog("Nom dir: ");
		String arc=JOptionPane.showInputDialog("nom arch: ");
		String frase=JOptionPane.showInputDialog("frase: ");
		
		String pathDirectorio="C:"+File.separator+"Users"+File.separator+"marce"+File.separator+"Documents"+File.separator+"Edisson"+File.separator+"crearDirectorioJava"+File.separator+Dir;
		String pathArchivo=pathDirectorio+File.separator+arc+".txt";
		
		
		File dirc=new File(pathDirectorio);
		//creacion directorio
		dirc.mkdir();
		
		File archivo=new File(pathArchivo);
		
		try {
			//creacion de archivo
			archivo.createNewFile();
			
			//escribir en archivo
			FileWriter escritura=new FileWriter(pathArchivo,true);
			
			for(int i=0;i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		}catch(Exception e) {
			System.out.println("El el directorio no existe");
		}
	}

}
