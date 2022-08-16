package com.alumno;

import java.util.ArrayList;

public class AlumnoService {

    public Alumno crearAlumno() {
        return new Alumno(asignarNombre(), asignarApellido(), asignarDni());
    }

    public String asignarNombre() {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Pablo");
        nombres.add("Andrea");
        nombres.add("Nayibe");
        nombres.add("Lorena");
        nombres.add("Franco");
        nombres.add("Renzo");
        nombres.add("Lucas");
        nombres.add("Gabriel");
        nombres.add("Macarena");
        nombres.add("Mariana");

        return nombres.get((int) (Math.random() * 10));
    }

    public String asignarApellido() {
        ArrayList<String> apellidos = new ArrayList<>();

        apellidos.add("FONTANA");
        apellidos.add("LEDESMA");
        apellidos.add("SOLARI");
        apellidos.add("BELLO");
        apellidos.add("QUIROGA");
        apellidos.add("BENTO");
        apellidos.add("AMADEO");
        apellidos.add("ARROJO");
        apellidos.add("VILLALBA");
        apellidos.add("FONTANA");

        return apellidos.get((int) (Math.random() * 10));
    }

    public int asignarDni() {
        return (int) (Math.random() * 5000000 + 35000000);
    }
}
