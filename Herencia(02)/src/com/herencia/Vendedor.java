package com.herencia;

public class Vendedor extends SubContratado {

    private double porcentaje;

    public Vendedor() {
    }

    public Vendedor(String nombre, Integer edad, Integer cantidadDeHoras, double precioPorHora, double porcentaje) {
        super(nombre, edad, cantidadDeHoras, precioPorHora);
        this.porcentaje = porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcularPago() {
        double auxiliarPorcentaje = (100 + porcentaje) / 100;

        return super.calcularPago() * auxiliarPorcentaje;
    }
}
