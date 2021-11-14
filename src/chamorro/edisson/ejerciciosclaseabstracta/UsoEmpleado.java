package chamorro.edisson.ejerciciosclaseabstracta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsoEmpleado {

	public static void main(String[] args) {

		Empleado[] array = new Empleado[4];
		sueldoMayor obt = new sueldoMayor();
		array[0] = new EmpleadoAsalariado("Antonio López", "654656Z", 2014, 1125);
		array[1] = new EmpleadoComision("Sandra Nieto", "7879879S", 2011, 169, 7.10);
		array[2] = new EmpleadoAsalariado("Maria Ramos", "77879878F", 2011, 1055);
		array[3] = new EmpleadoComision("Manuel Ruiz", "4654654D", 2010, 35, 6.90);

		obt.getSueldoMayor(array);
		obt.mostrarTodos(array);

	}

}

class sueldoMayor {

	public sueldoMayor() {

	}

	public void getSueldoMayor(Empleado array[]) {

		List<Double> listaSalarios = new ArrayList<>();
	
		for (int i = 0; i < array.length; i++) {
			listaSalarios.add(array[i].getSalario());
		}

		System.out.println(array[listaSalarios.indexOf(Collections.max(listaSalarios))].getNombre()
				+ " tiene un salario mayor con un valor de: "
				+ array[listaSalarios.indexOf(Collections.max(listaSalarios))].getSalario());

	}

	public void mostrarTodos(Empleado array[]) {
		for (Empleado ite : array) {
			System.out.println(ite.Imprimir() + "\n");
		}
	}

}
