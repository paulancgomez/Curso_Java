package ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	//REGISTRAR JDBC Driver
	//JDBC nombre del driver y URL de la BDD
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; //Aqui esta el objeto que me permite realizar una conexion
	private static final String URL_DB = "jdbc:mysql://localhost:3306/db_ejemplo"; //mil programadores es el nombre de mi base de datos
	//CREDENCIALES DE LA BBD
	private static final String USER = "root";     //USUARIO
	private static final String PASS = "41122022"; //CONTRASEÑA DE TU CUENTA
	
	
	public static void main(String[] args) throws SQLException {
		
		//GENERACION LA CONEXION
		Connection conn = DriverManager.getConnection(URL_DB, USER, PASS);
		
		//CREAMOS UN OBJETO QUE ENVIARA LAS SENTENCIAS
		Statement stm = conn.createStatement();
		
		//EJECUTAMOS LA SENTENCIA SQL Y OBTENEMOS UN ResultSet CON LOS DATOS
		ResultSet res = stm.executeQuery("SELECT * FROM ALUMNO");
		
		//RECORREMOS EL RS HASTA QUE NO HAYA SIGUIENTE
		while(res.next()) {
			System.out.println("Alumno: " + res.getString("nombre") + " " +res.getString("apellido"));  //MOSTRAMOS 'nombre' Y 'apellido' DE LA TABLA 'ALUMNO' DE LA BASE DE DATOS 'Clase20'
		}
		
		//CERRAMOS LAS CONEXIONES
		stm.close();
		conn.close();
	}

}
