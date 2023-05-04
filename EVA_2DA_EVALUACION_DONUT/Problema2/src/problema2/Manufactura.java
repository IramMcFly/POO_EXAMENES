package problema2;

public class Manufactura extends Empleados{
    
    private double horas;
    
    public Manufactura(){
        super();
    }

    public Manufactura (String nombre, String apellido, int edad, double salariob, double horas) {
        super(nombre, apellido, edad, salariob);
        this.horas = horas;
    }

    public double getSalarioTotal() {
        return horas * super.getSalarioBase();
    }
    
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Puesto: Manufactura");
        System.out.println("Horas Trabajadas: " + horas);
        System.out.println("Salario semanal: " + this.getSalarioTotal());
    }

}
