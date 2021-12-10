package chamorro.edisson.eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import chamorro.edisson.interfacesgraficas.GenericFrame;

public class EventoDeRaton {

	public static void main(String[] args) {

		LaminaBotonColores boton = new LaminaBotonColores();
		boton.adicionarBoton(new JButton("BLUE"), Color.BLUE);
		boton.adicionarBoton(new JButton("RED"), Color.RED);
		boton.adicionarBoton(new JButton("BLACK"), Color.BLACK);

		GenericFrame laminaPrincipal = new GenericFrame(1, 100, 100, 500, 300, boton);

	}

}

class LaminaBotonColores extends JPanel {

	private static final long serialVersionUID = 1L;
	private Color color;

	public void adicionarBoton(JButton boton, Color color) {
		this.color = color;
		add(boton);
		boton.addActionListener(new ColorBackground(this.color));

	}

	private class ColorBackground implements ActionListener {

		private Color color;

		public ColorBackground(Color colorSeleccionado) {
			color = colorSeleccionado;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(color);
		}

	}

}
