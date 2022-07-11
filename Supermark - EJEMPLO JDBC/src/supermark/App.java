package supermark;
import java.util.Scanner;


public class App {
	
	static private Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		
        System.out.println("\tMENU");
		System.out.println("1. INICIAR SESION---");
		System.out.println("2. REGISTRARSE---");
		
		int opcion = leer.nextInt();
		
		switch(opcion) {
			case 1:
				iniciarSesionMenu();
				System.out.println("Finalizo");
				break;
			default:
				registrarMenu();
				System.out.println("Finalizo");
				break;
		}
        
	}
	
	
	public static void registrarMenu() {
		Sistema sistema = new Sistema();
		
		System.out.println("\tRegistrarse");
		
		System.out.println("Ingrese su nombre");
		String nombre=leer.next();
		System.out.println("Ingrese su Apellido");
		String apellido=leer.next();
		System.out.println("Ingrese su Email");
		String email=leer.next();
		System.out.println("Ingrese Username");
		String username=leer.next();
		System.out.println("Ingrese su Contraseña");
		String password=leer.next();
		System.out.println("Ingrese nuevamente su Contraseña");
		String password2=leer.next();

		NuevoUsuario nuevoUsuario = new NuevoUsuario(nombre, apellido, email, username, password, password2);
		//NuevoUsuario nuevoUsuario = new NuevoUsuario("Pepe", "Perez","pepe@gmail.com", "pepito", "pepe123", "pepe123");
		
		sistema.registrar(nuevoUsuario);
		System.out.println("BIENVENIDO " + nuevoUsuario.getNombre() + "! :)");

	}
	
		
	
	public static void iniciarSesionMenu(){
		Sistema sistema = new Sistema();
		
		System.out.println("\tIniciar Sesion");
		
		System.out.println("Ingrese Username");
		String username=leer.next();
		System.out.println("Ingrese su Contraseña");
		String password=leer.next();
		
		InicioSesion inicioSesion = new InicioSesion(username, password);
		//InicioSesion inicioSesion = new InicioSesion("pepito", "pepe123");
		
        Usuario usuario = sistema.iniciarSesion(inicioSesion);
        System.out.println("HOLA " + usuario.getNombre() + "! :)");
        
	}
	
	

}
