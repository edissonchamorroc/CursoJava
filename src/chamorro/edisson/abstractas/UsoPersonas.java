package chamorro.edisson.abstractas;

import java.util.Arrays;
import java.util.Date;

public class UsoPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Personas Juan=new Personas("Juan"); sale error, no se puede 
		// instanciar una clase abstracta
		/*
		Empleados juan=new Empleados("Juan",new Date(54645454),500);
		
		System.out.println(juan.getName());
		System.out.println(juan.getDescripcion());
		
		
		Jefes Ana=new Jefes("Ana",new Date(5645454),3500);
		System.out.println(Ana.getName());
		Ana.setCargo("Directora comercial");
		System.out.println(Ana.getDescripcion()+ Ana.getCargo());
		
		Alumnos maria=new Alumnos("maria","Dibujo","5");
		System.out.println(maria.getName());
		System.out.println(maria.getDescripcion());
		
		Jefes David=new Jefes("David",new Date(3651463),4800);
		David.setCargo("Director de RRHH");
		System.out.println(David.getName());
		System.out.println(David.getDescripcion()+ David.getCargo());*/
		
		Empleados losEmpleados[]=new Empleados[5];
		
		losEmpleados[0]=new Empleados("Juan",new Date(54645454),2500);
		losEmpleados[1]=new Empleados("Maria",new Date(54645454),1500);
		losEmpleados[2]=new Empleados("Ana",new Date(54645454),3500);
		losEmpleados[3]=new Empleados("Sandra",new Date(54645454),6000);
		losEmpleados[4]=new Empleados("Antonio",new Date(54645454),2100);
		
		Arrays.sort(losEmpleados);
		for(Empleados ite:losEmpleados) {
			System.out.println(ite.getDescripcion());
		}
		
		Jefes Manuel=new Jefes("Manuel",new Date(54654),5000);
		
		Empleados Sonia=new Empleados("Sonia",new Date(54654),3000);
		
		System.out.println("El trabajador "+Sonia.getName()+" tiene un bonus de: "+Sonia.setBonus(500));
	}

}
