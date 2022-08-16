package com.herencia;

public abstract class Electrodomestico {

    protected String marca;
    protected String modelo;
    protected Integer numeroDeSerie;
    protected double voltaje;
    protected String estado;
    protected double precio;

    public Electrodomestico() {
    }

    public Electrodomestico(String marca, String modelo, Integer numeroDeSerie, double voltaje, String estado, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
        this.voltaje = voltaje;
        this.estado = estado;
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumeroDeSerie(Integer numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public String getEstado() {
        return estado;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Número de serie: " + numeroDeSerie + "\n"
                + "Voltaje: " + voltaje + "\n"
                + "Estado: " + estado + "\n"
                + "Precio: " + precio;
    }
}
