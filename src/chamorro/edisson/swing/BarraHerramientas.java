package chamorro.edisson.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class BarraHerramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoHerramientas marco = new MarcoHerramientas();
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class MarcoHerramientas extends JFrame{
	
	public JPanel miLamina= new JPanel();
	
	public MarcoHerramientas() {
		setLayout(new BorderLayout());
		setBounds(200,100,300,300);
		add(miLamina);
		EventoColorFondo colorAzul=new EventoColorFondo("Azul",Color.BLUE, new ImageIcon("C:/Users/marce/eclipse-workspace/CursoJava/src/chamorro/edisson/swing/bolaAzul.png"));
		EventoColorFondo colorRojo=new EventoColorFondo("Rojo",Color.RED,new ImageIcon("C:/Users/marce/eclipse-workspace/CursoJava/src/chamorro/edisson/swing/bolaRojo.png"));
		EventoColorFondo colorVerde=new EventoColorFondo("Verde",Color.GREEN,new ImageIcon("C:/Users/marce/eclipse-workspace/CursoJava/src/chamorro/edisson/swing/bolaVerde.png"));
		JToolBar barraHerramientas = new JToolBar();
		barraHerramientas.add(colorAzul);
		barraHerramientas.add(colorRojo);
		barraHerramientas.add(colorVerde);
		add(barraHerramientas, BorderLayout.NORTH);
		setVisible(true);
	}
	private class EventoColorFondo extends AbstractAction{
		
		
		public EventoColorFondo(String nombre, Color color_fondo, Icon icono) {
			putValue(Action.NAME,nombre);
			putValue(Action.SMALL_ICON,icono);
			putValue("Color de Fondo",color_fondo);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c=(Color)getValue("Color de Fondo");
			
			miLamina.setBackground(c);
		}
		
	}
		
}

	
