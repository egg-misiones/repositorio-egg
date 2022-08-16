package com.televisor;

import com.electrodomestico.Electrodomestico;

public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean sintonizadorTdt;

    public Televisor() {
        super();
        resolucion = 20;
        sintonizadorTdt = false;
    }

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
        resolucion = 20;
        sintonizadorTdt = false;
    }

    public Televisor(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    @Override
    public double precioFinal() {
        double precioPlusTelevisor = 0;
        precioPlusTelevisor = super.precioFinal();

        if (resolucion > 40) {
            precioPlusTelevisor = ((precioPlusTelevisor * 30) / 100) + precioPlusTelevisor;
        }

        if (sintonizadorTdt) {
            precioPlusTelevisor += 500;
        }

        return precioPlusTelevisor;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Resolución: " + resolucion + "\n"
                + "Sintonizador TDT: " + sintonizadorTdt;
    }
}
