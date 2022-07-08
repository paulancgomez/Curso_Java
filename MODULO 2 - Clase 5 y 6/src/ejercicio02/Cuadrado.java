package ejercicio02;

public class Cuadrado extends Figura{
	double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	//El area de un cuadrado es igual a lado por lado.
	public double calcularArea(){
		double area = this.lado * this.lado; 
		return area;
	}

}
