package problema2;

public abstract class Empleados implements Capturando {

    private String nombre;
    private String apellido;
    private int edad;
    private double salariob;

    public Empleados() {
        this.nombre = "---";
        this.apellido = "---";
        this.edad = 0;
        this.salariob = 0;
    }

    public Empleados(String nombre, String apellido, int edad, double salariob) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salariob = salariob;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario Base: " + salariob);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void setSalarioBase(double salarioBase) {
        this.salariob = salarioBase;
    }

    @Override
    public double getSalarioBase() {
        return salariob;
    }
    
}
