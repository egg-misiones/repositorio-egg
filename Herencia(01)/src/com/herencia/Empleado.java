package com.herencia;

public abstract class Empleado {

    protected String nombre;
    protected Integer edad;

    public Empleado() {
    }

    public Empleado(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }

    public abstract double calcularPago();
}
