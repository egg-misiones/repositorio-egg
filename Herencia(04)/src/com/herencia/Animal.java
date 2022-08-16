package com.herencia;

import java.util.ArrayList;

public abstract class Animal {

    protected String nombre;
    protected double peso;
    protected double tamanio;
    protected ArrayList<String> habilidades;
    protected Entrenador entrenador;
    protected Cuidador cuidador;

    public Animal() {
        habilidades = new ArrayList<>();
    }

    public Animal(String nombre, double peso, double tamanio) {
        this.nombre = nombre;
        this.peso = peso;
        this.tamanio = tamanio;
        habilidades = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getTamanio() {
        return tamanio;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public abstract void asignarHabilidades();

    public abstract void alimentar(Stock stock, Integer habilidad);
}
