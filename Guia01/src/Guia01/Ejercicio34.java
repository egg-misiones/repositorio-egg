package Guia01;

import java.util.Scanner;

public class Ejercicio34 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad;

        System.out.print("Ingrese la cantidad de personas que desea saber el nombre y la edad: ");
        cantidad = entrada.nextInt();

        registro(cantidad);
    }

    public static void registro(int cantidad) {
        Scanner entrada = new Scanner(System.in);
        String nombre, respuesta;
        int edad;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombre = entrada.next();
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edad = entrada.nextInt();

            if (edad >= 18) {
                System.out.println(nombre + " (" + edad + " años) es mayor de edad");
            } else {
                System.out.println(nombre + " (" + edad + " años) es menor de edad");
            }

            if (i < (cantidad - 1)) {
                System.out.print("¿Desea continuar con el proceso?: ");
                respuesta = entrada.next();
                respuesta = respuesta.toUpperCase();

                if (respuesta.equals("NO")) {
                    break;
                }
            }
        }
    }
}
