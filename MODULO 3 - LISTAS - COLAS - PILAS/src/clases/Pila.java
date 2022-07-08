package clases;

import java.util.*;

public class Pila {

	public static void main(String[] args) {
		Stack<Integer> pila = new Stack<>();
		
		System.out.println("Agregando valores.");
		for(int i=0; i<5; i++) {
			pila.push(i);  //INSERTA AL FINAL DE LA PILA
			System.out.println("Valor: " + i);
		}
		System.out.println("Tamanio inicial de la pila: " + pila.size());
		
		System.out.println("Retirando valores");
		while(!pila.isEmpty()) {  //MIENTRAS LA PILA NO ESTE VACIA
			System.out.println("Valor: " + pila.pop());
			System.out.println("Tamanio actual de la pila: " + pila.size());
		}
		System.out.println("Tamanio final de la pila: " + pila.size());

	}

}
