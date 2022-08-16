package Guia01;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro1, nro2, aux, i;
        i = 0;

        do {
            System.out.println("Para la división por restas sucesivas, ingrese 2 valores");
            System.out.println("Aclaración: los 2 valores deben ser mayores a 1");
            System.out.print("Ingrese el dividendo: ");
            nro1 = entrada.nextInt();
            System.out.print("Ingrese el divisor: ");
            nro2 = entrada.nextInt();
        } while (nro1 <= 1 || nro2 <= 1);

        if (nro1 == nro2) {
            nro1 = 1;
            nro2 = 0;
        } else if (nro1 < nro2) {
            aux = nro1;
            nro1 = nro2;
            nro2 = aux;
            while (nro1 > nro2) {
                nro1 = nro1 - nro2;
                i++;
            }
            nro2 = nro1;
            nro1 = i;
        } else {
            while (nro1 > nro2) {
                nro1 = nro1 - nro2;
                i++;
            }
            nro2 = nro1;
            nro1 = i;
        }

        System.out.println("El método de división por restas sucesivas arrojó los siguientes resultados: ");
        System.out.println("Cociente: " + nro1);
        System.out.println("Resto: " + nro2);
    }
}
