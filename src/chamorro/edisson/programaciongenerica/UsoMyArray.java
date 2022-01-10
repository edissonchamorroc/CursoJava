package chamorro.edisson.programaciongenerica;

import java.io.File;

public class UsoMyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList nombres = new MyArrayList(5);
		
		nombres.setObject("Maria");
		nombres.setObject("Carlos");
		nombres.setObject("Pedro");
		nombres.setObject("Juan");
		nombres.setObject("Edisson");
		
		String nombrePersona = (String)nombres.getObject(2);
		
		System.out.println(nombrePersona);
		
		MyArrayList archivos = new MyArrayList(5);
		
		archivos.setObject(new File("ejemplos.xlsx"));
		
		File document = (File) archivos.getObject(0);
	}

}
