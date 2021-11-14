package chamorro.edisson.arrays;

public class Ejemplo_ArraysBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz=new int[5][3];
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				matriz[i][j]=j*i;
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
