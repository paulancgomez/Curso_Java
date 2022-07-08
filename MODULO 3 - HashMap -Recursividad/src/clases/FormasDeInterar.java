package clases;

import java.util.ArrayList;
import java.util.Iterator;

public class FormasDeInterar {

	public static void main(String[] args) {
		
		ArrayList<String> autos = new ArrayList<String>();
		autos.add("BMW");
		autos.add("Citroen");
		autos.add("Clio");
		
		System.out.println("============== Indice ==============");
		for(int i=0; i<autos.size();i++) {
			System.out.println(autos.get(i));
		}
		
		System.out.println("============= Foreach ===============");
		
		
		
		System.out.println("============= Iterator ===============");
		
		Iterator<String> iter = autos.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
