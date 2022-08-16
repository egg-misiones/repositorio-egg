package Guia01;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro1, nro2;

        System.out.println("Ingrese 2 números");
        System.out.print("Número 1: ");
        nro1 = entrada.nextInt();
        System.out.print("Número 2: ");
        nro2 = entrada.nextInt();

        if (nro1 > nro2) {
            System.out.println("El número mayor es: " + nro1);
        } else if (nro1 < nro2) {
            System.out.println("El número mayor es: " + nro2);
        } else {
            System.out.println("Ambos números son iguales");
        }
    }
}
