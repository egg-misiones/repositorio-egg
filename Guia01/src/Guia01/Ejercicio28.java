package Guia01;

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro;

        System.out.print("Ingrese un valor: ");
        nro = entrada.nextInt();

        for (int i = 0; i < nro; i++) {
            for (int j = 0; j < nro; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
