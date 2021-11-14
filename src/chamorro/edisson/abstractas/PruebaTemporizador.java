package chamorro.edisson.abstractas;

import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Temporizador oyente=new Temporizador();
		
		Timer miTempo=new Timer(3000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {//clase interna anónima
				// TODO Auto-generated method stub
				Date fecha=new Date();
				System.out.println(fecha);
			}
			
		});
		
		miTempo.start();
		
		JOptionPane.showMessageDialog(null, " Pulsa aceptar para detener: ");
	}

}

/*class Temporizador implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Date fecha=new Date();
		System.out.println(fecha);
	}
	
}*/