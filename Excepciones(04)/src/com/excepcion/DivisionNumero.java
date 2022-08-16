package com.excepcion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionNumero {

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primerNumero, segundoNumero;
        Integer primeraConversion, segundaConversion;

        try {
            System.out.println("Ingrese un número: ");
            primerNumero = entrada.readLine();
            System.out.println("Ingrese otro número: ");
            segundoNumero = entrada.readLine();

            primeraConversion = Integer.parseInt(primerNumero);
            segundaConversion = Integer.parseInt(segundoNumero);

            System.out.println(primerNumero + " / " + segundoNumero + " = " + primeraConversion / segundaConversion);
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.err.println("Tipo de excepción: " + e.getClass().getSimpleName());
        }
    }
}
