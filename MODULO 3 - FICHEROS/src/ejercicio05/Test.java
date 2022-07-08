package ejercicio05;

/*	Ejercicio Nro 5

	Crear un fichero de texto con el nombre y contenido que tú desees. Por
	ejemplo, Ejercicio1.txt. Realiza un programa en Java que lea el fichero
	<<Ejercicio1.txt>> carácter a carácter y muestre su contenido por pantalla sin
	espacios.
	
	Ejemplo:
	Si el fichero contiene el siguiente texto “Hola que haces”, deberá mostrar
	“Holaquehaces”.
	sugerencia: usar la función ready() de BufferedReader (implementarla para saber lo
	que hace)*/

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException{
		try {
			FileReader archivo = new FileReader("C:\\Prueba/prueba.txt"); //Es un archivo que existe en nuestra computadora
			BufferedReader texto = new BufferedReader(archivo);
			String lectura = "";
			int caracter = 0;
			System.out.println("contenido del archivo");
			while(texto.ready()) {
				caracter = texto.read();
				if(caracter != 32) {  //CODIGO ASCII: 32 es el espacio
					lectura = lectura + (char)caracter;
				}
			}
			System.out.println(lectura);
		}catch(FileNotFoundException e) {
			System.out.println("El archivo no fue encontrado.");
		}

	}

}
