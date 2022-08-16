package Guia01;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B, C, D, aux;

        System.out.print("Ingrese el valor de A: ");
        A = entrada.nextInt();
        System.out.print("Ingrese el valor de B: ");
        B = entrada.nextInt();
        System.out.print("Ingrese el valor de C: ");
        C = entrada.nextInt();
        System.out.print("Ingrese el valor de D: ");
        D = entrada.nextInt();

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Valores iniciales");
        System.out.println("A: " + C);
        System.out.println("B: " + D);
        System.out.println("C: " + B);
        System.out.println("D: " + A);
        System.out.println("Valores finales");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
}
