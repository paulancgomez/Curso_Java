package ejercicio07;

public class Producto {
	//ATRIBUTOS
	private int id;
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	
	//CONSTRUTORES
	public Producto(int id, String nombre, String categoria, double precio, int stock) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}
	
	//METODOS GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//METODOS
	public boolean validarStock(int cantidad){
		return this.stock >= cantidad;     //Si es mayor o igual que cero retorna true
	}
	
	public void vender(String categoria, int cantidad){
		System.out.println("***********************************************");
		System.out.println("\tVENTA");
		if(this.categoria.equals(categoria)) {
			if(this.validarStock(cantidad)) {
				System.out.println("Total a pagar: " + this.precio * cantidad);
				this.stock = this.stock - cantidad;
				System.out.println("Venta exitosa!");
			}
			else {
				System.out.println("Producto sin stock.");
			}
		}
		else {
			System.out.println("Categoria no registrada.");
		}
		System.out.println("***********************************************");
	}
	
	public void comprar(String categoria, int cantidad){
		System.out.println("***********************************************");
		System.out.println("\tCOMPRA");
		if(this.categoria.equals(categoria)) {
			if(this.validarStock(101)) {
				this.stock = this.stock + cantidad;
				System.out.println("Compra exitosa!");
				this.toString();
			}
			else {
				System.out.println("Producto sin stock suficiente. No se pudo agregar la compra.");
			}
		}
		else {
			System.out.println("Categoria no registrada. No se pudo agregar la compra.");
		}
		System.out.println("***********************************************");
	}
	
	public 	String toString() {
		return "\tPRODUCTO\nId: " + this.id + "\nNombre: " + this.nombre + "\nCategoria: " + this.categoria + "\nPrecio: " + this.precio + "\nStock: " + this.stock;  
	}
	
}
