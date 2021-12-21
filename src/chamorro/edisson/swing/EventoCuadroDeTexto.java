package chamorro.edisson.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventoCuadroDeTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco mrk = new Marco();
		mrk.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class Marco extends JFrame {

	public Marco() {
		setBounds(600, 300, 600, 400);
		add(new Lamina());
		setVisible(true);
	}
}

class Lamina extends JPanel {

	public Lamina() {
		JTextField cuadroDeTexto = new JTextField(20);

		Document documento = cuadroDeTexto.getDocument();

		documento.addDocumentListener(new ListnerText());

		add(cuadroDeTexto);
	}

	private class ListnerText implements DocumentListener {

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has introducido texto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Borrado texto");
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub

		}

	}
}
