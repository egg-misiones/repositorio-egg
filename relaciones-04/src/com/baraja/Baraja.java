package com.baraja;

import com.carta.Carta;
import java.util.ArrayList;

public class Baraja {

    private ArrayList<Carta> baraja;

    public Baraja() {
        baraja = new ArrayList<>();
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }
}
