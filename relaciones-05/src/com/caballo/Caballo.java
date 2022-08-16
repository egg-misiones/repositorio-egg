package com.caballo;

import com.animal.Animal;

public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String tipoAlimento, int edad, String tipoRaza) {
        super(nombre, tipoAlimento, edad, tipoRaza);
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " se alimenta con " + tipoAlimento);
    }
}
