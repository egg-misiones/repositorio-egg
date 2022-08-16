package Ejercicio13;

import java.util.Scanner;

public class AhorcadoService {

    public Ahorcado crearAhorcado(String palabra) {
        Ahorcado ahorcado = new Ahorcado(palabra);

        return ahorcado;
    }

    public void leer(Ahorcado ahorcado) {
        Scanner entrada = new Scanner(System.in);
        String[] vector = new String[ahorcado.getPalabra().length];
        String letra;

        llenarVector(vector);

        int intentos = ahorcado.getIntentos();

        do {
            mostrarLongitud(ahorcado);
            do {
                System.out.print("Ingrese una letra: ");
                letra = entrada.nextLine();
                letra = letra.toUpperCase();
            } while (letra.length() != 1);
            if (letraEncontrada(ahorcado, letra)) {
                System.out.println("Mensaje: La letra pertenece a la palabra");
                recorrerVector(ahorcado, vector, letra);
            } else {
                System.out.println("Mensaje: La letra no pertenece a la palabra");
                intentos--;
            }
            encontradasFaltantes(vector);
            oportunidadesRestantes(intentos);
            mostrarVector(vector);
            System.out.println();
            if (palabraEncontrada(ahorcado, vector)) {
                break;
            }
        } while (intentos > 0);

        if (palabraEncontrada(ahorcado, vector)) {
            System.out.println("Mensaje: ¡Felicitaciones! ¡Ganaste!");
        } else {
            System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
        }
    }

    public void llenarVector(String[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = "_ ";
        }
    }

    public void mostrarLongitud(Ahorcado ahorcado) {
        System.out.println("Longitud de la palabra: " + ahorcado.getPalabra().length);
    }

    public boolean letraEncontrada(Ahorcado ahorcado, String letra) {
        boolean acierto = false;

        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (letra.equals(ahorcado.getPalabra()[i])) {
                acierto = true;
                break;
            }
        }

        return acierto;
    }

    public void recorrerVector(Ahorcado ahorcado, String[] vector, String letra) {
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (letra.equals(ahorcado.getPalabra()[i])) {
                vector[i] = letra;
            }
        }
    }

    public void encontradasFaltantes(String[] vector) {
        int encontradas, faltantes;
        encontradas = 0;
        faltantes = 0;

        for (int i = 0; i < vector.length; i++) {
            if (!vector[i].equals("_ ")) {
                encontradas++;
            } else {
                faltantes++;
            }
        }

        System.out.println("Número de letras (encontradas, faltantes): (" + encontradas + ", " + faltantes + ")");
    }

    public void oportunidadesRestantes(int intentos) {
        System.out.println("Números de oportunidades restantes: " + intentos);
    }

    public void mostrarVector(String[] vector) {
        System.out.print("Estado actual: ");

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public boolean palabraEncontrada(Ahorcado ahorcado, String[] vector) {
        int contador = 0;

        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (vector[i].equals(ahorcado.getPalabra()[i])) {
                contador++;
            }
        }

        if (contador == ahorcado.getPalabra().length) {
            return true;
        } else {
            return false;
        }
    }
}
