package com.embarcacion.deportiva;

import com.barco.Barco;

public class EmbarcacionDeportiva extends Barco {

    private Integer potenciaCV;

    public EmbarcacionDeportiva() {
        super();
    }

    public EmbarcacionDeportiva(Integer potenciaCV, int matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }

    @Override
    public String toString() {
        return "EMBARCACIÓN DEPORTIVA" + "\n"
                + "Matrícula: " + matricula + "\n"
                + "Eslora: " + eslora + "\n"
                + "Año de fabricación: " + anioFabricacion + "\n"
                + "Potencia CV: " + potenciaCV;
    }
}
