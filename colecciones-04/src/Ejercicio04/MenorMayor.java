package Ejercicio04;

import java.util.Comparator;

public class MenorMayor implements Comparator<Alumno> {

    @Override
    public int compare(Alumno alumno1, Alumno alumno2) {
        if (alumno1.getNotaFinal() > alumno2.getNotaFinal()) {
            return 1;
        } else if (alumno1.getNotaFinal() < alumno2.getNotaFinal()) {
            return -1;
        } else {
            return 0;
        }
    }
}
