package clase5y6;
import java.util.Scanner;


/*
Ejercicio N° 10 
Crear dos matrices de mxn y sumar sus valores, los resultados se deben almacenar en otra matriz. Los valores y la longitud,
serán insertados por el usuario. Mostrar las matrices originales y el resultado. 

 */

public class Ejercicio10 {

	public static void main(String[] args) {
		int [] [] matrizA;
		int [] [] matrizB;
		int [] [] matrizC;
		
		System.out.println("MATRIZ A");
		matrizA = ingresa();
		
		System.out.println("MATRIZ B");
		matrizB = ingresa();
		
		matrizC = sumaMatriz(matrizA, matrizB);
		
		System.out.println("MATRIZ A");
		muestra(matrizA);
		
		System.out.println("MATRIZ B");
		muestra(matrizB);
		
		System.out.println("MATRIZ C");
		muestra(matrizC);

	}
	
	public static int[][] ingresa(){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Tamanio fila: ");
		int m = teclado.nextInt();
		
		System.out.println("Tamanio columna: ");
		int n = teclado.nextInt();
		
		int [][] matriz = new int[m][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.println("Elemento" + "[" + i + "]" + "[" + j + "]: ");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		teclado.close();
		
		return matriz;
	}
	
	public static int[][] sumaMatriz(int [][] matrizA, int [][] matrizB){
		int[][] matrizC = new int[matrizA.length][matrizA[0].length];
		for(int i=0; i<matrizA.length; i++) {
			for(int j=0; j<matrizA[0].length; j++) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j]; 
			}
		}
		return matrizC;
	}
	
	public static void muestra(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
