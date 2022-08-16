package Guia01;

import java.util.Scanner;

public class Ejercicio17B {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad, nro, max, min, i, suma;
        double promedio;

        do {
            System.out.println("Indique la cantidad de números que desea ingresar: ");
            System.out.println("Aclaración: el número debe ser mayor a 0");
            cantidad = entrada.nextInt();
        } while (cantidad <= 0);

        i = 1;
        suma = 0;
        max = 0;
        min = 0;

        do {
            System.out.print("Ingrese el valor " + i + ": ");
            nro = entrada.nextInt();
            if (i == 1) {
                max = nro;
                min = nro;
            }
            if (nro > max) {
                max = nro;
            }
            if (nro < min) {
                min = nro;
            }
            suma = suma + nro;
            i++;
        } while (i <= cantidad);

        promedio = (double) suma / cantidad;

        System.out.println("El valor máximo ingresado es: " + max);
        System.out.println("El valor mínimo ingresado es: " + min);
        System.out.println("El promedio es: " + promedio);
    }
}
