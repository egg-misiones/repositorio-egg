package com.principal;

import com.electrodomestico.Electrodomestico;
import com.lavadora.Lavadora;
import com.televisor.Televisor;

public class Principal {

    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        double contadorLavadoras = 0;
        double contadorTelevisores = 0;

        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Lavadora(800, 18);
        electrodomesticos[2] = new Lavadora(950, 15);
        electrodomesticos[3] = new Lavadora(1500, "Rosa", 'z', 14, 3);
        electrodomesticos[4] = new Lavadora(1200, "Azul", 'c', 15, 4);
        electrodomesticos[5] = new Televisor();
        electrodomesticos[6] = new Televisor(20000, 3);
        electrodomesticos[7] = new Televisor(28000, 4);
        electrodomesticos[8] = new Televisor(22000, "Gris", 'a', 3, 28, false);
        electrodomesticos[9] = new Televisor(25000, "Negro", 'b', 4, 25, true);

        System.out.println("ELECTRODOMÉSTICOS");

        for (int i = 0; i < electrodomesticos.length; i++) {
            if (electrodomesticos[i] instanceof Lavadora) {
                System.out.println((i + 1) + ". LAVADORA");
                System.out.println(electrodomesticos[i]);
                contadorLavadoras += electrodomesticos[i].precioFinal();
            }

            if (electrodomesticos[i] instanceof Televisor) {
                System.out.println((i + 1) + ". TELEVISOR");
                System.out.println(electrodomesticos[i]);
                contadorTelevisores += electrodomesticos[i].precioFinal();
            }

            System.out.println("Precio final: " + electrodomesticos[i].precioFinal());
            System.out.println();
        }

        System.out.println("Precio total de lavadoras: " + contadorLavadoras);
        System.out.println("Precio total de televisores: " + contadorTelevisores);
        System.out.println("Precio total de lavadoras y televisores: " + (contadorLavadoras + contadorTelevisores));
    }
}
