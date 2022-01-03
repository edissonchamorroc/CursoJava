package chamorro.edisson.swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class EjemploCombobox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoComboBox marcoCombo = new MarcoComboBox();
		marcoCombo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class MarcoComboBox extends JFrame{
	
	public MarcoComboBox() {
		setBounds(400, 200, 600, 500);
		add(new LaminaComboBox());
		setVisible(true);
	}
}
class LaminaComboBox extends JPanel{
	
	private JComboBox combo;
	private JLabel texto;
	private JPanel superior;
	public LaminaComboBox() {
		
		setLayout(new BorderLayout());
		
		combo= new JComboBox();
		
		combo.addItem("Serif");
		combo.addItem("Courier");
		combo.addItem("Arial");
		combo.addItem("SansSerif");
		combo.addItem("Monospaced");
		
		combo.addActionListener(new ManejarEventoCombo());
		superior= new JPanel();
		superior.add(combo);
		
		
		texto= new JLabel("En breve aprenderemos javafx");
		texto.setFont(new Font("Serif",Font.PLAIN,18));
		
		add(texto,BorderLayout.CENTER);
		add(superior,BorderLayout.NORTH);
	}
	private class ManejarEventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			texto.setFont(new Font((String)combo.getSelectedItem(),Font.PLAIN,18));
		}
		
	}
}
