package supermark;

import java.util.Date;

public class Producto {
	//ATRIBUTOS
	private String descripcion;
	private Date fechaVenc;
	private int cantStock;
	private double precio;
	private Categoria categoria;
	
	
	//CONSTRUCTORES
	public Producto(String descripcion, Date fechaVenc, int cantStock, double precio, Categoria categoria) {
		super();
		this.descripcion = descripcion;
		this.fechaVenc = fechaVenc;
		this.cantStock = cantStock;
		this.precio = precio;
		this.categoria = categoria;
	}
	
	
	//METODOS GET Y SET
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaVenc() {
		return fechaVenc;
	}
	public void setFechaVenc(Date fechaVenc) {
		this.fechaVenc = fechaVenc;
	}
	public int getCantStock() {
		return cantStock;
	}
	public void setCantStock(int cantStock) {
		this.cantStock = cantStock;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	//METODOS DE LA CLASE
	
}
