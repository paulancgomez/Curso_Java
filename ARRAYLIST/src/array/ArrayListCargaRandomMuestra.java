package array;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListCargaRandomMuestra {

	public static void main(String[] args) {
		//DEFINE ARRAY
		ArrayList<Integer> numeros = new ArrayList<Integer>();
						
		//CARGA ARRAY
		Random random = new Random();
		for(int i = 0; i < 4; i++) {
			int x = random.nextInt(100) + 1; // 0 y 99 + 1
		    numeros.add(x);
		}		
						
		//MUESTRA ARRAY
		for(int i = 0; i < 4; i++) {
			System.out.print(numeros.get(i) + " || ");			
		}

	}

}
