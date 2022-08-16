package com.espectador;

import com.cine.Cine;
import java.util.ArrayList;

public class EspectadorService {

    public Espectador crearEspectador() {
        Espectador espectador = new Espectador();

        espectador.setNombre(asignarNombre());
        espectador.setEdad((int) (Math.random() * 55 + 5));
        espectador.setDineroDisponible((int) (Math.random() * 1000));

        return espectador;
    }

    public String asignarNombre() {
        String[] nombres = {"Cristian", "Leandro", "Claudio", "María", "Pilar", "Nayibe",
            "Lorena", "Gastón", "Paula", "Lorenzo", "Pedro", "Rocío", "Esteban", "Celeste"};

        return nombres[(int) (Math.random() * 14)];
    }

    public void asignarCine(ArrayList<Espectador> espectadores, Cine cine) {
        espectadores.forEach(espectador -> espectador.setCine(cine));
    }
}
