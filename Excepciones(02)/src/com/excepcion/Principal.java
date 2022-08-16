package com.excepcion;

public class Principal {

    public static void main(String[] args) {
        Meses meses = new Meses();

        try {
            meses.mostrarVector();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Tipo de excepción: " + e.getClass().getSimpleName());
        }
    }
}
