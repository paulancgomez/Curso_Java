package ejercicio03;

/*	Ejercicio Nro 3
 
	Ingresar un número por teclado solicitando el precio de un producto “x”
	(puede tener decimales) y calcule el precio final con IVA. El IVA será una constante
	del 10.5%. Usar InputStreamReader y Scanner.
	
	SACAR EL 10.5 DE UN NUMERO num
	resultado = num+((10.5*num)/100)
	*/

import java.io.IOException;
import java.io.InputStreamReader;  //Para usar la clase InputStreamReader
import java.io.BufferedReader;

public class Test {

	public static void main(String[] args) throws IOException{
		//USANDO InputStreamReader
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(entrada);
		double precio;
		System.out.println("Ingrese el precio del producto: ");
		String p = teclado.readLine();
		precio = 1.105 * Double.parseDouble(p);  //parseDouble convierte mi cadena en double
		System.out.println("El precio final del producto es: " + precio);
		
		//CERRAMOS LOS FLUJOS
		entrada.close();
		teclado.close();
		
	}

}
