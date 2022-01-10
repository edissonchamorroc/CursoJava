package chamorro.edisson.programaciongenerica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chamorro.edisson.ejerciciosclaseabstracta.Empleado;
import chamorro.edisson.ejerciciosclaseabstracta.EmpleadoAsalariado;
import chamorro.edisson.ejerciciosclaseabstracta.EmpleadoComision;

public class UsoEmpleado {

	public static void main(String[] args) {

		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		listaEmpleados.add( new EmpleadoAsalariado("Antonio López", "654656Z", 2014, 1125));
		listaEmpleados.add(new EmpleadoComision("Sandra Nieto", "7879879S", 2011, 169, 7.10));
		listaEmpleados.add( new EmpleadoAsalariado("Maria Ramos", "77879878F", 2011, 1055));
		listaEmpleados.add(new EmpleadoComision("Manuel Ruiz", "4654654D", 2010, 35, 6.90));
		
		listaEmpleados.trimToSize();//reduce la lista a 4 ya que por defecto coge 10 posiciones de memoria
		
		for(Empleado e:listaEmpleados) {
			
			System.out.println(e.getNombre()+" tiene un salario de: "+e.getSalario());
		}
		 
		Empleado []empleados = new Empleado[listaEmpleados.size()];
		
		listaEmpleados.toArray(empleados);//pasa todos los datos de arraylist a array empleados

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
