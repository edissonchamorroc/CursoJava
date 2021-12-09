package chamorro.edisson.poo_arrays_ejemplo;

public class Alumnos {
	private Colegio nombreColegio;
	private String nombreAlumno;
	private double notaMedia;
	private static int numeroAlumno=1;
	private int nAlumno;
	
	public Alumnos(Colegio nombreColegio,String nombreAlumno,double notaMedia) {
		this.nombreColegio=nombreColegio;
		this.nombreAlumno=nombreAlumno;
		this.notaMedia=notaMedia;
		nAlumno=numeroAlumno;
		numeroAlumno++;
		
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia=notaMedia;
	}
	public String toString() {
		return "Nombre alumno: "+nombreAlumno+"\nColegio: "+this.getNombreColegioAlumno()+"\nN° alumno: "+nAlumno+"\nNota media: "+notaMedia;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public String getNombreColegioAlumno() {
		return this.nombreColegio.getNombreColegio();
	}
}
