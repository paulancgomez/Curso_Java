package ejercicio05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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

public class Test3 {

    public static void main(String[] args) throws Exception {
        File fichero = Constructor_1(); //Creo un fichero con la direccion que le pase

        if(!fichero.exists()){ //Si no existe el fichero lo creo
            System.out.println("El fichero: '" + fichero.getName() + "' no existe");
            // CREAR FICHERO
            System.out.println("Creando Ejercicio1Test3.txt");
            if(fichero.createNewFile()){
                //Crea un fichero sin datos
                System.out.println(fichero.getName()+" creado con exito!!!");
            }else{
                System.out.println("No se ha podido crear " + fichero.getName());
            }
        }

        //Lectrura de un archivo
        leer(fichero.getAbsolutePath()); //Le mando a leer la Ruta absoluta del fichero
    }
	
    public static File Constructor_1(){
        File fichero = new File("./src/resources/Ejercicio1Test3.txt");
        return fichero;
    }
    
    public static void leer(String direccion) throws FileNotFoundException{
        FileReader archivo = null;
        BufferedReader texto = null;
        try{
            archivo = new FileReader(direccion);
            texto = new BufferedReader(archivo);
            String lectura ="";
            int caracterCompu = 0;             //Almacena el numero del caracter correspondiente al codigo ASCII
            while(texto.ready()){              //Mientras tenga algo para leer
                caracterCompu = texto.read();  //lee un byte (un caracter) y lo guardo en caracterCompu en codigo ASCII
            	if(caracterCompu != 32) {      //(32 es el espacio en blanco) si es distinto del espacio en blanco
                	lectura = lectura + (char)caracterCompu; //concateno. Acumulo los que no son espacios
                }
            }
            if(lectura.length() > 0) {
            	System.out.println("Contenido del archivo:");
            	System.out.println(lectura);
            }else {
            	System.out.println("No tiene contenido.");
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
    
    public static void escribir(String direccion) throws FileNotFoundException{
        FileWriter archivo = null;
        BufferedWriter texto = null;
        try{
            archivo = new FileWriter(direccion);
            texto = new BufferedWriter(archivo);
            texto.write("Modificando el archivo");
            texto.newLine(); //salto de linea
            texto.write("Salto de linea");
            texto.flush(); // guarda las modificaciones
        }catch(FileNotFoundException e){
            System.out.println("archivo no encontrado");// muestra un msj de error si no 
                                                          // encuentra el archivo

        }catch(IOException e){
            System.out.println("Error! "+e.getMessage());// muestra un msj de error si no 
                                                         // puede abrir el archivo
        }
        finally{
            try{ //cerramos los flujos abiertos
                texto.close();
                archivo.close();
            }catch(IOException e){
                System.out.println("Error! "+e.getMessage());
            }
        }

        leer(direccion);
    }

}
