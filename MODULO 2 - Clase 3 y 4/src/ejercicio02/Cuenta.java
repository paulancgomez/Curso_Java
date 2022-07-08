package ejercicio02;

import clases.Persona;

public class Cuenta {
	//ATRIBUTOS
	private Persona titular;
	private double saldo;
	
	//CONSTRUCTORES
	public Cuenta() {
		
	}
	
	public Cuenta(Persona titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Cuenta(Persona titular) {
		this.titular = titular;
		this.saldo = 0;  //No hace falta ya que los atributos no inicializados se les asigna por defecto 0
	}
	
	//METODOS DE CLASE
	public void mostrar() {
		System.out.println("*************************");
		System.out.println("\tCUENTA");
		this.titular.muestra();
		System.out.println("Saldo: " + this.saldo);
		System.out.println("*************************");
	}
	
	//DEPOSITO DE DINERO
	public boolean ingresar(double cantidad) {
		System.out.println("\tDEPOSITO DE DINERO");
		if(cantidad > 0) {
			this.saldo += cantidad;              //this.saldo = this.saldo + cantidad;
			System.out.println("Operacion realizada con exito!. Se depositaron $" + cantidad);
			return true;
		}
		else {
			System.out.println("Operacion rechazada!");
			return false;
		}
	}
	
	//EXTRACCION DE DINERO
	public boolean retirar(double cantidad) {
		System.out.println("\tEXTRACCION DE DINERO");
		if(cantidad > 0) {  //Si no tengo el saldo suficiente para retirar lo mismo lo hago ya que a cuenta puede estar en números rojos.
			this.saldo = this.saldo - cantidad;
			System.out.println("Operacion realiza con exito!. Se extrajeron $" + cantidad);
			return true;
		} else {
			System.out.println("Operacion rechazada!");
			return false;
		}
	}

}
