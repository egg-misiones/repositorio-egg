package com.perro;

import com.animal.Animal;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String tipoAlimento, int edad, String tipoRaza) {
        super(nombre, tipoAlimento, edad, tipoRaza);
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " se alimenta con " + tipoAlimento);
    }
}
