package chamorro.edisson.poo_arrays_ejemplo;

public class UsoColegio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colegio sanJavier=new Colegio("San Javier",200);
		Colegio Cervantes=new Colegio("Cervantes",200);
		
		sanJavier.nuevoAlumno("juan",8.5);
		sanJavier.nuevoAlumno("sara",9);
		
		Cervantes.nuevoAlumno("Ana",5);
		Cervantes.nuevoAlumno("Antonio",7);
		Cervantes.nuevoAlumno("maria",3);
		Cervantes.expulsarAlumno("Antonio");
		Cervantes.setNotaMedia("maria",8);
		Cervantes.getTodosAlumnos();
		System.out.println();
		sanJavier.getTodosAlumnos();
	}

}
