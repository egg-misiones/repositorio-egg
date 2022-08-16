package com.estudiante;

import com.persona.Persona;

public class Estudiante extends Persona {

    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, Integer dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void nuevoCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Curso: " + curso;
    }
}
