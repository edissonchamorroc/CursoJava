package chamorro.edisson.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import chamorro.edisson.interfacesgraficas.GenericFrame;

public class VariosOyentes {

	public static void main(String[] args) {

		GenericFrame marcoPrincipal = new GenericFrame(JFrame.EXIT_ON_CLOSE, 100, 200, 300, 200, new LaminaPrincipal());

	}

}

class LaminaPrincipal extends JPanel {

	JButton botonCerrar;

	public LaminaPrincipal() {

		JButton botonNuevo = new JButton("Nuevo");

		botonCerrar = new JButton("Cerrar todo");

		add(botonNuevo);

		add(botonCerrar);

		botonNuevo.addActionListener(new crearFrame());

	}

	private class crearFrame implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			MarcoNuevo nuevoMarco = new MarcoNuevo(botonCerrar);

			nuevoMarco.setVisible(true);

		}

	}

}

class MarcoNuevo extends JFrame {

	private static int contador = 0;

	public MarcoNuevo(JButton boton) {

		contador++;

		setTitle("Ventana " + contador);

		setBounds(50 * contador, 50 * contador, 300, 200);

		boton.addActionListener(new cerrarVentanas());
	}

	private class cerrarVentanas implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			dispose();

		}

	}
}
