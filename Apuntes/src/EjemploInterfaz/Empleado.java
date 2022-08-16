package EjemploInterfaz;

/*
TEORÍA
Recuerde que cuando una clase implementa a una interfaz, hace un contrato con el compilador,
en el que se establece que la clase implementará cada uno de los métodos en la interfaz, o
de lo contrario la clase se declara como abstract. Si se elige la última opción, no necesitamos
declarar los métodos de la interfaz como abstract en la clase abstracta; ya están declarados como
tales de manera implícita en la interfaz. Cualquier subclase concreta de la clase abstracta debe
implementar a los métodos de la interfaz para cumplir con el contrato de la superclases con el compilador.

CLASE EMPLEADO
Empleado no implementa el método obtenerMontoPago de la interfaz PorPagar,
por lo que la clase debe declararse como abstract para evitar un error de compilación.
 */
// Superclase abstracta Empleado
public abstract class Empleado implements PorPagar {

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

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n"
                + "Apellido: " + getApellido() + "\n"
                + "Nº de seguro social: " + getNumeroSeguroSocial();
    }
}
