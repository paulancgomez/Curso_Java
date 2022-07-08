package clases;

import java.io.IOException;

class Test {
    public static void main(String[] args) throws IOException {
        int c;
        int contador = 0;
        
        System.out.print("se lee hasta encontrar el fin de línea: ");
        
        
        while((c=System.in.read())!='\n' && System.in.available()<6) {
        	contador++;
        	System.out.print("Lo que interpreta el compilador: " + c);
        	System.out.print("Lo que ve la persona: " + (char)c);
        }
        
        System.out.println(); //Se escribe el fin de linea
        System.out.println( "Contados "+ contador +" bytes en total." );
    }
}
