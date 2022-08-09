package chamorro.edisson.mvc.vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import chamorro.edisson.mvc.controlador.ControladorBoton;
import chamorro.edisson.mvc.controlador.ControladorCargaMenus;

public class MarcoMVC extends JFrame {

	private JPanel superior = new JPanel();
	private static JComboBox secciones, nombres;
	private static JTextArea resultados;
	private JButton boton;

	public MarcoMVC() {
		setTitle("Consulta Artículos");
		setLayout(new BorderLayout());
		setBounds(300, 200, 400, 400);

		secciones = new JComboBox();
		secciones.addItem("Todos");

		nombres = new JComboBox();
		nombres.addItem("Todos");

		superior.add(secciones);
		superior.add(nombres);

		add(superior, BorderLayout.NORTH);

		resultados = new JTextArea(4, 50);
		add(resultados, BorderLayout.CENTER);

		boton = new JButton("Buscar");
		boton.addActionListener(new ControladorBoton(this));
		add(boton, BorderLayout.SOUTH);
		setVisible(true);

		addWindowListener(new ControladorCargaMenus(this));
	}

	public static JComboBox getSecciones() {
		return secciones;
	}

	public static JComboBox getNombres() {
		return nombres;
	}

	public static JTextArea getTextArea() {
		return resultados;
	}
}
