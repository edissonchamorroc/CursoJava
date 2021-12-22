package chamorro.edisson.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.Document;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEjercicio marco = new MarcoEjercicio();
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoEjercicio extends JFrame {
	public MarcoEjercicio() {
		setBounds(400, 200, 600, 500);
		add(new LaminaEjercicio());
		setVisible(true);
	}
}

class LaminaEjercicio extends JPanel {

	public JPanel superior = new JPanel();
	private JPanel inferior = new JPanel();
	private JPanel medio = new JPanel();
	private JRadioButton rBoton1, rBoton2;
	private JCheckBox box1, box2;
	private JButton boton1, boton2;
	private JTextArea area1;
	private JTextField nombre, apellido;
	private JLabel lNombre, Lapellido;

	public LaminaEjercicio() {
		setLayout(new BorderLayout());

		lNombre = new JLabel("Nombre");
		nombre = new JTextField(20);
		Lapellido = new JLabel("Apellido");
		apellido = new JTextField(20);

		superior.add(lNombre);
		superior.add(nombre);
		superior.add(Lapellido);
		superior.add(apellido);

		area1 = new JTextArea(20, 30);

		JScrollPane laminaScroll = new JScrollPane(area1);

		area1.setLineWrap(true);

		medio.add(laminaScroll);

		boton1 = new JButton("Boton 1");
		boton1.addActionListener(new ManejoEventos());
		boton2 = new JButton("Boton 2");
		boton2.addActionListener(new ManejoEventos());
		box1 = new JCheckBox("Casilla 1");
		box1.addActionListener(new ManejoEventos());
		box2 = new JCheckBox("Casilla 2");
		box2.addActionListener(new ManejoEventos());

		ButtonGroup grupoBotones = new ButtonGroup();

		rBoton1 = new JRadioButton("radio 1");
		rBoton2 = new JRadioButton("radio 2");

		grupoBotones.add(rBoton1);
		grupoBotones.add(rBoton2);

		inferior.add(boton1);
		inferior.add(boton2);
		inferior.add(box1);
		inferior.add(box2);
		inferior.add(rBoton1);
		inferior.add(rBoton2);

		add(superior, BorderLayout.NORTH);
		add(medio, BorderLayout.CENTER);
		add(inferior, BorderLayout.SOUTH);

	}

	private class ManejoEventos implements ActionListener {
		
		private int contador=0;
		private String resultado="";
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		 
		  if(contador==0) {
			  resultado+=nombre.getText()+" "+apellido.getText()+" realiza las siguientes acciones:\n";
		  }
		  if(e.getSource()==boton1)  resultado+="Boton 1 pulsado\n";
		  if(e.getSource()==boton2)  resultado+="Boton 2 pulsado\n";
		  if(e.getSource()==box1) {
			  if(box1.isSelected())  resultado+="Casilla 1 seleccionada\n";
			  else resultado+="Casilla 1 desactivada\n";
				  
		  }
		  if(e.getSource()==box2) {
			  if(box2.isSelected())  resultado+="Casilla 2 seleccionada\n";
			  else resultado+="Casilla 2 desactivada\n";
				  
		  }
		  if(e.getSource()==rBoton1) {
			  if(box1.isSelected())  resultado+="Radio 1 seleccionado\n";
			  else resultado+="radio 2 desactivado\n";
				  
		  }
		  if(e.getSource()==rBoton2) {
			  if(box1.isSelected())  resultado+="radio 2 seleccionado\n";
			  else resultado+="radio 2 desactivado\n";
				  
		  }
		  area1.setText(resultado);
		  contador++;
		}

	}
}