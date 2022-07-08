package ejercicio02;

public class Circulo extends Figura{
	int radio;
	double pi;
	
	public Circulo(int radio) {
		this.radio = radio;
		this.pi = 3.14159;
	}
	
	//El area de un circulo es pi multiplicado por el radio al cuadrado. 
	public double calcularArea() {
		double area = this.pi * this.radio * this.radio;
		return area;
	}

}
