package com.principal;

import com.alumno.Alumno;
import com.simulador.Simulador;
import com.voto.Voto;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Simulador simulador = new Simulador();
        ArrayList<Alumno> alumnos;
        ArrayList<Voto> votos;

        alumnos = simulador.crearLista();
        simulador.mostrarDatos(alumnos);

        votos = simulador.votacion(alumnos);
        simulador.ordenamientoCantidadVotos(alumnos);

        System.out.println();
        simulador.mostrarVotos(alumnos);

        System.out.println();
        simulador.mostrarFacilitadores(alumnos);

        System.out.println();
        simulador.mostrarVotoAlumno(votos);
    }
}
