package chamorro.edisson.conexionbbdd;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;

public class InterfazProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ManipularProducto db= new ManipularProducto();
		
		//db.agregarProducto("AR04","deportes", "tenis", "rojo", "22/10/2000", "No", "25000");
		//System.out.println(db.buscarProducto("AR02"));
		
		MarcoProductos productos = new MarcoProductos();
		productos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class MarcoProductos extends JFrame{
	
	private JPanel superior = new JPanel();
	private JPanel inferior = new JPanel();
	private JTextPane areaConsulta= new JTextPane();
	private JButton insertar, borrar;

	public MarcoProductos() {
		
		setLayout(new BorderLayout());
		setBounds(200,200,700,400);
		superior.setLayout(new GridLayout(4,4));
		setInputs(new JTextArea(),new JLabel("Código"));
		setInputs(new JTextArea(),new JLabel("Seccion"));
		setInputs(new JTextArea(),new JLabel("Nombre"));
		setInputs(new JTextArea(),new JLabel("Descripcion"));
		setInputs(new JTextArea(),new JLabel("Fecha"));
		setInputs(new JTextArea(),new JLabel("Importado"));
		setInputs(new JTextArea(),new JLabel("Precio"));
		
		add(superior,BorderLayout.NORTH);
		
		add(areaConsulta,BorderLayout.CENTER);
		
		insertar = new JButton("Insertar");
		borrar = new JButton("Borrar");
		inferior.add(insertar);
		inferior.add(borrar);
		
		add(inferior,BorderLayout.SOUTH);
		setVisible(true);
		
		
	}
	public void setInputs(JTextArea areaEntrada,JLabel etiqueta) {
		JTextArea area= areaEntrada;
		area.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		superior.add(etiqueta);
		superior.add(area);
		
	}
	private class EventoBotones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource().equals(insertar)) {
				//ManipularProducto.agregarProducto(, getName(), getName(), getName(), getTitle(), getWarningString(), getName());
			}else {
				
			}
		}
		
	}
	
}
