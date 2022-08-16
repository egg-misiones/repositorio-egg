package EjemploEmpleado;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private double salarioBase; // Salario base por semana

    public EmpleadoBaseMasComision(String nombre, String apellido, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        super(nombre, apellido, numeroSeguroSocial, ventasBrutas, tarifaComision);
        this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public double ingresos() {
        return getSalarioBase() + super.ingresos();
    }

    @Override
    public String toString() {
        return "CON SALARIO BASE "
                + super.toString() + "\n"
                + "Salario base: " + getSalarioBase() + "\n";
    }
}
