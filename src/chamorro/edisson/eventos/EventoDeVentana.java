package chamorro.edisson.eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import chamorro.edisson.interfacesgraficas.GenericFrame;

public class EventoDeVentana {

	public static void main(String[] args) {

		GenericFrame frameEvento = new GenericFrame(100, 100, 500, 300);

		frameEvento.addWindowStateListener(new EventosDeVentana());

	}

}

class EventosDeVentana implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {

		System.out.println("La ventana ha cambiado de estado");
		
		System.out.println(e.getOldState());
		
		System.out.println(e.getNewState());
	}

}