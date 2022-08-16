package com.juego;

import com.jugador.Jugador;
import com.revolver.Revolver;
import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Revolver revolver;

    public Juego() {
    }

    public Juego(Revolver revolver) {
        this.revolver = revolver;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }
}
