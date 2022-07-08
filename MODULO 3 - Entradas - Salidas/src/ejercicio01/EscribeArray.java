package ejercicio01;

/*	Ejercicio Nro 1
	Intenta escribir un programa, de nombre “EscribeArray”, que cree un array de
	bytes, con los dígitos del 0 al 9, y a continuación, defina sobre él un flujo de entrada
	para leer sus valores, y mostrarlos por pantalla (usar: ByteArrayInputStream y
	función available()).

	Ejemplo:
	Entrada: array_1 = [0,1,2,3,4,5,6,7,8,9]
	Salida = 0,1,2,3,4,5,6,7,8,9*/

import java.io.*;


public class EscribeArray {
	public static void main(String[] args) {
		//DEFINIMOS UN ARRAY DE BYTES
		byte [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		//FLUJO DE ENTRADA: ByteArrayInputStream
		ByteArrayInputStream flujoArray = new ByteArrayInputStream(array);
		
		//LEEMOS CADA UNO DE LOS BYTE QUE TIENE DENTRO DEL ARRAY
		/*Ejecutamos la secuencia de lectura hasta que la cantidad que tengamos
		disponible en el bufer sea igual a 0*/
		while(flujoArray.available() != 0) { //Mientras la cantidad de datos que tiene disponible para lectura sea distinto de 0.
			byte num = (byte)flujoArray.read(); //Con read leemos un byte. La cantidad va decrementando a medida que va leyendo.
			System.out.print(num + ","); //Mostramos cada uno de los numeros que tiene para leer dentro del bufer
		}
		
	}

}
