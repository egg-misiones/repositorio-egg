package com.velero;

import com.barco.Barco;

public class Velero extends Barco {

    private Integer numeroMastiles;

    public Velero() {
        super();
    }

    public Velero(Integer numeroMastiles, int matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numeroMastiles;
    }

    @Override
    public String toString() {
        return "VELERO" + "\n"
                + "Matrícula: " + matricula + "\n"
                + "Eslora: " + eslora + "\n"
                + "Año de fabricación: " + anioFabricacion + "\n"
                + "Número de mástiles: " + numeroMastiles;
    }
}
