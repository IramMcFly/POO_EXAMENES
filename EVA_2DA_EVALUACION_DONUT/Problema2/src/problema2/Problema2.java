package problema2;

public class Problema2 {

    public static void main(String[] args) {
        Jefe a = new Jefe("Pancho", "Pistolas", 54, 5000);
        imprimirDatos(a);
        
        Apoyo l = new Apoyo();
        l.setApellido("Ballesteros");
        l.setNombre("Iram");
        l.setEdad(18);
        l.setSalarioBase(50);
        l.setHoras(40);
        imprimirDatos(l);
        
        Manufactura pa = new Manufactura("Diego", "Rose", 18, 59, 48);
        imprimirDatos(pa);
    }
    
    public static void imprimirDatos(Capturando obj){
        obj.imprimirDatos();
        System.out.println("");
    }

}
