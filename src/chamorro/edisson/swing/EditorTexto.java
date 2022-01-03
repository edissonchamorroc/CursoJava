package chamorro.edisson.swing;

import static chamorro.edisson.swing.EstiloLetra.getEstiloLetra;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.text.StyledEditorKit;

public class EditorTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEditor marco = new MarcoEditor();
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoEditor extends JFrame {

	public MarcoEditor() {
		setBounds(400, 100, 500, 600);
		add(new LaminaEditor());
		setVisible(true);
	}
}

class LaminaEditor extends JPanel {

	private JPanel superior = new JPanel();
	private JMenuBar menu = new JMenuBar();
	private JMenu fuente, estilo, tamano;
	private JTextPane areaTexto = new JTextPane();
	private JToolBar barraHerramientas = new JToolBar();

	public LaminaEditor() {
		setLayout(new BorderLayout());

		add(areaTexto, BorderLayout.CENTER);
		// ----------------
		fuente = new JMenu("Fuente");
		configurarMenu("fuente", "Arial");
		configurarMenu("fuente", "Courier");
		configurarMenu("fuente", "Verdana");

		// --------items estilo
		estilo = new JMenu("Estilo");

		configurarMenu("estilo", "Negrita");
		configurarMenu("estilo", "Cursiva");

		// --------items tamano
		tamano = new JMenu("Tamaño");
		configurarMenu("Tamano", "8");
		configurarMenu("Tamano", "12");
		configurarMenu("Tamano", "24");
		configurarMenu("Tamano", "32");
		configurarMenu("Tamano", "43");

		menu.add(fuente);
		menu.add(estilo);
		menu.add(tamano);
		superior.add(menu);
		add(superior, BorderLayout.NORTH);

		// ---barra herramientas

		configura_barra("C:/Users/marce/eclipse-workspace/CursoJava/src/chamorro/edisson/swing/bolaAzul.png")
				.addActionListener(new StyledEditorKit.ForegroundAction("letra azul", Color.BLUE));
		configura_barra("C:/Users/marce/eclipse-workspace/CursoJava/src/chamorro/edisson/swing/bolaRoja.png")
				.addActionListener(new StyledEditorKit.ForegroundAction("letra azul", Color.RED));

		configura_barra("C:/Users/marce/eclipse-workspace/CursoJava/src/chamorro/edisson/swing/bolaVerde.png")
				.addActionListener(new StyledEditorKit.ForegroundAction("letra azul", Color.GREEN));
		
		configura_barra("C:/Users/marce/eclipse-workspace/CursoJava/src/chamorro/edisson/swing/iconoIzquierda.jpg")
		.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
		
		configura_barra("C:/Users/marce/eclipse-workspace/CursoJava/src/chamorro/edisson/swing/iconoDerecha.jpg")
		.addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
		
		configura_barra("C:/Users/marce/eclipse-workspace/CursoJava/src/chamorro/edisson/swing/iconoCentro.jpg")
		.addActionListener(new StyledEditorKit.AlignmentAction("Centrado", 1));
		
		configura_barra("C:/Users/marce/eclipse-workspace/CursoJava/src/chamorro/edisson/swing/iconoJustificado.jpg")
		.addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));
		
		barraHerramientas.setOrientation(1);
		add(barraHerramientas, BorderLayout.WEST);

	}

	public void configurarMenu(String menu, String menuItem) {
		JMenuItem elemento = new JMenuItem(menuItem);
		if (menu.equalsIgnoreCase("fuente")) {
			fuente.add(elemento);
			elemento.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia letra", menuItem));
		}
		if (menu.equalsIgnoreCase("estilo")) {
			estilo.add(elemento);
			try {
				if (getEstiloLetra(menuItem) == Font.BOLD)
					elemento.addActionListener(new StyledEditorKit.BoldAction());

				else
					elemento.addActionListener(new StyledEditorKit.ItalicAction());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (menu.equalsIgnoreCase("tamano")) {
			tamano.add(elemento);
			elemento.addActionListener(new StyledEditorKit.FontSizeAction("tamano", Integer.parseInt(menuItem)));
		}

	}

	public JButton configura_barra(String ruta) {
		JButton boton = new JButton(new ImageIcon(ruta));
		barraHerramientas.add(boton);
		return boton;
	}

	public void setAling(String nombreColor, Color color) {

	}
}