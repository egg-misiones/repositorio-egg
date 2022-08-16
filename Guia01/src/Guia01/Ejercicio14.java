package Guia01;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.print("Ingrese una letra: ");
        letra = entrada.next().charAt(0);

        switch (letra) {
            case 'a':
            case 'A':
                System.out.println("Usted ingresó una vocal");
                break;
            case 'e':
            case 'E':
                System.out.println("Usted ingresó una vocal");
                break;
            case 'i':
            case 'I':
                System.out.println("Usted ingresó una vocal");
                break;
            case 'o':
            case 'O':
                System.out.println("Usted ingresó una vocal");
                break;
            case 'u':
            case 'U':
                System.out.println("Usted ingresó una vocal");
                break;
            default:
                System.out.println("Usted no ingresó una vocal");
        }
    }
}
