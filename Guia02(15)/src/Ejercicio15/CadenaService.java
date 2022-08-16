package Ejercicio15;

import java.util.Scanner;

public class CadenaService {

    public Cadena crearCadena(String frase) {
        Cadena cadena = new Cadena(frase);

        return cadena;
    }

    public Cadena leerFrase() {
        Scanner entrada = new Scanner(System.in);
        String frase;

        System.out.print("Ingrese una frase: ");
        frase = entrada.nextLine();

        return crearCadena(frase);
    }

    public void cantidadVocales(Cadena cadena) {
        String letra;
        int cantidadVocales = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = cadena.getFrase().substring(i, i + 1);
            letra = letra.toUpperCase();
            switch (letra) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    cantidadVocales++;
                    break;
            }
        }

        System.out.println("La frase tiene " + cantidadVocales + " vocales");
    }

    public void invertirFrase(Cadena cadena) {
        String letra, frase;
        letra = "";
        frase = "";

        for (int i = cadena.getLongitud(); i > 0; i--) {
            letra = cadena.getFrase().substring(i - 1, i);
            frase += letra;
        }

        System.out.println("Frase invertida: " + frase);
    }

    public void vecesRepetido(Cadena cadena) {
        Scanner entrada = new Scanner(System.in);
        String letra;
        int contador = 0;

        do {
            System.out.print("Ingrese un caracter: ");
            letra = entrada.next();
        } while (letra.length() != 1);

        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (letra.endsWith(cadena.getFrase().substring(i, i + 1))) {
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("La letra ingresada no se encuentra en la frase");
        } else {
            System.out.println("La letra '" + letra + "' se repite " + contador + " veces");
        }
    }

    public void compararLongitud(Cadena cadena) {
        Scanner entrada = new Scanner(System.in);
        String frase;

        System.out.print("Ingrese una frase: ");
        frase = entrada.nextLine();

        if (frase.length() == cadena.getLongitud()) {
            System.out.println("La longitud de las frases es igual");
        } else {
            System.out.println("La longitud de las frases es diferente");
        }
    }

    public void unirFrases(Cadena cadena) {
        Scanner entrada = new Scanner(System.in);
        String frase, fraseFinal;

        System.out.print("Ingrese una frase: ");
        frase = entrada.nextLine();

        fraseFinal = cadena.getFrase().concat(frase);

        System.out.println("Frases unidas: " + fraseFinal);
    }

    public void reemplazar(Cadena cadena) {
        Scanner entrada = new Scanner(System.in);
        String letra;

        do {
            System.out.print("Ingrese una letra: ");
            letra = entrada.nextLine();
        } while (letra.length() != 1);

        cadena.setFrase(cadena.getFrase().replaceAll(letra, "a"));

        System.out.println("Frase resultante: " + cadena.getFrase());
    }
}
