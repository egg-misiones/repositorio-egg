package com.herencia;

public class Heladera extends Electrodomestico {

    private double capacidad;
    private boolean noFrost;

    public Heladera() {
    }

    public Heladera(String marca, String modelo, Integer numeroDeSerie, double voltaje, String estado, double precio, double capacidad, boolean noFrost) {
        super(marca, modelo, numeroDeSerie, voltaje, estado, precio);
        this.capacidad = capacidad;
        this.noFrost = noFrost;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void setNoFrost(boolean noFrost) {
        this.noFrost = noFrost;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public boolean isNoFrost() {
        return noFrost;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Capacidad: " + capacidad + "\n"
                + "No frost: " + noFrost;
    }
}
