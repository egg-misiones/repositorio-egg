package com.herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Electrodomestico> productos = new ArrayList<>();
        ArrayList<Electrodomestico> usuario = new ArrayList<>();
        productos.add(new Televisor("SAMSUNG", "A1111", 11111, 4.5, "ENCENDIDO", 40000, 40, true));
        productos.add(new Televisor("PHILIPS", "B2222", 22222, 5, "ENCENDIDO", 45000, 45, true));
        productos.add(new Televisor("NOBLEX", "C3333", 33333, 5.5, "ENCENDIDO", 50000, 50, true));
        productos.add(new Lavarropa("PHILCO", "D4444", 44444, 6, "ENCENDIDO", 55000, 5, "AUTOMÁTICO"));
        productos.add(new Lavarropa("SAMSUNG", "E5555", 55555, 6.5, "ENCENDIDO", 60000, 6, "SEMI-AUTOMÁTICO"));
        productos.add(new Lavarropa("LG", "F6666", 66666, 7, "ENCENDIDO", 65000, 5, "AUTOMÁTICO"));
        productos.add(new Heladera("PATRICK", "G7777", 77777, 7.5, "ENCENDIDO", 55000, 200, true));
        productos.add(new Heladera("SIAM", "H8888", 88888, 8, "ENCENDIDO", 60000, 225, false));
        productos.add(new Heladera("GAFA", "I9999", 99999, 8.5, "ENCENDIDO", 65000, 250, true));
        productos.add(new Licuadora("PHILIPS", "J1212", 12121, 9, "ENCENDIDO", 25000, 600, 4));
        productos.add(new Licuadora("PHILCO", "K2323", 23232, 9.5, "ENCENDIDO", 30000, 650, 5));
        productos.add(new Licuadora("NOBLEX", "L3434", 34343, 10, "ENCENDIDO", 35000, 700, 4));
        String tipoDeProducto;
        int primeraRespuesta = 0;
        char segundaRespuesta = 0;
        double precioTotal = 0;

        do {
            System.out.println("ELECTRODOMÉSTICOS: ");
            System.out.println();
            for (int i = 0; i < productos.size(); i++) {
                tipoDeProducto = productos.get(i).getClass().getSimpleName();
                System.out.println((i + 1) + ". " + tipoDeProducto.toUpperCase());
                System.out.println("Marca: " + productos.get(i).getMarca());
                System.out.println("Modelo: " + productos.get(i).getModelo());
                System.out.println();
            }
            System.out.println((productos.size() + 1) + ". Salir");
            System.out.println();
            System.out.println("Indique el producto que desea comprar ingresando el número correspondiente: ");
            primeraRespuesta = entrada.nextInt();
            if (primeraRespuesta >= 1 && primeraRespuesta <= productos.size()) {
                tipoDeProducto = productos.get(primeraRespuesta - 1).getClass().getSimpleName();
                System.out.println((primeraRespuesta) + ". " + tipoDeProducto.toUpperCase());
                System.out.println(productos.get(primeraRespuesta - 1));
                System.out.println();
                System.out.println("¿Está seguro que desea comprar el producto? S/N");
                segundaRespuesta = entrada.next().charAt(0);
                segundaRespuesta = Character.toUpperCase(segundaRespuesta);
                while (segundaRespuesta != 'S' && segundaRespuesta != 'N') {
                    System.out.println("La letra ingresada es inválida. Vuelva a intentar");
                    segundaRespuesta = entrada.next().charAt(0);
                    segundaRespuesta = Character.toUpperCase(segundaRespuesta);
                }
                if (segundaRespuesta == 'S') {
                    usuario.add(productos.get(primeraRespuesta - 1));
                }
            } else if (primeraRespuesta == (productos.size() + 1)) {
                System.out.println("Operación finalizada");
                System.out.println();
            } else {
                System.out.println("El número ingresado es inválido");
                System.out.println();
            }
        } while (primeraRespuesta != (productos.size() + 1));

        if (usuario.isEmpty() == false) {
            System.out.println("TICKET DE VENTA: ");
            System.out.println();
            for (int i = 0; i < usuario.size(); i++) {
                tipoDeProducto = usuario.get(i).getClass().getSimpleName();
                System.out.println((i + 1) + ". " + tipoDeProducto.toUpperCase());
                System.out.println(usuario.get(i));
                System.out.println();
                precioTotal += usuario.get(i).getPrecio();
            }
            System.out.println("Precio total: " + precioTotal);
        }
    }
}
