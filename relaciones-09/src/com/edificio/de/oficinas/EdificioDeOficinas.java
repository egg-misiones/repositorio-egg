package com.edificio.de.oficinas;

import com.interfaz.Edificio;

public class EdificioDeOficinas implements Edificio {

    private Integer numeroDeOficinas;
    private double superficie;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numeroDeOficinas, double superficie) {
        this.numeroDeOficinas = numeroDeOficinas;
        this.superficie = superficie;
    }

    public void setNumeroDeOficinas(Integer numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public Integer getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public double getSuperficie() {
        return superficie;
    }

    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }
}
