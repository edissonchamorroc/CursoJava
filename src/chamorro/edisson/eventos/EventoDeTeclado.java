package chamorro.edisson.eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import chamorro.edisson.interfacesgraficas.GenericFrame;

public class EventoDeTeclado {

	public static void main(String[] args) {
		
		GenericFrame frameKeys = new GenericFrame(100,200,500,300);
		
		frameKeys.addKeyListener(new EventoTeclado());

	}

}

class EventoTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
	
		//System.out.println("Has pulsado y suelto un tecla");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
		System.out.println("Has presionado una tecla: "+ e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
	
		//System.out.println(" Has soltado una tecla");
	}
	
}
