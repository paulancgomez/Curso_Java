package clases;

import java.util.*;

public class Cola {

	public static void main(String[] args) {
		Queue<Integer> cola = new LinkedList<>();
		System.out.println("Agregando valores.");
		for(int i=0; i<5; i++) {
			cola.add(i);
		}
		System.out.println("Tamanio inicial de la cola: " + cola.size());
		
		System.out.println("Retirando valores");
		while(cola.peek()!=null) {
			System.out.println("Valor: " + cola.poll());
			System.out.println("Tamanio actual de la cola: " + cola.size());
		}
		System.out.println("Tamanio final de la cola: " + cola.size());

	}

}
