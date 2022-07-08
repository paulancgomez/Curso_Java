package ejercicio06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*	Ejercicio Nro 6

	Escribe un programa que escriba los 100 primeros números naturales en filas
	de 10 en un archivo numNaturales.txt (crear el archivo usando la clase File).
	Ejemplo:
	1 2 3 4 5 6 7 8 9 10
	11 12 13 14 15 16 17 18 19 20
	...
	91 92 93 94 95 96 97 98 99 100*/

public class Ejercicio6 {

	public static void main(String[] args) throws Exception {
        File fichero = Constructor_2();
      
        if(!fichero.exists()){
            System.out.println("El fichero: '" + fichero.getName() + "' no existe");
            System.out.println("Creando numNaturales.txt");
            if(fichero.createNewFile()){
                System.out.println(fichero.getName()+" creado con exito!!!");
            }else{
                System.out.println("No se ha podido crear " + fichero.getName());
            }
        }
        escribir(fichero.getAbsolutePath());
    }
	
	public static File Constructor_2(){
        File fichero = new File("./src/resources/","numNaturales.txt");
        return fichero;
    }
	
	public static void escribir(String direccion) throws FileNotFoundException{
        FileWriter archivo = null;
        BufferedWriter texto = null;
        try{
            archivo = new FileWriter(direccion);
            texto = new BufferedWriter(archivo);
            
            for(int i=0; i<=100;i++) {
            	texto.write(i + "");   //Escribe los numeros del 1 al 100
            	if(i%10==0 && i!=0) {
            		texto.newLine();   //Salto de linea
            	}else {
            		texto.write(" ");  //Escribo un espacio
            	}
            }
            
            texto.flush();             //Guarda las modificaciones
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

        leer(direccion);
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
            while((lectura=texto.readLine())!=null){
                System.out.println(lectura);
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
