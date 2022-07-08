package ejercicio09;

public class Pila {
	//ATRIBUTOS
	private int[] pila; 
	private int tope;
	private int tamPila;
	
	//CONSTRUCTOR
	public Pila(int tamPila) {
		this.pila = new int[tamPila]; 
		this.tamPila = tamPila;
		this.tope = -1;  //POR DEFECTO NO HAY ELEMENTOS CUANDO SE CREA
	}
	
	//EMPTY
	public boolean estaVacia() {
		return this.tope == -1;
	}
	
	public boolean estaLlena() {
		return this.tope == this.tamPila - 1;  //this.tope == this.pila.length - 1
	}
	
	//METODO PUSH
	public void meter(int elemento) {
		if(!this.estaLlena()) {
			this.pila[this.tope] = elemento;
			this.tope = this.tope + 1;
		}else {
			System.out.println("Pila llena.");
		}
	}
	
	//METODO POP
	public int sacar() {
		int elemento;
		if(!this.estaVacia()) {
			elemento = this.pila[this.tope];
			this.tope = this.tope - 1;
		}else {
			System.out.println("La pila no tiene elemenetos.");
			elemento = 0;
		}
		return elemento;
	}
	
	
	

}
