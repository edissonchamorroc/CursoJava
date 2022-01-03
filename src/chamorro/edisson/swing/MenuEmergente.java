package chamorro.edisson.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class MenuEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMenuEmergente marco = new MarcoMenuEmergente();
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoMenuEmergente extends JFrame {

	public MarcoMenuEmergente() {

		setBounds(200, 100, 300, 300);
		add(new LaminaMenuEmergente());
		setVisible(true);
	}
}

class LaminaMenuEmergente extends JPanel {

	public LaminaMenuEmergente() {
		JPopupMenu emergente = new JPopupMenu();

		JMenuItem azul = new JMenuItem("azul");
		azul.addActionListener(new EventoColorFondo(Color.BLUE));
		JMenuItem rojo = new JMenuItem("rojo");
		rojo.addActionListener(new EventoColorFondo(Color.RED));
		JMenuItem verde = new JMenuItem("verde");
		verde.addActionListener(new EventoColorFondo(Color.GREEN));

		emergente.add(azul);

		emergente.add(rojo);

		emergente.add(verde);

		setComponentPopupMenu(emergente);

	}

	private class EventoColorFondo extends AbstractAction {

		public EventoColorFondo(Color color_fondo) {

			putValue("Color de Fondo", color_fondo);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c = (Color) getValue("Color de Fondo");

			setBackground(c);
		}

	}

}
