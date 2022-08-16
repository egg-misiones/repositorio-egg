package Ejercicio16;

import java.util.Scanner;

public class MatematicaService {

    public Matematica crearMatematica(double nro1, double nro2) {
        Matematica matematica = new Matematica();

        matematica.setNro1(nro1);
        matematica.setNro2(nro2);

        return matematica;
    }

    public Matematica leer() {
        Scanner entrada = new Scanner(System.in);
        double nro1, nro2;

        System.out.print("Ingrese el valor 1: ");
        nro1 = entrada.nextDouble();
        System.out.print("Ingrese el valor 2: ");
        nro2 = entrada.nextDouble();

        return crearMatematica(nro1, nro2);
    }

    public String devolverMayor(Matematica matematica) {
        String respuesta;

        if (matematica.getNro1() > matematica.getNro2()) {
            respuesta = "El número mayor es: " + matematica.getNro1();
            return respuesta;
        } else if (matematica.getNro1() < matematica.getNro2()) {
            respuesta = "El número mayor es: " + matematica.getNro2();
            return respuesta;
        } else {
            respuesta = "Los dos números son iguales";
            return respuesta;
        }
    }

    public void calcularPotencia(Matematica matematica) {
        double redondeo1, redondeo2, potencia;

        redondeo1 = Math.round(matematica.getNro1());
        redondeo2 = Math.round(matematica.getNro2());

        if (redondeo1 > redondeo2) {
            potencia = Math.pow(redondeo1, redondeo2);
            System.out.println(redondeo1 + "^" + redondeo2 + ": " + potencia);
        } else if (redondeo1 < redondeo2) {
            potencia = Math.pow(redondeo2, redondeo1);
            System.out.println(redondeo2 + "^" + redondeo1 + ": " + potencia);
        } else {
            potencia = Math.pow(redondeo1, redondeo2);
            System.out.println(redondeo1 + "^" + redondeo2 + ": " + potencia);
        }
    }

    public void calcularRaiz(Matematica matematica) {
        double valorAbsoluto;

        if (matematica.getNro1() < matematica.getNro2()) {
            valorAbsoluto = Math.abs(matematica.getNro1());
            System.out.println("La raíz cuadrada de " + valorAbsoluto + " es: " + Math.sqrt(valorAbsoluto));
        } else if (matematica.getNro1() > matematica.getNro2()) {
            valorAbsoluto = Math.abs(matematica.getNro2());
            System.out.println("La raíz cuadrada de " + valorAbsoluto + " es: " + Math.sqrt(valorAbsoluto));
        } else {
            valorAbsoluto = Math.abs(matematica.getNro1());
            System.out.println("La raíz cuadrada de " + valorAbsoluto + " es: " + Math.sqrt(valorAbsoluto));
        }
    }

    public void sumarAngulos(Matematica matematica) {
        double termino1, termino2, resultado;

        termino1 = Math.sin(matematica.getNro1()) * Math.cos(matematica.getNro2());
        termino2 = Math.cos(matematica.getNro1()) * Math.sin(matematica.getNro2());
        resultado = termino1 + termino2;
        System.out.println("Sen (" + matematica.getNro1() + " + " + matematica.getNro2() + "): " + resultado);
    }
}
