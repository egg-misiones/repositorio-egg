package com.voto;

import com.alumno.Alumno;
import java.util.ArrayList;

public class Voto {

    private Alumno alumno;
    private ArrayList<Alumno> alumnosVotados;

    public Voto() {
        alumnosVotados = new ArrayList<>();
    }

    public Voto(Alumno alumno, ArrayList<Alumno> alumnosVotados) {
        this.alumno = alumno;
        this.alumnosVotados = alumnosVotados;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setAlumnosVotados(ArrayList<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public ArrayList<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }
}
