package Ejercicio11;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        CafeteraService cafeteraService = new CafeteraService();
        Cafetera cafetera;
        int cantidad;

        cafetera = cafeteraService.crearCafetera();

        cafetera = cafeteraService.llenarCafetera(cafetera);

        System.out.print("Indique la cantidad de café que desea que le sirvan: ");
        cantidad = entrada.nextInt();

        cafeteraService.servirTaza(cafetera, cantidad);
        cafeteraService.vaciarCafetera(cafetera);
        cafeteraService.agregarCafe(cafetera, 500);
    }
}
