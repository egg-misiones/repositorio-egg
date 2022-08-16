package com.hotel.cuatro.estrellas;

import com.hotel.general.Hotel;

public final class HotelCuatroEstrellas extends Hotel {

    private String gimnasio;
    private String nombreDelRestaurante;
    private Integer capacidadDelRestaurante;

    public HotelCuatroEstrellas() {
    }

    public HotelCuatroEstrellas(String nombre, String direccion, String localidad, String gerente, Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer cantidadDePisos, String gimnasio, String nombreDelRestaurante, Integer capacidadDelRestaurante) {
        super(nombre, direccion, localidad, gerente, cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos);
        this.gimnasio = gimnasio;
        this.nombreDelRestaurante = nombreDelRestaurante;
        this.capacidadDelRestaurante = capacidadDelRestaurante;
        asignarPrecioDeHabitacion();
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public void setNombreDelRestaurante(String nombreDelRestaurante) {
        this.nombreDelRestaurante = nombreDelRestaurante;
    }

    public void setCapacidadDelRestaurante(Integer capacidadDelRestaurante) {
        this.capacidadDelRestaurante = capacidadDelRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public String getNombreDelRestaurante() {
        return nombreDelRestaurante;
    }

    public Integer getCapacidadDelRestaurante() {
        return capacidadDelRestaurante;
    }

    public Integer valorAgregadoPorRestaurante() {
        if (capacidadDelRestaurante < 30) {
            return 10;
        } else if (capacidadDelRestaurante >= 30 && capacidadDelRestaurante <= 50) {
            return 30;
        } else {
            return 50;
        }
    }

    public Integer valorAgregadoPorGimnasio() {
        if (gimnasio.equalsIgnoreCase("A")) {
            return 50;
        } else {
            return 30;
        }
    }

    @Override
    public void asignarPrecioDeHabitacion() {
        precioDeHabitaciones = 50 + cantidadDeHabitaciones + valorAgregadoPorRestaurante() + valorAgregadoPorGimnasio();
    }

    @Override
    public String toString() {
        return "HOTEL CUATRO ESTRELLAS" + "\n"
                + super.toString() + "\n"
                + "Gimnasio: " + gimnasio + "\n"
                + "Nombre del restaurante: " + nombreDelRestaurante + "\n"
                + "Capacidad del restaurante: " + capacidadDelRestaurante;
    }
}
