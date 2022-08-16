package Ejercicio01;

import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class PalabraService {

    public Palabra crearPalabra() {
        Palabra palabra = new Palabra();

        return palabra;
    }

    public void leerVariablePalabra(Palabra palabra) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String variablePalabra;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese 10 palabras de una a la vez (" + (i + 1) + "): ");
            variablePalabra = entrada.next();
            guardarVariablePalabra(palabra, variablePalabra);
        }

        ordenarLista(palabra);
    }

    public void guardarVariablePalabra(Palabra palabra, String variablePalabra) {
        palabra.getPalabras().add(variablePalabra);
    }

    public void ordenarLista(Palabra palabra) {
        Collections.sort(palabra.getPalabras());
    }

    public void leerLongitud(Palabra palabra) {
        Scanner entrada = new Scanner(System.in);
        int longitud;

        System.out.print("Ingrese la longitud de las palabras que desea hallar: ");
        longitud = entrada.nextInt();

        System.out.println();

        longitud(palabra, longitud);
    }

    public void longitud(Palabra palabra, int longitud) {
        int contador = 0;
        System.out.println("LISTA REDUCIDA: ");

        for (String p : palabra.getPalabras()) {
            if (longitud == p.length()) {
                System.out.println(p + " (" + longitud + ")");
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("No hay ninguna palabra con la longitud solicitada");
        }
    }

    public void mostrarLista(Palabra palabra) {
        System.out.println("LISTA COMPLETA: ");

        for (String p : palabra.getPalabras()) {
            System.out.println(p);
        }
    }
}
