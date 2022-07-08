package trabajo_practico;

/*	Ejercicio 3: CONSULTAS
	
	Crear la Base de Datos auto_shop explicada en la teoría y realizar una consulta relevante
	de los datos contenidos dentro de la BDD existente
*/

import java.sql.*;

public class Ejercicio3 {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/auto_shop";
	static final String USER = "root";
	static final String PASS = "41122022";

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		Statement stmt2 = null;
		
		//PASO 3: Abrir una Conexion
		System.out.println("Conectando a la Base de Datos...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
		//PASO 4: Ejecutar una consulta SQL
		System.out.println("Creando statement...");
		stmt = conn.createStatement();
		stmt2 = conn.createStatement();
		
		String sql;
		
		sql = "SELECT FName, LName, Email FROM customers";
		ResultSet rs = stmt.executeQuery(sql);
		sql = "SELECT Model, TotalCost FROM cars";
		ResultSet rs2 = stmt2.executeQuery(sql); 
		
		//PASO 5: Extraer datos del ResultSet
		while(rs.next()) {
			String fname = rs.getString("FName");
			String lname = rs.getString("LName");
			String email = rs.getString("Email");
				
			//Mostrar valores
			System.out.println("Nombre: " + fname + " " + lname + " Email: " + email);
		}
		
		while(rs2.next()) {
			String model = rs2.getString("Model");
			int costo = rs2.getInt("TotalCost");
				
			//Mostrar valores
			System.out.println("Modelo: " + model + " Costo: " + costo);
		}
			
		//PASO 6: Entorno de Limpieza
		rs.close();
		rs2.close();
		stmt.close();
		stmt2.close();
		conn.close();

	}

}
