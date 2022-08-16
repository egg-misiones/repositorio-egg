package com.jugador;

import com.juego.Juego;
import com.revolver.Revolver;
import com.revolver.RevolverService;
import java.util.ArrayList;

public class JugadorService {

    public Jugador crearJugador() {
        return new Jugador();
    }

    public void disparar(Revolver revolver, Jugador jugador) {
        RevolverService revolverService = new RevolverService();

        if (revolverService.disparar(revolver)) {
            jugador.setEstaVivo(false);
            System.out.println("El " + jugador.getNombre() + " ha muerto");
        } else {
            System.out.println("El " + jugador.getNombre() + " sigue con vida");
        }
    }

    public void asignarJuego(ArrayList<Jugador> jugadores, Juego juego) {
        jugadores.forEach(jugador -> jugador.setJuego(juego));
    }
}
