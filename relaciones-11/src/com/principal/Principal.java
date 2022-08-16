package com.principal;

import com.estudiante.Estudiante;
import com.persona.Persona;
import com.personal.servicio.PersonalDeServicio;
import com.profesor.Profesor;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Profesor("Matemática", 2005, 2, "Pablo", "Ramos", 77888999, "Casado"));
        personas.add(new PersonalDeServicio("Biblioteca", 2000, 10, "Leo", "Vega", 33222111, "Soltero"));
        personas.add(new Estudiante("9º", "Oscar", "Videla", 55444333, "Soltero"));

        for (Persona p : personas) {
            if (p instanceof Profesor) {
                System.out.println("PROFESOR: ");
            }

            if (p instanceof PersonalDeServicio) {
                System.out.println("PERSONAL DEL SERVICIO: ");
            }

            if (p instanceof Estudiante) {
                System.out.println("ESTUDIANTES: ");
            }

            System.out.println(p);
            System.out.println();
        }
    }
}
