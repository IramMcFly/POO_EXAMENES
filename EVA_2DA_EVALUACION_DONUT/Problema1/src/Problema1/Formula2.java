package Problema1;

public class Formula2 extends Movimiento{

    public Formula2(){
        super();
    }
    
    public Formula2(double veli, double velf, double aceleration, double time) {
        super(veli, velf, aceleration, time);
    }
   
    
    @Override
    public double calcularDistancia() {
        
     return ((getVeli()+getVelf())/2)*getTime();

           
    }
    
}
