package com.revolver;

public class Revolver {

    private int posicionActual;
    private int posicionBala;

    public Revolver() {
        posicionActual = (int) (Math.random() * 6 + 1);
        posicionBala = (int) (Math.random() * 6 + 1);
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    @Override
    public String toString() {
        return "Posición actual: " + posicionActual + "\n" + "Posición de la bala: " + posicionBala;
    }
}
