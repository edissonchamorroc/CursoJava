package chamorro.edisson.swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.FontSizeAction;

public class EjercicioCompletoSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEjercicioCompleto marco = new MarcoEjercicioCompleto();
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoEjercicioCompleto extends JFrame {

	public MarcoEjercicioCompleto() {
		setBounds(200, 100, 400, 500);
		add(new LaminaEjercicioCompleto());
		setVisible(true);
	}
}

class LaminaEjercicioCompleto extends JPanel {

	private JMenuBar menu = new JMenuBar();
	private JMenu fuente, estilo, tamano;
	private JSpinner tamanoS;
	private JPanel superior = new JPanel();
	private JTextPane areaTexto = new JTextPane();
	private int tamanoLetra;

	public LaminaEjercicioCompleto() {
		// ------- difiniendo estructura de lamina principal
		setLayout(new BorderLayout());

		add(areaTexto, BorderLayout.CENTER);
		// --------- items fuente
		fuente = new JMenu("Fuente");
		configurarMenu("fuente", "Arial", 0);
		configurarMenu("fuente", "Courier", 0);
		configurarMenu("fuente", "Verdana", 0);

		// --------items estilo
		estilo = new JMenu("Estilo");

		configurarMenu("estilo", "Negrita", 1);
		configurarMenu("estilo", "Cursiva", 2);

		// --------items tamano
		tamano = new JMenu("Tamaño");
		
		configurarMenu("tamano","",0);

		tamanoS = new JSpinner(new SpinnerNumberModel(12, 8, 30, 1));

		tamanoS.addChangeListener(new SpinnerEvent());

		tamano.add(tamanoS);
		// -------- estableciendo la barra de menu
		menu.add(fuente);
		menu.add(estilo);
		menu.add(tamano);
		superior.add(menu);
		// -----------
		add(superior, BorderLayout.NORTH);

	}

	public void configurarMenu(String menu, String rotulo, int estilos) {
		JMenuItem elemento = new JMenuItem(rotulo);

		if (menu == "fuente") {
			fuente.add(elemento);
			elemento.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia letra", rotulo));
		}
		if (menu == "estilo") {
			estilo.add(elemento);
			if(estilos==Font.BOLD)  elemento.addActionListener(new StyledEditorKit.BoldAction());
				
			else elemento.addActionListener(new StyledEditorKit.ItalicAction());
		}
		if(menu=="tamano") {
			System.out.println(tamanoLetra);
			elemento.addActionListener(new StyledEditorKit.FontSizeAction("tamano",tamanoLetra));
		}

		//elemento.addActionListener(new EventosMenu(rotulo, estilos));
	}

	private class EventosMenu implements ActionListener {
		private String rotulo;

		private int estilo;
		private int tamanoLet;

		public EventosMenu(String rotulo, int estilo) {
			this.rotulo = rotulo;
			this.estilo = estilo;

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if (rotulo == "Courier" || rotulo == "Arial" || rotulo == "Verdana") {
				estilo = areaTexto.getFont().getStyle();
				tamanoLet = areaTexto.getFont().getSize();

			} else if (rotulo == "Negrita" || rotulo == "Cursiva") {
				rotulo = areaTexto.getFont().getFontName();
				tamanoLet = areaTexto.getFont().getSize();
			} else if (tamanoLet >= 8) {
				rotulo = areaTexto.getFont().getFontName();
				estilo = areaTexto.getFont().getStyle();
			}

			areaTexto.setFont(new Font(rotulo, estilo, tamanoLet));

		}

	}

	private class SpinnerEvent implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			tamanoLetra = Integer.parseInt(tamanoS.getValue().toString());
			
			
			
		
			//areaTexto.setFont(new Font(areaTexto.getFont().getFontName(), areaTexto.getFont().getStyle(), tamanoLetra));
		}

	}
}
