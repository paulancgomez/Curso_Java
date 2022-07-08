package clase5y6;
import java.util.Scanner;

/*
Ejercicio N° 1 
Crear un array de 10 de números enteros, con valores solicitados por teclado. Mostrar por consola el índice y el valor de cada elemento.
Realizar dos métodos, uno para el ingreso de datos y otro para la salida de datos. 

*/

public class Ejercicio01 {

	public static void main(String[] args) {
		int[] vector = new int[10];
		
		entradaDatos(vector);
		salidaDatos(vector);

	}
	
	public static void entradaDatos(int[] vector) {
		Scanner teclado = new Scanner(System.in);
		for(int i=0; i<vector.length; i++) {
			System.out.println("Ingrese el siguiente numero: ");
			vector[i] = teclado.nextInt();
		}
		teclado.close();
	}
	
	public static void salidaDatos(int[] vector) {
		for(int i=0; i<vector.length; i++) {
			System.out.println("Indice: " + i + " - " + "Valor: " + vector[i]);
		}
	}

}
