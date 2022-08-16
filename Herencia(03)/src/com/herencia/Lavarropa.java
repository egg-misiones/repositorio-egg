package com.herencia;

public class Lavarropa extends Electrodomestico {

    private Integer cargaMaxima;
    private String tipo;

    public Lavarropa() {
    }

    public Lavarropa(String marca, String modelo, Integer numeroDeSerie, double voltaje, String estado, double precio, Integer cargaMaxima, String tipo) {
        super(marca, modelo, numeroDeSerie, voltaje, estado, precio);
        this.cargaMaxima = cargaMaxima;
        this.tipo = tipo;
    }

    public void setCargaMaxima(Integer cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCargaMaxima() {
        return cargaMaxima;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Carga máxima: " + cargaMaxima + "\n"
                + "Tipo: " + tipo;
    }
}
