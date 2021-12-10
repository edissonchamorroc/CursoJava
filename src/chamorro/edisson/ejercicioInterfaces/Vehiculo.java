package chamorro.edisson.ejercicioInterfaces;

public interface Vehiculo {
	public abstract String Acelerar(int valor);
	public abstract String Frenar(int valor);
	public abstract int Plazas();
	
	public final static int VelMax=120;
}
