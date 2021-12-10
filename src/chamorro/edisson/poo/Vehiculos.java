package chamorro.edisson.poo;

public class Vehiculos {
	//sobrecarga de constructores-----------
	public Vehiculos(int ruedas) {//constructor
		this.ruedas=ruedas;
		largo=3;
		ancho=1;
		peso=2;
		color="Sin Color";
	}
	public Vehiculos(int ruedas,int largo,int ancho,int peso) {
		this.ruedas=ruedas;
		this.largo=largo;
		this.ancho=ancho;
		this.peso=peso;
		color="Sin Color";
	}
	//------------------------------------------
	//sobrecarga de metodos--------------------
	public void setExtra(boolean clm) {
		this.climatizador=clm;
	}
	
	public void setExtra(boolean clm,boolean gps) {
		this.climatizador=clm;
		this.gps=gps;
	}
	
	public void setExtra(boolean clm,boolean gps,boolean tap) {
		this.climatizador=clm;
		this.gps=gps;
		this.tapiceria=tap;
	}
	//---------------------------------------
	public String getExtra(){
		if(climatizador & gps==false & tapiceria==false)return "tu coche tiene el pack 1";
		else if(climatizador & gps & tapiceria==false)return "tu coche tiene el pack 2";
		if(climatizador & gps & tapiceria)return "tu coche tiene el pack 3";
		else return "No tiene packs";
	}
	public void setColor(String c) {
		this.color=c;
	}
	public void setlargo(int l) {
		largo=l;
	}
	public void setancho(int a) {
		ancho=a;
	}
	public void setpeso(int p) {
		peso=p;
	}
	
	
	public String getDatos() {
		return "El vehiculo tiene:\ncolor: "+color+"\nlargo: "+largo+"\nancho: "+ancho+"\npeso: "+peso;
	}
	
	//encapsulamiento -- metodos que solo se accede desde la misma clasee
	private int ruedas,largo,ancho,peso;
	private String color;
	private boolean climatizador,gps, tapiceria; 
}
