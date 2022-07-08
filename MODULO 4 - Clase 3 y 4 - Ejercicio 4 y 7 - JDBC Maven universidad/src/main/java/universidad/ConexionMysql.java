package universidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionMysql {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL_DB = "jdbc:mysql://localhost:3306/universidad";
	private static final String USER = "root";
	private static final String PASS = "41122022";
	
	//METODO ESTATICO QUE ME CREA UNA CONEXION A LA BASE DE DATOS
	public static Statement getStatement() {
		Connection conn = null;
		try {	
			conn = DriverManager.getConnection(URL_DB, USER, PASS);
			return conn.createStatement();                            //Devuelve una conexion
		}catch(SQLException exception){
			System.out.println(exception.getLocalizedMessage());      //Devuelve el mensaje del error
			return null;
		}
	}
	
}