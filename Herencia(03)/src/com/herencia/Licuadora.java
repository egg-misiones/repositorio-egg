package com.herencia;

public class Licuadora extends Electrodomestico {

    private double potencia;
    private Integer cantidadDeVelocidades;

    public Licuadora() {
    }

    public Licuadora(String marca, String modelo, Integer numeroDeSerie, double voltaje, String estado, double precio, double potencia, Integer cantidadDeVelocidades) {
        super(marca, modelo, numeroDeSerie, voltaje, estado, precio);
        this.potencia = potencia;
        this.cantidadDeVelocidades = cantidadDeVelocidades;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setCantidadDeVelocidades(Integer cantidadDeVelocidades) {
        this.cantidadDeVelocidades = cantidadDeVelocidades;
    }

    public double getPotencia() {
        return potencia;
    }

    public Integer getCantidadDeVelocidades() {
        return cantidadDeVelocidades;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Potencia: " + potencia + "\n"
                + "Cantidad de velocidades: " + cantidadDeVelocidades;
    }
}
