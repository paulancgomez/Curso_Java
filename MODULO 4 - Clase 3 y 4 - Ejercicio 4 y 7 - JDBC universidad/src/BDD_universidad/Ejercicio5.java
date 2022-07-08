package BDD_universidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*	Ejercicio 5: NO SE PUEDE

	Utilizando de la BDD universidad eliminar los siguientes registros dentro de la Tabla asignatura

	- Álgebra lineal y matemática discreta
	- Cálculo (NO SE PUEDE PORQUE Calculo ES CLAVE FORANEA, hay alumnos matriculados en Calculo)
	- Estadística

*/

import java.sql.*;

public class Ejercicio5 {
	
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
		
		//ELIMINAMOS UNA PERSONA
		sql = "DELETE FROM persona WHERE nombre = 'Pedro'";
		
		stmt.executeUpdate(sql);
		System.out.println("Valores eliminados con Exito");
			
		//PASO 5: Entorno de Limpieza
		stmt.close();
		conn.close();

	}

}
