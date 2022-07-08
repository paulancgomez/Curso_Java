package ejercicio05;

public class Agenda {
	private Contacto[] contactos;
	private int t;                   //t cantidad de contactos ocupados que tengo en la agenda

	//CONSTRUTOR POR DEFECTO (POR DEFECTO SERA 10)
	public Agenda() {
		this.contactos = new Contacto[10];
		this.t = 0;
	}
	
	//CONSTRUCTOR
	public Agenda(int capacidad) {
		if(capacidad > 0) {
			this.contactos = new Contacto[capacidad];
			this.t = 0;       
		}
		else {
			System.out.println("Error. Capacidad no admitida.");
			this.t = -1;
		}
	}
	
	//GETT Y SETT
	public Contacto[] getContactos() {
		return contactos;
	}

	public void setContactos(Contacto[] contactos) {
		this.contactos = contactos;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}
	
	//METODO LISTAR
	public void listarContactos(){
		if(this.t == 0) {
			System.out.println("No hay contactos para mostrar.");
		}
		for(int i=0; i<this.contactos.length; i++) {
			if(contactos[i] != null)
			System.out.println("\nCONTACTO " + (i+1) + "\n" + this.contactos[i].toString());
		}
	}

	//METODO ANIADIR
	public void aniadirContacto(Contacto nuevo){
		if(!agendaLlena()) {                  //Si no esta llena
			if(!existeContacto(nuevo)) {      //Si no existe
				contactos[t] = nuevo;
				this.t = this.t + 1;
				System.out.println("CONTACTO ANIADIDO!");
			}
			else {
				System.out.println("El contacto con ese nombre ya existe.");
			}
		}
		else {
			System.out.println("Agenda llena. No se pueden aniadir mas contactos.");
		}	
	}
	private boolean existeContacto(Contacto c) {
		if(this.t == 0) {  //NO HAY ELEMENTO ENTOCES NO EXISTE AUN
			return false;
		}
		else {
			int i=0;
			while(i<this.t && contactos[i].iguales(c)==false){ //que vaya hasta la cantidad de ocupados porque en el resto del vector no hay nada
				i++;  
			}
			if(i<this.t)
				return true;
			else
				return false;
		}
	}
	
	//METODO BUSCAR
	public void buscaContacto(String nombre){
		int indiceBus=buscaContactoPriv(nombre);
		if(indiceBus != -1) {
			System.out.println("Numero de Telefono buscado: " + this.contactos[indiceBus].getNumTelefono());
		}
		else
			System.out.println("No esta.");
			
	}
	
	private int buscaContactoPriv(String nombre){  //Retorna la posicion donde esta "nombre"
		int i=0;
		while(i<this.t && this.contactos[i].getNombre().equals(nombre)==false) {
			i++;
		}
		if(i<this.t) {
			return i;
		}
		else
			return -1;
	}
	
	//METODO ELIMINAR
	public void eliminarContacto(String nombre){
		int indiceBus=buscaContactoPriv(nombre);
		if(indiceBus != -1) {
			for(int j=indiceBus; j<this.t-1; j++) {
				this.contactos[j] = this.contactos[j+1];
			}
			this.contactos[indiceBus] = null;  //??
			this.t--;
			System.out.println("CONTACTO ELIMINADO!");
		}else {
			System.out.println("El contacto no se encuentra en la agenda.");
		}
	}
	
	//ESTADO DE LA AGENDA
	public boolean agendaLlena() {
		return this.t == this.contactos.length;
	}
	
	public int contactosLibres(){
		return this.contactos.length-this.t;
	}
}
