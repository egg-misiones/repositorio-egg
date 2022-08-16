package com.centro.docente;

import com.persona.Persona;
import java.util.ArrayList;
import java.util.Iterator;

public class CentroDocente {

    private ArrayList<Persona> personas;

    public CentroDocente() {
        personas = new ArrayList<>();
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void darDeAlta(Persona persona) {
        if (buscarPersona(persona) == false) {
            personas.add(persona);
        }
    }

    public boolean buscarPersona(Persona parametroPersona) {
        for (Persona p : personas) {
            if (p.obtenerDni().equals(parametroPersona.getDni())) {
                return true;
            }
        }

        return false;
    }

    public void darDeBaja(Integer parametroDni) {
        Iterator<Persona> it = personas.iterator();

        while (it.hasNext()) {
            Persona persona = it.next();
            if (persona.obtenerDni().equals(parametroDni)) {
                it.remove();
            }
        }
    }

    public void mostrarDatos() {
        System.out.println("CENTRO DOCENTE");
        personas.forEach(p -> System.out.println(p + "\n"));
    }
}
