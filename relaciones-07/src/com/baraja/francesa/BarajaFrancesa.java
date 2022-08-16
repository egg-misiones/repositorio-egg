package com.baraja.francesa;

import com.baraja.Baraja;
import com.carta.Carta;
import com.carta.PalosBarFrancesa;
import java.util.HashSet;

public final class BarajaFrancesa extends Baraja {

    public BarajaFrancesa() {
        numeroCartasTotal = 52;
        numeroCartasPalo = 13;
        crearBaraja();
    }

    @Override
    public void crearBaraja() {
        HashSet<Carta> cartas = new HashSet<>();

        do {
            cartas.add(Carta.crearCartaFrancesa());
        } while (cartas.size() < numeroCartasTotal);

        baraja.addAll(cartas);
    }

    public void cartaRoja(Carta<PalosBarFrancesa> carta) {
        if (carta.getPalo().equals(PalosBarFrancesa.DIAMANTES) || carta.getPalo().equals(PalosBarFrancesa.CORAZONES)) {
            System.out.println("La carta enviada es ROJA");
        }
    }

    public void cartaNegra(Carta<PalosBarFrancesa> carta) {
        if (carta.getPalo().equals(PalosBarFrancesa.PICAS) || carta.getPalo().equals(PalosBarFrancesa.TREBOLES)) {
            System.out.println("La carta enviada es NEGRA");
        }
    }
}
