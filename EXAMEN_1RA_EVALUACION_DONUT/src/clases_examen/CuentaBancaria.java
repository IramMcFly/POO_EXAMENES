package clases_examen;

public class CuentaBancaria {
	
	private String nCuenta;
	private String nmCliente;
	private double saldo;
	
	//constructores
	public CuentaBancaria() {
		nCuenta = "";
		nmCliente = "";
		saldo = 0;
	}
	public CuentaBancaria(String n, String nm, double S) {
		nCuenta = n;
		nmCliente = nm;
		saldo = S;
	}
	
	//metodos Set
	public void setCuenta(String n) {
		nCuenta = n;
	}
	public void setcliente(String n) {
		nmCliente = n;
	}
	
	//metodos get
	public String getCuenta() {
		return nCuenta;
	}
	public String getCliente() {
		return nmCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	
	//manejo de dinero
	public void depositarEnCuenta(double s) {
		saldo += s;
	}
	public void retirarDeCuenta(double s) {
		if(saldo >= s) {
			saldo -= s;
		}
	}
	
	public void imprimirDatos() {
		System.out.println("Numero de cuenta: " + nCuenta);
		System.out.println("Nombre del cliente: " + nmCliente);
		System.out.println("Saldo actual: " + saldo);
	}
	
}
