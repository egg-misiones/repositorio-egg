package com.profesor;

import com.empleado.Empleado;

public class Profesor extends Empleado {

    private String materia;

    public Profesor() {
    }

    public Profesor(String materia, Integer anioDeIncorporacion, Integer numeroDeDespacho, String nombre, String apellido, Integer dni, String estadoCivil) {
        super(anioDeIncorporacion, numeroDeDespacho, nombre, apellido, dni, estadoCivil);
        this.materia = materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void cambioDeMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Materia: " + materia;
    }
}
