package chamorro.edisson.poo;
import java.util.Random;
public class CuentaCorriente {
	public CuentaCorriente(String titular,double saldo) {
		
		this.nombreTitular=titular;
		this.saldo=saldo;
		Random rad=new Random();
		numeroCuenta=Math.abs(rad.nextLong());
		//numeroCuenta=(long)((Math.random() +1 )*1000000);
		
	}
	//propiedades
	private double saldo;
	private long numeroCuenta;
	private String nombreTitular;
	//metodos
	public void setIngreso(double ingreso) {
		if(ingreso>=0)saldo+=ingreso;
		else System.out.println(" No se permite ingresos negativos.");
	}
	
	public void setReintegro(double ingreso) {
		if(saldo>=0 & saldo>=ingreso)saldo-=ingreso;
		else System.out.println(" No puede retirar, no tiene saldo.");
	}
	
	public String getSaldo() {
		return "El saldo de la cuenta es: "+saldo+"\n";
	}
	
	public String getDatosGenerales() {
		return "Titular "+nombreTitular+" con numero de cuenta: "+numeroCuenta+"\ntiene saldo : "+saldo;
	}
	public static void transferencia(CuentaCorriente cuentafrom,CuentaCorriente cuentato, double valorTransferir ) {
		cuentafrom.setReintegro(valorTransferir);
		if(cuentafrom.saldo>=valorTransferir) {
			cuentato.setIngreso(valorTransferir);	
		}
		
	}
}
