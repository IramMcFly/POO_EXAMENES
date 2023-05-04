package problema3;

public abstract class Empleados {
    
    private String ID;
    private String nombre;
    private double salario;

    public Empleados() {
        this.ID = "0";
        this.nombre = "-------";
        this.salario = 0;
    }

    public Empleados(String ID, String nombre, double salario) {
        this.ID = ID;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalario(){
        return 0;   
    }
}
