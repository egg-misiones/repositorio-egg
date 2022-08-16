package Guia01;

/*
        // INFORMACIÓN BÁSICA DE LIGA
        System.out.println("INFORMACIÓN DE LIGA");
        System.out.println();
        System.out.println("Cantidad de fechas: " + liga.getFechas().size());
        System.out.println("Cantidad de partidos por fecha: " + liga.getFechas().get(0).getPartidos().size());
        System.out.println();

        // LISTA DE EQUIPOS
        System.out.println(liga.getNombreDeLiga());
        System.out.println();
        for (int i = 0; i < liga.getNombresDeEquipos().size(); i++) {
            System.out.println((i + 1) + ". " + liga.getNombresDeEquipos().get(i));
        }
        System.out.println();

        // CREACIÓN DE ENFRENTAMIENTOS
        int numeroDeEquipos = liga.getNombresDeEquipos().size();
        int primerContador = 0;
        int segundoContador = numeroDeEquipos - 2;

        for (int i = 0; i < numeroDeEquipos - 1; i++) {
            for (int j = 0; j < numeroDeEquipos / 2; j++) {
                liga.getFechas().get(i).getPartidos().get(j).getEquipoLocal().setNombreDelEquipo(liga.getNombresDeEquipos().get(primerContador));
                liga.getFechas().get(i).getPartidos().get(j).setGolesDelEquipoLocal((int) (Math.random() * 5));
                primerContador++;
                if (primerContador == numeroDeEquipos - 1) {
                    primerContador = 0;
                }
                if (j == 0) {
                    liga.getFechas().get(i).getPartidos().get(j).getEquipoVisitante().setNombreDelEquipo(liga.getNombresDeEquipos().get(numeroDeEquipos - 1));
                    liga.getFechas().get(i).getPartidos().get(j).setGolesDelEquipoVisitante((int) (Math.random() * 5));
                } else {
                    liga.getFechas().get(i).getPartidos().get(j).getEquipoVisitante().setNombreDelEquipo(liga.getNombresDeEquipos().get(segundoContador));
                    liga.getFechas().get(i).getPartidos().get(j).setGolesDelEquipoVisitante((int) (Math.random() * 5));
                    segundoContador--;

                    if (segundoContador == -1) {
                        segundoContador = numeroDeEquipos - 2;
                    }
                }
            }
        }
        
        // MOSTRAR FECHAS
        for (int i = 0; i < liga.getFechas().size(); i++) {
            System.out.println("FECHA " + (i + 1));
            System.out.println();
            for (int j = 0; j < liga.getFechas().get(0).getPartidos().size(); j++) {
                System.out.println(liga.getFechas().get(i).getPartidos().get(j));
            }
            System.out.println();
        }

        // MOSTRAR DATOS DE EQUIPOS
        for (int i = 0; i < 20; i++) {
            System.out.println(liga.getEquipos().get(i));
            System.out.println();
        }
 */
import java.util.ArrayList;

public class Ejemplo03 {

    public static void main(String[] args) {
        ArrayList<String> equipos = new ArrayList<>();
        String[][] matriz1 = new String[5][3];
        String[][] matriz2 = new String[5][3];

        equipos.add("Barcelona"); // 0
        equipos.add("Real Madrid"); // 1
        equipos.add("Villarreal"); // 2
        equipos.add("Valencia"); // 3
        equipos.add("Sevilla"); // 4
        equipos.add("Atlético"); // 5

        int numeroEquipos = 6;
        int contador1 = 0;
        int contador2 = numeroEquipos - 2;

        for (int i = 0; i < numeroEquipos - 1; i++) {
            for (int j = 0; j < numeroEquipos / 2; j++) {
                matriz1[i][j] = equipos.get(contador1);
                contador1++;
                if (contador1 == numeroEquipos - 1) {
                    contador1 = 0;
                }

                if (j == 0) {
                    matriz2[i][j] = equipos.get(numeroEquipos - 1);
                } else {
                    matriz2[i][j] = equipos.get(contador2);
                    contador2--;

                    if (contador2 == -1) {
                        contador2 = numeroEquipos - 2;
                    }
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("FECHA " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.println(matriz1[i][j] + " vs " + matriz2[i][j]);
            }
            System.out.println();
        }

        /*
        // CREACIÓN DE ENFRENTAMIENTOS
        int numeroDeEquipos = liga.getNombresDeEquipos().size();
        String[][] equiposLocales = new String[numeroDeEquipos - 1][numeroDeEquipos / 2];
        String[][] equiposVisitantes = new String[numeroDeEquipos - 1][numeroDeEquipos / 2];
        int primerContador = 0;
        int segundoContador = numeroDeEquipos - 2;

        for (int i = 0; i < numeroDeEquipos - 1; i++) {
            for (int j = 0; j < numeroDeEquipos / 2; j++) {
                equiposLocales[i][j] = liga.getNombresDeEquipos().get(primerContador);
                liga.getFechas().get(i).getPartidos().get(j).getEquipoLocal().setNombreDelEquipo(equiposLocales[i][j]);
                primerContador++;
                if (primerContador == numeroDeEquipos - 1) {
                    primerContador = 0;
                }
                if (j == 0) {
                    equiposVisitantes[i][j] = liga.getNombresDeEquipos().get(numeroDeEquipos - 1);
                    liga.getFechas().get(i).getPartidos().get(j).getEquipoVisitante().setNombreDelEquipo(equiposVisitantes[i][j]);
                } else {
                    equiposVisitantes[i][j] = liga.getNombresDeEquipos().get(segundoContador);
                    liga.getFechas().get(i).getPartidos().get(j).getEquipoVisitante().setNombreDelEquipo(equiposVisitantes[i][j]);
                    segundoContador--;

                    if (segundoContador == -1) {
                        segundoContador = numeroDeEquipos - 2;
                    }
                }
            }
        }
         */
    }
}
