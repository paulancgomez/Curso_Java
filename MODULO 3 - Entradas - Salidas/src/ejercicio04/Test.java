package ejercicio04;

/*Ejercicio Nro 4

	Crea un programa para leer caracteres del teclado. Este formula la pregunta
	hasta que se introduzca alguno de los caracteres que constituyen una respuesta
	válida. La condición de cierre es ingresando el carácter ‘s’ o ‘S’.*/

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException{
		//UTILIZANDO LA CLASE InputStreamReader y BufferedReader
		
		System.out.println("Se lee hasta encontrar el fin de linea: ");
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(entrada);
		
		String letra = teclado.readLine();
		System.out.print(letra);
		
		while(!letra.equals("s")) { //FALTA S MAYUS
			System.out.print("Ingrese una letra: ");
			letra = teclado.readLine();
		}
		
		teclado.close();
		System.out.print("El programa finalizo porque ingreso la letra s");
		

	}

}
