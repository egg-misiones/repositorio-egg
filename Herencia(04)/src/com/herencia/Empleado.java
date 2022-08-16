package com.herencia;

public abstract class Empleado {

    protected String nombre;
    protected String horarioDeEntrada;
    protected String horarioDeSalida;

    public Empleado() {
    }

    public Empleado(String nombre, String horarioDeEntrada, String horarioDeSalida) {
        this.nombre = nombre;
        this.horarioDeEntrada = horarioDeEntrada;
        this.horarioDeSalida = horarioDeSalida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorarioDeEntrada(String horarioDeEntrada) {
        this.horarioDeEntrada = horarioDeEntrada;
    }

    public void setHorarioDeSalida(String horarioDeSalida) {
        this.horarioDeSalida = horarioDeSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorarioDeEntrada() {
        return horarioDeEntrada;
    }

    public String getHorarioDeSalida() {
        return horarioDeSalida;
    }
}
