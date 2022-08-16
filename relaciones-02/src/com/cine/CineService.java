package com.cine;

import com.espectador.Espectador;
import com.espectador.EspectadorService;
import com.pelicula.PeliculaService;

public class CineService {

    public Cine crearCine() {
        PeliculaService peliculaService = new PeliculaService();
        EspectadorService espectadorService = new EspectadorService();
        Cine cine = new Cine();

        cine.setPeliculaCartelera(peliculaService.asignarPelicula());

        do {
            cine.getEspectadores().add(espectadorService.crearEspectador());
        } while (cine.getEspectadores().size() < 150);

        return cine;
    }

    public void ubicarEspectadores(Cine cine) {
        int fila, columna;

        for (Espectador e : cine.getEspectadores()) {
            if (cantidadButacasDisponibles(cine) > 0) {
                if (e.getDineroDisponible() >= cine.getPrecioEntrada() && e.getEdad() >= cine.getPeliculaCartelera().getEdadMinima()) {
                    e.setDineroDisponible(e.getDineroDisponible() - cine.getPrecioEntrada());

                    do {
                        fila = (int) (Math.random() * 8);
                        columna = (int) (Math.random() * 9);
                    } while (cine.getSalaCine()[fila][columna].equalsIgnoreCase("**"));

                    cine.getSalaCine()[fila][columna] = "**";
                }
            } else {
                break;
            }
        }
    }

    public void mostrarSala(Cine cine) {
        for (int i = 0; i < cine.getSalaCine().length; i++) {
            for (int j = 0; j < cine.getSalaCine()[0].length; j++) {
                System.out.print(cine.getSalaCine()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int cantidadButacasDisponibles(Cine cine) {
        int contador = 0;

        for (int i = 0; i < cine.getSalaCine().length; i++) {
            for (int j = 0; j < cine.getSalaCine()[0].length; j++) {
                if (!cine.getSalaCine()[i][j].equalsIgnoreCase("**")) {
                    contador++;
                }
            }
        }

        return contador;
    }
}
