package Guia01;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int nro, doble, triple;
        double raiz;

        System.out.print("Ingrese un número entero: ");
        nro = entrada.nextInt();

        doble = nro * 2;
        triple = nro * 3;
        raiz = Math.sqrt(nro);

        System.out.println("El doble del número ingresado es: " + doble);
        System.out.println("El triple del número ingresado es: " + triple);
        System.out.println("La raíz cuadrada del número ingresado es: " + raiz);
    }
}
