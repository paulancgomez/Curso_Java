package ejercicio02;

/*	Ejercicio Nro 2
	
	Escribe un programa que solicite al usuario un valor entero. El programa no
	dejará de solicitarlo hasta que el método introduzca un valor entero (usar: flujo de
	bytes).*/

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException{
		int caracter = 0;
		System.out.println("Ingrese un entero: ");
		
		do {
			caracter = System.in.read(); //LEER
			if(caracter>=48 && caracter<=57) { //CODIGO ASCII DEL 48 AL 57 SON NUMEROS ENTEROS. FUNCIONA CON NEGATIVOS TAMBIEN
				System.out.println("Ingresaste un entero: " + (char)caracter);
				System.out.println("Codigo ASCII: " + caracter);
			}
			else if (caracter == 10){  //10 ES EL SALTO DE LINEA
				System.out.println("Ingrese un entero");
			}
		}while(caracter<48 || caracter>57);

	}

}
