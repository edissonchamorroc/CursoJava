package chamorro.edisson.poo;

public class Uso_Cuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente cuenta1=new CuentaCorriente("edisson",1200000.34);
		CuentaCorriente cuenta2=new CuentaCorriente("carlos",700000.44);
		
		System.out.println(cuenta1.getDatosGenerales());
		
		System.out.println(cuenta2.getDatosGenerales());
		
		cuenta1.transferencia(cuenta1,cuenta2, 300000);
		
		System.out.println(cuenta1.getDatosGenerales());
		
		System.out.println(cuenta2.getDatosGenerales());
	}

}
