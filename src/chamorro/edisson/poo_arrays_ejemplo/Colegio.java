package chamorro.edisson.poo_arrays_ejemplo;

public class Colegio {
	private String nombre;
	
	private Alumnos arrayAlumnos[];
	static int posicionArray=0;
	
	public Colegio(String nombre,int numAlumnos){
		this.nombre=nombre;
		arrayAlumnos=new Alumnos[numAlumnos];
	}
	public String getNombreColegio() {
		return nombre;
	}
	private Alumnos getAlumno(int nAlumno) {
		return arrayAlumnos[nAlumno];
	}
	public void nuevoAlumno(String nombreAlumno, double notaAlumno) {
		Alumnos nuevoAlumno=new Alumnos(this, nombreAlumno,notaAlumno);
		arrayAlumnos[posicionArray]=nuevoAlumno;
		posicionArray++;
	}
	public void expulsarAlumno(String nombreAlumno) {
		for(int i=0;i<arrayAlumnos.length;i++) {
			if(this.getAlumno(i)!=null) {
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					arrayAlumnos[i]=null;
				}
			}
		}
		
	}
	public void setNotaMedia(String nombreAlumno,double nuevaNotaMedia) {
		for(int i=0;i<arrayAlumnos.length;i++) {
			if(this.getAlumno(i)!=null) {
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					arrayAlumnos[i].setNotaMedia(nuevaNotaMedia);
				}
			}
		}
	}
	public void getTodosAlumnos() {
		for(int i=0;i<arrayAlumnos.length;i++) {
			if(this.getAlumno(i)!=null) {
				System.out.println(this.getAlumno(i).toString());	
			}
			
		}
	}

	public void getDatosAlumno(String nombreAlumno) {
		for(int i=0;i<arrayAlumnos.length;i++) {
			if(this.getAlumno(i)!=null) {
				if(arrayAlumnos[i].getNombreAlumno().equalsIgnoreCase(nombreAlumno)) {
					System.out.println(this.getAlumno(i).toString());
				}
			}
		}
	}
}