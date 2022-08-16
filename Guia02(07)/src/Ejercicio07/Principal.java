package Ejercicio07;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();
        int alto, largo;

        System.out.print("Ingrese la altura del rectangulo: ");
        alto = entrada.nextInt();
        rectangulo.setAlto(alto);
        System.out.print("Ingrese el largo del rectangulo: ");
        largo = entrada.nextInt();
        rectangulo.setLargo(largo);

        rectangulo.superficie();
        rectangulo.perimetro();
        rectangulo.visualizar();
    }
}
