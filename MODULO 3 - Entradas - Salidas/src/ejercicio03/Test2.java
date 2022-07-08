package ejercicio03;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//USANDO Scanner
		Scanner teclado = new Scanner(System.in);
		double precio;
		System.out.println("Ingrese el precio del producto: ");
		precio = teclado.nextDouble();
		precio = precio * 1.105;
		System.out.println("El precio final del producto es: " + precio);
		
		teclado.close();

	}

}
