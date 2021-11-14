package chamorro.edisson.eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import chamorro.edisson.interfacesgraficas.GenericFrame;

public class EventoDeVentana {

	public static void main(String[] args) {
		
		GenericFrame frameEvento = new GenericFrame(100,100,500,300);
		
		frameEvento.addWindowListener(new EventosDeVentana());

	}

}

class EventosDeVentana extends WindowAdapter {

	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana abierta");
	}
	
	public void windowClosed(WindowEvent e) {
		System.out.println("Ventana cerrada");
	}
	
	
	
	
}