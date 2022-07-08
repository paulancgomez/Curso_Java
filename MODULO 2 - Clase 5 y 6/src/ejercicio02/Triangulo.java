package ejercicio02;

public class Triangulo extends Figura{
	double base;
	double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//El area de un triangulo es igual a base por altura partido por 2.
	public double calcularArea() {
		double area = (this.base + this.altura) / 2;
		return area;
	}


}
