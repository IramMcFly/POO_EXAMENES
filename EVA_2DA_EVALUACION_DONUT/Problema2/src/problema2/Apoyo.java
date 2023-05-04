package problema2;

public class Apoyo extends Empleados{

    private double horas;

    public Apoyo() {
        super();
    }

    public Apoyo(String nombre, String apellido, int edad, double salariob, double horas) {
        super(nombre, apellido, edad, salariob);
        this.horas = horas;
    }
    
    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    public double getSalarioTotal() {
        return horas * super.getSalarioBase() + (super.getSalarioBase()/2);
    }
    
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Puesto: Apoyo");
        System.out.println("Horas Trabajadas: " + horas);
        System.out.println("Salario semanal: " + this.getSalarioTotal());
    }
}
