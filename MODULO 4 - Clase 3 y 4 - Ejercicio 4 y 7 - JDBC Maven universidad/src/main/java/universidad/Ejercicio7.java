package universidad;

/*	Ejercicio 7

	Utilizando la base de Datos universidad creada en el practico anterior Realizar las
	siguientes Consultas desde un programa en JAVA para obtener de la BDD los siguientes
	datos
	
	a. Todas las personas que tengan como valor 'M' en su atributo sexo
	b. Todas las personas que tengan como valor 'profesor' en su atributo tipo
	c. ¿Existe algún profesor hombre en la universidad ?
	d. ¿Cuántos son los alumnos Hombres en la universidad ?
	e. Nombre de alumno/s que empieza con la letra 'J'
	f. Cual es el numero de telefono de el registro de la tabla persona cuyo atributo nombre es
	'Juan' y su atributo apellido1 es 'Saez'

*/

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio7 {

	public static void main(String[] args) throws SQLException {
		Statement stm = ConexionMysql.getStatement();
		ResultSet result = null;
		
		//A
		System.out.println("\na) Todas las personas que tengan como valor 'M' en su atributo sexo");
		result = stm.executeQuery("select * from persona p where p.sexo = 'M'");
		while(result.next()) {
			System.out.println(result.getString("nombre") + " " + result.getString("apellido1"));			
		}
		
		//B
		System.out.println("\nb) Todas las personas que tengan como valor 'profesor' en su atributo tipo");
		result = stm.executeQuery("select * from persona p where p.tipo = 'profesor'");
		while(result.next()) {
			System.out.println(result.getString("nombre") + " " + result.getString("apellido1"));			
		}
		
		//C
		System.out.println("\nc) ¿Existe algún profesor hombre en la universidad ?");
		result = stm.executeQuery("select (count(*) > 0) as 'existe' from persona p where p.sexo = 'H' AND p.tipo = 'profesor'");
		while(result.next()) {
			System.out.println(result.getBoolean("existe"));
		}
		
		//D
		System.out.println("\nd) ¿Cuántos son los alumnos Hombres en la universidad ?");
		result = stm.executeQuery("select count(*) as 'cantidad' from persona p where p.sexo = 'H' AND p.tipo = 'alumno'");
		while(result.next()) {
			System.out.println(result.getInt("cantidad"));
		}
		
		//E
		System.out.println("\ne) Nombre de alumno/s que empieza con la letra 'J'");
		result = stm.executeQuery("select * from persona p where p.tipo = 'alumno' AND p.nombre like 'J%'");
		while(result.next()) {
			System.out.println(result.getString("nombre") + " " + result.getString("apellido1"));			
		}
		
		//F
		System.out.println("\nf) Cual es el numero de telefono de el registro de la tabla persona cuyo atributo nombre es 'Juan' y su atributo apellido1 es 'Saez'");
		result = stm.executeQuery("select p.telefono from persona p where p.nombre = 'Juan' AND p.apellido1 = 'Saez'");
		while(result.next()) {
			System.out.println(result.getString("telefono"));
		}
		
		stm.close();

	}

}
