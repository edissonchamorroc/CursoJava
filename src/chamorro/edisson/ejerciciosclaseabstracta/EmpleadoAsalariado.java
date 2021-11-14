package chamorro.edisson.ejerciciosclaseabstracta;

public class EmpleadoAsalariado extends Empleado {

	public EmpleadoAsalariado(String nombre, String Id, int fechaAlta, double salario) {
		super(nombre, Id, fechaAlta);
		this.salario = salario;
	}

	@Override
	public String Imprimir() {

		return this.getNombre() + " con DNI: " + this.getId() + " y con año de alta: " + this.getFecha()
				+ " tiene un salario fijo de: " + Math.round(salario);
	}

	public double getSalario() {
		int antiguedad = this.getFecha() - fechaReferencia;
		if (antiguedad >= 2 & antiguedad <= 3) {
			salario = salario * 1.07;
		} else if (antiguedad >= 4 & antiguedad <= 8) {
			salario = salario * 1.11;
		} else if (antiguedad >= 9 & antiguedad <= 15) {
			salario = salario * 1.17;
		}
		return salario;
	}

	private int fechaReferencia = 2000;
	private double salario;

}
