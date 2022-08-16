package Guia01;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B, C, discriminante, X1, X2;

        System.out.println("Ingrese los coeficientes de una ecuación de 2do grado");
        System.out.print("A: ");
        A = entrada.nextDouble();
        System.out.print("B: ");
        B = entrada.nextDouble();
        System.out.print("C: ");
        C = entrada.nextDouble();

        discriminante = Math.pow(B, 2) - 4 * A * C;

        if (discriminante > 0) {
            X1 = (-B - Math.sqrt(discriminante)) / (2 * A);
            X2 = (-B + Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Dado que el discriminante es mayor que 0, las dos raíces son reales y distintas");
            System.out.println("X1: " + X1);
            System.out.println("X2: " + X2);
        } else if (discriminante == 0) {
            X1 = -B / (2 * A);
            X2 = X1;
            System.out.println("Dado que el discriminante es igual a 0, las dos raíces son reales e iguales");
            System.out.println("X1: " + X1);
            System.out.println("X2: " + X2);
        } else {
            System.out.println("Dado que el discriminante es menor que 0, las dos raíces son complejas conjugadas");
        }
    }
}
