package com.herencia;

public class Equipo {

    private String nombreDelEquipo;
    private Integer puntosAcumulados;
    private Integer partidosGanados;
    private Integer partidosEmpatados;
    private Integer partidosPerdidos;
    private Integer totalDeGolesAFavor;
    private Integer totalDeGolesEnContra;
    private Liga liga;

    public Equipo() {
        nombreDelEquipo = null;
        puntosAcumulados = 0;
        partidosGanados = 0;
        partidosEmpatados = 0;
        partidosPerdidos = 0;
        totalDeGolesAFavor = 0;
        totalDeGolesEnContra = 0;
        liga = null;
    }

    public Equipo(String nombreDelEquipo) {
        this.nombreDelEquipo = nombreDelEquipo;
        puntosAcumulados = 0;
        partidosGanados = 0;
        partidosEmpatados = 0;
        partidosPerdidos = 0;
        totalDeGolesAFavor = 0;
        totalDeGolesEnContra = 0;
        liga = null;
    }

    public Equipo(String nombreDelEquipo, Integer puntosAcumulados, Integer partidosGanados, Integer partidosEmpatados, Integer partidosPerdidos, Integer totalDeGolesAFavor, Integer totalDeGolesEnContra, Liga liga) {
        this.nombreDelEquipo = nombreDelEquipo;
        this.puntosAcumulados = puntosAcumulados;
        this.partidosGanados = partidosGanados;
        this.partidosEmpatados = partidosEmpatados;
        this.partidosPerdidos = partidosPerdidos;
        this.totalDeGolesAFavor = totalDeGolesAFavor;
        this.totalDeGolesEnContra = totalDeGolesEnContra;
        this.liga = liga;
    }

    public void setNombreDelEquipo(String nombreDelEquipo) {
        this.nombreDelEquipo = nombreDelEquipo;
    }

    public void setPuntosAcumulados(Integer puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public void setPartidosGanados(Integer partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public void setPartidosEmpatados(Integer partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public void setPartidosPerdidos(Integer partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public void setTotalDeGolesAFavor(Integer totalDeGolesAFavor) {
        this.totalDeGolesAFavor = totalDeGolesAFavor;
    }

    public void setTotalDeGolesEnContra(Integer totalDeGolesEnContra) {
        this.totalDeGolesEnContra = totalDeGolesEnContra;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public String getNombreDelEquipo() {
        return nombreDelEquipo;
    }

    public Integer getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public Integer getPartidosGanados() {
        return partidosGanados;
    }

    public Integer getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public Integer getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public Integer getTotalDeGolesAFavor() {
        return totalDeGolesAFavor;
    }

    public Integer getTotalDeGolesEnContra() {
        return totalDeGolesEnContra;
    }

    public Liga getLiga() {
        return liga;
    }

    @Override
    public String toString() {
        return nombreDelEquipo.toUpperCase() + "\n"
                + "Puntos acumulados: " + puntosAcumulados + "\n"
                + "Partidos ganados: " + partidosGanados + "\n"
                + "Partidos empatados: " + partidosEmpatados + "\n"
                + "Partidos perdidos: " + partidosPerdidos + "\n"
                + "Total de goles a favor: " + totalDeGolesAFavor + "\n"
                + "Total de goles en contra: " + totalDeGolesEnContra;
    }
}
