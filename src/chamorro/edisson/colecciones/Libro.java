package chamorro.edisson.colecciones;

import java.util.Objects;

public class Libro {
	
	private String autor;
	
	private String titulo;
	
	private int isbn;
	
	public Libro(String autor, String titulo, int isbn) {
		
		this.autor = autor;
		
		this.titulo = titulo;
		
		this.isbn = isbn;
	}
	
	public String getDatos() {
		return "El titulo es: "+titulo+" de el autor "+autor+" y con codigo ISBN "+isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	}
	
	/*public boolean equals(Object obj) {
		boolean isEqual=false;
		Libro libroComparacion = (Libro)obj;
		if(obj instanceof Libro) {//comprueba si el obj por paramaetro es una instancia de objeto libro
			if(this.isbn==libroComparacion.isbn)isEqual=true;
		}
		
		return isEqual;
	}*/
	
	
}
