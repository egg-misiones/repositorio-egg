package com.herencia;

public class Principal {

    public static void main(String[] args) {
        Asalariado primerEmpleado = new Asalariado("Mario", 28, 10000);
        SubContratado segundoEmpleado = new SubContratado("Pedro", 25, 50, 100);
        Vendedor tercerEmpleado = new Vendedor("Marta", 22, 100, 200, 5);

        System.out.println("ASALARIADO");
        System.out.println(primerEmpleado.toString());
        System.out.println("Sueldo: " + primerEmpleado.calcularPago());
        System.out.println();
        System.out.println("SUBCONTRATADO");
        System.out.println(segundoEmpleado.toString());
        System.out.println("Sueldo: " + segundoEmpleado.calcularPago());
        System.out.println();
        System.out.println("VENDEDOR");
        System.out.println(tercerEmpleado.toString());
        System.out.println("Sueldo: " + tercerEmpleado.calcularPago());
    }
}
