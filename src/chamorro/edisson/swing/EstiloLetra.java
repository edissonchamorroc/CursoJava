package chamorro.edisson.swing;

public class EstiloLetra {
	
	
	public static int getEstiloLetra(String estilo) {
		int estiloToReturn=0;
		if(estilo.equalsIgnoreCase("negrita")) {
			estiloToReturn=1;
		}
		else if(estilo.equalsIgnoreCase("cursiva")) {
			estiloToReturn=2;
		}
		return estiloToReturn;
	}
}
