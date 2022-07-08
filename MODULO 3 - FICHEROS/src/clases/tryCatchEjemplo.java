package clases;

public class tryCatchEjemplo {

	public static void main(String[] args) {
		int a = 10;
		int b= 0;
		
		try {
			System.out.println("Division: " + a/b);
		}catch(Exception e) {
			System.out.println("Error en la division");
		}

	}

}
