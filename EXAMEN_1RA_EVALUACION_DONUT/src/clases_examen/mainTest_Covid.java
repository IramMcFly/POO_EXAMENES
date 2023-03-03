package clases_examen;

public class mainTest_Covid {
	
	public static void callTestCovid() {
		
		
		//trabajando objeto TestCovid1
		//unicamente se usa el constructor default
		TestCovid TestCovid1 = new TestCovid();
		TestCovid1.calcularPersonaRiesgo();
		System.out.println("Edad: " + TestCovid1.getEdad() + "\nEnfermo: " + TestCovid1.getEnfermo() + "\nPeso: " + TestCovid1.getPeso() + "\nEstatura: " + TestCovid1.getEstatura());
		
		//usando el constructor que recibe datos
		System.out.println();
		TestCovid TestCovid2 = new TestCovid(65,false,1.6,56.3);
		TestCovid2.calcularPersonaRiesgo();
		System.out.println("Edad: " + TestCovid2.getEdad() + "\nEnfermo: " + TestCovid2.getEnfermo() + "\nPeso: " + TestCovid2.getPeso() + "\nEstatura: " + TestCovid2.getEstatura());
		
		//llenado manual del objeto
		System.out.println();
		TestCovid TestCovid3 = new TestCovid();
		TestCovid3.setEdad(34);
		TestCovid3.setEnfermo(true);
		TestCovid3.setEstatura(1.4);
		TestCovid3.setPeso(50.7);
		TestCovid3.calcularPersonaRiesgo();
		System.out.println("Edad: " + TestCovid3.getEdad() + "\nEnfermo: " + TestCovid3.getEnfermo() + "\nPeso: " + TestCovid3.getPeso() + "\nEstatura: " + TestCovid3.getEstatura());
		
	}
	
	
}
