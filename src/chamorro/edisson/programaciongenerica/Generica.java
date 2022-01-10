package chamorro.edisson.programaciongenerica;

public class Generica<T> {
	
	private T objeto;
	
	public Generica() {
		objeto=null;
	}
	
	public void setObject(T newValue) {
		objeto=newValue;
	}
	
	public T getObject() {
		return objeto;
	}
}
