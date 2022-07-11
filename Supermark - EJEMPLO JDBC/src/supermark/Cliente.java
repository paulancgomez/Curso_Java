package supermark;

import java.util.ArrayList;

public class Cliente extends Usuario {

	//ATRIBUTOS
	private Domicilio domicilio;
	private Carrito carrito;
	private ArrayList<Compra> listaCompra;

	//CONSTRUCTORES
    public Cliente(String nombre, String apellido, String email) {
        super(nombre, apellido, email);
    }

    public Cliente(String nombre, String apellido, String correo, Domicilio domicilio) {
		super(nombre, apellido, correo);
		this.domicilio = domicilio;
		this.carrito = new Carrito();
		this.listaCompra = new ArrayList<Compra> ();
		
	}
    
    //METODOS DE LA CLASE
    
    
    public void verCompras(){
        
    }
    

	public void VerProductosSeleccionados() {
		
		
	}
    
}