package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        do {
            try {
                System.out.println("Introduzca un numerador entero: ");
                int numerador = entrada.nextInt();
                System.out.println("Introduzca un denominador entero: ");
                int denominador = entrada.nextInt();

                int resultado = cociente(numerador, denominador);
                System.out.println(numerador + " / " + denominador + " = " + resultado);
                continuar = false;
            } catch (InputMismatchException e) {
                System.out.println(e.getClass().getSimpleName());
                entrada.next();
                System.out.println("Debe introducir enteros. Intente otra vez");
            } catch (ArithmeticException e) {
                System.out.println(e.getClass().getSimpleName());
                System.out.println("0 es un denominador inválido. Intente otra vez");
            }
        } while (continuar);
    }

    public static int cociente(int numerador, int denominador) throws ArithmeticException {
        return numerador / denominador;
    }
}
