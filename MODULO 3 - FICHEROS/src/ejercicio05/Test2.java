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

public class Test2 {

	public static void main(String[] args) {
		//1° PASO: CREAMOS EL ARCHIVO
		File archivo = crearArchivo("./src/resources/", "Ejercicio1Test2.txt");
		
		//2° PASO: ESCRIBIR EL ARCHIVO CREADO
		String informacionAEscribir = "Hola que haces";
		escribir(archivo, informacionAEscribir);
		
		//3° PASO: LEER EL ARCHIVO SIN ESPACIOS
		leerSinEspacios(archivo);

	}
	
	public static File crearArchivo(String pathPadre, String nombreArchivo) {
		File nuevoArchivo = new File(pathPadre, nombreArchivo); //Creo el archivo que recibe el path y el nombre del archivo. Hasta aca solo vive en memoria, todavia no existe en mi disco.
		try {
			if(!nuevoArchivo.exists()) { //Si no existe el archivo entonces lo voy a crear
				nuevoArchivo.createNewFile();
			}
			return nuevoArchivo;
		}catch(Exception e) {
			System.out.println("No se pudo crear el archivo, " + e.getLocalizedMessage());
			return null; //Devuelvo null en caso de que no se pudo crear el archivo.
		}
	}
	
	public static void escribir(File archivo, String info) {
		FileWriter fw = null;
		BufferedWriter buffer = null;
		
		try {
			fw = new FileWriter(archivo);
			buffer = new BufferedWriter(fw);
			buffer.write(info);
			buffer.flush();
		}catch(IOException e) {
			System.out.println("No se pudo crear el archivo, " + e.getLocalizedMessage());
		} finally {
			try {
				fw.close();
				buffer.close();
			}catch(IOException e) {
				
			}
		}
		
	}
	
	public static void leerSinEspacios(File file) {
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			if(fr.ready()) {
				int caracter;
				while((caracter = fr.read()) > -1) {
					if(caracter != 32) {  //32 es le espacio
						System.out.print((char)caracter);
					}
				}
			}
			
		}catch(IOException e) {
			System.out.println("Hubo un error al leer el archivo, " + e.getLocalizedMessage());
		}
	}

}
