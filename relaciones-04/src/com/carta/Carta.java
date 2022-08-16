package com.carta;

import java.util.Objects;

public class Carta {

    private Integer numero;
    private String palo;

    public Carta() {
        int[] vectorNumero = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        numero = vectorNumero[(int) (Math.random() * 10)];
        String[] vectorPalo = {"ESPADA", "BASTO", "ORO", "COPA"};
        palo = vectorPalo[(int) (Math.random() * 4)];
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.numero);
        hash = 71 * hash + Objects.hashCode(this.palo);
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
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }
}
