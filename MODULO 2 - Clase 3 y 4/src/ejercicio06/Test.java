package ejercicio06;

/*  Ejercicio N° 6:
 	
 	Crear una Clase Taxi que contenga los siguientes atributos: id, número Taxi,
	tipoDeTarifa (1 o 2), precio de bajada de bandera(58 o 70).
	Crear un objeto taxi utilizando un constructor a su elección. Dentro de la clase
	crear los siguientes métodos:
	
		● crear un método cambiarTarifa que permita cambiar el tipo de tarifa del taxi,
		si vale 1 debe cambiar a 2 y el precio debe ser 70 y si el tipo de tarifa es 2
		debe cambiar a 1 y el precio a 58, cuando realice el cambio mostrar un
		mensaje “cambio de tarifa exitoso”.
		
		● crear un método calcularTotalAPagar que permita ingresar la cantidad de
		metros recorridos, si el tipo de tarifa es 1 se debe cobrar el precio de bajada
		de bandera apenas sube la persona y por cada metro se le va a cobrar 5 mas,
		si el tipo de tarifa es 2 se debe cobrar cobrar el precio de bajada de bandera
		apenas sube la persona y por cada metro se le cobra 8 más. El método debe
		devolver el monto que se le debe pagar al taxi.
		Los métodos deben ser probados en el objeto creado ingresando valores a su
		elección y mostrando los resultados.*/

public class Test {

	public static void main(String[] args) {
		Taxi taxi = new Taxi(123,10,2);
		taxi.muestra();
		
		taxi.cambiarTarifa();
		taxi.muestra();
		
		System.out.println("Total de viaje: $" + taxi.calcularTotalAPagar(10));

	}

}
