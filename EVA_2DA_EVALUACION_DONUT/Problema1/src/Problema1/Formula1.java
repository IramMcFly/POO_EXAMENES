package Problema1;

public class Formula1 extends Movimiento {  

    public Formula1(){
        super();
    }
    
    public Formula1(double veli, double velf, double aceleration, double time) {
        super(veli, velf, aceleration, time);
    }
    
    @Override
    public double calcularDistancia() {
        
     return (getVeli()*getTime())+((getAceleration()*Math.pow(getTime(), 2))/2);

           
    }

    
}
