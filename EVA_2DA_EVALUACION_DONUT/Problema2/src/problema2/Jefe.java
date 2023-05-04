package problema2;

public class Jefe extends Empleados {

    public Jefe() {
        super();
    }

    public Jefe(String nombre, String apellido, int edad, double salariob) {
        super(nombre, apellido, edad, salariob);
    }
    
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Puesto: Jefe");
    }

}
