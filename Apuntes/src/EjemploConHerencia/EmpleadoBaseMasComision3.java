package EjemploConHerencia;

/*
EmpleadoBaseMasComision3 hereda de EmpleadoPorComision2 y tiene acceso
a los miembros protected de EmpleadoPorComision2
 */
public class EmpleadoBaseMasComision3 extends EmpleadoPorComision2 {

    private double salarioBase; // Salario base por semana

    // Constructor con 6 argumentos
    public EmpleadoBaseMasComision3(String nombre, String apellido, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        // Llamada explícita al constructor de la superclase EmpleadoPorComision2
        super(nombre, apellido, numeroSeguroSocial, ventasBrutas, tarifaComision);
        this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase;
    }

    // Validación del parámetro salarioBase
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Método para calcular el salario del empleado
    @Override
    public double obtenerIngresos() {
        return salarioBase + (tarifaComision * ventasBrutas);
    }

    // Se sobrescribe el método toString
    @Override
    public String toString() {
        return "Empleado por comisión con sueldo base: " + nombre + " " + apellido + "\n"
                + "Nº de seguro social: " + numeroSeguroSocial + "\n"
                + "Ventas brutas: " + ventasBrutas + "\n"
                + "Tarifa por comisión: " + tarifaComision + "\n"
                + "Salario base: " + salarioBase;
    }
}
