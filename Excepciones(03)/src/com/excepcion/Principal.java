package com.excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int random, contador, respuesta = 0;
        contador = 0;
        random = (int) (Math.random() * 500 + 1);

        do {
            try {
                System.out.print("Adivine el número generado aleatoreamente (1-500): ");
                respuesta = entrada.nextInt();
                if (respuesta == random) {
                    System.out.println("¡Felicitaciones! ¡Ha acertado!");
                } else if (respuesta < random) {
                    System.out.println("El número random es mayor al ingresado");
                    contador++;
                } else {
                    System.out.println("El número random es menor al ingresado");
                    contador++;
                }
            } catch (InputMismatchException e) {
                System.err.println("Tipo de excepción: " + e.getClass().getSimpleName());
                contador++;
                entrada.next();
            }
        } while (respuesta != random);

        System.out.println("Cantidad de intentos: " + contador);
    }
}
