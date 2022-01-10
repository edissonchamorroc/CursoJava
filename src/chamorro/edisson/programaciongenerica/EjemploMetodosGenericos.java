package chamorro.edisson.programaciongenerica;

public class EjemploMetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []personas = {"Sara","Antonio","Maria"};
		
		System.out.println(ExaminaArrays.getElementMenor(personas));
		

	}

}
class ExaminaArrays{
	
	public static <T extends Comparable> T getElementMenor(T [] array) {
		T objetMenor = array[0];
		
		for(int i=1;i<array.length;i++) {
			
			if(objetMenor.compareTo(array[i])>0) {
				
				objetMenor=array[i];
			}
		}
		return objetMenor;
	}
	
	
}