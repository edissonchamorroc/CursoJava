package chamorro.edisson.mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static Connection conexion= null;
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USER = "edisson";
	private static final String PASS = "123";

	public Conexion() {
		
	}

	public static Connection getConexion() {
		
		try {
			conexion = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conexion;
	}

	
	
}
