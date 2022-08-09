package chamorro.edisson.conexionbbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ManipularProducto {

	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USER = "edisson";
	private static final String PASS = "123";

	public static Statement stmt;
	public static Connection conexion;

	public static void conectar() {
		try {
			// Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			JOptionPane.showMessageDialog(null, "Se ha conectado satisfactoriamente");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo conectar");
		}
	}

	public static void agregarProducto(String codigo, String seccion, String nombre, String descripcion, String fecha,
			String importado, String precio) {

		try {
			conectar();

			String sqlInstrution = "INSERT INTO PRODUCTOS values('" + codigo + "','" + seccion + "','" + nombre + "','"
					+ descripcion + "','" + fecha + "','" + importado + "','" + precio + "')";
			stmt = conexion.createStatement();
			stmt.executeUpdate(sqlInstrution);
			conexion.close();
			JOptionPane.showMessageDialog(null, " Registro agregado");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, " No se pudo agregar producto");
		}

	}

	public void borrarProducto(String codigo) {

		try {
			conectar();
			stmt = conexion.createStatement();
			stmt.executeUpdate("delete from usuarios where Email='" + codigo + "'");
			conexion.close();
			JOptionPane.showMessageDialog(null, " producto eliminado");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "producto no eliminado");
		}
	}

	public String buscarProducto(String codigo) {

		try {
			String producto = "";
			conectar();
			stmt = conexion.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM PRODUCTOS WHERE CODIGO='" + codigo + "'");

			while (result.next()) {
				producto += (result.getString("codigo") + " " + result.getString("seccion") + " "
						+ result.getString("nombre") + " " + result.getString("descripcion") + " "
						+ result.getString("fecha") + " " + result.getString("importado") + " "
						+ result.getString("precio"));
			}

			conexion.close();
			return producto;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, " producto no existe");
			return "";
		}
	}

}
