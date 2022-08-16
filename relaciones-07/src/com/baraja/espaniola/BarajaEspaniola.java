package com.baraja.espaniola;

import com.baraja.Baraja;
import com.carta.Carta;
import java.util.HashSet;

public final class BarajaEspaniola extends Baraja {

    private boolean masCartas;

    public BarajaEspaniola() {
    }

    public BarajaEspaniola(boolean masCartas) {
        this.masCartas = masCartas;
        asignarAtributos(masCartas);
        crearBaraja();
    }

    public void setMasCartas(boolean masCartas) {
        this.masCartas = masCartas;
    }

    public boolean MasCartas() {
        return masCartas;
    }

    @Override
    public void crearBaraja() {
        HashSet<Carta> cartas = new HashSet<>();

        if (masCartas) {
            do {
                cartas.add(Carta.crearCartaEspaniola48());
            } while (cartas.size() < numeroCartasTotal);
        } else {
            do {
                cartas.add(Carta.crearCartaEspaniola40());
            } while (cartas.size() < numeroCartasTotal);
        }

        baraja.addAll(cartas);
    }

    public void asignarAtributos(boolean masCartas) {
        if (masCartas) {
            numeroCartasPalo = 12;
            numeroCartasTotal = 48;
        } else {
            numeroCartasPalo = 10;
            numeroCartasTotal = 40;
        }
    }
}
