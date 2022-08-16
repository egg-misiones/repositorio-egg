package Guia01;

import java.util.Scanner;

public class Ejercicio17A {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad, nro, max, min, i, suma;
        double promedio;

        System.out.print("Indique la cantidad de números que desea ingresar: ");
        cantidad = entrada.nextInt();

        while (cantidad <= 0) {
            System.out.print("El número ingresado es inválido. El número debe ser mayor a 0: ");
            cantidad = entrada.nextInt();
        }

        System.out.print("Ingrese el valor 1: ");
        nro = entrada.nextInt();

        max = nro;
        min = nro;
        i = 2;
        suma = nro;

        while (i <= cantidad) {
            System.out.print("Ingrese el valor " + i + ": ");
            nro = entrada.nextInt();
            if (nro > max) {
                max = nro;
            }
            if (nro < min) {
                min = nro;
            }
            suma += nro;
            i++;
        }

        promedio = (double) suma / cantidad;

        System.out.println("El valor máximo ingresado es: " + max);
        System.out.println("El valor mínimo ingresado es: " + min);
        System.out.println("El promedio es: " + promedio);
    }
}
