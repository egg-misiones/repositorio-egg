package com.jugador;

import com.juego.Juego;

public class Jugador {

    private int id;
    private String nombre;
    private boolean estaVivo;
    private static int contador;
    private Juego juego;

    public Jugador() {
        id = ++contador;
        nombre = "JUGADOR " + id;
        estaVivo = true;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getEstaVivo() {
        return estaVivo;
    }

    public Juego getJuego() {
        return juego;
    }
}
