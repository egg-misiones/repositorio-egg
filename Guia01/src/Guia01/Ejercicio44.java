package Guia01;

import java.util.Scanner;

public class Ejercicio44 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int veinte = 20, longitud, i, random, randomFila, randomColumna;
        String[][] matriz = new String[veinte][veinte];
        String palabra;
        boolean vacio;
        i = 0;

        do {
            i++;
            do {
                System.out.println("Ingrese 5 palabras de una por vez: ");
                System.out.println("Aclaración: las palabras deben tener un mínimo de 3 letras y un máximo de 5 letras");
                System.out.print("Ingrese la palabra " + i + ": ");
                palabra = entrada.next();
                longitud = palabra.length();
            } while (longitud < 3 || longitud > 5);

            do {
                vacio = false;
                random = 0;
                do {
                    randomFila = (int) (Math.random() * 20);
                    randomColumna = (int) (Math.random() * 20);
                } while (randomColumna + longitud > 20);

                for (int j = 0; j < longitud; j++) {
                    if (matriz[randomFila][randomColumna + j] == null) {
                        random++;
                    }
                }
                if (random == longitud) {
                    vacio = true;
                }
            } while (vacio == false);

            for (int j = 0; j < longitud; j++) {
                matriz[randomFila][randomColumna + j] = palabra.substring(j, (j + 1));
            }

            if (i == 5) {
                for (int j = 0; j < veinte; j++) {
                    for (int k = 0; k < veinte; k++) {
                        if (matriz[j][k] == null) {
                            matriz[j][k] = String.valueOf((int) (Math.random() * 10));
                        }
                    }
                }
            }
        } while (i < 5);

        for (int j = 0; j < veinte; j++) {
            for (int k = 0; k < veinte; k++) {
                System.out.print(matriz[j][k] + " ");
            }
            System.out.println();
        }
    }
}
