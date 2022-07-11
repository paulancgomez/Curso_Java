package supermark;

import static spark.Spark.*;
import org.apache.log4j.PropertyConfigurator;
import com.google.gson.Gson;

public class App {
	public static void main(String[]args){
		//PATH DONDE SE ENCUENTRA EL ARCHIVO log4j.properties
		String log4jConfPath = "C:/Users/Cardozo/Desktop/1000programadores/supermark/to/log4j.properties";
		
		PropertyConfigurator.configure(log4jConfPath);
	    Gson mapper= new Gson();
	    port(8080);
	    
	    //PETICION
	    get("/saludo", (req,res) -> new Persona ("Gabriel", "Silvestre"), mapper::toJson);
	}
}
