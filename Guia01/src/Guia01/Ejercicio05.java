package Guia01;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dato, dias, horas, minutos;

        System.out.print("Ingrese la cantidad de minutos: ");
        dato = entrada.nextInt();

        dias = dato / 1440;
        horas = dato % 1440 / 60;
        minutos = dato % 60;

        System.out.println("La cantidad de minutos ingresados equivale a: ");
        System.out.println(dias + " día/días");
        System.out.println(horas + " hora/horas");
        System.out.println(minutos + " minuto/minutos");
    }
}
