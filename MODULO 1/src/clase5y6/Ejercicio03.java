package clase5y6;

/*
Ejercicio N° 3 
Crear un vector de 10 números reales, con valores solicitados al usuario. Por otro lado solicitar una posición entre 0 y 9.
Eliminar el elemento situado en esa posición sin dejar hueco. Visualizar el vector resultante. 

*/

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Float> numeros = new ArrayList<Float>();
		for(int i = 0; i < 4; i++) { // el tamaño es 10
			System.out.println("Ingrese el siguiente numero: ");
			float x = teclado.nextFloat(); 
			numeros.add(x);
		}
		
		System.out.println("Ingrese la posición del elemento a eliminar: ");
		int p = teclado.nextInt();
		teclado.close();
		
		if (p >= 0 && p <= numeros.size() - 1) {
			numeros.remove(p);
			System.out.println("Tamanio: " + numeros.size());
			for(int i = 0; i < numeros.size(); i++) {
				System.out.println(numeros.get(i));			
			}
		}
		else {
			System.out.println("La posición ingresada es incorrecta");
		}

	}

}
