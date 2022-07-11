package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCargaScannerMuestra {

	public static void main(String[] args) {
		//DEFINE ARRAY
		ArrayList<Integer> numeros = new ArrayList<Integer>();
						
		//CARGA ARRAY
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			int x = teclado.nextInt(); 
		    numeros.add(x);
		}
		teclado.close();
						
		//MUESTRA ARRAY
		for(int i = 0; i < 4; i++) {
			System.out.print(numeros.get(i) + " || ");			
		}

	}

}
