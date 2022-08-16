package com.herencia;

public class Entrenador extends Empleado {

    private Integer aniosDeExperiencia;
    private Animal animal;

    public Entrenador() {
    }

    public Entrenador(String nombre, String horarioDeEntrada, String horarioDeSalida, Integer aniosDeExperiencia) {
        super(nombre, horarioDeEntrada, horarioDeSalida);
        this.aniosDeExperiencia = aniosDeExperiencia;
    }

    public void setAniosDeExperiencia(Integer aniosDeExperiencia) {
        this.aniosDeExperiencia = aniosDeExperiencia;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Integer getAniosDeExperiencia() {
        return aniosDeExperiencia;
    }

    public Animal getAnimal() {
        return animal;
    }
}
