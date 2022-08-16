package com.residencia;

import com.alojamiento.extra.hotelero.AlojamientoExtraHotelero;

public class Residencia extends AlojamientoExtraHotelero {

    private Integer cantidadDeHabitaciones;
    private boolean descuentosGremios;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean esPrivado, double cantidadDeMetrosCuadrados, Integer cantidadDeHabitaciones, boolean descuentosGremios, boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente, esPrivado, cantidadDeMetrosCuadrados);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public void setCantidadDeHabitaciones(Integer cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public void setDescuentosGremios(boolean descuentosGremios) {
        this.descuentosGremios = descuentosGremios;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public boolean isDescuentosGremios() {
        return descuentosGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    @Override
    public String toString() {
        return "RESIDENCIA" + "\n"
                + super.toString() + "\n"
                + "Cantidad de habitaciones: " + cantidadDeHabitaciones + "\n"
                + "Descuentos a gremios: " + descuentosGremios + "\n"
                + "Campo deportivo: " + campoDeportivo;
    }
}
