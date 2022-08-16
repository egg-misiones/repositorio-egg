package com.gato;

import com.animal.Animal;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String tipoAlimento, int edad, String tipoRaza) {
        super(nombre, tipoAlimento, edad, tipoRaza);
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " se alimenta con " + tipoAlimento);
    }
}
