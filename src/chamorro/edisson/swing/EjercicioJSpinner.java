package chamorro.edisson.swing;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EjercicioJSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSpinner marco = new MarcoSpinner();
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoSpinner extends JFrame {

	public MarcoSpinner() {
		setBounds(200, 200, 400, 100);
		add(new LaminaSpinner());
		setVisible(true);
	}
}

class LaminaSpinner extends JPanel {

	private JSpinner spiner1,spiner2;

	public LaminaSpinner() {
		String[] meses = { "ene", "feb", "mar", "abr", "may", "jun" };
		spiner1 = new JSpinner(new SpinnerListModel(meses));
		spiner1.setPreferredSize(new Dimension(200,20));
		spiner2=new JSpinner(new SpinnerNumberModel(3,-2,13,1));
		spiner1.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				System.out.println(spiner1.getValue());
			}

		});
		add(spiner1);
		add(spiner2);
	}
}
