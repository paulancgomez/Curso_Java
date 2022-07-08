package ejercicio04;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char respuesta;
		do {
			System.out.println("Termina cuando ingresa s o S: ");
			respuesta = teclado.nextLine().charAt(0);
		}while(respuesta != 's' && respuesta != 'S');

	}

}
