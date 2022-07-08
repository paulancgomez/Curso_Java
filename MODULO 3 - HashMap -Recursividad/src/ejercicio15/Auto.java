package ejercicio15;

public class Auto {
	//ATRIBUTOS
	private String color;
	private String marca;
	private int cantPuertas;
	private boolean encendido;
	
	//CONTRUCTORES
	public Auto(String color, String marca, int cantPuertas) {
		this.color = color;
		this.marca = marca;
		this.cantPuertas = cantPuertas;
		this.encendido = false;  //POR DEFECTO
	}
	
	public void encender() {
		if(this.encendido==false) {
			this.encendido=true;
			System.out.println("Auto encendido...");
		}
		else System.out.println("El auto ya se encuentra encendido");
	}
	
	public void moverse() {
		if(this.encendido==true) {
			System.out.println("Auto en movimiento...");
		}
		else System.out.println("El auto se encuentra apagado. Enciendalo para poder moverse...");
	}
	
	//METODO MOSTRAR
	public void mostrar() {
		System.out.println("Color:"+this.color);
		System.out.println("Marca:"+this.marca);
		System.out.println("Cantidad de Puertas:"+this.cantPuertas);
		System.out.println("Esta encendido?:"+this.encendido);
	}
}
