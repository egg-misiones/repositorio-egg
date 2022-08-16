package EjemploSinHerencia2do;

// La clase EmpleadoBaseMasComision representa a un empleado que recibe un salario base más una comisión
public class EmpleadoBaseMasComision {

    private String nombre;
    private String apellido;
    private String numeroSeguroSocial;
    private double ventasBrutas; // Ventas totales por semana
    private double tarifaComision; // Porcentaje de comisión
    private double salarioBase; // Salario base por semana

    // Constructor con 6 parámetros
    public EmpleadoBaseMasComision(String nombre, String apellido, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        // La llamada al constructor de la clase Object sucede acá
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = (ventasBrutas < 0.0) ? 0.0 : ventasBrutas;
        this.tarifaComision = (tarifaComision > 0.0 && tarifaComision < 1.0) ? tarifaComision : 0.0;
        this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    // Validación del parámetro ventasBrutas
    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = (ventasBrutas < 0.0) ? 0.0 : ventasBrutas;
    }

    // Validación del parámetro tarifaComision
    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = (tarifaComision > 0.0 && tarifaComision < 1.0) ? tarifaComision : 0.0;
    }

    // Validación del parámetro salarioBase
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Método para calcular el salario del empleado
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
