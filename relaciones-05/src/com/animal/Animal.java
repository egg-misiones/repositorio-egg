package com.animal;

public abstract class Animal {

    protected String nombre;
    protected String tipoAlimento;
    protected int edad;
    protected String tipoRaza;

    public Animal() {
    }

    public Animal(String nombre, String tipoAlimento, int edad, String tipoRaza) {
        this.nombre = nombre;
        this.tipoAlimento = tipoAlimento;
        this.edad = edad;
        this.tipoRaza = tipoRaza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTipoRaza(String tipoRaza) {
        this.tipoRaza = tipoRaza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipoRaza() {
        return tipoRaza;
    }

    public abstract void alimentarse();
}
