package com.baraja;

import com.carta.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class BarajaService {

    public Baraja crearBaraja() {
        Baraja baraja = new Baraja();
        HashSet<Carta> cartas = new HashSet<>();

        do {
            cartas.add(new Carta());
        } while (cartas.size() < 40);

        baraja.getBaraja().addAll(cartas);

        return baraja;
    }

    public void ordenarBaraja(ArrayList<Carta> baraja) {
        baraja.sort((c1, c2) -> c1.getNumero().compareTo(c2.getNumero()));
    }

    public void barajar(Baraja baraja) {
        Collections.shuffle(baraja.getBaraja());
    }

    public void siguienteCarta(ArrayList<Carta> cartasMonton, ArrayList<Carta> baraja) {
        if (cartasDisponibles(baraja) == 0) {
            System.out.println("No quedan más cartas");
        } else {
            cartasMonton.add(baraja.get(0));
            baraja.remove(0);
        }
    }

    public void darCartas(ArrayList<Carta> cartasUsuario, ArrayList<Carta> baraja) {
        Scanner entrada = new Scanner(System.in);
        int cantidad;

        System.out.print("Ingrese el número de cartas que desea obtener: ");
        cantidad = entrada.nextInt();

        if (cartasDisponibles(baraja) >= cantidad) {
            for (int i = 0; i < cantidad; i++) {
                cartasUsuario.add(baraja.get(0));
                baraja.remove(0);
            }
        } else {
            System.out.println("No es posible entregarle esa cantidad de cartas");
        }
    }

    public int cartasDisponibles(ArrayList<Carta> baraja) {
        return baraja.size();
    }

    public void cartasMonton(ArrayList<Carta> cartasMonton) {
        System.out.println("CARTAS FUERA DE JUEGO");
        if (cartasMonton.isEmpty()) {
            System.out.println("Aún no han salido cartas");
        } else {
            cartasMonton.forEach(c -> System.out.println(c.toString()));
        }
    }

    public void mostrarBaraja(ArrayList<Carta> baraja) {
        System.out.println("CARTAS DE LA BARAJA");
        if (baraja.isEmpty()) {
            System.out.println("Ya no quedan más cartas");
        } else {
            baraja.forEach(c -> System.out.println(c.toString()));
        }
    }

    public void mostrasCartasUsuario(ArrayList<Carta> cartasUsuario) {
        System.out.println("CARTAS DEL USUARIO");
        if (cartasUsuario.isEmpty()) {
            System.out.println("El usuario aún no ha pedido cartas");
        } else {
            cartasUsuario.forEach(c -> System.out.println(c.toString()));
        }
    }
}
