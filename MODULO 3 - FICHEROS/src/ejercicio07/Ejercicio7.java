package ejercicio07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*	Ejercicio Nro 7

	Escribe un programa que reciba el nombre de un archivo que almacena una
	serie de cantidades enteras positivas separadas por coma (“,”) e imprima su suma.

	Ejemplo:
	Archivo x contiene:
	línea 1: 2,53,2,10,1,6,10
	línea 2: 5,3,100,2,101,16,76,110
	....
	línea n: 15,13,10,26,10,160,6,0
	deberá mostrar:
	línea 1: 84
	línea 2: 413
	...
	línea n: 240*/

public class Ejercicio7 {

	public static void main(String[] args) throws Exception {
		File fichero = Constructor_1();

        if(!fichero.exists()){
            System.out.println("El fichero: '" + fichero.getName() + "' no existe");
            // CREAR FICHERO
            System.out.println("Creando Ejercicio7.txt");
            if(fichero.createNewFile()){
                //Crea un fichero sin datos
                System.out.println(fichero.getName()+" creado con exito!!!");
            }else{
                System.out.println("No se ha podido crear " + fichero.getName());
            }
        }

    
        leer(fichero.getAbsolutePath());
    }
	
    public static File Constructor_1(){
        File fichero = new File("./src/resources/Ejercicio7.txt");
        return fichero;
    }
	
	public static void leer(String direccion) throws FileNotFoundException{
        FileReader archivo = null;
        BufferedReader texto = null;
        try{
            archivo = new FileReader(direccion);
            texto = new BufferedReader(archivo);
            String lectura ="";
            System.out.println("El path del archivo es: "+direccion);
            System.out.println("Contenido del archivo:");
            int suma;
            int linea = 1;
            while((lectura = texto.readLine())!=null){
                String [] fila = lectura.split(",");
                suma=0;
                for(int i=0; i<fila.length; i++){
                	suma = suma + Integer.parseInt(fila[i]);
                }
                System.out.println("Suma de la linea " + linea + ": " + suma);
                linea++;
            }
        }catch(FileNotFoundException e){
            System.out.println("archivo no encontrado");

        }catch(IOException e){
            System.out.println("Error! "+e.getMessage());
        }
        finally{
            try{
                texto.close();
                archivo.close();
            }catch(IOException e){
                System.out.println("Error! "+e.getMessage());
            }
        }
    }

	
}
