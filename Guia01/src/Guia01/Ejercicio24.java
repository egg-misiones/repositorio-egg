package Guia01;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro1, nro2, resultado, respuesta;
        nro1 = (int) (Math.random() * 10 + 0);
        nro2 = (int) (Math.random() * 10 + 0);
        resultado = nro1 * nro2;

        do {
            System.out.print("Adivine el resultado de la multiplicación entre " + nro1 + " y " + nro2 + ": ");
            respuesta = entrada.nextInt();
            if (respuesta == resultado) {
                System.out.println("¡Felicitaciones! ¡Ha acertado!");
            } else {
                System.out.println("Por favor, vuelva a intentar");
            }
        } while (respuesta != resultado);
    }
}
