package Ejercicio05;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora, minutos, segundos;

        System.out.print("Ingrese una determinada cantidad de horas: ");
        hora = entrada.nextInt();
        System.out.print("Ingrese una determinada cantidad de minutos: ");
        minutos = entrada.nextInt();
        System.out.print("Ingrese una determinada cantidad de segundos: ");
        segundos = entrada.nextInt();

        Tiempo horario = new Tiempo(hora, minutos, segundos);
        horario.imprimirHoraCompleta();
    }
}
