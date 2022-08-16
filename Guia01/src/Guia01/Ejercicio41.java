package Guia01;

import java.util.Scanner;

public class Ejercicio41 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro, diagonal1, diagonal2, contador1, contador2;
        boolean magica = true;
        contador1 = 0;
        contador2 = 0;

        do {
            System.out.println("Ingrese el tamaño de la matriz: ");
            System.out.println("Aclaración: el valor debe ser mayor a 1");
            nro = entrada.nextInt();
        } while (nro <= 1);

        int[][] matriz = new int[nro][nro];
        int[] vector1 = new int[nro];
        int[] vector2 = new int[nro];

        rellenar(matriz, nro);
        visualizar(matriz, nro);
        diagonal1 = principal(matriz, nro);
        diagonal2 = secundaria(matriz, nro);
        filascolumnas(matriz, vector1, vector2, nro);

        if (diagonal1 != diagonal2) {
            magica = false;
        }

        for (int i = 0; i < nro; i++) {
            if (vector1[i] == diagonal1) {
                contador1++;
            }
        }

        for (int i = 0; i < nro; i++) {
            if (vector2[i] == diagonal2) {
                contador2++;
            }
        }

        if (magica == true && contador1 == nro & contador2 == nro) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }
    }

    public static void rellenar(int[][] matriz, int nro) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < nro; i++) {
            for (int j = 0; j < nro; j++) {
                do {
                    System.out.println("Ingrese el valor de la ubicación [" + i + ", " + j + "]: ");
                    System.out.println("Rango mínimo y máximo (1-9)");
                    matriz[i][j] = entrada.nextInt();
                } while (matriz[i][j] <= 0 || matriz[i][j] >= 10);
            }
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

    public static int principal(int[][] matriz, int nro) {
        int diagonal1;
        diagonal1 = 0;

        for (int i = 0; i < nro; i++) {
            for (int j = 0; j < nro; j++) {
                if (i == j) {
                    diagonal1 += matriz[i][j];
                }
            }
        }

        return diagonal1;
    }

    public static int secundaria(int[][] matriz, int nro) {
        int diagonal2;
        diagonal2 = 0;

        for (int i = 0; i < nro; i++) {
            for (int j = 0; j < nro; j++) {
                if (i + j == (nro - 1)) {
                    diagonal2 += matriz[i][j];
                }
            }
        }

        return diagonal2;
    }

    public static void filascolumnas(int[][] matriz, int[] vector1, int[] vector2, int nro) {
        for (int i = 0; i < nro; i++) {
            for (int j = 0; j < nro; j++) {
                vector1[i] = vector1[i] + matriz[i][j];
                vector2[i] = vector2[i] + matriz[j][i];
            }
        }
    }
}
