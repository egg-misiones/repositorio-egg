package com.hotel.cinco.estrellas;

import com.hotel.general.Hotel;

public final class HotelCincoEstrellas extends Hotel {

    private String gimnasio;
    private String nombreDelRestaurante;
    private Integer capacidadDelRestaurante;
    private Integer cantidadSalonesDeConferencia;
    private Integer cantidadDeSuites;
    private Integer cantidadDeLimosinas;

    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(String nombre, String direccion, String localidad, String gerente, Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer cantidadDePisos, String gimnasio, String nombreDelRestaurante, Integer capacidadDelRestaurante, Integer cantidadSalonesDeConferencia, Integer cantidadDeSuites, Integer cantidadDeLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos);
        this.gimnasio = gimnasio;
        this.nombreDelRestaurante = nombreDelRestaurante;
        this.capacidadDelRestaurante = capacidadDelRestaurante;
        this.cantidadSalonesDeConferencia = cantidadSalonesDeConferencia;
        this.cantidadDeSuites = cantidadDeSuites;
        this.cantidadDeLimosinas = cantidadDeLimosinas;
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

    public void setCantidadSalonesDeConferencia(Integer cantidadSalonesDeConferencia) {
        this.cantidadSalonesDeConferencia = cantidadSalonesDeConferencia;
    }

    public void setCantidadDeSuites(Integer cantidadDeSuites) {
        this.cantidadDeSuites = cantidadDeSuites;
    }

    public void setCantidadDeLimosinas(Integer cantidadDeLimosinas) {
        this.cantidadDeLimosinas = cantidadDeLimosinas;
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

    public Integer getCantidadSalonesDeConferencia() {
        return cantidadSalonesDeConferencia;
    }

    public Integer getCantidadDeSuites() {
        return cantidadDeSuites;
    }

    public Integer getCantidadDeLimosinas() {
        return cantidadDeLimosinas;
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

    public Integer valorAgregadoPorLimosinas() {
        return 15 * cantidadDeLimosinas;
    }

    @Override
    public void asignarPrecioDeHabitacion() {
        precioDeHabitaciones = 50 + cantidadDeHabitaciones + valorAgregadoPorRestaurante() + valorAgregadoPorGimnasio() + valorAgregadoPorLimosinas();
    }

    @Override
    public String toString() {
        return "HOTEL CINCO ESTRELLAS" + "\n"
                + super.toString() + "\n"
                + "Gimnasio: " + gimnasio + "\n"
                + "Nombre del restaurante: " + nombreDelRestaurante + "\n"
                + "Capacidad del restaurante: " + capacidadDelRestaurante + "\n"
                + "Cantidad de salones de conferencia: " + cantidadSalonesDeConferencia + "\n"
                + "Cantidad de suites: " + cantidadDeSuites + "\n"
                + "Cantidad de limosinas: " + cantidadDeLimosinas;
    }
}
