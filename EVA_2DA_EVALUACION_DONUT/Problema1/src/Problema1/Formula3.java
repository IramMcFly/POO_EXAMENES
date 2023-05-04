package Problema1;

public class Formula3 extends Movimiento{

    public Formula3(){
        super();
    }
    
    public Formula3(double veli, double velf, double aceleration, double time) {
        super(veli, velf, aceleration, time);
    }
    
    
    @Override
    public double calcularDistancia() {
        
     return (Math.pow(getVelf(), 2)- Math.pow(getVeli(), 2))/(getAceleration()*2);

           
    }
}
