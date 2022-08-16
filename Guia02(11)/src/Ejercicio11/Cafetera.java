package Ejercicio11;

public class Cafetera {

    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
        capacidadMaxima = 1000;
        capacidadActual = 0;
    }

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        if (capacidadActual > capacidadMaxima) {
            this.capacidadMaxima = capacidadMaxima;
            this.capacidadActual = capacidadMaxima;
        } else {
            this.capacidadMaxima = capacidadMaxima;
            this.capacidadActual = capacidadActual;
        }
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }
}
