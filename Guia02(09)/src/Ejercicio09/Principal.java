package Ejercicio09;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        RaicesService raicesService = new RaicesService();
        Raices raices;
        double A, B, C;

        System.out.println("Ingrese los coeficientes de una ecuación de 2do grado");
        System.out.print("A: ");
        A = entrada.nextDouble();
        System.out.print("B: ");
        B = entrada.nextDouble();
        System.out.print("C: ");
        C = entrada.nextDouble();

        raices = raicesService.crearRaices(A, B, C);
        raicesService.calcular(raices);
    }
}
