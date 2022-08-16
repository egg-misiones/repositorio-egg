package com.herencia;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int respuesta;

        System.out.println("BIENVENIDO");
        System.out.println();

        // SELECCIÓN DE LIGA
        do {
            System.out.println("Seleccione una liga para poder iniciar la temporada: ");
            System.out.println("1. PREMIER LEAGUE");
            System.out.println("2. LA LIGA");
            System.out.println("3. SERIE A");
            System.out.println("4. PRIMERA DIVISIÓN");
            respuesta = entrada.nextInt();
            if (respuesta < 1 || respuesta > 4) {
                System.out.println("La opción ingresada es inválida");
                System.out.println();
            }
        } while (respuesta < 1 || respuesta > 4);

        // CREACIÓN DE LIGA
        Liga liga = new Liga(respuesta);
        System.out.println("La solicitud ha sido procesada con éxito");
        System.out.println();

        // ASIGNAR LIGA A EQUIPOS
        for (int i = 0; i < 20; i++) {
            liga.getEquipos().get(i).setLiga(liga);
        }

        int opcion;

        do {
            System.out.println("Elija una opcion: ");
            System.out.println("1. Mostrar información básica de la liga");
            System.out.println("2. Mostrar lista de equipos");
            System.out.println("3. Generar FIXTURE");
            System.out.println("4. Mostrar FIXTURE");
            System.out.println("5. Iniciar TEMPORADA");
            System.out.println("6. Mostrar RESULTADOS");
            System.out.println("7. Actualizar PUNTAJES");
            System.out.println("8. Mostrar DATOS de equipos");
            System.out.println("9. Mostrar TABLA DE POSICIONES");
            System.out.println("10. Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    mostrarInformacionBasica(liga);
                    break;
                case 2:
                    mostrarListaDeEquipos(liga);
                    break;
                case 3:
                    generarFixture(liga);
                    break;
                case 4:
                    mostrarFixture(liga);
                    break;
                case 5:
                    iniciarTemporada(liga);
                    break;
                case 6:
                    mostrarResultados(liga);
                    break;
                case 7:
                    actualizarPuntajes(liga);
                    break;
                case 8:
                    mostrarDatosDeEquipos(liga);
                    break;
                case 9:
                    mostrarTablaDePosiciones(liga);
                    break;
                case 10:
                    System.out.println("Solicitud procesada con éxito");
                    System.out.println();
                    break;
                default:
                    System.out.println("La opción ingresada es inválida");
                    System.out.println();
                    break;
            }
        } while (opcion != 10);
    }

    // PRIMERA OPCIÓN
    public static void mostrarInformacionBasica(Liga liga) {
        // INFORMACIÓN BÁSICA DE LIGA
        System.out.println("INFORMACIÓN DE LIGA");
        System.out.println();
        System.out.println("Cantidad de fechas: " + liga.getFechas().size());
        System.out.println("Cantidad de partidos por fecha: " + liga.getFechas().get(0).getPartidos().size());
        System.out.println();
    }

    // SEGUNDA OPCIÓN
    public static void mostrarListaDeEquipos(Liga liga) {
        // LISTA DE EQUIPOS
        System.out.println(liga.getNombreDeLiga());
        System.out.println();
        for (int i = 0; i < liga.getNombresDeEquipos().size(); i++) {
            System.out.println((i + 1) + ". " + liga.getNombresDeEquipos().get(i));
        }
        System.out.println();
    }

    // TERCERA OPCIÓN
    public static void generarFixture(Liga liga) {
        // GENERAR FIXTURE
        if (liga.getFechas().get(0).getPartidos().get(0).getEquipoLocal().getNombreDelEquipo() == null) {
            int numeroDeEquipos = liga.getNombresDeEquipos().size();
            int primerContador = 0;
            int segundoContador = numeroDeEquipos - 2;

            for (int i = 0; i < numeroDeEquipos - 1; i++) {
                for (int j = 0; j < numeroDeEquipos / 2; j++) {
                    String nombreLocal = liga.getNombresDeEquipos().get(primerContador);
                    liga.getFechas().get(i).getPartidos().get(j).getEquipoLocal().setNombreDelEquipo(nombreLocal);
                    primerContador++;

                    if (primerContador == numeroDeEquipos - 1) {
                        primerContador = 0;
                    }

                    String nombreVisitante;
                    if (j == 0) {
                        nombreVisitante = liga.getNombresDeEquipos().get(numeroDeEquipos - 1);
                        liga.getFechas().get(i).getPartidos().get(j).getEquipoVisitante().setNombreDelEquipo(nombreVisitante);
                    } else {
                        nombreVisitante = liga.getNombresDeEquipos().get(segundoContador);
                        liga.getFechas().get(i).getPartidos().get(j).getEquipoVisitante().setNombreDelEquipo(nombreVisitante);
                        segundoContador--;

                        if (segundoContador == -1) {
                            segundoContador = numeroDeEquipos - 2;
                        }
                    }
                }
            }
            System.out.println("FIXTURE generado con éxito");
            System.out.println();
        } else {
            System.out.println("El FIXTURE ya ha sido generado");
            System.out.println();
        }
    }

    // CUARTA OPCIÓN
    public static void mostrarFixture(Liga liga) {
        // MOSTRAR FECHAS
        if (liga.getFechas().get(0).getPartidos().get(0).getEquipoLocal().getNombreDelEquipo() == null) {
            System.out.println("Aún no se ha generado un FIXTURE");
            System.out.println();
        } else {
            for (int i = 0; i < liga.getFechas().size(); i++) {
                System.out.println("FECHA " + (i + 1));
                System.out.println();
                for (int j = 0; j < liga.getFechas().get(0).getPartidos().size(); j++) {
                    String local = liga.getFechas().get(i).getPartidos().get(j).getEquipoLocal().getNombreDelEquipo();
                    String visitante = liga.getFechas().get(i).getPartidos().get(j).getEquipoVisitante().getNombreDelEquipo();
                    System.out.println(local + visitante);
                }
                System.out.println();
            }
        }
    }

    // QUINTA OPCIÓN
    public static void iniciarTemporada(Liga liga) {
        // GENERAR RESULTADOS
        if (liga.getFechas().get(0).getPartidos().get(0).getEquipoLocal().getNombreDelEquipo() == null) {
            System.out.println("Aún no se ha generado un FIXTURE");
            System.out.println();
        } else if (liga.getFechas().get(0).getPartidos().get(0).getGolesDelEquipoLocal() != 0 && liga.getFechas().get(0).getPartidos().get(0).getGolesDelEquipoVisitante() != 0) {
            System.out.println("La TEMPORADA ya ha sido iniciada. No es posible iniciarla otra vez");
            System.out.println();
        } else {
            int numeroDeEquipos = liga.getNombresDeEquipos().size();

            for (int i = 0; i < numeroDeEquipos - 1; i++) {
                for (int j = 0; j < numeroDeEquipos / 2; j++) {
                    liga.getFechas().get(i).getPartidos().get(j).setGolesDelEquipoLocal((int) (Math.random() * 5));
                    liga.getFechas().get(i).getPartidos().get(j).setGolesDelEquipoVisitante((int) (Math.random() * 5));
                }
            }
            System.out.println("La TEMPORADA ha iniciado con éxito");
            System.out.println();
        }
    }

    // SEXTA OPCIÓN
    public static void mostrarResultados(Liga liga) {
        // MOSTRAR RESULTADOS
        if (liga.getFechas().get(0).getPartidos().get(0).getEquipoLocal().getNombreDelEquipo() == null) {
            System.out.println("Aún no se ha generado un FIXTURE");
            System.out.println();
        } else if (liga.getFechas().get(0).getPartidos().get(0).getGolesDelEquipoLocal() == 0 && liga.getFechas().get(0).getPartidos().get(0).getGolesDelEquipoVisitante() == 0) {
            System.out.println("La TEMPORADA aún no ha iniciado");
            System.out.println();
        } else {
            for (int i = 0; i < liga.getFechas().size(); i++) {
                System.out.println("FECHA " + (i + 1));
                System.out.println();
                for (int j = 0; j < liga.getFechas().get(0).getPartidos().size(); j++) {
                    System.out.println(liga.getFechas().get(i).getPartidos().get(j));
                }
                System.out.println();
            }
        }
    }

    // SÉPTIMA OPCIÓN
    public static void actualizarPuntajes(Liga liga) {
        // ACTUALIZAR PUNTAJES
        if (liga.getEquipos().get(0).getPartidosGanados() != 0 && liga.getEquipos().get(0).getPartidosEmpatados() != 0 && liga.getEquipos().get(0).getPartidosPerdidos() != 0) {
            System.out.println("Los PUNTAJES ya han sido actualizados. Sólo se pueden actualizar una vez");
            System.out.println();
        } else {
            int numeroDeEquipos = liga.getNombresDeEquipos().size();

            for (int i = 0; i < numeroDeEquipos - 1; i++) {
                for (int j = 0; j < numeroDeEquipos / 2; j++) {
                    String local = liga.getFechas().get(i).getPartidos().get(j).getEquipoLocal().getNombreDelEquipo();
                    String visitante = liga.getFechas().get(i).getPartidos().get(j).getEquipoVisitante().getNombreDelEquipo();
                    int golesLocal = liga.getFechas().get(i).getPartidos().get(j).getGolesDelEquipoLocal();
                    int golesVisitante = liga.getFechas().get(i).getPartidos().get(j).getGolesDelEquipoVisitante();

                    if (golesLocal > golesVisitante) {
                        for (Equipo e : liga.getEquipos()) {
                            if (e.getNombreDelEquipo().equalsIgnoreCase(local)) {
                                e.setPuntosAcumulados(e.getPuntosAcumulados() + 3);
                                e.setPartidosGanados(e.getPartidosGanados() + 1);
                                e.setTotalDeGolesAFavor(e.getTotalDeGolesAFavor() + golesLocal);
                                e.setTotalDeGolesEnContra(e.getTotalDeGolesEnContra() + golesVisitante);
                            }

                            if (e.getNombreDelEquipo().equalsIgnoreCase(visitante)) {
                                e.setPartidosPerdidos(e.getPartidosPerdidos() + 1);
                                e.setTotalDeGolesAFavor(e.getTotalDeGolesAFavor() + golesVisitante);
                                e.setTotalDeGolesEnContra(e.getTotalDeGolesEnContra() + golesLocal);
                            }
                        }
                    } else if (golesLocal < golesVisitante) {
                        for (Equipo e : liga.getEquipos()) {
                            if (e.getNombreDelEquipo().equalsIgnoreCase(visitante)) {
                                e.setPuntosAcumulados(e.getPuntosAcumulados() + 3);
                                e.setPartidosGanados(e.getPartidosGanados() + 1);
                                e.setTotalDeGolesAFavor(e.getTotalDeGolesAFavor() + golesVisitante);
                                e.setTotalDeGolesEnContra(e.getTotalDeGolesEnContra() + golesLocal);
                            }

                            if (e.getNombreDelEquipo().equalsIgnoreCase(local)) {
                                e.setPartidosPerdidos(e.getPartidosPerdidos() + 1);
                                e.setTotalDeGolesAFavor(e.getTotalDeGolesAFavor() + golesLocal);
                                e.setTotalDeGolesEnContra(e.getTotalDeGolesEnContra() + golesVisitante);
                            }
                        }
                    } else {
                        for (Equipo e : liga.getEquipos()) {
                            if (e.getNombreDelEquipo().equalsIgnoreCase(local)) {
                                e.setPuntosAcumulados(e.getPuntosAcumulados() + 1);
                                e.setPartidosEmpatados(e.getPartidosEmpatados() + 1);
                                e.setTotalDeGolesAFavor(e.getTotalDeGolesAFavor() + golesLocal);
                                e.setTotalDeGolesEnContra(e.getTotalDeGolesEnContra() + golesVisitante);
                            }

                            if (e.getNombreDelEquipo().equalsIgnoreCase(visitante)) {
                                e.setPuntosAcumulados(e.getPuntosAcumulados() + 1);
                                e.setPartidosEmpatados(e.getPartidosEmpatados() + 1);
                                e.setTotalDeGolesAFavor(e.getTotalDeGolesAFavor() + golesVisitante);
                                e.setTotalDeGolesEnContra(e.getTotalDeGolesEnContra() + golesLocal);
                            }
                        }
                    }
                }
            }
            liga.getEquipos().sort((Equipo e1, Equipo e2) -> {
                Integer primerOrden = e2.getPuntosAcumulados().compareTo(e1.getPuntosAcumulados());

                if (primerOrden == 0) {
                    Integer equipo1 = e1.getTotalDeGolesAFavor() - e1.getTotalDeGolesEnContra();
                    Integer equipo2 = e2.getTotalDeGolesAFavor() - e2.getTotalDeGolesEnContra();

                    return equipo2.compareTo(equipo1);
                }

                return primerOrden;
            });

            System.out.println("Los PUNTAJES han sido actualizados con éxito");
            System.out.println();
        }
    }

    // OCTAVA OPCIÓN
    public static void mostrarDatosDeEquipos(Liga liga) {
        // MOSTRAR DATOS DE EQUIPOS
        if (liga.getEquipos().get(0).getPartidosGanados() == 0 && liga.getEquipos().get(0).getPartidosEmpatados() == 0 && liga.getEquipos().get(0).getPartidosPerdidos() == 0) {
            System.out.println("La TEMPORADA aún no ha iniciado y/o los PUNTAJES no han sido actualizados");
            System.out.println();
        } else {
            for (int i = 0; i < 20; i++) {
                System.out.println(liga.getEquipos().get(i));
                System.out.println();
            }
        }
    }

    // NOVENA OPCIÓN
    public static void mostrarTablaDePosiciones(Liga liga) {
        // TABLA DE POSICIONES
        if (liga.getEquipos().get(0).getPartidosGanados() == 0 && liga.getEquipos().get(0).getPartidosEmpatados() == 0 && liga.getEquipos().get(0).getPartidosPerdidos() == 0) {
            System.out.println("La TEMPORADA aún no ha iniciado y/o los PUNTAJES no han sido actualizados");
            System.out.println();
        } else {
            String puntos, ganados, empatados, perdidos;

            System.out.println("[ EQUIPO ]          [ PUNTOS ] [ PG ] [ PE ] [ PP ] [ GF ] [ GC ]");
            for (Equipo e : liga.getEquipos()) {
                if (String.valueOf(e.getPuntosAcumulados()).length() == 1) {
                    puntos = e.getPuntosAcumulados() + " ";
                } else {
                    puntos = String.valueOf(e.getPuntosAcumulados());
                }

                if (String.valueOf(e.getPartidosGanados()).length() == 1) {
                    ganados = e.getPartidosGanados() + " ";
                } else {
                    ganados = String.valueOf(e.getPartidosGanados());
                }

                if (String.valueOf(e.getPartidosEmpatados()).length() == 1) {
                    empatados = e.getPartidosEmpatados() + " ";
                } else {
                    empatados = String.valueOf(e.getPartidosEmpatados());
                }

                if (String.valueOf(e.getPartidosPerdidos()).length() == 1) {
                    perdidos = e.getPartidosPerdidos() + " ";
                } else {
                    perdidos = String.valueOf(e.getPartidosPerdidos());
                }

                System.out.println(e.getNombreDelEquipo() + "    " + puntos + "       " + ganados + "     " + empatados + "     " + perdidos + "     " + e.getTotalDeGolesAFavor() + "     " + e.getTotalDeGolesEnContra());
            }
            System.out.println();
        }
    }
}
