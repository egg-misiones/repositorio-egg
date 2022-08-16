package com.pelicula;

import java.util.ArrayList;

public class PeliculaService {

    public Pelicula crearPelicula(String titulo, int duracion, int edadMinima, String director) {
        return new Pelicula(titulo, duracion, edadMinima, director);
    }

    public Pelicula asignarPelicula() {
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        peliculas.add(crearPelicula("El Origen", 160, 18, "Christopher Nolan"));
        peliculas.add(crearPelicula("El Lobo de Wall Street", 180, 18, "Martin Scorsese"));
        peliculas.add(crearPelicula("Toy Story 4", 100, 5, "Josh Cooley"));
        peliculas.add(crearPelicula("Parasite", 90, 18, "Bong Joon-ho"));
        peliculas.add(crearPelicula("Whiplash", 100, 13, "Damien Chazelle"));

        return peliculas.get((int) (Math.random() * 5));
    }
}
