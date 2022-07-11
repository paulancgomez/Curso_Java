package supermark;

import java.util.Date;

public class Producto {
	
	//ATRIBUTOS
	private int idProducto;
	private String descripcion;
	private Date fechaVenc;
	private int cantStock;
	private double precio;
	
	//CONSTRUCTOR
	public Producto(int idProducto, String descripcion, Date fechaVenc, int cantStock, double precio) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.fechaVenc = fechaVenc;
		this.cantStock = cantStock;
		this.precio = precio;
	}
	
	//METODOS GET Y SET
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
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
	
	//METODOS DE LA CLASE
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcion=" + descripcion + ", fechaVenc=" + fechaVenc
				+ ", cantStock=" + cantStock + ", precio=" + precio + "]";
	}
	
}
