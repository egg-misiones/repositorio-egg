package Guia01;

import java.util.Scanner;

public class Ejercicio45 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro, respuesta;

        System.out.print("Ingrese el término de la sucesión de Fibonacci que desea hallar: ");
        nro = entrada.nextInt();

        respuesta = fibonacci(nro);

        System.out.println("El término " + nro + " en la sucesión de Fibonacci es: " + respuesta);
    }

    public static int fibonacci(int nro) {
        int[] vector = new int[nro];

        switch (nro) {
            case 1:
                System.out.println("1.");
                return 1;
            case 2:
                System.out.println("1, 1.");
                return 1;
            default:
                vector[0] = 1;
                vector[1] = 1;

                for (int i = 2; i < nro; i++) {
                    vector[i] = vector[i - 1] + vector[i - 2];
                }

                for (int i = 0; i < nro; i++) {
                    if (i == (nro - 1)) {
                        System.out.println(vector[i] + ".");
                    } else {
                        System.out.print(vector[i] + ", ");
                    }
                }
                return vector[nro - 1];
        }
    }
}
