package com.persona;

import java.util.Objects;

public abstract class Persona {

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

    public Integer obtenerDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "Estado civil: " + estadoCivil;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
}
