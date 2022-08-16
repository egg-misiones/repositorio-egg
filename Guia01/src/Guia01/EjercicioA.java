package Guia01;

import java.util.Scanner;

public class EjercicioA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro, j, primo, aux;
        primo = 0;

        System.out.print("Ingrese un valor: ");
        nro = entrada.nextInt();
        aux = nro;

        do {
            j = 0;
            for (int i = 0; i < nro; i++) {
                if (nro % (i + 1) == 0) {
                    j++;
                }
            }
            if (j == 2) {
                primo++;
            }
            nro--;
        } while (nro > 1);

        System.out.println("La cantidad de números primos existentes entre 1 y " + aux + " es: " + primo);
    }
}
