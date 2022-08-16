package com.herencia;

import java.util.ArrayList;

public final class Fecha {

    private ArrayList<Partido> partidos;

    public Fecha() {
        partidos = new ArrayList<>();
        crearCantidadDePartidos();
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }
    
    public void crearCantidadDePartidos() {
        for (int i = 0; i < 10; i++) {
            partidos.add(new Partido());
        }
    }
}
