package com.herencia;

public class Asalariado extends Empleado {

    private double sueldo;

    public Asalariado() {
    }

    public Asalariado(String nombre, Integer edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcularPago() {
        return sueldo;
    }
}
