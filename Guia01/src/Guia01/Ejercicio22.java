package Guia01;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro, i, j, par, impar;
        i = 0;
        j = 0;
        par = 0;
        impar = 0;

        do {
            i++;
            System.out.print("Ingrese el valor " + i + ": ");
            nro = entrada.nextInt();
            if (nro % 5 == 0) {
                break;
            }
            if (nro >= 0) {
                j++;
                if (nro % 2 == 0) {
                    par++;
                }
                if (nro % 2 == 1) {
                    impar++;
                }
            }
        } while (nro % 5 != 0);

        System.out.println("La cantidad de números leídos resultante es: " + j);
        System.out.println("La cantidad de números pares leídos es: " + par);
        System.out.println("La cantidad de números impares leídos es: " + impar);
    }
}
