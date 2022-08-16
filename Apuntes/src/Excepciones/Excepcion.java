package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean continuar;

        do {
            continuar = false;
            try {
                System.out.println("Ingrese un número positivo: ");
                numero = entrada.nextInt();

                if (numero <= 0) {
                    System.out.println("El número ingresado no es positivo");
                    continuar = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("El elemento ingresado no es un número");
                entrada.next();
                continuar = true;
            }
        } while (continuar);
    }
}
