package clases;

import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		
		//INSERTAR ELEMENTOS (Clave, Valor)
		hm.put("1", "Argentina");
		hm.put("3", "Chile");
		hm.put("2", "Bolivia");
		
		System.out.println(hm.get("1"));
		
		//REEMPLAZO ELEMENTO
		hm.replace("1", "Brasil");
		System.out.println(hm.get("1"));
		
		//ELIMINAR
		hm.remove("3");
		
		//CANTIDAD DE ELEMENTOS
		System.out.println("Cantidad de elementos: " + hm.size());
		
		for (String i : hm.keySet()) {
			System.out.println("Clave: " + i + " tiene el valor: " + hm.get(i));
		}
		
		//LIMPIAR TODO EL HASHMAP
		hm.clear();
		System.out.println("Cantidad de elementos: " + hm.size());

	}

}
