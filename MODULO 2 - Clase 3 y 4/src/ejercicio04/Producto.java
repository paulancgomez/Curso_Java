package ejercicio04;

public class Producto {
	//ATRIBUTOS
	private String nombre;
	private double precio;
	private int vencimiento;
	private boolean tipo;     //true -> perecedero. false -> no perecedero
	
	//CONSTRUCTORES
	public Producto() {
		
	}
	
	public Producto(String nombre, double precio, int vencimiento, boolean tipo) {
		this.nombre = nombre;
		this.precio = precio;
		this.vencimiento = vencimiento;
		this.tipo = tipo;
	}

	//GETTERS y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(int vencimiento) {
		this.vencimiento = vencimiento;
	}

	public boolean getTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	
	/*Crear una función llamada calcular: en producto simplemente seria calcular
	precio por cantidad, en perecederos el precio se reducirá según los días a
	caducar, si le queda 1 día se reducirá 4 veces el precio, si le quedan 2 días se
	reducirá el precio 3 veces, si le quedan 3 días se reducirá la mitad el precio.
	Crear una clase ejecutable y crear un array de productos y muestra el precio
	total de vender 5 productos de cada uno.*/
	
	public double calcular(int cantidad) {
		double total = 0;
		
		if(this.getTipo()) { //Si es perecedero
			switch(this.getVencimiento()) {
			case 1:
				total= (this.getPrecio() / 4) * cantidad;
				break;
			case 2:
				total= (this.getPrecio() / 3) * cantidad;
				break;
			case 3:
				total= (this.getPrecio() / 2) * cantidad;
				break;
			default:
				break;
			}
		}
		else {
			total=this.getPrecio() * cantidad;
		}
		return total;
	}
	
	public String toString() {
		System.out.println("*****************************");
		return "\tPRODUCTO\nNombre: " + this.nombre + "\nPrecio: " + this.precio + "\nVencimiento: " + this.vencimiento + "\nTipo: " + this.tipo + "\n"; 
	}
	
}
