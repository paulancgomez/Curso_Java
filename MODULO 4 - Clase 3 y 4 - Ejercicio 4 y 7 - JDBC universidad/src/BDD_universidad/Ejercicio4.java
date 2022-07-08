package BDD_universidad;

/*	Ejercicio 4

	Utilizando la BDD universidad creada en el práctico anterior agregar 3 alumnos y 1 docente
	en los registros de la tabla persona
*/

import java.sql.*;

public class Ejercicio4 {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/universidad";
	static final String USER = "root";
	static final String PASS = "41122022";

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		
		//PASO 3: Abrir una Conexion
		System.out.println("Conectando a la Base de Datos...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
		//PASO 4: Ejecutar una consulta SQL
		System.out.println("Creando statement...");
		stmt = conn.createStatement();
		
		String sql;
		
		sql = "INSERT INTO persona\r\n"
				+ "	VALUES\r\n"
				+ "		(14, '37293846M', 'Lucia', 'Sanchez', 'Perez', 'Salta', 'C/ Calle 123', '387733928', '2008-04-02', 'M', 'alumno'),\r\n"
				+ "		(15, '29483749S', 'Matilda', 'Vega', 'Gea', 'Rosario de Lerma' , 'C/ Calle 823', '387938172', '2002-04-04', 'M', 'alumno'),\r\n"
				+ "		(16, '39472647G', 'Mia', 'Bayer', 'Spencer', 'Salta', 'C/ Calle 132', '387392834', '2000-05-06', 'M', 'alumno'),\r\n"
				+ "		(17, '38293748A', 'Pia', 'Lakin', 'Lemke', 'Cerrillos' , 'C/ Calle 133', '387283664', '1928-06-01', 'M', 'profesor');";
		
		stmt.executeUpdate(sql);
		System.out.println("Valores insertados con Exito");
			
		//PASO 5: Entorno de Limpieza
		stmt.close();
		conn.close();

	}

}
