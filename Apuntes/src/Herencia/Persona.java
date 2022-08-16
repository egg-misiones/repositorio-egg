package Herencia;

public class Persona {

    private String nombre;
    private char genero;
    private int edad;
    private String direccion;

    // Constructor vacío
    public Persona() {
    }

    // Constructor con 1 parámetro
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Constructor con todos los parámetros
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Persona\n"
                + "Nombre: " + nombre + "\n"
                + "Género: " + genero + "\n"
                + "Edad: " + edad + "\n"
                + "Dirección: " + direccion + "\n";
    }
}
