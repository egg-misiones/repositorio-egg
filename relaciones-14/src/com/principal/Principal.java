package com.principal;

import com.centro.docente.CentroDocente;
import com.estudiante.Estudiante;
import com.personal.servicio.PersonalDeServicio;
import com.profesor.Profesor;

public class Principal {

    public static void main(String[] args) {
        CentroDocente centroDocente = new CentroDocente();

        centroDocente.darDeAlta(new Estudiante("1º", "Oscar", "Videla", 55444333, "Soltero"));
        centroDocente.darDeAlta(new Estudiante("3º", "Ana", "Quinteros", 11222333, "Soltero"));
        centroDocente.darDeAlta(new Estudiante("4º", "José", "Lemos", 11222333, "Soltero"));
        centroDocente.darDeAlta(new Profesor("Matemática", 1999, 2, "Pablo", "Ramos", 77888999, "Casado"));
        centroDocente.darDeAlta(new PersonalDeServicio("Biblioteca", 2000, 10, "Leo", "Vega", 33222111, "Casado"));
        centroDocente.darDeBaja(11222333);
        centroDocente.mostrarDatos();
        centroDocente.mostrarSalario();
    }
}
