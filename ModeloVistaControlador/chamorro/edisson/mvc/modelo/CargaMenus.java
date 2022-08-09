package chamorro.edisson.mvc.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CargaMenus {

	private static Conexion conexion;
	private static ResultSet[] resultados = new ResultSet[2];;
	private static Statement secciones,nombres;
	

	
	public static ResultSet [] ejecutaConsultas() {
		
		ResultSet resSec= null;
		
		ResultSet resNomb= null;
		
		Connection accesoBBDD = conexion.getConexion();
		
		try {
			secciones=accesoBBDD.createStatement();
			
			nombres=accesoBBDD.createStatement();
			
			resSec=secciones.executeQuery("SELECT DISTINCT SECCION FROM PRODUCTOS");
			
			resNomb=nombres.executeQuery("SELECT DISTINCT NOMBRE FROM PRODUCTOS");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		resultados[0]=resSec;
		resultados[1]=resNomb;
		return resultados;
	}
	

}
