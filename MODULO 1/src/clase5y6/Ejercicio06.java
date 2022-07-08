package clase5y6;

/*
Ejercicio N° 6 
Escriba un programa que determine si una palabra es palíndromo. Palíndromo: palabra o expresión que es igual si se lee de
izquierda a derecha que de derecha a izquierda, por ejemplo, arenera. 

 */

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la palabra: ");
		String palabra = teclado.nextLine();
		String inversa = "";
		
		teclado.close();
		
		for(int i = palabra.length() - 1; i >= 0; i--) {			
			inversa += palabra.charAt(i);
		}
		
		System.out.println(inversa);
		
		if (palabra.equalsIgnoreCase(inversa)) {
			System.out.println("La palabra es palindromo");
		}
		else {
			System.out.println("La palabra no es palindromo");
		}

	}

}
