package chamorro.edisson.serializacion;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class RecuperarSerializacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("C:/Users/marce/Documents/Edisson/objetoSerializado.dat"));
			
			Empleado [] entradaDatos = (Empleado[])flujoEntrada.readObject(); 
			
			flujoEntrada.close();
			
			for(Empleado e:entradaDatos) {
				
				System.out.println(e);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
