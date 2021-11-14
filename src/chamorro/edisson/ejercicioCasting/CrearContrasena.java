package chamorro.edisson.ejercicioCasting;

public class CrearContrasena {
	private int longitud=0,countNum=0,countLp=0,countLg=0;
	private String contrasena="";
	public CrearContrasena(int longitud) {
		
		this.longitud=longitud;
	}
	
	private void ConstraInt() {
		int contraInt=0,a,i=0;
		while(i<longitud) {
			contraInt=(int)(Math.random()*10);
			a=(int)(Math.random()*100);
			contraInt+=a;
			if(contraInt>=48 & contraInt<=57)
			{contrasena+=(char)contraInt;i++;countNum++;}
		else if(contraInt>=65 & contraInt<=90) 
			{contrasena+=(char)contraInt;i++;countLg++;}
		else if(contraInt>=97 & contraInt<=122)
			{contrasena+=(char)contraInt;i++;countLp++;}
			//System.out.println(contraInt);
		}
		
	}
	private String getNivel() {
		String nivel="";
		if(countNum>5 & countLg>2 & countLp>1 )nivel="fuerte";
		else nivel="debil";
		return nivel;
	}
	public String getContrasena() {
		this.ConstraInt();
		return contrasena+" es "+this.getNivel();
	}
}