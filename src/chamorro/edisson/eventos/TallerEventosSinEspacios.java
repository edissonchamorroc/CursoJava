package chamorro.edisson.eventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import chamorro.edisson.interfacesgraficas.GenericFrame;
import chamorro.edisson.utils.ValidateEmail;

public class TallerEventosSinEspacios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaminaDeCampos lamina = new LaminaDeCampos();
		GenericFrame frame = new GenericFrame(JFrame.DISPOSE_ON_CLOSE, 300, 200, 300, 200, lamina);
	}

}

class LaminaDeCampos extends JPanel {

	private JTextField campoUsuario;
	private JTextField campoContrasena;
	private JTextField campoEmail;
	private JLabel etiquetaUsuario;
	private JLabel etiquetaContrasena;
	private JLabel etiquetaEmail;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		campoUsuario = new JTextField();
		campoContrasena = new JTextField();
		campoEmail = new JTextField();

		etiquetaUsuario = new JLabel("Usuario");
		etiquetaContrasena = new JLabel("Contrasena");
		etiquetaEmail = new JLabel("Email ");

		campoUsuario.setBounds(100, 30, 100, 20);
		campoContrasena.setBounds(100, 60, 100, 20);
		campoEmail.setBounds(100, 100, 100, 20);

		etiquetaUsuario.setBounds(30, 30, 100, 20);
		etiquetaContrasena.setBounds(30, 60, 100, 20);
		etiquetaEmail.setBounds(30, 100, 100, 20);

		add(campoUsuario);
		add(campoContrasena);
		add(campoEmail);

		add(etiquetaUsuario);
		add(etiquetaContrasena);
		add(etiquetaEmail);

		campoUsuario.addFocusListener(new foco());
		campoContrasena.addFocusListener(new foco());
		campoEmail.addFocusListener(new foco());

	}

	private class foco implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
				
		}

		@Override
		public void focusLost(FocusEvent e) {

			if (e.getSource() == campoUsuario & campoUsuario.getText().isEmpty()) {

				JOptionPane.showMessageDialog(null, "No se puede Usuario en blanco");
				campoUsuario.requestFocus();
				

			}
			if (e.getSource() == campoContrasena & campoContrasena.getText().isEmpty()) {

				JOptionPane.showMessageDialog(null, "No se puede Contraseña en blanco");
				campoContrasena.requestFocus();
				

			}
			

		}

	}

}
