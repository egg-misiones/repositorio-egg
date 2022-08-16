package Guia01;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String codigo, letra1, letra2;
        int longitud, i, j, k;
        double aciertos, desaciertos;
        i = 0;
        j = 0;
        k = 0;

        do {
            i++;
            do {
                System.out.println("Ingrese la secuencia " + i + ": ");
                System.out.println("Aclaración: la secuencia debe contener sólo 5 caracteres");
                codigo = entrada.next();
                longitud = codigo.length();
            } while (longitud != 5);
            if (codigo.equals("&&&&&")) {
                break;
            }
            codigo = codigo.toUpperCase();
            letra1 = codigo.substring(0, 1);
            letra2 = codigo.substring(4, 5);
            if ((letra1.equals("X")) && (letra2.equals("0"))) {
                j++;
            } else if (!codigo.equals("&&&&&")) {
                k++;
            }
        } while (!codigo.equals("&&&&&"));

        aciertos = (100 * (double) j) / (i - 1);
        desaciertos = (100 * (double) k) / (i - 1);

        System.out.println("El porcentaje de lecturas correctas es: " + aciertos + "%");
        System.out.println("El porcentaje de lecturas inválidas es: " + desaciertos + "%");
    }
}
