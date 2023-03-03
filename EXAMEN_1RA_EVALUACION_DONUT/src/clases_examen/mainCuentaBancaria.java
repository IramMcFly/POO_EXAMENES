package clases_examen;

public class mainCuentaBancaria {

	public static void callCuentaBancaria() {
		
		//constructor sin parametros
		System.out.println();
		CuentaBancaria cb1 = new CuentaBancaria();
		cb1.imprimirDatos();
		
		//costructor con argumentos
		System.out.println();
		CuentaBancaria cb2 = new CuentaBancaria("2978364", "Ricardo Salinas", 902234.2);
		cb2.imprimirDatos();
		
		//constructor sin parametros manipulado manualmente
		System.out.println();
		CuentaBancaria cb3 = new CuentaBancaria();
		cb3.setcliente("Carlos Salinas De Gortari");
		cb3.setCuenta("265432234");
		cb3.depositarEnCuenta(321123.45);
		cb3.retirarDeCuenta(200.0);
		cb3.imprimirDatos();
		
	}
	
}
