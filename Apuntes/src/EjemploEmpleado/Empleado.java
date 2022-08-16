package EjemploEmpleado;

// Superclase abstracta Empleado
public abstract class Empleado {

    private String nombre;
    private String apellido;
    private String numeroSeguroSocial;

    public Empleado(String nombre, String apellido, String numeroSeguroSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
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

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    // Método abstracto sobrescrito por las subclases
    public abstract double ingresos();

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n"
                + "Apellido: " + getApellido() + "\n"
                + "Nº de seguro social: " + getNumeroSeguroSocial();
    }
}
