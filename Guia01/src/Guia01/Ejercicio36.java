package Guia01;

import java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro, j;

        System.out.print("Indique la cantidad de valores que desea ingresar en 2 vectores: ");
        nro = entrada.nextInt();

        int[] vector1 = new int[nro];
        int[] vector2 = new int[nro];

        for (int i = 0; i < nro; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + " del vector 1: ");
            vector1[i] = entrada.nextInt();
        }

        for (int i = 0; i < nro; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + " del vector 2: ");
            vector2[i] = entrada.nextInt();
        }

        j = 0;

        for (int i = 0; i < nro; i++) {
            if (vector1[i] == vector2[i]) {
                j++;
            } else {
                break;
            }
        }

        if (j == nro) {
            System.out.println("Los valores de los 2 vectores son iguales");
        } else {
            System.out.println("Los valores de los 2 vectores no son iguales");
        }
    }
}
