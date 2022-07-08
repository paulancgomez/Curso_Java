package ejercicio04;

/*Ejercicio Nro 4

Crea un programa para leer caracteres del teclado. Este formula la pregunta
hasta que se introduzca alguno de los caracteres que constituyen una respuesta
válida. La condición de cierre es ingresando el carácter ‘s’ o ‘S’.*/

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		
		//UTILIZANDO LA CLASE Scanner
		
		boolean ban;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un caracter/es. s o S para salir: ");
		
		do {
			ban = false;
			String letra = teclado.nextLine();  //INGRESA CARACTER
			if(!letra.toUpperCase().equals("S")) {  //CONVIERTE CARACTER EN MAYUSCULA, LUEGO COMPARA CON S
				System.out.println("Usted ingreso '" + letra + "'. Debe ingresar un carácter de Salida (s o S): ");
				ban = true;
			}
		}while(ban);
		System.out.println(ban);
		System.out.println("Fin de la aplicacion");
		teclado.close();
		

	}

}
