package chamorro.edisson.interfacesgraficas;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujandoEnJFrame {

	public static void main(String[] args) {
	
		MarcoDibujos marco = new MarcoDibujos();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoDibujos extends JFrame {

	public MarcoDibujos() {

		setBounds(300, 300, 800, 450);

		LaminaDibujos lamina = new LaminaDibujos();

		add(lamina);

		setVisible(true);
	}
}

class LaminaDibujos extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g1 = (Graphics2D) g;

		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);

		BasicStroke trazo = new BasicStroke(4);

		g1.setStroke(trazo);

		g1.draw(rectangulo);

	}
}
