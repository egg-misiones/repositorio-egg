package com.principal;

import com.baraja.Baraja;
import com.baraja.BarajaService;
import com.carta.Carta;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        BarajaService barajaService = new BarajaService();
        Baraja baraja;
        ArrayList<Carta> cartasMonton = new ArrayList<>();
        ArrayList<Carta> cartasUsuario = new ArrayList<>();
        int respuesta;

        baraja = barajaService.crearBaraja();

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
            respuesta = entrada.nextInt();
            switch (respuesta) {
                case 1:
                    barajaService.ordenarBaraja(baraja.getBaraja());
                    System.out.println();
                    break;
                case 2:
                    barajaService.barajar(baraja);
                    System.out.println();
                    break;
                case 3:
                    barajaService.siguienteCarta(cartasMonton, baraja.getBaraja());
                    break;
                case 4:
                    barajaService.darCartas(cartasUsuario, baraja.getBaraja());
                    System.out.println();
                    break;
                case 5:
                    barajaService.cartasMonton(cartasMonton);
                    System.out.println();
                    break;
                case 6:
                    barajaService.mostrasCartasUsuario(cartasUsuario);
                    System.out.println();
                    break;
                case 7:
                    barajaService.mostrarBaraja(baraja.getBaraja());
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Cartas disponibles: " + barajaService.cartasDisponibles(baraja.getBaraja()));
                    System.out.println();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("La opción ingresada es inválida");
                    System.out.println();
                    break;
            }
        } while (respuesta != 9);
    }
}
