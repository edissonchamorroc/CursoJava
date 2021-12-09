package chamorro.edisson.ficheros;

import java.io.*;

import javax.swing.JOptionPane;


public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Dir=JOptionPane.showInputDialog("Nom dir: ");
		String arc=JOptionPane.showInputDialog("nom arch: ");
		String frase=JOptionPane.showInputDialog("frase: ");
		
		File dirc=new File("C:"+File.separator+"Users"+File.separator+"edisson"+File.separator+"Documents"+File.separator+"pago credito cesde"+File.separator+Dir);
		
		dirc.mkdir();
		
		File archivo=new File("C:"+File.separator+"Users"+File.separator+"edisson"+File.separator+"Documents"+File.separator+"pago credito cesde"+File.separator+Dir+File.separator+arc+".txt");
		
		try {
			archivo.createNewFile();
			FileWriter escritura=new FileWriter("C:"+File.separator+"Users"+File.separator+"edisson"+File.separator+"Documents"+File.separator+"pago credito cesde"+File.separator+Dir+File.separator+arc+".txt",true);
			for(int i=0;i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		}catch(Exception e) {
			
		}
	}

}
