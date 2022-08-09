
public class practicasJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 
		int []p= {2,6};
		int []q= {-2,-6};
		System.out.println(Reflections.reflectPoint(p, q));

	}

}
class Reflections{
	
	public static int[] reflectPoint(int[]p,int[]q) {
		int s[]=new int[2];
		int distancia=(int)(Math.sqrt(Math.pow((p[0]-q[0]), 2) + Math.pow((p[1]-q[1]), 2)));
		s[0]=(distancia+(p[0]-q[0]))*(-1);
		s[1]=(distancia+(p[1]-q[1]))*(-1);
		System.out.println(distancia+"--"+s[0]+"----"+s[1]);
		return s;
	}
}

