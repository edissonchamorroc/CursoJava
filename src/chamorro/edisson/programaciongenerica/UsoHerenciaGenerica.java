package chamorro.edisson.programaciongenerica;

import java.util.GregorianCalendar;


public class UsoHerenciaGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generica2Herencia<Empleados> empleado12= new Generica2Herencia<Empleados>();
		empleado12.setPrimero(new Empleados("Edisson",4000000,2021,10,8));
		Generica2Herencia<Jefes> Sara= new Generica2Herencia<Jefes>();
		Sara.setPrimero(new Jefes("Sara",2000000,2021,10,8));
		
		Generica2Herencia.imprimirTrabajador(Sara);
	}

}
class Empleados {
	//propiedades
	private final String nombre;
	private double sueldo;
	GregorianCalendar calendario;
	private int Id;
	private static int IdSiguiente=1;
	//constructor
	public Empleados(String nombre, double sueldo, int a, int mes, int dia) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		calendario=new GregorianCalendar(a,mes,dia);
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	
	public String getDatosEmpleado() {
		return "EL empleado "+nombre+" tiene el Id: "+Id;
	}
	//metodo static solo accede a las variables static de la clase
	public static String getIds() {
		return "El Id Siguiente será: "+IdSiguiente;
	}
	public double getSueldo() {
		return sueldo;
	}
	public GregorianCalendar getFechaAlta() {
		return calendario;
	}
	public void setSubeSueldo(double porcentaje) {
		
		sueldo+=(sueldo*porcentaje/100);
	}
}

//-------HERENCIA--------
class Jefes extends Empleados{

	public Jefes(String nombre, double sueldo, int a, int mes, int dia) {
		super(nombre, sueldo, a, mes, dia);
		// TODO Auto-generated constructor stub
	}
	public void setIncentivo(double incentivo) {
		this.incentivo=incentivo;
	}
	public double getSueldo() {
		 double sueldojefe=super.getSueldo();
		 return sueldojefe+incentivo;
		 
	}
	private double incentivo;
	
}

