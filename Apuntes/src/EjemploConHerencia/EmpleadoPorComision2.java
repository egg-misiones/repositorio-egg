package EjemploConHerencia;

// La clase EmpleadoPorComision2 representa a un empleado por comisión
public class EmpleadoPorComision2 {

    // Atributos protected
    protected String nombre;
    protected String apellido;
    protected String numeroSeguroSocial;
    protected double ventasBrutas; // Ventas semanales totales
    protected double tarifaComision; // Porcentaje de comisión

    // Constructor con 5 parámetros
    public EmpleadoPorComision2(String nombre, String apellido, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = (ventasBrutas < 0.0) ? 0.0 : ventasBrutas;
        this.tarifaComision = (tarifaComision > 0.0 && tarifaComision < 1.0) ? tarifaComision : 0.0;
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

    // Método para calcular el salario del empleado por comisión
    public double obtenerIngresos() {
        return tarifaComision * ventasBrutas;
    }

    // Se sobrescribe el método toString
    @Override
    public String toString() {
        return "Empleado por comisión: " + nombre + " " + apellido + "\n"
                + "Nº de seguro social: " + numeroSeguroSocial + "\n"
                + "Ventas brutas: " + ventasBrutas + "\n"
                + "Tarifa por comisión: " + tarifaComision;
    }
}
