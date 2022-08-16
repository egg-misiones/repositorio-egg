package Guia01;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas, valor, salario;

        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        horas = entrada.nextInt();
        System.out.print("Ingrese el valor por hora: ");
        valor = entrada.nextInt();

        salario = horas * valor;

        System.out.println("Usted cobrará: $" + salario);
    }
}
