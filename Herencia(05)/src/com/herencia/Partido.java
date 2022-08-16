package com.herencia;

public class Partido {

    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesDelEquipoLocal;
    private int golesDelEquipoVisitante;

    public Partido() {
        equipoLocal = new Equipo();
        equipoVisitante = new Equipo();
        golesDelEquipoLocal = 0;
        golesDelEquipoVisitante = 0;
    }

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesDelEquipoLocal, int golesDelEquipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesDelEquipoLocal = golesDelEquipoLocal;
        this.golesDelEquipoVisitante = golesDelEquipoVisitante;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public void setGolesDelEquipoLocal(int golesDelEquipoLocal) {
        this.golesDelEquipoLocal = golesDelEquipoLocal;
    }

    public void setGolesDelEquipoVisitante(int golesDelEquipoVisitante) {
        this.golesDelEquipoVisitante = golesDelEquipoVisitante;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesDelEquipoLocal() {
        return golesDelEquipoLocal;
    }

    public int getGolesDelEquipoVisitante() {
        return golesDelEquipoVisitante;
    }

    @Override
    public String toString() {
        return equipoLocal.getNombreDelEquipo() + " (" + golesDelEquipoLocal + ")" + " - " + equipoVisitante.getNombreDelEquipo() + " (" + golesDelEquipoVisitante + ")";
    }
}
