import java.util.Arrays;

public class histograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArray[] = new int[]{1, 2, 1, 3, 3, 1, 2, 1, 5, 1};

	   
	    Arrays.sort(myArray);
	   
	    int max = myArray[myArray.length - 1];
	    
	    for(int i = 1; i <= max; i++){
	        
	        System.out.print(i + ": ");
	        
	        for (int x = 0; x < myArray.length; x++){
	           
	            if (i == myArray[x]){
	                System.out.print("*");
	            }
	        }

	        System.out.println();
	    }
	}

}
