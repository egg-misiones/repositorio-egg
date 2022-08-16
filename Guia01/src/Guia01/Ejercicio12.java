package Guia01;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int minutos, dia, turno;
        double min5, min8, min10, monto1, monto2, monto3, final1, final2, final3;
        final1 = 0;

        System.out.println("Ingrese la cantidad de minutos: ");
        minutos = entrada.nextInt();

        if (minutos >= 1 && minutos <= 5) {
            final1 = minutos * 1.00;
        } else if (minutos >= 6 && minutos <= 8) {
            min5 = 5 * 1.00;
            monto1 = (minutos - 5) * 0.80;
            final1 = monto1 + min5;
        } else if (minutos >= 9 && minutos <= 10) {
            min5 = 5 * 1.00;
            min8 = 3 * 0.80;
            monto2 = (minutos - 8) * 0.70;
            final1 = monto2 + min5 + min8;
        } else if (minutos > 10) {
            min5 = 5 * 1.00;
            min8 = 3 * 0.80;
            min10 = 2 * 0.70;
            monto3 = (minutos - 10) * 0.50;
            final1 = monto3 + min5 + min8 + min10;
        }

        System.out.println("Indique el día ingresando un número: ");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miércoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sábado");
        System.out.println("7. Domingo");
        dia = entrada.nextInt();

        System.out.println("Indique el turno ingresando un número: ");
        System.out.println("1. Matutino");
        System.out.println("2. Vespertino");
        turno = entrada.nextInt();

        if (dia >= 1 && dia <= 6) {
            if (turno == 1) {
                final2 = final1 * 1.15;
                System.out.println("Usted deberá pagar: $" + final2);
            } else if (turno == 2) {
                final2 = final1 * 1.10;
                System.out.println("Usted deberá pagar: $" + final2);
            }
        } else if (dia == 7) {
            final3 = final1 * 1.03;
            System.out.println("Usted deberá pagar: $" + final3);
        }
    }
}
