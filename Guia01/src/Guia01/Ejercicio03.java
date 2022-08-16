package Guia01;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double C, F;

        System.out.print("Ingrese una cantidad de grados centígrados: ");
        C = entrada.nextDouble();

        F = 32 + (9 * C / 5);

        System.out.println("La conversión a grados Fahrenheit resultante es: " + F);
    }
}
