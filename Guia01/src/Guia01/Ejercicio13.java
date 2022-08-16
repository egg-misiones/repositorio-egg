package Guia01;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro;

        System.out.print("Ingrese un número entre el 1 y el 10: ");
        nro = entrada.nextInt();

        switch (nro) {
            case 1:
                System.out.println("El número romano resultante es: I");
                break;
            case 2:
                System.out.println("El número romano resultante es: II");
                break;
            case 3:
                System.out.println("El número romano resultante es: III");
                break;
            case 4:
                System.out.println("El número romano resultante es: IV");
                break;
            case 5:
                System.out.println("El número romano resultante es: V");
                break;
            case 6:
                System.out.println("El número romano resultante es: VI");
                break;
            case 7:
                System.out.println("El número romano resultante es: VII");
                break;
            case 8:
                System.out.println("El número romano resultante es: VIII");
                break;
            case 9:
                System.out.println("El número romano resultante es: IX");
                break;
            case 10:
                System.out.println("El número romano resultante es: X");
                break;
            default:
                System.out.println("El número ingresado no es válido");
        }
    }
}
