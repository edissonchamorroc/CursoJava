package chamorro.edisson.ejerciciosclaseabstracta;

public class EmpleadoComision extends Empleado {

	private int clientes;
	private double comision;
	private double salario = 950;

	public EmpleadoComision(String nombre, String Id, int fechaAlta, int clientes, double comision) {
		super(nombre, Id, fechaAlta);
		this.clientes = clientes;
		this.comision = comision;
	}

	@Override
	public String Imprimir() {

		return this.getNombre() + " con DNI: " + this.getId() + " con año de alta: " + this.getFecha()
				+ " clientes captados: " + clientes + " a " + comision + " cada uno " + " tiene un salario de: "
				+ Math.round(salario);

	}

	public double getSalario() {
		if (comision * clientes > salario) {
			salario = comision * clientes;
		}
		return salario;
	}

}
