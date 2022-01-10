package chamorro.edisson.programaciongenerica;

public class MyArrayList {
	
	private Object[] elementos;
	private int i=0;
	
	public MyArrayList(int size) {
		elementos= new Object[size];
	}
	
	public Object getObject(int index) {
		return elementos[index];
	}
	
	public void setObject(Object obj) {
		elementos[i]=obj;
		i++;
	}
}
