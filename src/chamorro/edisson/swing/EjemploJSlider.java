package chamorro.edisson.swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class EjemploJSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSlider marco = new MarcoSlider();
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class MarcoSlider extends JFrame{
	
	public MarcoSlider() {
		setBounds(400, 200, 600, 500);
		add(new LaminaSlider());
		setVisible(true);
	}
}
class LaminaSlider extends JPanel{
	
	private JSlider slider;
	private JLabel texto;
	private JPanel superior= new JPanel();
	
	
	public LaminaSlider() {
		
		setLayout(new BorderLayout());
		slider = new JSlider(5,25,12);
		slider.setMinorTickSpacing(12);
		slider.setMajorTickSpacing(2);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				texto.setFont(new Font("Courier",Font.PLAIN,slider.getValue()));
			}
			
		});
		superior.add(slider);
		
		texto= new JLabel("Hola mundo");
		texto.setFont(new Font("Courier",Font.PLAIN,12));
		
		add(superior,BorderLayout.NORTH);
		add(texto);
	}
	
			
	
		
	}
	 

