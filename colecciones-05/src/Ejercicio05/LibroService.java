package Ejercicio05;

import java.util.HashSet;

public class LibroService {

    private HashSet<Libro> listaLibro = new HashSet();

    public void setListaLibro(HashSet<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }

    public HashSet<Libro> getListaLibro() {
        return listaLibro;
    }

    public void crearLibro(String titulo, String autor, int nroDeEjemplares, int nroDeEjemplaresPrestados) {
        Libro libro = new Libro();

        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setNroDeEjemplares(nroDeEjemplares);
        libro.setNroDeEjemplaresPrestados(nroDeEjemplaresPrestados);

        guardarLibro(libro);
    }

    public void guardarLibro(Libro libro) {
        listaLibro.add(libro);
    }

    public void mostrarDatos() {
        System.out.println("LISTA DE LIBROS: ");

        for (Libro i : listaLibro) {
            System.out.println(i.toString());
        }
    }

    public boolean prestamoLibro(String nombreLibro) {
        for (Libro i : listaLibro) {
            if (i.getTitulo().equalsIgnoreCase(nombreLibro)) {
                if (i.getNroDeEjemplaresPrestados() < i.getNroDeEjemplares()) {
                    i.setNroDeEjemplaresPrestados(i.getNroDeEjemplaresPrestados() + 1);
                    return true;
                }
            }
        }

        return false;
    }

    public boolean devolucionLibro(String nombreLibro) {
        for (Libro i : listaLibro) {
            if (i.getTitulo().equalsIgnoreCase(nombreLibro)) {
                if (i.getNroDeEjemplaresPrestados() > 0) {
                    i.setNroDeEjemplaresPrestados(i.getNroDeEjemplaresPrestados() - 1);
                    return true;
                }
            }
        }

        return false;
    }
}
