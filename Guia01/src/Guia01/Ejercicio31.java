package Guia01;

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro1, nro2, opcion, resultado;

        System.out.print("Ingrese el valor 1: ");
        nro1 = entrada.nextInt();
        System.out.print("Ingrese el valor 2: ");
        nro2 = entrada.nextInt();

        System.out.println("Elija una opción: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                resultado = sumar(nro1, nro2);
                System.out.println("La suma resultante es: " + resultado);
                break;
            case 2:
                resultado = restar(nro1, nro2);
                System.out.println("La resta resultante es: " + resultado);
                break;
            case 3:
                resultado = multiplicar(nro1, nro2);
                System.out.println("La multiplicación resultante es: " + resultado);
                break;
            case 4:
                resultado = dividir(nro1, nro2);
                System.out.println("La división resultante es: " + resultado);
                break;
            default:
                System.out.println("La opción ingresada es inválida");
        }
    }

    public static int sumar(int A, int B) {
        return A + B;
    }

    public static int restar(int A, int B) {
        return A - B;
    }

    public static int multiplicar(int A, int B) {
        return A * B;
    }

    public static int dividir(int A, int B) {
        return A / B;
    }
}
