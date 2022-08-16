package Guia01;

import java.util.Scanner;

public class Ejercicio40 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro, contador;
        contador = 0;

        System.out.print("Ingrese el tamaño de la matriz: ");
        nro = entrada.nextInt();

        int[][] original = new int[nro][nro];
        int[][] transpuesta = new int[nro][nro];

        for (int i = 0; i < nro; i++) {
            for (int j = 0; j < nro; j++) {
                System.out.print("Ingrese el valor de la ubicación [" + i + ", " + j + "]: ");
                original[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz original: ");
        visualizar(original, nro);

        for (int i = 0; i < nro; i++) {
            for (int j = 0; j < nro; j++) {
                transpuesta[j][i] = original[i][j];
            }
        }

        System.out.println("Matriz transpuesta: ");
        visualizar(transpuesta, nro);

        for (int i = 0; i < nro; i++) {
            for (int j = 0; j < nro; j++) {
                if (transpuesta[i][j] == -(original[i][j])) {
                    contador++;
                }
            }
        }

        if ((nro * nro) == contador) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }

    public static void visualizar(int[][] matriz, int nro) {
        for (int i = 0; i < nro; i++) {
            for (int j = 0; j < nro; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
