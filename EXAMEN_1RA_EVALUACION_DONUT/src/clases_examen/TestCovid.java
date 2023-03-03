package clases_examen;

public class TestCovid {
	
	private int edad;
	private boolean enfermo;
	private double peso;
	private double estatura;
	
	//costructor default
	public TestCovid() {
		edad = 0;
		enfermo = false;
		peso = 0;
		estatura = 0;
	}
	//costructor + atributos
	public TestCovid(int e, boolean en, double p, double estat) {
		edad = e;
		enfermo = en;
		peso = p;
		estatura = estat;
	}

	//metodos set
	public void setEdad(int e) {
		edad = e;
	}
	public void setEnfermo(boolean en) {
		enfermo = en;
	}
	public void setPeso(double p) {
		peso = p;
	}
	public void setEstatura(double e) {
		estatura = e;
	}
	
	//metodos get
	public int getEdad() {
		return edad;
	}
	public String getEnfermo() {
		if(enfermo) {
			return "Si";
		}else {
			return "No";
		}
	
	}
	public double getPeso() {
		return peso;
	}
	public double getEstatura() {
		return estatura;
	}
	
	public void calcularPersonaRiesgo() {
		
		boolean riesgo;
		
		if(calcularIMC() > 30) {
			System.out.println("Persona de Riesgo");
		}else if(enfermo) {
			System.out.println("Persona de Riesgo");
		}else if(edad >= 65) {
			System.out.println("Persona de Riesgo");
		}else {
			System.out.println("Persona sin Riesgo");
		}
	
	}
	
	private double calcularIMC() {
		return (peso / (estatura * estatura));
	}
	
	
}
