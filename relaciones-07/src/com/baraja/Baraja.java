package com.baraja;

import com.carta.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public abstract class Baraja<T> {

    protected ArrayList<Carta<T>> baraja;
    protected int numeroCartasTotal;
    protected int numeroCartasPalo;

    public Baraja() {
        baraja = new ArrayList<>();
    }

    public void setBaraja(ArrayList<Carta<T>> baraja) {
        this.baraja = baraja;
    }

    public void setNumeroCartasTotal(int numeroCartasTotal) {
        this.numeroCartasTotal = numeroCartasTotal;
    }

    public void setNumeroCartasPalo(int numeroCartasPalo) {
        this.numeroCartasPalo = numeroCartasPalo;
    }

    public ArrayList<Carta<T>> getBaraja() {
        return baraja;
    }

    public int getNumeroCartasTotal() {
        return numeroCartasTotal;
    }

    public int getNumeroCartasPalo() {
        return numeroCartasPalo;
    }

    public void ordenarBaraja() {
        baraja.sort((c1, c2) -> c1.getNumero().compareTo(c2.getNumero()));
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    public void siguienteCarta(ArrayList<Carta> cartasMonton) {
        if (cartasDisponibles() == 0) {
            System.out.println("No quedan más cartas");
        } else {
            cartasMonton.add(baraja.get(0));
            baraja.remove(0);
        }
    }

    public void darCartas(ArrayList<Carta> cartasUsuario) {
        Scanner entrada = new Scanner(System.in);
        int cantidad;

        System.out.print("Ingrese el número de cartas que desea obtener: ");
        cantidad = entrada.nextInt();

        if (cartasDisponibles() >= cantidad) {
            for (int i = 0; i < cantidad; i++) {
                cartasUsuario.add(baraja.get(0));
                baraja.remove(0);
            }
        } else {
            System.out.println("No es posible entregarle esa cantidad de cartas");
        }
    }

    public int cartasDisponibles() {
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

    public void mostrarBaraja() {
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

    public abstract void crearBaraja();
}
