package Guia01;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro, i, suma;

        i = 1;
        suma = 0;

        do {
            System.out.print("Ingrese el valor " + i + ": ");
            nro = entrada.nextInt();
            if (nro == 0) {
                break;
            }
            if (nro > 0) {
                suma = suma + nro;
            }
            i++;
        } while (i <= 20 && nro != 0);

        if (nro == 0) {
            System.out.println("Se capturó el número 0");
        }

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
