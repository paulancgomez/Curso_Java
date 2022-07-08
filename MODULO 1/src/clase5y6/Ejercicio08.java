package clase5y6;

/*
Ejercicio N° 8 
Ingrese 10 nombres de personas en un vector, luego ingrese un nombre cualquiera y búsquelo en el vector,
si el nombre aparece en el vector mostrar "Nombre encontrado" en caso contrario "Nombre no encontrado". 

 */

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		String[] nombres = new String [4];
		
		//INGRESA VECTOR
		Scanner teclado = new Scanner(System.in);
		for(int i=0; i<nombres.length; i++) {
			System.out.println("Nombre: ");
			nombres[i] = teclado.nextLine();	
		}
		
		//MUESTRA VECTOR
		for(int i=0; i<nombres.length; i++) {
			System.out.print(nombres[i] + " // ");	
		}
		
		//BUSCA NOMBRE
		System.out.println("Ingrese un nombre cualquiera: ");
		String buscado = teclado.nextLine();
		teclado.close();
		int i=0;
		boolean band=false;
		while(i<nombres.length && !band) {
			if(buscado.equals(nombres[i])) {
				band=true;
			}
			i++;	
		}
		if(band) {
			System.out.println("Nombre encontrado.");
		}
		else
		{
			System.out.println("Nombre NO encontrado.");
		}
		

	}

}
