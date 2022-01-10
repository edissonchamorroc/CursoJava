package chamorro.edisson.serializacion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Administrador jefe = new Administrador("juan", 8000, 2005, 12, 15);

		jefe.setIncentivo(5000);

		Empleado[] personal = new Empleado[3];

		personal[0] = jefe;

		personal[1] = new Administrador("Pedro", 8000, 2005, 12, 15);

		personal[2] = new Administrador("Sofia", 8000, 2005, 12, 15);
		
		try {
			ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("C:/Users/marce/Documents/Edisson/objetoSerializado.dat"));
			
			flujoSalida.writeObject(personal);
			
			flujoSalida.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Empleado implements Serializable {
	
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 3628360445613313490L;

	private Date fechaContrato;

	private String nombre;

	private double sueldos;

	public Empleado(String n, double s, int agno, int mes, int dia) {

		nombre = n;

		sueldos = s;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

		fechaContrato = calendario.getTime();

	}

	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldos;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void subirSueldo(double porcentaje) {

		double aumento = sueldos * porcentaje / 100;

		sueldos += aumento;

	}

	public String toString() {

		return "El Nombre es =" + nombre + ",y su sueldo es =" + sueldos + ", fecha de contrato=" + fechaContrato;

	}

}
class Administrador extends Empleado{	
	
	private double incentivo;

	private static final long serialVersionUID = 2L;

	public Administrador(String n, double s, int agno, int mes, int dia){
			
			super(n,s,agno,mes,dia);
			
			incentivo=0;
			
		}
		
		public double getSueldo(){
			
			double sueldoBase=super.getSueldo();
			
			return sueldoBase + incentivo;
			
		}
		
		public void setIncentivo(double b){
			
			incentivo=b;
		}
		
		
		public String toString(){
			
			return super.toString() + " Incentivo=" + incentivo;
			
		}
	
	
	
}
