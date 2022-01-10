package chamorro.edisson.programaciongenerica;

import chamorro.edisson.ejerciciosclaseabstracta.Empleado;

public class Generica2Herencia<T> {

	private T primero;

	public Generica2Herencia() {
		primero = null;
	}
	
	public static void imprimirTrabajador(Generica2Herencia<? extends Empleados> e) {// parametro comodin
		//me permite usar objetos que hereden de empleados
		Empleados primero =e.getPrimero();
		System.out.println(primero.getDatosEmpleado());
	}

	public void setPrimero(T nuevoValor) {
		primero = nuevoValor;
	}

	public T getPrimero() {
		return primero;
	}
}
