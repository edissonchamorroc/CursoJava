
public class NumeroMgrande {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {13,2,94,4,35,1,38};
		
		int mayor=myArray[0];
		for(Integer ite:myArray) {
			if(Math.max(ite, ite)>mayor) {
				mayor=Math.max(ite, ite);
			}
		}
		System.out.println(mayor);
	}

}
