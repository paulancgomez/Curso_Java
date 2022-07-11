package supermark;

import java.util.ArrayList;

public class Carrito {
	
	//ATRIBUTOS
	private int id;
	private ArrayList<Producto> listaProductos;
	
	//CONSTRUCTORES
	public Carrito() {	
		this.listaProductos = new ArrayList<Producto>();
	}
	
	//METODOS
	public void agragaProducto(Producto p) {
		this.listaProductos.add(p);
	}
	
	public void recorrerCarrito() {
		for (int i=0;i<this.listaProductos.size();i++) {
			System.out.println(listaProductos.get(i).toString());
		}	
	}

}
