package chamorro.edisson.ficherosexternos;

import java.io.File;

public class AccesoRutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directorio = new File("C:\\Users\\marce\\Documents\\Edisson");

		System.out.println(directorio.getAbsolutePath());

		System.out.println(directorio.exists());

		String[] nombreArchivos = directorio.list();

		for (String e : nombreArchivos) {

			System.out.println(e);

			File nuevoDirectorio = new File(directorio.getAbsolutePath(), e);

			if (nuevoDirectorio.isDirectory()) {
				System.out.println("Elementos de sub carpetas");
				String[] archivosSubCarpeta = nuevoDirectorio.list();

				for (String ee : archivosSubCarpeta) {
					System.out.println(ee);
				}
			}
		}

	}
}
