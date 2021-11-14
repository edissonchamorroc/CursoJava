package chamorro.edisson.abstractas;

import java.util.Date;

public abstract class Personas {
	
	public Personas(String nom) {
	
		nombre=nom;
		
	}
	
	private String nombre;
	
	public String getName() {
	
		return nombre;
		
	}
	
	//creacion_de_metodo_abstracto
	public abstract String getDescripcion();
	
}


class Empleados extends Personas implements Comparable, ParaTrabajadores{

	public Empleados(String nom, Date fechaAlta, double sueldo) {
		
		super(nom);
		
		this.fechaAlta=fechaAlta;
		
		this.sueldo=sueldo;
		
	}
	
	@Override
	public String getDescripcion() {
		
		return "El empleado "+this.getName()+" tiene un sueldo de: "
				+sueldo+"$"+" y salio de la empresa en "+fechaAlta;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Empleados otroEmpleado=(Empleados)o;
		
		if(this.sueldo<otroEmpleado.sueldo)return -1;
		
		else if(this.sueldo>otroEmpleado.sueldo)return 1;
		
		else return 0;
	}
	
	private double sueldo;
	
	private Date fechaAlta;

	@Override
	public double setBonus(double gratificacion) {
		// TODO Auto-generated method stub
		
		return gratificacion+ ParaTrabajadores.bonus;
	}
	
}


class Jefes extends Empleados implements Parajefe {
	
	public Jefes(String nom, Date fechaAlta, double sueldo) {
		
		super(nom, fechaAlta, sueldo);
		
	}
	
	
	public void setIncentivo(double incentivo) {
		
		this.incentivo=incentivo;
		
	}

	@Override
	public void setCargo(String cargo) {
		// TODO Auto-generated method stub
		
		this.cargo=cargo;
	}

	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
	
		return "\n Además tiene el cargo: "+cargo;
		
	}
	
	@Override
	public double setBonus(double gratificacion) {
		// TODO Auto-generated method stub
		
		double prima=2000;
		
		return prima+gratificacion+ ParaTrabajadores.bonus;
	}
	
	private String cargo;
	
	private double incentivo;
	

	
	
}

class Alumnos extends Personas{

	public Alumnos(String nom,String optativas, String aula) {
		// TODO Auto-generated constructor stub
		
		super(nom);
		
		this.aula=aula;
		
		a_optativas=optativas;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		
		return "El Alumno "+this.getName()+" está en el aula "+aula
				+"y"+" a escogido "+a_optativas;
	}
	
	private String a_optativas;
	
	private String aula;
	
}

