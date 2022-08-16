package Guia01;

import java.util.Scanner;

public class Ejercicio37 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro, j, dig1, dig2, dig3, dig4, dig5;

        System.out.print("Indique la cantidad de valores que desea ingresar en el vector: ");
        nro = entrada.nextInt();

        int[] vector = new int[nro];

        for (int i = 0; i < nro; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            vector[i] = entrada.nextInt();
        }

        dig1 = 0;
        dig2 = 0;
        dig3 = 0;
        dig4 = 0;
        dig5 = 0;

        for (int i = 0; i < nro; i++) {
            j = 0;
            while (vector[i] > 0) {
                vector[i] = (vector[i] / 10);
                j++;
            }
            if (j == 1) {
                dig1++;
            }
            if (j == 2) {
                dig2++;
            }
            if (j == 3) {
                dig3++;
            }
            if (j == 4) {
                dig4++;
            }
            if (j == 5) {
                dig5++;
            }
        }

        System.out.println("Números de 1 dígito: " + dig1);
        System.out.println("Números de 2 dígito: " + dig2);
        System.out.println("Números de 3 dígito: " + dig3);
        System.out.println("Números de 4 dígito: " + dig4);
        System.out.println("Números de 5 dígito: " + dig5);
    }
}
