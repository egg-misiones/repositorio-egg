package Guia01;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro;

        System.out.print("Ingrese un valor cuyo dominio pertenezca al intervalo (0,9999): ");
        nro = entrada.nextInt();

        if (nro >= 0 && nro <= 9999) {
            if (nro % 2 == 0) {
                System.out.println("El número ingresado es múltiplo de 2");
            } else if (nro % 3 == 0) {
                System.out.println("El número ingresado es múltiplo de 3");
            } else if (nro % 5 == 0) {
                System.out.println("El número ingresado es múltiplo de 5");
            } else {
                System.out.println("El número ingresado no es múltiplo de 2, ni de 3, ni de 5");
            }
        } else {
            System.out.println("El número ingresado no pertenece al dominio indicado");
        }
    }
}
