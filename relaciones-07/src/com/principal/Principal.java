package com.principal;

import com.baraja.Baraja;
import com.baraja.espaniola.BarajaEspaniola;
import com.baraja.francesa.BarajaFrancesa;
import com.carta.Carta;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int primeraRespuesta = 0;
        int segundaRespuesta = 0;
        int terceraRespuesta;

        do {
            System.out.println("Elija una opcion: ");
            System.out.println("1. Crear BARAJA ESPAÑOLA");
            System.out.println("2. Crear BARAJA FRANCESA");
            primeraRespuesta = entrada.nextInt();
            switch (primeraRespuesta) {
                case 1:
                    do {
                        System.out.println("Elija una opcion: ");
                        System.out.println("1. Crear BARAJA ESPAÑOLA de 48 CARTAS");
                        System.out.println("2. Crear BARAJA ESPAÑOLA de 40 CARTAS");
                        segundaRespuesta = entrada.nextInt();
                        switch (segundaRespuesta) {
                            case 1:
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("La opción ingresada es inválida");
                                break;
                        }
                    } while (segundaRespuesta != 1 && segundaRespuesta != 2);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("La opción ingresada es inválida");
                    break;
            }
        } while (primeraRespuesta != 1 && primeraRespuesta != 2);

        ArrayList<Carta> cartasMonton = new ArrayList<>();
        ArrayList<Carta> cartasUsuario = new ArrayList<>();
        Baraja baraja;

        if (primeraRespuesta == 1) {
            if (segundaRespuesta == 1) {
                baraja = new BarajaEspaniola(true);
            } else {
                baraja = new BarajaEspaniola(false);
            }
        } else {
            baraja = new BarajaFrancesa();
        }

        do {
            System.out.println("Elija una opción: ");
            System.out.println("1. Ordenar baraja");
            System.out.println("2. Barajar");
            System.out.println("3. Siguiente carta");
            System.out.println("4. Obtener cartas");
            System.out.println("5. Mostrar cartas del montón");
            System.out.println("6. Mostrar cartas del usuario");
            System.out.println("7. Mostrar baraja");
            System.out.println("8. Cartas disponibles");
            System.out.println("9. Salir");
            terceraRespuesta = entrada.nextInt();
            switch (terceraRespuesta) {
                case 1:
                    baraja.ordenarBaraja();
                    System.out.println();
                    break;
                case 2:
                    baraja.barajar();
                    System.out.println();
                    break;
                case 3:
                    baraja.siguienteCarta(cartasMonton);
                    break;
                case 4:
                    baraja.darCartas(cartasUsuario);
                    System.out.println();
                    break;
                case 5:
                    baraja.cartasMonton(cartasMonton);
                    System.out.println();
                    break;
                case 6:
                    baraja.mostrasCartasUsuario(cartasUsuario);
                    System.out.println();
                    break;
                case 7:
                    baraja.mostrarBaraja();
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
                    System.out.println();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("La opción ingresada es inválida");
                    System.out.println();
                    break;
            }
        } while (terceraRespuesta != 9);
    }
}
