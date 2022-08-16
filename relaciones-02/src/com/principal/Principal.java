package com.principal;

import com.cine.Cine;
import com.cine.CineService;
import com.espectador.Espectador;
import com.espectador.EspectadorService;

public class Principal {

    public static void main(String[] args) {
        CineService cineService = new CineService();
        EspectadorService espectadorService = new EspectadorService();
        Cine cine;

        cine = cineService.crearCine();
        espectadorService.asignarCine(cine.getEspectadores(), cine);

        System.out.println("Título: " + cine.getPeliculaCartelera().getTitulo());
        System.out.println("Director: " + cine.getPeliculaCartelera().getDirector());
        System.out.println("Edad mínima: " + cine.getPeliculaCartelera().getEdadMinima());
        System.out.println("Duración: " + cine.getPeliculaCartelera().getDuracion());
        System.out.println();

        for (Espectador e : cine.getEspectadores()) {
            System.out.println(e);
            System.out.println();
        }

        System.out.println("BUTACAS DISPONIBLES: " + cineService.cantidadButacasDisponibles(cine));
        cineService.mostrarSala(cine);

        cineService.ubicarEspectadores(cine);
        System.out.println();

        System.out.println("BUTACAS DISPONIBLES: " + cineService.cantidadButacasDisponibles(cine));
        cineService.mostrarSala(cine);
    }
}
