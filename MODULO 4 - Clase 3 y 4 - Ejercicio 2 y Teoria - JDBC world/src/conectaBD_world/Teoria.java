package conectaBD_world;

//PASO 1: Importar paquetes requeridos
import java.sql.*;

public class Teoria {
	
	//Registar JDBC Driver
	//JDBC nombre del driver y URL de la BDD
	
	//JDBC_DRIVER: Esto le especifica cuál será el driver que utilizaremos para acceder a la BDD.
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	//DB_URL: Aqui le proporcionaremos la dirección en la que se encuentra la BDD a la que queremos acceder.
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";
	//Credenciales de la BDD
	//USER: Este es el nombre del usuario con el que accederemos, por defecto a la hora de instalar quedó el usuario “root” .
	static final String USER = "root";
	//PASS: La contraseña que teníamos que guardar para poder acceder con nuestro driver a la BDD.
	static final String PASS = "41122022";

	public static void main(String[] args) throws SQLException{
		//Aquí vamos Registrar el Driver
		Connection conn = null;
		Statement stmt = null;
		
		//Aquí vamos a Conectarnos a la BDD con las credenciales que le proporcionamos
		//PASO 3: Abrir una Conexion
		System.out.println("Conectando a la Base de Datos...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
		//Aquí vamos a crear el objeto Statement para poder correr nuestras sentencias SQL
		//PASO 4: Ejecutar una consulta SQL
		System.out.println("Creando statement...");
		stmt = conn.createStatement();
		String sql;
		sql = "SELECT Name, Code, Population FROM country";
		ResultSet rs = stmt.executeQuery(sql); 
		long poblacion = 0;
		
		//PASO 5: Extraer datos del Resultset
		while(rs.next()) {
			//Recibir por tipo de columna
			int population = rs.getInt("Population");
			String Name = rs.getString("Name");
			String CountryCode = rs.getString("Code");
			
			poblacion+=rs.getLong("Population");
			
			//Mostrar valores
			System.out.print("Pais: " + Name);
			System.out.print(", Codigo Pais: " + CountryCode);
			System.out.print(", Poblacion: " + population + " habitantes");
			System.out.println();
			
		}
		//EJERCICIO: Podrías determinar cuántas personas existen en el mundo según esta BDD ?
		System.out.println("La poblacion mundial es: " + poblacion);
		
		//PASO 6: Entorno de Limpieza
		rs.close();
		stmt.close();
		conn.close();
		

	}

}
