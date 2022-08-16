package EjemploEmpleado;

public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String numeroSeguroSocial, double salarioSemanal) {
        super(nombre, apellido, numeroSeguroSocial);
        this.salarioSemanal = (salarioSemanal < 0.0) ? 0.0 : salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = (salarioSemanal < 0.0) ? 0.0 : salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    @Override
    public double ingresos() {
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return "EMPLEADO ASALARIADO" + "\n"
                + super.toString() + "\n"
                + "Salario semanal: " + getSalarioSemanal() + "\n";
    }
}
