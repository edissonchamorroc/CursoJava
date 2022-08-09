package chamorro.edisson.mvc.controlador;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;

import chamorro.edisson.mvc.modelo.CargaMenus;
import chamorro.edisson.mvc.vista.MarcoMVC;

public class ControladorCargaMenus extends WindowAdapter {

	private MarcoMVC vista;

	private CargaMenus objetoCargaMenus;

	private ResultSet[] resultadosRecibidos= new ResultSet[2] ;

	public ControladorCargaMenus(MarcoMVC vista) {

		this.vista = vista;
	}

	public void windowOpened(WindowEvent e) {
		
		resultadosRecibidos = objetoCargaMenus.ejecutaConsultas();

		try {

			while (resultadosRecibidos[0].next()) {

				vista.getSecciones().addItem(resultadosRecibidos[0].getString(1));
			}

			while (resultadosRecibidos[1].next()) {

				vista.getNombres().addItem(resultadosRecibidos[1].getString(1));
			}
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}

	}
}
