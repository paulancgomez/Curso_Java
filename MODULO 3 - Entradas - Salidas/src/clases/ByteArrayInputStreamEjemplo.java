package clases;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamEjemplo {

	public static void main(String[] args) throws IOException {
		//DEFINIMOS UN ARRAY DE BYTES
		byte [] array = {1, 2, 3, 4};
				
		//CREO UN OBJETO DE LA CLASE ByteArrayInputStream
		ByteArrayInputStream input = new ByteArrayInputStream(array);
				
		//RETORNAMOS LA CANTIDAD DE BYTES DISPONIBLES
		System.out.println("Cantidad inicial de bytes disponibles: " + input.available());
				
		//LEEMOS LOS 2 PRIMERO BYTES
		input.read();
		input.read();
		System.out.println("Cantidad final de bytes disponibles: " + input.available());
		
		input.close();

	}

}
