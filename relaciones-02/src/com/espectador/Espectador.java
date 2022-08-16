package com.espectador;

import com.cine.Cine;

public class Espectador {

    private String nombre;
    private int edad;
    private double dineroDisponible;
    private Cine cine;
    private int id;
    private static int contadorEspectador;

    public Espectador() {
        id = ++contadorEspectador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDineroDisponible(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }

    public Cine getCine() {
        return cine;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Espectador " + id + ": " + nombre + " (" + edad + ")" + "\n"
                + "Dinero disponible: " + dineroDisponible;
    }
}
