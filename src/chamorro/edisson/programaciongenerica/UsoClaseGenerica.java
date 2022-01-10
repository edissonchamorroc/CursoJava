package chamorro.edisson.programaciongenerica;

public class UsoClaseGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generica<String> objeto= new Generica<String>();
		
		objeto.setObject("Edisson chamorro");
		
		System.out.println(objeto.getObject());
		
		Generica<Persona> objetoPersona= new Generica<Persona>();
		
		objetoPersona.setObject(new Persona("Maria"));
		
		System.out.println(objetoPersona.getObject().toString());
	}

}
class Persona{
	private String nombre;
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	public String toString() {
		return nombre;
	}
	
}