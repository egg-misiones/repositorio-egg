package Guia01;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro1, nro2, opcion, sumar, restar, multiplicar;
        double division;
        char letra;
        letra = 0;

        do {
            System.out.println("Ingrese el valor 1: ");
            System.out.println("Aclaración: el valor debe ser mayor a 0");
            nro1 = entrada.nextInt();
            System.out.println("Ingrese el valor 2: ");
            System.out.println("Aclaración: el valor debe ser mayor a 0");
            nro2 = entrada.nextInt();
        } while (nro1 <= 0 || nro2 <= 0);

        do {
            System.out.println("Menú");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    sumar = nro1 + nro2;
                    System.out.println("La suma resultante es: " + sumar);
                    break;
                case 2:
                    restar = nro1 - nro2;
                    System.out.println("La resta resultante es: " + restar);
                    break;
                case 3:
                    multiplicar = nro1 * nro2;
                    System.out.println("La multiplicación resultante: " + multiplicar);
                    break;
                case 4:
                    division = nro1 / nro2;
                    System.out.println("La división resultante es: " + division);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa? S/N");
                    letra = entrada.next().charAt(0);
                    letra = Character.toUpperCase(letra);
                    while (letra != 'S' && letra != 'N') {
                        System.out.println("La letra ingresada es inválida. Vuelva a intentar");
                        letra = entrada.next().charAt(0);
                        letra = Character.toUpperCase(letra);
                    }
                    break;
                default:
                    System.out.println("La opción ingresada es inválida");
            }
        } while (opcion != 5 || letra == 'N');
    }
}
