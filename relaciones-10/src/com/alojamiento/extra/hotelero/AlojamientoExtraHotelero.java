package com.alojamiento.extra.hotelero;

import com.alojamiento.Alojamiento;

public abstract class AlojamientoExtraHotelero extends Alojamiento {

    protected boolean esPrivado;
    protected double cantidadDeMetrosCuadrados;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(String nombre, String direccion, String localidad, String gerente, boolean esPrivado, double cantidadDeMetrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.cantidadDeMetrosCuadrados = cantidadDeMetrosCuadrados;
    }

    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public void setCantidadDeMetrosCuadrados(double cantidadDeMetrosCuadrados) {
        this.cantidadDeMetrosCuadrados = cantidadDeMetrosCuadrados;
    }

    public boolean isEsPrivado() {
        return esPrivado;
    }

    public double getCantidadDeMetrosCuadrados() {
        return cantidadDeMetrosCuadrados;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Privado: " + esPrivado + "\n"
                + "Cantidad de metros cuadrados: " + cantidadDeMetrosCuadrados;
    }
}
