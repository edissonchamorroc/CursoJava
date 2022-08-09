package chamorro.edisson.colecciones;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("Antonio Lopez","0001",20000);
		Cliente cliente2 = new Cliente("Rafael Gomez","0002",30000);
		Cliente cliente3 = new Cliente("Diana Lopez","0003",10000);
		Cliente cliente4 = new Cliente("Edisson Chamorro","0004",90000);
		Cliente cliente5 = new Cliente("Edisson Chamorro","0004",90000);
		
		Set<Cliente> cliente = new HashSet<Cliente>();
		
		cliente.add(cliente1);
		cliente.add(cliente2);
		cliente.add(cliente3);
		cliente.add(cliente4);
		cliente.add(cliente5);
		
		for(Cliente e:cliente) {
			System.out.println(e.getNombre());
		}
	}

}
