package ejercicio1;

import java.util.Scanner;

/*Ejercicio N° 1

Crear una clase llamada Persona con los atributos: Nombre, Apellido, DNI, Domicilio.
Con los métodos: Constructor y un método que permita mostrar la información de la
persona.

*/

public class Test {

	public static void main(String[] args) {
		//FORMA 1: INSTANCIAMOS MANDANDO DATOS DIRECTOS
		Persona persona1 = new Persona("Paula", "Nicole", 12345, "Salta");
		
		
		//FORMA 2: INSTANCIAMOS CONSTRUCTOR INGRESANDO DATOS POR CONSOLA
        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Ingrese su apellido: ");
		String apellido = teclado.nextLine();
		
		System.out.println("Ingrese su domicilio: ");
		String domicilio = teclado.nextLine();
		
		System.out.println("Ingrese su dni: ");
		int dni = teclado.nextInt();
		
		teclado.close();
		
		Persona persona2 = new Persona(nombre, apellido, dni, domicilio);	
		
		
		//FORMA 3: INSTANCIAMOS CONSTRUCTOR POR DEFECTO (TODOS VACIOS)
		Persona persona3 = new Persona();	
		
		
		//MUESTRA DATOS DE PERSONA
		persona1.muestra();
		persona2.muestra();
		persona3.muestra();

	}

}
