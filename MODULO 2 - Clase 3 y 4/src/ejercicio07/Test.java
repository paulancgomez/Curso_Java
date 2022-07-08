package ejercicio07;

/*  Ejercicio N° 7:
 	
 	Crear una Clase Producto que contenga los siguientes atributos: id, nombre,
	categoría, precio, stock.Crear un objeto Producto utilizando un constructor a su
	elección. Dentro de la clase crear los siguientes métodos:
	
		● Crear un metodo validarStock este método debe devolver un true si es que
		tiene stock disponible, sino lo tienen debe devolver false.
		
		● Crear un metodo vender este método debe recibir una categoría y la unidades
		que se desean vender, el método debe validar usando el método anterior si
		hay stock antes de realizar la venta, si se puede vender debemos comprobar
		que la categoría ingresada sea igual a la del producto si es asi recien se
		puede realizar la venta por lo cual debe mostrar el total a pagar por la venta y
		actualizar el stock del producto, en cualquiera de los otros casos que no se
		pueda vender mostrar un mensaje de error a su elección.
		
		● Crear un método comprar este método debe recibir como parámetro las
		cantidad de producto y la categoría, si la categoría coincide con la del
		producto actual y el stock está por debajo de 100 unidades esa cantidad de
		producto debe ser sumada al stock actual, mostrar un mensaje con todos los
		datos del objeto. En caso contrario mostrar un mensaje “no se pudo agregar
		la compra”. Los métodos deben ser probados en el objeto creado ingresando
		valores a su elección y mostrando los resultados. Cuando quiera probar el
		método validar en la consola debe mostrar en vez de true “si tiene stock”, y en
		vez de false “no tiene stock”.*/

public class Test {

	public static void main(String[] args) {
		Producto producto = new Producto(111, "Oreo", "Galletas", 100, 200);
		System.out.println(producto.toString());
		
		producto.vender("123", 50);
		System.out.println(producto.toString());
		
		producto.comprar("123", 200);
		System.out.println(producto.toString());

	}

}
