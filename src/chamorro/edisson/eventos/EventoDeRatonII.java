package chamorro.edisson.eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import chamorro.edisson.interfacesgraficas.GenericFrame;

public class EventoDeRatonII {

	public static void main(String[] args) {

		GenericFrame frameMice = new GenericFrame(300, 300, 500, 400);

		frameMice.addMouseListener(new EventoRaton());
		frameMice.addMouseMotionListener(new MovimientoRaton());

	}

}

class EventoRaton extends MouseAdapter {

	public void mousePressed(MouseEvent e) {
		System.out.println("X: " + e.getX() + " Y: " + e.getY());
	}

}

class MovimientoRaton implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrastrando con el raton");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo el raton");
	}

}