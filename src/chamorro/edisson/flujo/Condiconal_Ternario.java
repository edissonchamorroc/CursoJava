package chamorro.edisson.flujo;

import javax.swing.JOptionPane;

public class Condiconal_Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario1=Double.parseDouble(JOptionPane.showInputDialog(" Ingresar primer salario: "));
		double salario2=Double.parseDouble(JOptionPane.showInputDialog(" Ingresar segundo salario: "));
		double salario_max;
		
		salario_max=(salario1>salario2)?salario1:salario2;
		System.out.println("El salario mayor es: "+salario_max);
		
	}

}
