package Guia01;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra;
        double monto, descuento1, descuento2;

        System.out.print("Ingrese una letra correspondiente a la clase de socio que pertenece: ");
        letra = entrada.next().charAt(0);
        System.out.print("Ingrese el monto del tratamiento: ");
        monto = entrada.nextDouble();

        switch (letra) {
            case 'a':
            case 'A':
                descuento1 = (50 * monto) / 100;
                System.out.println("Dado que es un socio tipo A, deberá pagar: " + descuento1);
                break;
            case 'b':
            case 'B':
                descuento2 = (35 * monto) / 100;
                System.out.println("Dado que es un socio tipo B, deberá pagar: " + descuento2);
                break;
            case 'c':
            case 'C':
                System.out.println("Dado que es un socio tipo C, deberá pagar: " + monto);
                break;
            default:
                System.out.println("La letra ingresada no pertenece a ningún tipo de socio");
        }
    }
}
