package EjemploConHerencia;

/*
EmpleadoBaseMasComision4 hereda de EmpleadoPorComision3 y accede a los
atributos private de EmpleadoPorComision3 a través de los métodos public.
 */
public class EmpleadoBaseMasComision4 extends EmpleadoPorComision3 {

    private double salarioBase; // Salario base por semana

    // Constructor con 6 argumentos
    public EmpleadoBaseMasComision4(String nombre, String apellido, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        // Llamada explícita al constructor de la superclase EmpleadoPorComision3
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

    /* Método para calcular el salario del empleado:
    Se hace uso de la palabra super para acceder al método obtenerIngresos
    de la clase EmpleadoPorComision3.
     */
    @Override
    public double obtenerIngresos() {
        return getSalarioBase() + super.obtenerIngresos();
    }

    // Se accede al método toString(superclase) por medio de la palabra super
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Salario base: " + salarioBase;
    }
}
