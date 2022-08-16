package com.centro.docente;

import com.estudiante.Estudiante;
import com.persona.Persona;
import com.personal.servicio.PersonalDeServicio;
import com.profesor.Profesor;
import java.util.ArrayList;
import java.util.Iterator;

public class CentroDocente {

    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;
    private ArrayList<PersonalDeServicio> personalDeServicio;

    public CentroDocente() {
        estudiantes = new ArrayList<>();
        profesores = new ArrayList<>();
        personalDeServicio = new ArrayList<>();
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void setPersonalDeServicio(ArrayList<PersonalDeServicio> personalDeServicio) {
        this.personalDeServicio = personalDeServicio;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public ArrayList<PersonalDeServicio> getPersonalDeServicio() {
        return personalDeServicio;
    }

    public void darDeAlta(Estudiante estudiante) {
        if (buscarPersona(estudiante) == false) {
            estudiantes.add(estudiante);
        }
    }

    public void darDeAlta(Profesor profesor) {
        if (buscarPersona(profesor) == false) {
            profesores.add(profesor);
        }
    }

    public void darDeAlta(PersonalDeServicio personal) {
        if (buscarPersona(personal) == false) {
            personalDeServicio.add(personal);
        }
    }

    public boolean buscarPersona(Persona parametroPersona) {
        for (Estudiante e : estudiantes) {
            if (e.obtenerDni().equals(parametroPersona.getDni())) {
                return true;
            }
        }

        for (Profesor p : profesores) {
            if (p.obtenerDni().equals(parametroPersona.getDni())) {
                return true;
            }
        }

        for (PersonalDeServicio personal : personalDeServicio) {
            if (personal.obtenerDni().equals(parametroPersona.getDni())) {
                return true;
            }
        }

        return false;
    }

    public void darDeBaja(Integer parametroDni) {
        Iterator<Estudiante> it1 = estudiantes.iterator();
        Iterator<Profesor> it2 = profesores.iterator();
        Iterator<PersonalDeServicio> it3 = personalDeServicio.iterator();

        while (it1.hasNext()) {
            Estudiante estudiante = it1.next();
            if (estudiante.obtenerDni().equals(parametroDni)) {
                it1.remove();
            }
        }

        while (it2.hasNext()) {
            Profesor profesor = it2.next();
            if (profesor.obtenerDni().equals(parametroDni)) {
                it2.remove();
            }
        }

        while (it3.hasNext()) {
            PersonalDeServicio personal = it3.next();
            if (personal.obtenerDni().equals(parametroDni)) {
                it3.remove();
            }
        }
    }

    public void mostrarDatos() {
        System.out.println("ESTUDIANTES");
        estudiantes.forEach(e -> System.out.println(e + "\n"));
        System.out.println("PROFESORES");
        profesores.forEach(p -> System.out.println(p + "\n"));
        System.out.println("PERSONA DE SERVICIO");
        personalDeServicio.forEach(personal -> System.out.println(personal + "\n"));
    }
}
