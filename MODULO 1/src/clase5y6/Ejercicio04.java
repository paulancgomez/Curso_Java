package clase5y6;

/*
	Ejercicio N° 4 
	Generar 20 números enteros entre 1 y 100 de forma aleatoria y contar cuántos de esos números enteros son divisibles entre 5. */


import java.util.ArrayList;
import java.util.Random;

public class Ejercicio04 {

	public static void main(String[] args) {
		//DEFINE ARRAY
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//CARGA ARRAY
		Random random = new Random();
		for(int i = 0; i < 4; i++) { // el tamaño es 20			
			int x = random.nextInt(100) + 1; // 0 y 99 + 1
			numeros.add(x);
		}		
		
		//MUESTRA ARRAY
		for(int i = 0; i < 4; i++) {
			System.out.print(numeros.get(i) + " || ");			
		}
		
		//CONTAR DIVISIBLES
		int cont= 0;
		for(int i = 0; i < 4; i++) {		
			if(numeros.get(i) % 5 == 0) {
				cont++;
			}
		}
		System.out.println("La cantidad de numeros divisibles por 5 son: " + cont);	
		

	}

}
