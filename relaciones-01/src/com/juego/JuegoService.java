package com.juego;

import com.jugador.Jugador;
import com.jugador.JugadorService;
import com.revolver.Revolver;
import com.revolver.RevolverService;

public class JuegoService {

    public Juego crearJuego() {
        return new Juego();
    }

    public void agregarRevolver(Juego juego, Revolver revolver) {
        juego.setRevolver(revolver);
    }

    public void agregarJugador(Juego juego, Jugador jugador) {
        juego.getJugadores().add(jugador);
    }

    public void ronda(Juego juego) {
        JugadorService jugadorService = new JugadorService();
        RevolverService revolverService = new RevolverService();

        for (Jugador j : juego.getJugadores()) {
            jugadorService.disparar(juego.getRevolver(), j);
            if (finJuego(juego)) {
                break;
            } else {
                revolverService.siguienteBala(juego.getRevolver());
            }
        }
    }

    public boolean finJuego(Juego juego) {
        for (Jugador j : juego.getJugadores()) {
            if (j.getEstaVivo() == false) {
                return true;
            }
        }

        return false;
    }
}
