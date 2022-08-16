package com.herencia;

public class Televisor extends Electrodomestico {

    private double pulgadas;
    private boolean smart;

    public Televisor() {
    }

    public Televisor(String marca, String modelo, Integer numeroDeSerie, double voltaje, String estado, double precio, double pulgadas, boolean smart) {
        super(marca, modelo, numeroDeSerie, voltaje, estado, precio);
        this.pulgadas = pulgadas;
        this.smart = smart;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public boolean isSmart() {
        return smart;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Pulgadas: " + pulgadas + "\n"
                + "Smart: " + smart;
    }
}
