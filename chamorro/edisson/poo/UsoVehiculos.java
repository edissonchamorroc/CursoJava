package chamorro.edisson.poo;

public class UsoVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciamientos
		Vehiculos miCoche1=new Vehiculos(2);//instanciamiento de objeto
		Vehiculos micoche2=new Vehiculos(4,3,2,3);
		//--------------------
		System.out.println(" los datos del vehiculo 1: "+miCoche1.getDatos());
		System.out.println(" los datos del vehiculo 2: "+micoche2.getDatos());
		miCoche1.setColor("gris");
		miCoche1.setancho(2);
		miCoche1.setlargo(3);
		miCoche1.setpeso(1);
		miCoche1.getExtra();
		miCoche1.setExtra(true);
		micoche2.setColor("negro mate");
		System.out.println(" los datos del vehiculo 1: "+miCoche1.getDatos());
		System.out.println(" los datos del vehiculo 2: "+micoche2.getDatos());
		
		
	}

}
