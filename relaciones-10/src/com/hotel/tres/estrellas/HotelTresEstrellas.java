package com.hotel.tres.estrellas;

import com.hotel.general.Hotel;

public final class HotelTresEstrellas extends Hotel {

    public HotelTresEstrellas() {
    }

    public HotelTresEstrellas(String nombre, String direccion, String localidad, String gerente, Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer cantidadDePisos) {
        super(nombre, direccion, localidad, gerente, cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos);
        asignarPrecioDeHabitacion();
    }

    @Override
    public void asignarPrecioDeHabitacion() {
        precioDeHabitaciones = 50 + cantidadDeHabitaciones;
    }

    @Override
    public String toString() {
        return "HOTEL TRES ESTRELLAS" + "\n"
                + super.toString();
    }
}
