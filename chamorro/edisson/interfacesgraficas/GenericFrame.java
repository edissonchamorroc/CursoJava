package chamorro.edisson.interfacesgraficas;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GenericFrame extends JFrame {

	public GenericFrame(int operation, int px, int py, int wid, int hig, JPanel lamina) {

		setDefaultCloseOperation(operation);

		setBounds(px, py, wid, hig);

		setVisible(true);
		
		add(lamina);
	}

	public GenericFrame(int px, int py, int wid, int hig) {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setBounds(px, py, wid, hig);

		setVisible(true);
		
	}
	
}
