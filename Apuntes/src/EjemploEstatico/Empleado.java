package EjemploEstatico;

public class Empleado {

    private String nombre;
    private String apellido;
    // Uso de un atributo estático para contabilizar la cantidad de objetos creados
    private static int cantidadEmpleados = 0;

    /*
    Se inicializan los atributos del objeto creado y se incrementa el atributo
    estático
     */
    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        cantidadEmpleados++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public static int getCantidadEmpleados() {
        return cantidadEmpleados;
    }
}
