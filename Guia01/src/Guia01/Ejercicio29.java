package Guia01;

import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro1, nro2, edad, suma;
        double promedio;
        suma = 0;

        System.out.print("Ingrese el número de familias: ");
        nro1 = entrada.nextInt();
        System.out.print("Ingrese el número de hijos de las familias: ");
        nro2 = entrada.nextInt();

        for (int i = 0; i < nro1; i++) {
            for (int j = 0; j < nro2; j++) {
                System.out.print("Ingrese la edad del hijo " + (j + 1) + " de la familia " + (i + 1) + ": ");
                edad = entrada.nextInt();
                suma = suma + edad;
            }
        }

        promedio = (double) suma / (nro1 * nro2);

        System.out.println("La media de edad de los hijos de todas las familias es: " + promedio);
    }
}
