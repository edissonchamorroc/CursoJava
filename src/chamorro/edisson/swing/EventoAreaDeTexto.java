package chamorro.edisson.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EventoAreaDeTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco1 mrk = new Marco1();
		mrk.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class Marco1 extends JFrame {

	public Marco1() {
		setBounds(600, 300, 600, 400);
		add(new Lamina1());
		setVisible(true);
	}
}

class Lamina1 extends JPanel {

	public Lamina1() {
		JTextArea areaDeTexto = new JTextArea(7, 25);
		
		JScrollPane laminaScroll = new JScrollPane(areaDeTexto);

		areaDeTexto.setLineWrap(true);

		add(laminaScroll);
		
		JButton boton = new JButton("getter");
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(areaDeTexto.getText());
			}
			
		});
		
		add(boton);
	}

}
