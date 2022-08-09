package chamorro.edisson.threads;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UsoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame marco = new MarcoRebote();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);

	}

}

class Pelota {

	// Mueve la pelota invirtiendo posición si choca con límites
	private static final int TAMX = 15;

	private static final int TAMY = 15;

	private double x = 0;

	private double y = 0;

	private double dx = 1;

	private double dy = 1;
	
	public void mueve_pelota(Rectangle2D limites) {

		x += dx;

		y += dy;

		if (x < limites.getMinX()) {

			x = limites.getMinX();

			dx = -dx;
		}

		if (x + TAMX >= limites.getMaxX()) {

			x = limites.getMaxX() - TAMX;

			dx = -dx;
		}

		if (y < limites.getMinY()) {

			y = limites.getMinY();

			dy = -dy;
		}

		if (y + TAMY >= limites.getMaxY()) {

			y = limites.getMaxY() - TAMY;

			dy = -dy;

		}

	}

	// Forma de la pelota en su posición inicial

	public Ellipse2D getShape() {

		return new Ellipse2D.Double(x, y, TAMX, TAMY);

	}


}

// Lámina que dibuja las pelotas----------------------------------------------------------------------

class LaminaPelota extends JPanel {

	// Añadimos pelota a la lámina
	private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();

	public void add(Pelota b) {

		pelotas.add(b);
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		for (Pelota b : pelotas) {

			g2.fill(b.getShape());
		}

	}

	
}
class PelotaThreads implements Runnable{
	private Pelota pelota;
	private Component lamina;
	public PelotaThreads(Pelota pelota, Component lamina) {
		this.pelota=pelota;
		this.lamina=lamina;
	}
	@Override
	public void run() {
		
		 System.out.println("Estado hilo: "+ Thread.currentThread().isInterrupted());
		// TODO Auto-generated method stub
		while(!Thread.currentThread().isInterrupted()) {

			pelota.mueve_pelota(lamina.getBounds());

			lamina.paint(lamina.getGraphics());
			
		
		}
		System.out.println("Estado hilo: "+ Thread.currentThread().isInterrupted());
	}
	
}
//Marco con lámina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame {
	
	private LaminaPelota lamina;
	private Thread hilo;
	
	public MarcoRebote() {

		setBounds(600, 300, 400, 350);

		setTitle("Rebotes");

		lamina = new LaminaPelota();

		add(lamina, BorderLayout.CENTER);

		JPanel laminaBotones = new JPanel();

		ponerBoton(laminaBotones, "Dale!", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego();
			}

		});

		ponerBoton(laminaBotones, "Salir", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				System.exit(0);

			}

		});
		ponerBoton(laminaBotones, "Parar", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				PararHilo();

			}

		});
		ponerBoton(laminaBotones, "Continuar", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				ContinuarHilo();

			}

		});

		add(laminaBotones, BorderLayout.SOUTH);
	}

	// Ponemos botones

	public void ponerBoton(Container c, String titulo, ActionListener oyente) {

		JButton boton = new JButton(titulo);

		c.add(boton);

		boton.addActionListener(oyente);

	}

	// Añade pelota y la bota 1000 veces

	public void comienza_el_juego() {

		Pelota pelota = new Pelota();

		lamina.add(pelota);
		
		Runnable run = new PelotaThreads(pelota,lamina);
		
		hilo= new Thread(run);
		
		hilo.start();
		

	}
	public void PararHilo() {
		
		hilo.interrupt();
		
	}
	public void ContinuarHilo() {
		
		hilo.start();
	}

	

}
