package ejercicio15;

/*	Ejercicio Nro 15

	Defina una clase Auto con los atributos color, cantidad de puertas, marcas y
	un boolean que indica si el auto esta encendido(true) o apagado(false) por defecto
	al crear un auto este se encuentra apagado. Además implementar 3 métodos:
	mostrar() el cual muestra todos los valores de los atributos de un auto,el encender()
	y moverse(). Luego defina una clase que contenga al método main e instancie 3
	objetos de la clase auto y cree un HashMap cuya clave sea de tipo String el cual
	representa la matrícula del auto, y el valor sea la clase Auto. Finalmente pruebe
	todas las operaciones expuestas en teoría sobre HashMap.*/

import java.util.*;

public class Test {

	public static void main(String[] args) {
		HashMap<String,Auto> autos = new HashMap<String,Auto>();
		
		Auto auto=new Auto("Rojo","Toyota",5);
		Auto auto1=new Auto("Azul","Chevrolet",3);
		Auto auto2=new Auto("Blanco","Fiat",3);
		
		autos.put("KJJ531", auto);
		autos.put("LWN789", auto1);
		autos.put("AB137KK", auto2);
		
		autos.get("LWN789").mostrar();
		System.out.println("Cantidad de autos:"+autos.size());
		for (String i : autos.keySet()){
			System.out.println("Clave:"+i);
		}
		for (Auto i : autos.values()){
			System.out.println("Valor:");
			i.mostrar();
		}
		System.out.println();
		autos.remove("KJJ531");
		
		for (String i : autos.keySet()) {
		     System.out.println("Clave: " + i + " Valor: " );
		     autos.get(i).mostrar();
		 }
	}

}
