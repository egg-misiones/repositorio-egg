package com.camping;

import com.alojamiento.extra.hotelero.AlojamientoExtraHotelero;

public class Camping extends AlojamientoExtraHotelero {

    private Integer capacidadMaximaDeCarpas;
    private Integer cantidadDeBaniosDisponibles;
    private boolean existeRestaurante;

    public Camping() {
    }

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean esPrivado, double cantidadDeMetrosCuadrados, Integer capacidadMaximaDeCarpas, Integer cantidadDeBaniosDisponibles, boolean existeRestaurante) {
        super(nombre, direccion, localidad, gerente, esPrivado, cantidadDeMetrosCuadrados);
        this.capacidadMaximaDeCarpas = capacidadMaximaDeCarpas;
        this.cantidadDeBaniosDisponibles = cantidadDeBaniosDisponibles;
        this.existeRestaurante = existeRestaurante;
    }

    public void setCapacidadMaximaDeCarpas(Integer capacidadMaximaDeCarpas) {
        this.capacidadMaximaDeCarpas = capacidadMaximaDeCarpas;
    }

    public void setCantidadDeBaniosDisponibles(Integer cantidadDeBaniosDisponibles) {
        this.cantidadDeBaniosDisponibles = cantidadDeBaniosDisponibles;
    }

    public void setExisteRestaurante(boolean existeRestaurante) {
        this.existeRestaurante = existeRestaurante;
    }

    public Integer getCapacidadMaximaDeCarpas() {
        return capacidadMaximaDeCarpas;
    }

    public Integer getCantidadDeBaniosDisponibles() {
        return cantidadDeBaniosDisponibles;
    }

    public boolean isExisteRestaurante() {
        return existeRestaurante;
    }

    @Override
    public String toString() {
        return "CAMPING" + "\n"
                + super.toString() + "\n"
                + "Capacidad máxima de carpas: " + capacidadMaximaDeCarpas + "\n"
                + "Cantidad de baños disponibles: " + cantidadDeBaniosDisponibles + "\n"
                + "Restaurante: " + existeRestaurante;
    }
}
