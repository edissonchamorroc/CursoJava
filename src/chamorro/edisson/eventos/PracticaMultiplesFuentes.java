package chamorro.edisson.eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JPanel;

import chamorro.edisson.interfacesgraficas.GenericFrame;

public class PracticaMultiplesFuentes {

	public static void main(String[] args) {

		LaminaFuenteBotones laminaBotones = new LaminaFuenteBotones();
		laminaBotones.setBotones("Azul", Color.BLUE);
		laminaBotones.setBotones("Rojo", Color.RED);
		laminaBotones.setBotones("Verde", Color.GREEN);
		GenericFrame frameMaster = new GenericFrame(3, 400, 100, 500, 400, laminaBotones);

	}

}

class LaminaFuenteBotones extends JPanel {

	public void setBotones(String nombreBoton, Color color) {
		JButton button = new JButton(nombreBoton);
		button.addActionListener(new EventoCambiarColorBack(nombreBoton, color));
		add(button);

	}

	private class EventoCambiarColorBack extends AbstractAction {

		private String keyColor;

		public EventoCambiarColorBack(String keyColor, Color colorFondo) {
			putValue(keyColor, colorFondo);
			this.keyColor = keyColor;
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			setBackground((Color) getValue(keyColor));
		}

	}
}
