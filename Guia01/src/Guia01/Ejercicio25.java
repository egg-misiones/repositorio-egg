package Guia01;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro, i;
        i = 0;

        System.out.print("Ingrese un valor: ");
        nro = entrada.nextInt();

        while (nro > 0) {
            nro = (nro / 10);
            i++;
        }

        System.out.println("El número ingresado tiene " + i + " dígitos");
    }
}
