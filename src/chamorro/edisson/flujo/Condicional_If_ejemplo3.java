package chamorro.edisson.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distancia_colegio=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese distancia a colegio: "));
		double renta_familiar=Double.parseDouble(JOptionPane.showInputDialog(" Ingrese resta familar: "));;
		byte hermanos_centro=Byte.parseByte(JOptionPane.showInputDialog(" Ingrese numero de hermanos: "));
		if(distancia_colegio<10 && renta_familiar<20000 && hermanos_centro>=2) {
			System.out.println(" El alumno tiene beca");
		}
		else {
			System.out.println(" El alumno no tiene beca");
		}
	}

}
//operador logico && || solo evaluan la primera condicion
//operdaro logico & | evaluan todo, sirve para analisis bit a bit