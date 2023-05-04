package problema3;

public class EmpleadoTiempoParcial extends Empleados{

    private double pagoPorHora;
    private double horasTrabajadas;

    public EmpleadoTiempoParcial() {
        super();
    }

    public EmpleadoTiempoParcial(double pagoPorHora, double horasTrabajadas, String ID, String nombre, double salario) {
        super(ID, nombre, salario);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    
}
