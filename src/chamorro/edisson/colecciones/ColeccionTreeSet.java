package chamorro.edisson.colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class ColeccionTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TreeSet<String> ordenaGente = new TreeSet<String>();
		
		ordenaGente.add("Oscar");
		ordenaGente.add("maria");
		ordenaGente.add("Ana");
		
		for (String e: ordenaGente) {
			System.out.println(e);
		}
	}*/
		TreeSet<Producto> ordenaProductos = new TreeSet<Producto>(new Producto());//para usar el comparator
		
		ordenaProductos.add(new Producto(3,"este es Tercer Producto"));
		ordenaProductos.add(new Producto(7,"Septimo"));
		ordenaProductos.add(new Producto(2,"Segundo Producto"));
		
		for (Producto producto : ordenaProductos) {
			System.out.println(producto.getDescripcion());
		}

	}

}
class Producto implements Comparable<Producto>, Comparator<Producto>{
	
	private int numeroProducto;
	private String descripcion;
	
	
	public Producto() {
		
	}
	public Producto(int numeroProducto, String descripcion) {
		this.numeroProducto = numeroProducto;
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public int compareTo(Producto o) {// ordenamiento natural de mayor a menor por ejemplo
		// TODO Auto-generated method stub
		return numeroProducto - o.numeroProducto;
	}

	@Override
	public int compare(Producto o1, Producto o2) {// en funcion de lo que yo quiera el ordenamiento
		// TODO Auto-generated method stub
		int carac1=o1.getDescripcion().length();
		int carac2=o2.getDescripcion().length();
		
		if(carac1<carac2) {
			return -1;
		}else if(carac1>carac2) {
			return 1;
		}
		else return 0;
		
	}
	
}
