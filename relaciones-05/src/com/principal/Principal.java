package com.principal;

import com.animal.Animal;
import com.caballo.Caballo;
import com.gato.Gato;
import com.perro.Perro;

public class Principal {

    public static void main(String[] args) {
        Animal perro = new Perro("TEDDY", "CROQUETAS", 10, "CHIHUAHUA");
        Animal gato = new Gato("PELUSA", "GALLETAS", 15, "SIAMES");
        Animal caballo = new Caballo("SPARK", "PASTO", 25, "FINO");

        perro.alimentarse();
        gato.alimentarse();
        caballo.alimentarse();
    }
}
