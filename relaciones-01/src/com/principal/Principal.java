package com.principal;

import com.juego.Juego;
import com.juego.JuegoService;
import com.jugador.JugadorService;
import com.revolver.RevolverService;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        JuegoService juegoService = new JuegoService();
        RevolverService revolverService = new RevolverService();
        JugadorService jugadorService = new JugadorService();

        Juego juego;
        int cantidadJugadores;

        do {
            System.out.print("Ingrese la cantidad de jugadores que serán de la partida: ");
            cantidadJugadores = entrada.nextInt();
        } while (cantidadJugadores < 1 || cantidadJugadores > 6);

        juego = juegoService.crearJuego();
        juegoService.agregarRevolver(juego, revolverService.crearRevolver());
        revolverService.mostrarDatos(juego.getRevolver());

        for (int i = 0; i < cantidadJugadores; i++) {
            juegoService.agregarJugador(juego, jugadorService.crearJugador());
        }

        jugadorService.asignarJuego(juego.getJugadores(), juego);
        System.out.println();
        System.out.println("INICIO DEL JUEGO");

        do {
            juegoService.ronda(juego);
        } while (juegoService.finJuego(juego) == false);

        System.out.println("FIN DEL JUEGO");
        System.out.println();
        revolverService.mostrarDatos(juego.getRevolver());
    }
}
