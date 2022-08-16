package Guia01;

import java.util.Scanner;

public class Ejercicio38 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro;

        System.out.print("Indique la cantidad de valores que desea ingresar en el vector: ");
        nro = entrada.nextInt();

        int[] vector = new int[nro];

        vector = rellenar(vector);
        visualizar(vector);
    }

    public static int[] rellenar(int[] vector) {
        int[] retorno = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            retorno[i] = (int) (Math.random() * 5 + 1);
        }

        return retorno;
    }

    public static void visualizar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i == vector.length - 1) {
                System.out.println(vector[i] + ".");
            } else {
                System.out.print(vector[i] + ", ");
            }
        }
    }
}
