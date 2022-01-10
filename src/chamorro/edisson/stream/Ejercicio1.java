package chamorro.edisson.stream;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFichero marco = new MarcoFichero();
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoFichero extends JFrame {

	public MarcoFichero() {
		setBounds(200, 200, 400, 500);
		add(new LaminaFichero());
		setVisible(true);
	}
}

class LaminaFichero extends JPanel {
	private JTextPane textPanel = new JTextPane();
	private JPanel inferior = new JPanel();
	private JButton escribir,leer,borrar;

	public LaminaFichero() {

		setLayout(new BorderLayout());
		escribir = new JButton("Escribir");
		leer = new JButton("Leer");
		borrar = new JButton("Borrar");
		escribir.addActionListener(new EventButton());
		leer.addActionListener(new EventButton());
		borrar.addActionListener(new EventButton());
		
		inferior.add(escribir);
		inferior.add(leer);
		inferior.add(borrar);


		add(textPanel, BorderLayout.CENTER);
		add(inferior, BorderLayout.SOUTH);

	}

	private class EventButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String texto="";
		
			try {
				if (e.getSource() == escribir) {
					FileWriter escritura = new FileWriter("C:/Users/marce/Documents/Edisson/fichero_escritura.txt");

					for (int i = 0; i < textPanel.getText().length(); i++) {
						
						escritura.write(textPanel.getText().charAt(i));
					}
					escritura.close();
				}
				if (e.getSource() == leer) {
					FileReader entrada = new FileReader("C:/Users/marce/Documents/Edisson/fichero_escritura.txt");

					int caracter = entrada.read();

					while (caracter > 0) {
						texto += (char)caracter;
						caracter = entrada.read();

					}
					textPanel.setText(texto);
					entrada.close();
				}
				if(e.getSource() == borrar) {
					textPanel.setText("");
				}
			} catch (IOException ex) {
				ex.getStackTrace();
			}

		}

	}
}