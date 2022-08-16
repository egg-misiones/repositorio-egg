package Guia01;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double X, Y;

        System.out.println("Ingrese las coordenadas de X e Y");
        System.out.print("X: ");
        X = entrada.nextDouble();
        System.out.print("Y: ");
        Y = entrada.nextDouble();

        if (X > 0 && Y > 0) {
            System.out.println("El punto pertenece al 1er cuadrante");
        } else if (X < 0 && Y > 0) {
            System.out.println("El punto pertenece al 2do cuadrante");
        } else if (X < 0 && Y < 0) {
            System.out.println("El punto pertenece al 3er cuadrante");
        } else if (X > 0 && Y < 0) {
            System.out.println("El punto pertenece al 4to cuadrante");
        } else if (X == 0 && Y != 0) {
            System.out.println("El punto se encuentra sobre el eje X");
        } else if (X != 0 && Y == 0) {
            System.out.println("El punto se encuentra sobre el eje Y");
        } else if (X == 0 && Y == 0) {
            System.out.println("El punto se encuentra sobre los ejes X e Y");
        }
    }
}
