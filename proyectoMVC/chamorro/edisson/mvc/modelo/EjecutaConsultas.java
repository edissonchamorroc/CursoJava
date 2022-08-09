package chamorro.edisson.mvc.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EjecutaConsultas {

	private static String seleccion;
	private static Conexion conexion;
	private static ResultSet result;
	private static PreparedStatement statement;
	private static final String CONSULTA_SECCION = "SELECT SECCION,NOMBRE, DESCRIPCION, FECHA , IMPORTADO, PRECIO FROM PRODUCTOS WHERE SECCION = ?";
	private static final String CONSULTA_NOMBRE = "SELECT SECCION,NOMBRE, DESCRIPCION, FECHA , IMPORTADO, PRECIO FROM PRODUCTOS WHERE NOMBRE = ?";
	private static final String CONSULTA_AMBOS = "SELECT SECCION,NOMBRE, DESCRIPCION, FECHA , IMPORTADO, PRECIO FROM PRODUCTOS WHERE SECCION = ? AND WHERE NOMBRE = ?";

	public static ResultSet consultaBBDD(String seccion, String nombre) {
		Connection conector = conexion.getConexion();

		result = null;

		try {
			if (!seccion.equals("Todos") && nombre.equals("Todos")) {

				statement = conector.prepareStatement(CONSULTA_SECCION);

				statement.setString(1, seccion);

				result = statement.executeQuery();

			} else if (seccion.equals("Todos") && !nombre.equals("Todos")) {

				statement = conector.prepareStatement(CONSULTA_NOMBRE);

				statement.setString(1, nombre);

				result = statement.executeQuery();
			} else if (seccion.equals("Todos") && nombre.equals("Todos")) {
				statement = conector.prepareStatement(CONSULTA_AMBOS);

				statement.setString(1, "*");
				statement.setString(2, "*");

				result = statement.executeQuery();
			} else {
				statement = conector.prepareStatement(CONSULTA_AMBOS);

				statement.setString(1, seccion);
				statement.setString(2, nombre);

				result = statement.executeQuery();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block

		}
		return result;
	}
}
