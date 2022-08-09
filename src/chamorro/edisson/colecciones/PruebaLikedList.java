package chamorro.edisson.colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLikedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> paises = new LinkedList<String>();
		LinkedList<String> capitales = new LinkedList<String>();
		
		paises.add("Colombia");
		paises.add("España");
		paises.add("Ecuador");
		paises.add("Brasil");
		
		capitales.add("Bogotá");
		capitales.add("Madrid");
		capitales.add("Quito");
		capitales.add("Sao paulo");
		
		ListIterator<String> itPaises=paises.listIterator();
		ListIterator<String> itCapitales=capitales.listIterator();
		
		while(itCapitales.hasNext()) {
			if(itPaises.hasNext()) {
				itPaises.next();
				itPaises.add(itCapitales.next());
			}
			
		}
		itCapitales=capitales.listIterator();
		
		while(itCapitales.hasNext()) {
			itCapitales.next();
			if(itCapitales.hasNext()) {
				itCapitales.next();
				itCapitales.remove();
			}
		}
		System.out.println(paises);
		System.out.println(capitales);
		
	}

}
