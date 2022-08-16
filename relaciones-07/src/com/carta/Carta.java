package com.carta;

import java.util.Objects;

public class Carta<T> {

    private Integer numero;
    private T palo;

    public Carta() {
    }

    public Carta(Integer numero, T palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setPalo(T palo) {
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public T getPalo() {
        return palo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.numero);
        hash = 89 * hash + Objects.hashCode(this.palo);
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
        final Carta<?> other = (Carta<?>) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        return true;
    }

    public static Carta crearCartaEspaniola48() {
        Carta carta = new Carta();

        carta.numero = (int) (Math.random() * 12 + 1);
        carta.palo = PalosBarEspaniola.values()[(int) (Math.random() * 4)];

        return carta;
    }

    public static Carta crearCartaEspaniola40() {
        int[] vectorNumero = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        Carta carta = new Carta();

        carta.numero = vectorNumero[(int) (Math.random() * 10)];
        carta.palo = PalosBarEspaniola.values()[(int) (Math.random() * 4)];

        return carta;
    }

    public static Carta crearCartaFrancesa() {
        Carta carta = new Carta();

        carta.numero = (int) (Math.random() * 13 + 1);
        carta.palo = PalosBarFrancesa.values()[(int) (Math.random() * 4)];

        return carta;
    }

    @Override
    public String toString() {
        if (palo instanceof PalosBarFrancesa) {
            switch (numero) {
                case 1:
                    return "AS (" + palo + ")";
                case 11:
                    return "JOTA (" + palo + ")";
                case 12:
                    return "REINA (" + palo + ")";
                case 13:
                    return "REY (" + palo + ")";
            }

            return numero + " (" + palo + ")";
        } else {
            switch (numero) {
                case 1:
                    return "AS (" + palo + ")";
                case 10:
                    return "SOTA (" + palo + ")";
                case 11:
                    return "CABALLO (" + palo + ")";
                case 12:
                    return "REY (" + palo + ")";
            }

            return numero + " (" + palo + ")";
        }
    }
}
