package chamorro.edisson.poo;

public class ClaseSucursal {
	public ClaseSucursal(String direccion,String ciudad,int numSucursal) {
		this.direccion=direccion;
		this.ciudad=ciudad;
		this.numSucursal=numSucursal;
	}
	private int numSucursal;
	private String direccion,ciudad;
	
	public String getDireccion() {
		return direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public int getNumSucursal() {
		return numSucursal;
	}
	
	public float calcular(ClasePaquete paquete) {
		
		if(paquete.getPrioridad()==0)return paquete.getPeso();
		else if(paquete.getPrioridad()==1)return paquete.getPeso()*(Float.valueOf(paquete.getPrioridad())) +10;
		else if(paquete.getPrioridad()==2)return paquete.getPeso()*(Float.valueOf(paquete.getPrioridad()))+20;
		else return 0;
	}
}
