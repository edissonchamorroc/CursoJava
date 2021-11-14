package chamorro.edisson.poo;

/*clase para estudiar que se puede agregar clases en una sola
 * y el uso de las palabras reservadas final y estatic. Final asegura que no se modifique 
 * ni por error o mal intensionadamente una propiedad, clase, objeto.
 * una propiedad Static no pertenece a ningun objeto como con las otras propiedades, solo pertenece a la clase */

import java.util.GregorianCalendar;
public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jefes juan=new Jefes("juan",8000,2013,8,6);
		juan.setIncentivo(200);
		Empleados array[]=new Empleados[5];
		
		array[0]=new Empleados("Antonio",2399.5,2005,7,5);
		array[1]=new Empleados("Carlos",5000.5,2005,6,5);
		array[2]=new Empleados("Maria",2500.5,2006,11,5);
		array[3]=juan;
		array[4]=new Jefes("Isabel",8000,2007,4,2);
		
		Jefes Isabel=(Jefes)array[4];
		Isabel.setIncentivo(500);
		
		
		/*Empleados Patricia =new Jefes("patricia",2500,2007,5,6);
		Jefes PatriciaSecretaria=(Jefes) Patricia;*/
		for(Empleados obj : array) {
			System.out.println(obj.getDatosEmpleado()+" y un salario de: "+obj.getSueldo());
		}

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

