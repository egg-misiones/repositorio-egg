package Guia01;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro;

        System.out.print("Ingrese un valor: ");
        nro = entrada.nextInt();

        for (int i = 0; i < nro; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}
