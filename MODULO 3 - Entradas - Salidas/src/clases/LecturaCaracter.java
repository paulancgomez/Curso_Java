package clases;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class LecturaCaracter {

	public static void main(String[] args) throws Exception{
		String c;
		
		System.out.println("Se lee hasta encontrar el fin de linea: ");
		
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(entrada);
		
		c = teclado.readLine();
		
		System.out.println("Contados " + c.length() + " Bytes en total.");
		System.out.println("Cadenas: " + c);

	}

}
