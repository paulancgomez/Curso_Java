package supermark;

public class Credenciales {
	
	//ATRIBUTOS
	public String JDBC_DRIVER; 
	public String DB_URL;
	
	//CREDENCIALES de la BDD
	 public String USER;
	 public String PASS;
	 public String path_log4_properties;
	 
	 public Credenciales(){
		 this.JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		 this.DB_URL = "jdbc:mysql://localhost:3306/supermark_v1";
		 this.USER = "root";
		 this.PASS = "41122022";
		 this.path_log4_properties = "C:/Users/enzzo/eclipse-workspace/Curso_Java";
	 }

}