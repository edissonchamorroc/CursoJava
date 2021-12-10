package chamorro.edisson.ejerciciosclaseabstracta;

public abstract class Empleado {

	private String nombres;
	private String Id;
	private int fechaAlta;

	public Empleado() {
	}

	public Empleado(String nombre, String Id, int fechaAlta) {
		nombres = nombre;
		this.Id = Id;
		this.fechaAlta = fechaAlta;
	}

	public abstract String Imprimir();

	public abstract double getSalario();

	public String getNombre() {
		return nombres;
	}

	public String getId() {
		return Id;
	}

	public int getFecha() {
		return fechaAlta;
	}

}
