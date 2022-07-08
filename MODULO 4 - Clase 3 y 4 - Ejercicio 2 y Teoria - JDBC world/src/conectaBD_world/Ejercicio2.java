package conectaBD_world;

/*	Ejercicio 2

	Utilizando la BDD world del práctico anterior realizar una consulta para conocer de la tabla
	country los atributos Nombre, Code, Population y formatear la salida para que la información
	detalle el codigo del pais el nombre y la cantidad de habitantes de ese país
	Ejemplo :
	"ARS: Argentina 40.000.000 habitantes."
*/

import java.sql.*;

public class Ejercicio2 {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";
	static final String USER = "root";
	static final String PASS = "41122022";

	public static void main(String[] args) throws SQLException{
		Connection conn = null;
		Statement stmt = null;
		
		//PASO 3: Abrir una Conexion
		System.out.println("Conectando a la Base de Datos...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
		//PASO 4: Ejecutar una consulta SQL
		System.out.println("Creando statement...");
		stmt = conn.createStatement();
		String sql;
		sql = "SELECT Name, Code, Population FROM country";
		ResultSet rs = stmt.executeQuery(sql); 
		
		//PASO 5: Extraer datos del ResultSet
		while(rs.next()) {
			int population = rs.getInt("Population");   //Guardamos la poblacion
			String Name = rs.getString("Name");         //Guardamos el nombre
			String CountryCode = rs.getString("Code");  //Guardamos el codigo
				
			//Mostrar valores
			System.out.println(CountryCode + ": " + Name + " " + population + " habitantes.");
		}
			
		//PASO 6: Entorno de Limpieza
		rs.close();
		stmt.close();
		conn.close();
	}

}
