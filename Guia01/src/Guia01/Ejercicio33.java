package Guia01;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro;
        boolean resultado;

        System.out.print("Ingrese un valor: ");
        nro = entrada.nextInt();

        resultado = primo(nro);

        if (resultado == true) {
            System.out.println("El número ingresado es primo");
        } else {
            System.out.println("El número ingresado no es primo");
        }
    }

    public static boolean primo(int nro) {
        int j;
        j = 0;

        for (int i = 0; i < nro; i++) {
            if (nro % (i + 1) == 0) {
                j++;
            }
        }
        if (j == 2) {
            return true;
        } else {
            return false;
        }
    }
}
