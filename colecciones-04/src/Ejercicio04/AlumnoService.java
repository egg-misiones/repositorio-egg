package Ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class AlumnoService {

    private HashSet<Alumno> cursoProgramacionEgg = new HashSet();

    public void setCursoProgramacionEgg(HashSet<Alumno> cursoProgramacionEgg) {
        this.cursoProgramacionEgg = cursoProgramacionEgg;
    }

    public HashSet<Alumno> getCursoProgramacionEgg() {
        return cursoProgramacionEgg;
    }

    public void crearAlumno(String nombre, String apellido, int nroLegajo, char sexo, String condicion, int notaFinal) {
        Alumno alumno = new Alumno();

        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setNroLegajo(nroLegajo);
        alumno.setSexo(sexo);
        alumno.setCondicion(condicion);
        alumno.setNotaFinal(notaFinal);

        guardarAlumno(alumno);
    }

    public void guardarAlumno(Alumno alumno) {
        cursoProgramacionEgg.add(alumno);
    }

    public void mostrarListaAlumno() {
        System.out.println("LISTA DE ALUMNOS: ");

        for (Alumno i : cursoProgramacionEgg) {
            System.out.println(i.getNombre() + " " + i.getApellido() + " (Nº de legajo: " + i.getNroLegajo() + "; Sexo: " + i.getSexo() + "; Condición: " + i.getCondicion() + "; Nota final: " + i.getNotaFinal() + ")");
        }
    }

    public void mostrarListaCondicional() {
        int contador = 0;
        System.out.println("LISTA DE ALUMNOS CONDICIONALES: ");

        for (Alumno i : cursoProgramacionEgg) {
            if (i.getCondicion().equalsIgnoreCase("CONDICIONAL")) {
                System.out.println(i.getNombre() + " " + i.getApellido());
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("Cantidad de alumnos condicionales: " + contador);
        } else {
            System.out.println("No hay alumnos condicionales");
        }
    }

    public void ordenarMayorMenor() {
        ArrayList<Alumno> listaMayorMenor = new ArrayList(cursoProgramacionEgg);

        Collections.sort(listaMayorMenor);
        System.out.println("LISTA ORDENADA DE MAYOR A MENOR");

        for (Alumno i : listaMayorMenor) {
            System.out.println(i.getNombre() + " " + i.getApellido() + " (" + i.getNotaFinal() + ")");
        }
    }

    public void ordenarMenorMayor() {
        ArrayList<Alumno> listaMenorMayor = new ArrayList(cursoProgramacionEgg);

        Collections.sort(listaMenorMayor, new MenorMayor());
        System.out.println("LISTA ORDENADA DE MENOR A MAYOR");

        for (Alumno i : listaMenorMayor) {
            System.out.println(i.getNombre() + " " + i.getApellido() + " (" + i.getNotaFinal() + ")");
        }
    }

    public void ordenarNombreApellido() {
        ArrayList<Alumno> listaNombreApellido = new ArrayList(cursoProgramacionEgg);

        Collections.sort(listaNombreApellido, new NombreApellido());
        System.out.println("LISTA ORDENADA POR NOMBRE Y APELLIDO");

        for (Alumno i : listaNombreApellido) {
            System.out.println(i.getApellido() + ", " + i.getNombre());
        }
    }
}
