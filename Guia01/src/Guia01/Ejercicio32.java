package Guia01;

import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String moneda;
        int nro;

        System.out.print("Ingrese la cantidad de euros que desea convertir: ");
        nro = entrada.nextInt();
        System.out.print("Indique a qué moneda desea hacer la conversión: ");
        moneda = entrada.next();
        moneda = moneda.toLowerCase();

        conversion(nro, moneda);
    }

    public static void conversion(int nro, String moneda) {
        double resultado;

        switch (moneda) {
            case "dolares":
                resultado = nro * 1.28611;
                System.out.println(nro + " euros equivalen a " + resultado + " dolares");
                break;
            case "yenes":
                resultado = nro * 129.852;
                System.out.println(nro + " euros equivalen a " + resultado + " yenes");
                break;
            case "libras":
                resultado = nro * 0.86;
                System.out.println(nro + " euros equivalen a " + resultado + " libras");
                break;
            default:
                System.out.println("La moneda ingresada es inválida");
        }
    }
}
