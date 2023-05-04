package Problema1;

public class Problema1 {

    public static void main(String[] args) {
        Formula1 d1 = new Formula1(1, 80, 10, 7);
        System.out.println("Distancia: " + d1.calcularDistancia());
        
        Formula2 d2 = new Formula2(1, 80, 10, 7);
        System.out.println("Distancia: " + d2.calcularDistancia());
        
        Formula3 d3 = new Formula3();
        d3.setVeli(1);
        d3.setAceleration(10);
        d3.setVelf(80);
        d3.setTime(7);
        System.out.println("Distancia: " + d3.calcularDistancia());
        
        
    }

}
