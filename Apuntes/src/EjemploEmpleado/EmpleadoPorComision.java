package EjemploEmpleado;

public class EmpleadoPorComision extends Empleado {

    private double ventasBrutas; // Ventas totales por semana
    private double tarifaComision; // Porcentaje de comisión

    public EmpleadoPorComision(String nombre, String apellido, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        super(nombre, apellido, numeroSeguroSocial);
        this.ventasBrutas = (ventasBrutas < 0.0) ? 0.0 : ventasBrutas;
        this.tarifaComision = (tarifaComision > 0.0 && tarifaComision < 1.0) ? tarifaComision : 0.0;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = (ventasBrutas < 0.0) ? 0.0 : ventasBrutas;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = (tarifaComision > 0.0 && tarifaComision < 1.0) ? tarifaComision : 0.0;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    @Override
    public double ingresos() {
        return getTarifaComision() * getVentasBrutas();
    }

    @Override
    public String toString() {
        return "EMPLEADO POR COMISIÓN" + "\n"
                + super.toString() + "\n"
                + "Ventas brutas: " + getVentasBrutas() + "\n"
                + "Tarifa de comisión: " + getTarifaComision();
    }
}
