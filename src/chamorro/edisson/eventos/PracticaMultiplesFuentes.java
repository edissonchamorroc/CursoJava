package chamorro.edisson.eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import chamorro.edisson.interfacesgraficas.GenericFrame;

public class PracticaMultiplesFuentes {

	public static void main(String[] args) {

		LaminaFuenteBotones laminaBotones = new LaminaFuenteBotones();
		laminaBotones.setBotones("Azul", Color.BLUE,"ctrl a");
		laminaBotones.setBotones("Rojo", Color.RED,"ctrl r");
		laminaBotones.setBotones("Verde", Color.GREEN,"ctrl g");
		GenericFrame frameMaster = new GenericFrame(3, 400, 100, 500, 400, laminaBotones);

	}

}

class LaminaFuenteBotones extends JPanel {

	public void setBotones(String nombreBoton, Color color, String comando) {
		JButton button = new JButton(nombreBoton);
		
		EventoCambiarColorBack evento = new EventoCambiarColorBack(nombreBoton, color);
		
		button.addActionListener(evento);
		
		add(button);
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
			
		mapaEntrada.put(KeyStroke.getKeyStroke(comando), nombreBoton);
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put(nombreBoton, evento );

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
