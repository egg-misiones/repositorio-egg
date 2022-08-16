package Ejercicio04;

import java.util.Comparator;

public class NombreApellido implements Comparator<Alumno> {

    @Override
    public int compare(Alumno alumno1, Alumno alumno2) {
        return alumno1.getApellido().compareTo(alumno2.getApellido());
    }
}
