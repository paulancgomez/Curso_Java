package ejercicio5;

public class Cuenta {
	//ATRIBUTOS
	private String nombreCliente;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	//CONSTRUCTOR POR DEFEECTO
	public Cuenta() {
		
	}
	
	//CONSTRUCTOR CON TODOS LOS PARAMETROS
	public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
		this.nombreCliente = nombreCliente;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	
	//CONSTRUCTOR COPIA
	public Cuenta(Cuenta cuenta) {
		this.nombreCliente = cuenta.nombreCliente;
		this.numeroCuenta = cuenta.numeroCuenta;
		this.tipoInteres = cuenta.tipoInteres;
		this.saldo = cuenta.saldo;
	}
	
	//METODOS SETTERS Y GETTERS
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//METODO INGRESO
	public boolean ingreso(double cantidad){
		if(cantidad >= 0){
			this.setSaldo(this.getSaldo()+cantidad);
			System.out.println("Ingreso realizado con éxito.");
			return true;
		}
		else {
			System.out.println("Error.");
			return false;
		}
	}
	
	//METODO REINTEGRO
	public boolean reintegro(int cantidad){
		boolean band = false;
		if(this.saldo - cantidad >= 0) {
			if(cantidad >= 0) {
				System.out.println("Reintegro realizado con éxito.");
				band=true;
			}else {
				System.out.println("Error Reintegro.");
				band=false;
			}
		}
		else {
			System.out.println("Error. No hay saldo suficiente para descontar.");
			band=false;
		}
		return band;
	}
	
	public void transferencia(Cuenta destino, double importe){
		if(this.saldo >= importe) {
			destino.setSaldo(destino.getSaldo()+importe);
			this.setSaldo(this.getSaldo()-importe);
			System.out.println("Transferencia realizada con éxito.");
		}
		else {
			System.out.println("Error Transferencia.");
		}
	}
	
	public void muestra() {
		System.out.println("Nombre del Cliente: " + this.nombreCliente
				+ "\nNumero de Cuenta: " + this.numeroCuenta
				+ "\nTipo de Interes: " + this.tipoInteres
				+ "\nSaldo: " + this.saldo
				+ "\n");
	}

}
