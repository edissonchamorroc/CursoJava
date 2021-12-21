package chamorro.edisson.swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventoCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCheck markd = new MarcoCheck();
		markd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoCheck extends JFrame {

	public MarcoCheck() {
		setBounds(600, 300, 600, 400);
		add(new LaminaCheck());
		setVisible(true);
	}
}

class LaminaCheck extends JPanel{
	
	private JCheckBox boxNegrita, boxCursiva;
	private JLabel texto;
	
	
	public LaminaCheck() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("Edisso chamorro");
		
		texto.setFont(new Font("Courier",Font.PLAIN,24));
		
		JPanel superior = new JPanel();
		JPanel inferior = new JPanel();
			
		superior.add(texto);
		
		boxNegrita = new JCheckBox("Negrita");
		boxCursiva = new JCheckBox("Cursiva");
		
		boxNegrita.addActionListener(new ManejaCheck());
		boxCursiva.addActionListener(new ManejaCheck());
		
		
		inferior.add(boxNegrita);
		inferior.add(boxCursiva);
		
		add(superior,BorderLayout.NORTH);
		add(inferior,BorderLayout.SOUTH);
		
	}
	private class ManejaCheck implements ActionListener{
		
		private int negrita_cursiva=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(boxNegrita.isSelected()) negrita_cursiva+=Font.BOLD;
			
			if(boxCursiva.isSelected()) negrita_cursiva+=Font.ITALIC;
			
			texto.setFont(new Font( "Courier",negrita_cursiva,24));
			
			negrita_cursiva=0;
		}
		
	}
}