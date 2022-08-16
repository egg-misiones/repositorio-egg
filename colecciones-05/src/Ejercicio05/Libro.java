package Ejercicio05;

import java.util.Objects;

public class Libro {

    private String titulo;
    private String autor;
    private int nroDeEjemplares;
    private int nroDeEjemplaresPrestados;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.titulo);
        hash = 79 * hash + Objects.hashCode(this.autor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    public Libro() {
    }

    public Libro(String titulo, String autor, int nroDeEjemplares, int nroDeEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroDeEjemplares = nroDeEjemplares;
        this.nroDeEjemplaresPrestados = nroDeEjemplaresPrestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNroDeEjemplares(int nroDeEjemplares) {
        this.nroDeEjemplares = nroDeEjemplares;
    }

    public void setNroDeEjemplaresPrestados(int nroDeEjemplaresPrestados) {
        this.nroDeEjemplaresPrestados = nroDeEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNroDeEjemplares() {
        return nroDeEjemplares;
    }

    public int getNroDeEjemplaresPrestados() {
        return nroDeEjemplaresPrestados;
    }

    @Override
    public String toString() {
        return titulo + " (Autor: " + autor + "; Nº de ejemplares: " + nroDeEjemplares + "; Nº de ejemplares prestados: " + nroDeEjemplaresPrestados + ")";
    }
}
