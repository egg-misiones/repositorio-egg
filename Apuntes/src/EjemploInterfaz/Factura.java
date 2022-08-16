package EjemploInterfaz;

/*
TEORÍA
Java no permite que las subclases hereden de más de una superclase, pero sí
permite que una clase herede de una superclase e implemente más de una interfaz.
 */
// La clase Factura implementa la interfaz PorPagar
public class Factura implements PorPagar {

    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = (cantidad < 0) ? 0 : cantidad;
        this.precioPorArticulo = (precioPorArticulo < 0.0) ? 0.0 : precioPorArticulo;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = (cantidad < 0) ? 0 : cantidad;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = (precioPorArticulo < 0.0) ? 0.0 : precioPorArticulo;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    // Se sobrescribe el método obtenerMontoPago de la interfez PorPagar
    @Override
    public double obtenerMontoPago() {
        return getCantidad() * getPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return "FACTURA" + "\n"
                + "Nº de pieza: " + getNumeroPieza() + "\n"
                + "Descripción: " + getDescripcionPieza() + "\n"
                + "Cantidad: " + getCantidad() + "\n"
                + "Precio por artículo: " + getPrecioPorArticulo();
    }
}
