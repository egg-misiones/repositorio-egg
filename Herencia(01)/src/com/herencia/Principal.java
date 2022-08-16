package com.herencia;

public class Principal {

    public static void main(String[] args) {
        Asalariado primerEmpleado = new Asalariado("Mario", 28, 10000);
        SubContratado segundoEmpleado = new SubContratado("Pedro", 25, 50, 100);

        System.out.println("ASALARIADO");
        System.out.println(primerEmpleado.toString());
        System.out.println("Sueldo: " + primerEmpleado.calcularPago());
        System.out.println();
        System.out.println("SUBCONTRATADO");
        System.out.println(segundoEmpleado.toString());
        System.out.println("Sueldo: " + segundoEmpleado.calcularPago());
    }
}
