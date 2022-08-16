package Guia01;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, anio;

        System.out.println("Ingrese una fecha");
        System.out.print("Día: ");
        dia = entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Año: ");
        anio = entrada.nextInt();

        if (anio >= 1) {
            if (mes >= 1 && mes <= 12) {
                switch (mes) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (dia >= 1 && dia <= 31) {
                            System.out.println("La fecha ingresada es válida");
                        } else {
                            System.out.println("Dado que el día es incorrecto, la fecha es inválida");
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (dia >= 1 && dia <= 30) {
                            System.out.println("La fecha ingresada es válida");
                        } else {
                            System.out.println("Dado que el día es incorrecto, la fecha es inválida");
                        }
                        break;
                    case 2:
                        if (dia >= 1 && dia <= 28) {
                            System.out.println("La fecha ingresada es válida");
                        } else {
                            System.out.println("Dado que el día es incorrecto, la fecha es inválida");
                        }
                        break;
                }
            } else {
                System.out.println("Dado que el mes es incorrecto, la fecha es inválida");
            }
        } else {
            System.out.println("Dado que el año es incorrecto, la fecha es inválida");
        }
    }
}
