package Ejercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        LibroService libroService = new LibroService();
        String nombreLibro;
        int respuesta;

        libroService.crearLibro("1984", "George Orwell", 4, 3);
        libroService.crearLibro("Odisea", "Homero", 2, 2);
        libroService.crearLibro("El viejo y el mar", "Ernest Hemingway", 5, 1);
        libroService.crearLibro("A sangre fría", "Truman Capote", 4, 2);
        libroService.crearLibro("Rayuela", "Julio Cortázar", 2, 0);

        do {
            System.out.println("Elija una opcion: ");
            System.out.println("1. Llevar libro");
            System.out.println("2. Devolver libro");
            System.out.println("3. Salir");
            respuesta = entrada.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.print("Ingrese el nombre del libro que desea llevar: ");
                    nombreLibro = entrada.next();
                    if (libroService.prestamoLibro(nombreLibro)) {
                        System.out.println("La operación se realizó exitosamente");
                    } else {
                        System.out.println("Lamentablemente no hay ejemplares disponibles");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del libro que desea devolver: ");
                    nombreLibro = entrada.next();
                    if (libroService.devolucionLibro(nombreLibro)) {
                        System.out.println("La operación se realizó exitosamente");
                    } else {
                        System.out.println("No se realizó ningún préstamo del ejemplar que desea devolver");
                    }
                    break;
                case 3:
                    System.out.println("Sesión finalizada");
                    break;
                default:
                    System.out.println("La opción ingresada es inválida");
                    break;
            }
        } while (respuesta != 3);

        System.out.println();
        libroService.mostrarDatos();
    }
}
