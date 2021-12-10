package chamorro.edisson.poo;

public class ClasePaquete {
	public ClasePaquete(String referencia,String DNI,float peso,byte prioridad) {
		this.referencia=referencia;
		this.DNI=DNI;
		this.peso=peso;
		this.prioridad=prioridad;
		
	}
	private String referencia,DNI;
	private float peso;
	private byte prioridad;
	

	
	
	public void setPrioridad(byte prioridad) {
		this.prioridad=prioridad;
	}
	
	public float getPeso() {
		return peso;
	}
	public byte getPrioridad() {
		return prioridad;
	}
	
	public String getReferencia() {
		return referencia;
	}
	

}
