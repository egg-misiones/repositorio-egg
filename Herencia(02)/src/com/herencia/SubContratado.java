package com.herencia;

public class SubContratado extends Empleado {

    protected Integer cantidadDeHoras;
    protected double precioPorHora;

    public SubContratado() {
    }

    public SubContratado(String nombre, Integer edad, Integer cantidadDeHoras, double precioPorHora) {
        super(nombre, edad);
        this.cantidadDeHoras = cantidadDeHoras;
        this.precioPorHora = precioPorHora;
    }

    public void setCantidadDeHoras(Integer cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public Integer getCantidadDeHoras() {
        return cantidadDeHoras;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcularPago() {
        return precioPorHora * cantidadDeHoras;
    }
}
