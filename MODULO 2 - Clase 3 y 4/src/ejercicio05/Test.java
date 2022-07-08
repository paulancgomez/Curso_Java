package ejercicio05;

/*  Ejercicio N° 5:
 	
 	Crear una agenda telefónica de contactos:
	Cada contacto tiene nombre y número de teléfono, un contacto es igual a otro
	cuando sus nombres son iguales Una agenda de contactos está formada por una
	cantidad n de contactos. Podemos definir nosotros la cantidad o por defecto serán
	10.
	Los métodos de la agenda serán los siguientes:
		● añadirContacto(Contacto c): añade un contacto a la agenda, si no se pueden
		meter más a la agenda se indicará por pantalla. No se pueden duplicar
		contactos existentes. -existeContacto(Contacto c): indica si el contacto
		pasado existe o no.
		● listarContactos(): lista todos los contactos.
		● buscaContacto(String nombre): busca el contacto por el nombre y muestra su
		teléfono
		● eliminiarContacto(String nombre): elimina el contacto y muestra un mensaje
		de contacto eliminado.
		● agendaLlena(): indica si la agenda está llena
		● contactosLibres():indica cuántos contactos libres quedan
	Crea un menú con opciones por consola para probar todas estas
	funcionalidades.*/

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {

		Agenda miAgenda = new Agenda(2);
		
		Scanner teclado = new Scanner(System.in);
		
		int opcion;
		
		do {
			opcion = menu();
			switch(opcion) {
				
				case 1:      //LISTAR CONTACTOS
					miAgenda.listarContactos();
					break;
				
				case 2:      //ANIADIR CONTACTO
					System.out.println("\tCONTACTO NUEVO");
					System.out.println("Nombre: ");
					String nombre = teclado.nextLine();
					
					System.out.println("Numero de Telefono: ");
					String numTelefono = teclado.nextLine();
					
					Contacto nuevo = new Contacto(nombre, numTelefono);
					miAgenda.aniadirContacto(nuevo);
					break;
				
				case 3:  //BUSCAR CONTACTO
					System.out.println("\tBUSCAR A");
					System.out.println("Nombre: ");
					String nombreBuscar = teclado.nextLine();
					miAgenda.buscaContacto(nombreBuscar);
					break;
				
				case 4:  //ELIMINAR CONTACTO
					System.out.println("\tELIMINAR A");
					System.out.println("Nombre: ");
					String nombreEliminar = teclado.nextLine();
					miAgenda.eliminarContacto(nombreEliminar);
					break;	
					
				case 5:  //ESTADO ACTUAL DE LA AGENDA
					if(!miAgenda.agendaLlena()) {
						if(miAgenda.getT() == 0) {
							System.out.println("AGENDA VACIA!");
						}
						else {
							System.out.println("Cantidad de contactos de mi Agenda: " + miAgenda.getT());
							System.out.println("Cantidad de contactos libres: " + miAgenda.contactosLibres());
						}
					}
					else
						System.out.println("AGENDA LLENA!");
					break;	
					
				case 0:
					System.out.println("Fin del programa.");
					break;	
				
				default:
					System.out.println("Opcion no valida. Vuelva a ingresar.");
					break;
			}
		}while(opcion != 0);
		
		teclado.close();
			
	}
	
	public static int menu() {
		int opcion;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("*******************************");
		System.out.println("\tMENU DE OPCIONES\n\n"
				+ "1. Listar todos los contactos.\n"
				+ "2. Aniadir un contacto a la agenda.\n"
				+ "3. Buscar Contacto.\n"
				+ "4. Eliminiar Contacto.\n"
				+ "5. Estado Actual de la Agenda.\n"
				+ "0. Salir.\n\n"
				+ "Elija una opcion:");
		opcion = teclado.nextInt();
		return opcion;
	}

}