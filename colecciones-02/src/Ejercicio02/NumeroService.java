package Ejercicio02;

import java.util.Iterator;
import java.util.Scanner;

public class NumeroService {

    public Numero crearNumero() {
        Numero numero = new Numero();

        return numero;
    }

    public void leerValores(Numero numero) {
        Scanner entrada = new Scanner(System.in);
        Integer variableNumero;

        do {
            System.out.print("Ingrese un número: ");
            variableNumero = entrada.nextInt();
            guardarVariableNumero(numero, variableNumero);
        } while (variableNumero != -99);
    }

    public void guardarVariableNumero(Numero numero, Integer variableNumero) {
        if (variableNumero != -99) {
            numero.getNumeros().add(variableNumero);
        }
    }

    public Integer calcularSuma(Numero numero) {
        Iterator<Integer> iterator = numero.getNumeros().iterator();
        Integer acumulador = 0;

        while (iterator.hasNext()) {
            acumulador += iterator.next();
        }

        return acumulador;
    }

    public double calcularPromedio(Numero numero) {
        double promedio;

        promedio = (double) calcularSuma(numero) / numero.getNumeros().size();

        return promedio;
    }

    public Integer calcularMayor(Numero numero) {
        Iterator<Integer> iterator = numero.getNumeros().iterator();
        Integer acumulador = 0;

        while (iterator.hasNext()) {
            if (iterator.next() > calcularPromedio(numero)) {
                acumulador++;
            }
        }

        return acumulador;
    }

    public void mostrarResultados(Numero numero) {
        System.out.println("LISTA COMPLETA: ");

        for (Integer n : numero.getNumeros()) {
            System.out.println(n);
        }
        System.out.println("Suma resultante: " + calcularSuma(numero));
        System.out.println("Promedio: " + String.format("%.2f", calcularPromedio(numero)));
        System.out.println("Números superiores al promedio: " + calcularMayor(numero));
    }
}
