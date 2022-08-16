package com.principal;

import com.centro.docente.CentroDocente;
import com.estudiante.Estudiante;
import com.personal.servicio.PersonalDeServicio;
import com.profesor.Profesor;

public class Principal {

    public static void main(String[] args) {
        CentroDocente centroDocente = new CentroDocente();

        centroDocente.darDeAlta(new Estudiante("9º", "Oscar", "Videla", 55444333, "Soltero"));
        centroDocente.darDeAlta(new Estudiante("8º", "Ana", "Quinteros", 11222333, "Soltera"));
        centroDocente.darDeAlta(new Estudiante("8º", "Ana", "Quinteros", 11222333, "Soltera"));
        centroDocente.darDeAlta(new Profesor("Matemática", 2005, 2, "Pablo", "Ramos", 77888999, "Casado"));
        centroDocente.darDeAlta(new PersonalDeServicio("Biblioteca", 2000, 10, "Leo", "Vega", 33222111, "Soltero"));
        centroDocente.darDeBaja(11222333);
        centroDocente.mostrarDatos();
    }
}
