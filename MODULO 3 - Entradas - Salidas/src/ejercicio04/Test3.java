package ejercicio04;

import java.util.Scanner;

/*Ejercicio Nro 4

Crea un programa para leer caracteres del teclado. Este formula la pregunta
hasta que se introduzca alguno de los caracteres que constituyen una respuesta
válida. La condición de cierre es ingresando el carácter ‘s’ o ‘S’.*/

public class Test3 {

	public static void main(String[] args) {
		//USANDO LA CLASE Scanner
		
		Scanner teclado = new Scanner(System.in);
		String p;
		do {
			System.out.println("Ingrese letra: ");
			p = teclado.next();
			System.out.println(p.charAt(0));
		}while(p.charAt(0) != 's' && p.charAt(0) != 'S');
		System.out.println("Termino.");
		
		teclado.close();

	}

}
