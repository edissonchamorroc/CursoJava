package chamorro.edisson.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import chamorro.edisson.mvc.modelo.EjecutaConsultas;
import chamorro.edisson.mvc.vista.MarcoMVC;

public class ControladorBoton implements ActionListener {

	private MarcoMVC vista;
	private EjecutaConsultas consultaDesdeBoton;
	private ResultSet resultadoConsulta;

	public ControladorBoton(MarcoMVC vista) {

		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String seleccionVistaSecciones = (String) vista.getSecciones().getSelectedItem();
		String seleccionVistaNombres = (String) vista.getNombres().getSelectedItem();

		resultadoConsulta = consultaDesdeBoton.consultaBBDD(seleccionVistaSecciones, seleccionVistaNombres);
		vista.getTextArea().setText(" ");
		try {
			while (resultadoConsulta.next()) {
				
				for(int i=1;i<7;i++) {
					vista.getTextArea().append(resultadoConsulta.getString(i));
					vista.getTextArea().append("-");
				}
				vista.getTextArea().append("\n");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
