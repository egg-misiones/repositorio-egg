package com.hotel.general;

import com.alojamiento.Alojamiento;

public abstract class Hotel extends Alojamiento {

    protected Integer cantidadDeHabitaciones;
    protected Integer numeroDeCamas;
    protected Integer cantidadDePisos;
    protected Integer precioDeHabitaciones;

    public Hotel() {
    }

    public Hotel(String nombre, String direccion, String localidad, String gerente, Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer cantidadDePisos) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.cantidadDePisos = cantidadDePisos;
    }

    public void setCantidadDeHabitaciones(Integer cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public void setNumeroDeCamas(Integer numeroDeCamas) {
        this.numeroDeCamas = numeroDeCamas;
    }

    public void setCantidadDePisos(Integer cantidadDePisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    public void setPrecioDeHabitaciones(Integer precioDeHabitaciones) {
        this.precioDeHabitaciones = precioDeHabitaciones;
    }

    public Integer getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public Integer getNumeroDeCamas() {
        return numeroDeCamas;
    }

    public Integer getCantidadDePisos() {
        return cantidadDePisos;
    }

    public Integer getPrecioDeHabitaciones() {
        return precioDeHabitaciones;
    }

    public abstract void asignarPrecioDeHabitacion();

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Cantidad de habitaciones: " + cantidadDeHabitaciones + "\n"
                + "Número de camas: " + numeroDeCamas + "\n"
                + "Cantidad de pisos: " + cantidadDePisos + "\n"
                + "Precio de habitación: " + precioDeHabitaciones;
    }
}
