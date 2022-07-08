package ejercicio04;

/*	Ejercicio N° 4:

 	Crear una clase Productos con atributos: Nombre, precios, vencimiento, con 2 tipos
 	de productos perecederos y no perecederos.
		● Crear sus constructores getters y setters.
		● crear una función llamada calcular: en producto simplemente seria calcular
		precio por cantidad, en perecederos el precio se reducirá según los días a
		caducar, si le queda 1 día se reducirá 4 veces el precio, si le quedan 2 días se
		reducirá el precio 3 veces, si le quedan 3 días se reducirá la mitad el precio.
		Crear una clase ejecutable y crear un array de productos y muestra el precio
		total de vender 5 productos de cada uno.*/

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList <Producto> productos = new ArrayList <Producto> ();
		
		Producto producto1= new Producto("Manzana", 10, 3, true);     //Perecedero
		Producto producto2= new Producto("Naranja", 15, 2, true);     //Perecedero
		Producto producto3= new Producto("Alfajor", 50, 10, false);   //No Perecedero
		
		//CARGO ARRAY
		productos.add(producto1); 
		productos.add(producto2);
		productos.add(producto3);
		
		//MUESTRO ARRAY
		for(int i = 0; i < productos.size(); i++) {
			System.out.print(productos.get(i));
		}
		
		//CALCULAR
		double sumaParcial = 0;
		System.out.println("*****************************");
		System.out.println("\tVENTA");
		for(int i=0; i<productos.size(); i++) {
			sumaParcial = sumaParcial + productos.get(i).calcular(5);
			System.out.println("Suma parcial: " + sumaParcial);
		}
		System.out.println("El precio total de vender 5 productos de cada uno es: " + sumaParcial);
		System.out.println("*****************************");
	}

}
