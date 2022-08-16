package com.persona;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected Integer dni;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void cambioDeEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "Estado civil: " + estadoCivil;
    }
}
