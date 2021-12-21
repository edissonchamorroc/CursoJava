package chamorro.edisson.conexionbbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class conexionOracle {

	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USER = "edisson";
	private static final String PASS = "123";

	public static Statement stmt;
	public static Connection conexion;

	public conexionOracle() {
		conexion = null;
		stmt = null;
	}

	public static void conectar() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			JOptionPane.showMessageDialog(null, "Se ha conectado satisfactoriamente");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo conectar");
		}
	}

	public static void crearTabla() {

		try {
			stmt = conexion.createStatement();
			int r = 0;
			String sql = "CREATE TABLE usuarios (Nombre VARCHAR(20),Apellido VARCHAR(20),Email VARCHAR(30))";
			r = stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, (r + 1) + " tabla creada");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo crear tabla ");
		}

	}

	public static void agregarUser(String nombre, String apellido, String email) {

		try {
			int r=0;
			String sql = "INSERT INTO usuarios values('" + nombre + "','" + apellido + "','" + email + "')";
			stmt = conexion.createStatement();
			r = stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, (r + 1) + " Registro agregado");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, " No se pudo registrar");
		}

	}
	public static String nombreUsuario(String id) {
		try {
			String nombre="";
			stmt=conexion.createStatement();
			ResultSet result = stmt.executeQuery("SELECT nombre FROM usuarios WHERE apellido='"+id+"'");
			while(result.next()) {
				nombre=result.getString("nombre");
			}
			JOptionPane.showMessageDialog(null," Usuario leido con exito");
			return nombre;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null," Usuario no existe");
			return "";
		}
	}

	public static String leerUsuarios() {
		String usuario = "";
		try {
			stmt = conexion.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM usuarios");
			while (result.next()) {
				usuario += (result.getString("ID") + " " + result.getString("nombre") + " "
						+ result.getString("apellido") + " " + result.getString("email"));
				
				
			}
			JOptionPane.showMessageDialog(null," Usuarios leidos con exito");
			return usuario;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null," Usuario no existe");
			return "";
		}


	}
	public static void borrarUsuario(String id) {
		try {
			
			int r=0;
			stmt=conexion.createStatement();
			r=stmt.executeUpdate("delete from usuarios where nombre='"+id+"'");
			JOptionPane.showMessageDialog(null, (r + 1) + " usuario eliminado");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"usuario eliminado");
		}
	}
	
	public static void borrarTabla() {
		try {
			
			int r=0;
			stmt=conexion.createStatement();
			r=stmt.executeUpdate("drop table usuarios");
			JOptionPane.showMessageDialog(null, (r + 1) + " tabla eliminada");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"tabla no eliminada");
		}
	}



}
