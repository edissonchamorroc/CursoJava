package chamorro.edisson.ejercicioInterfaces;

public class UsoEjercicioInterfaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo array[]=new Vehiculo[6];
		array[0]=new Coche(0);
		array[1]=new Coche(100);
		array[2]=new Coche(10);
		array[3]=new Moto(0);
		array[4]=new Moto(100);
		array[5]=new Moto(70);
		
		System.out.println(array[0].Acelerar(20));
		System.out.println(array[1].Acelerar(30));
		System.out.println(array[2].Frenar(2));
		System.out.println(array[3].Acelerar(20));
		System.out.println(array[4].Acelerar(30));
		System.out.println(array[5].Frenar(5));
		System.out.println(array[0].Plazas());
		System.out.println(array[4].Plazas());
		
		
	}

}
