package main_package;

import clases_examen.*;
import java.util.Scanner;

public class EVA1_EXAMEN_DONUT {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int select;
		
		//datos
		DatosIntegrantes.imprimirDatosEquipo();
		DatosIntegrantes.imprimirProblemasResuletos();
		
		
		System.out.print("Ingrese el programa a correr: ");
		select = sc.nextInt();
		
		while(select < 1 || select > 3) {
			System.out.print("Escoge una opcion valida: ");
			select = sc.nextInt();
		}
		
		
		switch(select) {
		case 1:
			System.out.println("\nFibonacci");
			mainFibonacci.callFibonacci();
		break;
		
		case 2:
			System.out.println("\nTestCovid");
			mainTest_Covid.callTestCovid();
		break;
		
		case 3:
			System.out.println("\nCuenta Bancaria");
			mainCuentaBancaria.callCuentaBancaria();
		break;
		
		default:
			
		break;
		}
		
				
	}

}
