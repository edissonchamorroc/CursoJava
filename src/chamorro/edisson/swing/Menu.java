package chamorro.edisson.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMenu marco = new MarcoMenu();
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoMenu extends JFrame {

	public MarcoMenu() {
		setBounds(200, 200, 400, 300);
		add(new LaminaMenu());
		setVisible(true);
	}

}

class LaminaMenu extends JPanel {

	private JMenuBar barraMenu;
	private JMenu archivo, edicion, herramientas,preferencias;
	private JMenuItem guardar, guardarComo, cortar, copiar, pegar, opciones, ayuda, generales;

	public LaminaMenu() {

		barraMenu = new JMenuBar();

		archivo = new JMenu("Archivo");

		edicion = new JMenu("edicion");

		herramientas = new JMenu("herramientas");

		barraMenu.add(archivo);

		barraMenu.add(edicion);

		barraMenu.add(herramientas);
		
		//----------- items de archivo
		guardar = new JMenuItem("Guardar");

		guardarComo = new JMenuItem("Guardar Como");
		
		guardarComo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.print("Has pulsado guardar como");
			}
			
		});

		archivo.add(guardar);

		archivo.add(guardarComo);
		
		//-------------- items de edicion

		cortar = new JMenuItem("Cortar");

		copiar = new JMenuItem("Copiar");
		
		pegar = new JMenuItem("Pegar");

		edicion.add(cortar);

		edicion.add(copiar);
		
		edicion.add(pegar);
		
		//---------- items de herramientas
		
		opciones = new JMenuItem("Opciones");
		
		preferencias = new JMenu("Preferencias");
		
		herramientas.add(opciones);
		
		herramientas.addSeparator();

		herramientas.add(preferencias);
		
		//--------------items de preferencias
		
		ayuda = new JMenuItem("Ayuda");

		generales = new JMenuItem("Generales");
		
		preferencias.add(ayuda);

		preferencias.add(generales);

		add(barraMenu);
	}
}
