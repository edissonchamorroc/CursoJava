package chamorro.edisson.eventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import chamorro.edisson.interfacesgraficas.GenericFrame;
import chamorro.edisson.utils.ValidateEmail;

public class EventoDeFocoComponentes {

	public static void main(String[] args) {

		GenericFrame frame = new GenericFrame(3, 200, 200, 500, 400, new LaminaFoco());

	}

}

class LaminaFoco extends JPanel {

	private JTextField campoTexto1, campoTexto2;
	private JLabel etiquetaNombre, etiquetaEmail;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		campoTexto1 = new JTextField();
		campoTexto2 = new JTextField();
		etiquetaNombre = new JLabel("User ");
		etiquetaEmail = new JLabel("Email ");

		campoTexto1.setBounds(110, 10, 150, 20);
		campoTexto2.setBounds(110, 50, 150, 20);
		etiquetaNombre.setBounds(70, 10, 150, 20);
		etiquetaEmail.setBounds(70, 50, 150, 20);

		add(campoTexto1);

		add(campoTexto2);

		add(etiquetaNombre);

		add(etiquetaEmail);

		campoTexto1.addFocusListener(new EventoDeFoco());

		campoTexto2.addFocusListener(new EventoDeFoco());
	}

	private class EventoDeFoco implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {

		}

		@Override
		public void focusLost(FocusEvent e) {

			if (e.getSource() == campoTexto2) {

				if (!ValidateEmail.validateEmail(campoTexto2.getText())) {
					System.out.println("El email no es valido");
				} else {
					System.out.println("El email es valido");
				}

			}
		}

	}

}
