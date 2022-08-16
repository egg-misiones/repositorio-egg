package Guia01;

import java.util.Scanner;

public class Ejercicio39 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro = 50;
        double nota1, nota2, nota3, nota4, notafinal;
        String[] datos = new String[nro];
        double[] notas = new double[nro];
        
        for (int i = 0; i < nro; i++) {
            System.out.print("Ingrese nombre y apellido del alumno " + (i + 1) + ": ");
            datos[i] = entrada.nextLine();
        }

        for (int i = 0; i < nro; i++) {
            System.out.print("Ingrese la nota de " + datos[i] + " en el 1er T.P. Evaluativo: ");
            nota1 = entrada.nextDouble();
            System.out.print("Ingrese la nota de " + datos[i] + " en el 2do T.P. Evaluativo: ");
            nota2 = entrada.nextDouble();
            System.out.print("Ingrese la nota de " + datos[i] + " en el 1er Integrador: ");
            nota3 = entrada.nextDouble();
            System.out.print("Ingrese la nota de " + datos[i] + " en el 2do Integrador: ");
            nota4 = entrada.nextDouble();
            nota1 *= 0.1;
            nota2 *= 0.15;
            nota3 *= 0.25;
            nota4 *= 0.5;
            notafinal = nota1 + nota2 + nota3 + nota4;
            notas[i] = notafinal;
        }

        for (int i = 0; i < nro; i++) {
            System.out.print((i + 1) + ". " + datos[i] + " -> ");
            if (notas[i] >= 70) {
                System.out.print("Aprobado (" + notas[i] + ")");
            } else {
                System.out.print("Desaprobado (" + notas[i] + ")");
            }
            System.out.println();
        }
    }
}
