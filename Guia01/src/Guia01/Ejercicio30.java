package Guia01;

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro;

        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese 5 valores comprendidos entre 1 y 20");
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                nro = entrada.nextInt();
            } while (nro < 1 || nro > 20);
            for (int j = 0; j < nro; j++) {
                if (j == 0) {
                    System.out.print(nro);
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
