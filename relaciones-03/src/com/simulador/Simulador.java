package com.simulador;

import com.alumno.Alumno;
import com.alumno.AlumnoService;
import com.voto.Voto;
import java.util.ArrayList;
import java.util.HashSet;

public class Simulador {

    public ArrayList<Alumno> crearLista() {
        AlumnoService alumnoService = new AlumnoService();
        HashSet<Alumno> alumnos = new HashSet<>();

        do {
            alumnos.add(alumnoService.crearAlumno());
        } while (alumnos.size() < 20);

        return new ArrayList<>(alumnos);
    }

    public ArrayList<Voto> votacion(ArrayList<Alumno> alumnos) {
        HashSet<Alumno> votados = new HashSet<>();
        ArrayList<Voto> votos = new ArrayList<>();
        int votoRandom;

        for (int i = 0; i < alumnos.size(); i++) {
            do {
                do {
                    votoRandom = (int) (Math.random() * alumnos.size());
                } while (votoRandom == i);
                votados.add(alumnos.get(votoRandom));
            } while (votados.size() < 3);

            votados.forEach(v -> v.setCantidadVotos(v.getCantidadVotos() + 1));
            votos.add(new Voto(alumnos.get(i), new ArrayList<>(votados)));
            votados.clear();
        }

        return votos;
    }

    public void ordenamientoCantidadVotos(ArrayList<Alumno> alumnos) {
        alumnos.sort((alumno1, alumno2) -> -(alumno1.getCantidadVotos().compareTo(alumno2.getCantidadVotos())));
    }

    public void mostrarDatos(ArrayList<Alumno> alumnos) {
        System.out.println("PROGRAMACIÓN EGG");
        alumnos.forEach(alumno -> System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " (" + alumno.getDni() + ")"));
    }

    public void mostrarVotos(ArrayList<Alumno> alumnos) {
        System.out.println("VOTACIÓN GENERAL");
        alumnos.forEach(alumno -> System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " (" + alumno.getCantidadVotos() + ")"));
    }

    public void mostrarFacilitadores(ArrayList<Alumno> alumnos) {
        System.out.println("FACILITADORES (TITULARES/SUPLENTES)");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + alumnos.get(i).getNombre() + " " + alumnos.get(i).getApellido() + " (" + alumnos.get(i).getCantidadVotos() + ")");
        }
    }

    public void mostrarVotoAlumno(ArrayList<Voto> votos) {
        for (int i = 0; i < votos.size(); i++) {
            System.out.println(votos.get(i).getAlumno().getNombre() + " " + votos.get(i).getAlumno().getApellido() + " votó a: ");
            votos.get(i).getAlumnosVotados().forEach(v -> System.out.println(v.getNombre() + " " + v.getApellido()));
            if (i != votos.size() - 1) {
                System.out.println();
            }
        }
    }
}
