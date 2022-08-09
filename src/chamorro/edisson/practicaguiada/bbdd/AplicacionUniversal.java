package chamorro.edisson.practicaguiada.bbdd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

public class AplicacionUniversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBBDD marcoBBDD = new MarcoBBDD();
		
		marcoBBDD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBBDD extends JFrame{
	
	public MarcoBBDD() {
		
		setBounds(100,300,700,700);
		
		add(new PanelBBDD());
		
		setVisible(true);
		
	}
}

class PanelBBDD extends JPanel{
	
	private JComboBox tablas;
	
	private JTextArea info;
	
	private Connection conexionSqlServer;
	
	public PanelBBDD() {
		
		setLayout(new BorderLayout());
		
		tablas = new JComboBox();
		
		info = new JTextArea();
		
		add(tablas, BorderLayout.NORTH);
		
		add(info, BorderLayout.CENTER);
		
		conexion();
		
		nombreTablas();
		
		tablas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				info.setText("");
				obtenerDatosTabla((String)tablas.getSelectedItem());
			}
			
		});
		
		
	}
	
	
	public void conexion() {
		String conexionUrl = "jdbc:sqlserver://localhost:1433;"
				+"database=Northwind;"
				+"integratedSecurity=false;"
				+"encrypt=true;"
				+"trustServerCertificate=true;"
				+"user=edi;"
				+"password=1234e;"
				+"loginTimeout = 30;";
		 try {
			 conexionSqlServer = DriverManager.getConnection(conexionUrl);
			 JOptionPane.showMessageDialog(null, "Conexion Establecida");
			} catch (SQLException e) {
				// TODO: handle exception
				 e.printStackTrace();
			}
		
	}
	public void nombreTablas(){
	    ResultSet rs=null;
	   try {
	        DatabaseMetaData datosBBDD=conexionSqlServer.getMetaData();
			rs=datosBBDD.getTables(null,null,null,null);
			while(rs.next()) {
			    tablas.addItem(rs.getString("TABLE_NAME"));
			}
	   }catch(Exception e){
	        e.printStackTrace();
	    }
	}
	
	public void obtenerDatosTabla(String nombreTabla) {
		
		String consulta ="select * From "+nombreTabla;
		
		ArrayList<String> campos = new ArrayList<String>();
		
		
		 try {
			Statement st = conexionSqlServer.createStatement();
			
			ResultSet rs = st.executeQuery(consulta);
			
			ResultSetMetaData columnas = rs.getMetaData() ;
			
			for(int i=1;i<columnas.getColumnCount();i++) {
				
				campos.add(columnas.getColumnName(i));
				
			}
			while( rs.next()) {
				
				for(String campo:campos) {
					info.append(rs.getString(campo));
				}
				info.append("\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
}

