package com.herencia;

import java.util.ArrayList;

public final class Liga {

    private String nombreDeLiga;
    private ArrayList<String> nombresDeEquipos;
    private ArrayList<Equipo> equipos;
    private ArrayList<Fecha> fechas;

    public Liga(Integer respuesta) {
        asignarNombreDeLiga(respuesta);
        nombresDeEquipos = new ArrayList<>();
        asignarNombresDeEquipos();
        equipos = new ArrayList<>();
        asignarEquipos();
        fechas = new ArrayList<>();
        crearCantidadDeFechas();
    }

    public void setNombreDeLiga(String nombreDeLiga) {
        this.nombreDeLiga = nombreDeLiga;
    }

    public void setNombresDeEquipos(ArrayList<String> nombresDeEquipos) {
        this.nombresDeEquipos = nombresDeEquipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public void setFechas(ArrayList<Fecha> fechas) {
        this.fechas = fechas;
    }

    public String getNombreDeLiga() {
        return nombreDeLiga;
    }

    public ArrayList<String> getNombresDeEquipos() {
        return nombresDeEquipos;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public ArrayList<Fecha> getFechas() {
        return fechas;
    }

    public void asignarNombreDeLiga(Integer respuesta) {
        switch (respuesta) {
            case 1:
                nombreDeLiga = "PREMIER LEAGUE";
                break;
            case 2:
                nombreDeLiga = "LA LIGA";
                break;
            case 3:
                nombreDeLiga = "SERIE A";
                break;
            case 4:
                nombreDeLiga = "PRIMERA DIVISIÓN";
                break;
        }
    }

    public void asignarNombresDeEquipos() {
        switch (nombreDeLiga) {
            case "PREMIER LEAGUE":
                nombresDeEquipos.add("Manchester City     ");
                nombresDeEquipos.add("Manchester United   ");
                nombresDeEquipos.add("Leicester City      ");
                nombresDeEquipos.add("West Ham            ");
                nombresDeEquipos.add("Chelsea             ");
                nombresDeEquipos.add("Liverpool           ");
                nombresDeEquipos.add("Everton             ");
                nombresDeEquipos.add("Aston Villa         ");
                nombresDeEquipos.add("Tottenham           ");
                nombresDeEquipos.add("Leeds               ");
                nombresDeEquipos.add("Arsenal             ");
                nombresDeEquipos.add("Wolves              ");
                nombresDeEquipos.add("Crystal Palace      ");
                nombresDeEquipos.add("Southampton         ");
                nombresDeEquipos.add("Burnley             ");
                nombresDeEquipos.add("Brighton            ");
                nombresDeEquipos.add("Newcastle           ");
                nombresDeEquipos.add("Fulham              ");
                nombresDeEquipos.add("Albion              ");
                nombresDeEquipos.add("Sheffield United    ");
                break;
            case "LA LIGA":
                nombresDeEquipos.add("Atlético Madrid     ");
                nombresDeEquipos.add("Barcelona           ");
                nombresDeEquipos.add("Real Madrid         ");
                nombresDeEquipos.add("Sevilla             ");
                nombresDeEquipos.add("Real Sociedad       ");
                nombresDeEquipos.add("Villarreal          ");
                nombresDeEquipos.add("Betis               ");
                nombresDeEquipos.add("Levante             ");
                nombresDeEquipos.add("Athletic de Bilbao  ");
                nombresDeEquipos.add("Granada             ");
                nombresDeEquipos.add("Celta de Vigo       ");
                nombresDeEquipos.add("Osasuna             ");
                nombresDeEquipos.add("Getafe              ");
                nombresDeEquipos.add("Valencia            ");
                nombresDeEquipos.add("Cádiz               ");
                nombresDeEquipos.add("Eibar               ");
                nombresDeEquipos.add("Alavés              ");
                nombresDeEquipos.add("Valladolid          ");
                nombresDeEquipos.add("Elche               ");
                nombresDeEquipos.add("Huesca              ");
                break;
            case "SERIE A":
                nombresDeEquipos.add("Inter               ");
                nombresDeEquipos.add("Milan               ");
                nombresDeEquipos.add("Juventus            ");
                nombresDeEquipos.add("Roma                ");
                nombresDeEquipos.add("Atalanta            ");
                nombresDeEquipos.add("Lazio               ");
                nombresDeEquipos.add("Napoli              ");
                nombresDeEquipos.add("Sassuolo            ");
                nombresDeEquipos.add("Hellas Verona       ");
                nombresDeEquipos.add("Sampdoria           ");
                nombresDeEquipos.add("Bologna             ");
                nombresDeEquipos.add("Genoa               ");
                nombresDeEquipos.add("Udinese             ");
                nombresDeEquipos.add("Fiorentina          ");
                nombresDeEquipos.add("Benevento           ");
                nombresDeEquipos.add("Spezia              ");
                nombresDeEquipos.add("Torino              ");
                nombresDeEquipos.add("Cagliari            ");
                nombresDeEquipos.add("Parma               ");
                nombresDeEquipos.add("Crotone             ");
                break;
            case "PRIMERA DIVISIÓN":
                nombresDeEquipos.add("River               ");
                nombresDeEquipos.add("Boca                ");
                nombresDeEquipos.add("Independiente       ");
                nombresDeEquipos.add("Racing              ");
                nombresDeEquipos.add("Estudiantes         ");
                nombresDeEquipos.add("Colón               ");
                nombresDeEquipos.add("San Lorenzo         ");
                nombresDeEquipos.add("Godoy Cruz          ");
                nombresDeEquipos.add("Arsenal             ");
                nombresDeEquipos.add("Banfield            ");
                nombresDeEquipos.add("Vélez               ");
                nombresDeEquipos.add("Lanús               ");
                nombresDeEquipos.add("Huracán             ");
                nombresDeEquipos.add("Rosario Central     ");
                nombresDeEquipos.add("Argentinos          ");
                nombresDeEquipos.add("Newell's            ");
                nombresDeEquipos.add("Atlético Tucumán    ");
                nombresDeEquipos.add("Gimnasia            ");
                nombresDeEquipos.add("Aldosivi            ");
                nombresDeEquipos.add("Unión               ");
                break;
        }
    }

    public void asignarEquipos() {
        for (int i = 0; i < 20; i++) {
            equipos.add(new Equipo(nombresDeEquipos.get(i)));
        }
    }

    public void crearCantidadDeFechas() {
        for (int i = 0; i < 19; i++) {
            fechas.add(new Fecha());
        }
    }
}
