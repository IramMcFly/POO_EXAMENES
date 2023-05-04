package problema3;

public class EmpleadoTiempoCompleto extends Empleados{

    public EmpleadoTiempoCompleto() {
        super();
    }

    public EmpleadoTiempoCompleto(String ID, String nombre, double salario) {
        super(ID, nombre, salario);
    }

    @Override
    public double calcularSalario() {
        return super.getSalario();
    }
    
  
}
