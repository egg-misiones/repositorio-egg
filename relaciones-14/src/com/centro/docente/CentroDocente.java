package com.centro.docente;

import com.empleado.Empleado;
import com.persona.Persona;
import com.personal.servicio.PersonalDeServicio;
import com.profesor.Profesor;
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

    public void mostrarSalario() {
        Empleado empleado;

        System.out.println("SALARIOS");
        for (Persona p : personas) {
            if (p instanceof Empleado) {
                if (p instanceof Profesor) {
                    System.out.println("PROFESOR");
                }

                if (p instanceof PersonalDeServicio) {
                    System.out.println("PERSONAL DE SERVICIO");
                }

                empleado = (Empleado) p;
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Apellido: " + empleado.getApellido());
                System.out.println("Salario: " + empleado.calcularSalario());
                System.out.println();
            }
        }
    }
}
