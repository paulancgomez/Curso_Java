package ejercicio01;

public class Raices {
	//ATRIBUTOS
	private double a;
	private double b;
	private double c;
	
	//CONSTRUCTOR POR DEFECTO
	public Raices() {
		
	}
	
	//CONSTRUCTOR COMUN
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//METODOS DE CLASE
	public void obtenerRaices() {  //TENGO 2 RAICES
		double x1 = (-this.b + Math.sqrt(this.getDiscriminante())) / (2 * this.a);
		double x2 = (-this.b - Math.sqrt(this.getDiscriminante())) / (2 * this.a);
		System.out.println("La raiz 1 es igual a: " + x1);
		System.out.println("La raiz 1 es igual a: " + x2);
	}
	
	public void obtenerRaiz() {  //TENGO 1 RAIZ. Cuando tengo unica solucion el determinante es igual a 0
		double x = (-this.b) / (2 * this.a);
		System.out.println("Raiz: " + x);
	}
	
	public double getDiscriminante(){
		return ((this.b * this.b) - 4 * this.a * this.c);  //this.b * this.b = Math.pow(this.b, 2)
	}
	
	public boolean tieneRaices() { //TIENE 2 RAICES
		return (getDiscriminante() > 0);
	}
	
	public boolean tieneRaiz() {   //TIENE UNA 1 RAIZ
		return (this.getDiscriminante() == 0);
	}
	
	public void calcular(){
		if(this.tieneRaices()) {
			this.obtenerRaices();
		}
		else if(this.tieneRaiz()) {
			this.obtenerRaiz();
		}
		else {
			System.out.println("La ecuacion no tiene solucion en los reales.");
		}	
	}
	
}
