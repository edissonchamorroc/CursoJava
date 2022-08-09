package chamorro.edisson.colecciones;

public class UsoLibroEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Libro libro1 = new Libro("Java se","Juan",10);
			
			Libro libro2 = new Libro("Java se","Juan",11);
			
			if(libro1.equals(libro2))System.out.println("Son iguales");
			else {
				System.out.println("NO Son iguales");
				System.out.println(libro1.hashCode());
				System.out.println(libro2.hashCode());
			}
	}

}
