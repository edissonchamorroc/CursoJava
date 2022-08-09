package chamorro.edisson.colecciones;

import java.util.HashMap;
import java.util.Map;

public class UsoMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Empleado> listaEmpleados = new HashMap<String,Empleado>();
		
		listaEmpleados.put("1",new Empleado("Edisson"));
		listaEmpleados.put("2",new Empleado("Carlos"));
		listaEmpleados.put("3",new Empleado("Juan"));
		
		
		for (Map.Entry<String, Empleado> e : listaEmpleados.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue().toString());
		}
	}

}
class Empleado{
	private String nombre;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		
	}
	public String toString() {
		return nombre;
	}
}
