package com.yate;

import com.barco.Barco;

public class Yate extends Barco {

    private Integer potenciaCV;
    private Integer numeroCamarotes;

    public Yate() {
        super();
    }

    public Yate(Integer potenciaCV, Integer numeroCamarotes, int matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public void setNumeroCamarotes(Integer numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public Integer getNumeroCamarotes() {
        return numeroCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + numeroCamarotes;
    }

    @Override
    public String toString() {
        return "YATE" + "\n"
                + "Matrícula: " + matricula + "\n"
                + "Eslora: " + eslora + "\n"
                + "Año de fabricación: " + anioFabricacion + "\n"
                + "Potencia CV: " + potenciaCV + "\n"
                + "Número de camarotes: " + numeroCamarotes;
    }
}
