package com.empleado;

import com.persona.Persona;

public abstract class Empleado extends Persona {

    protected Integer anioDeIncorporacion;
    protected Integer numeroDeDespacho;

    public Empleado() {
    }

    public Empleado(Integer anioDeIncorporacion, Integer numeroDeDespacho, String nombre, String apellido, Integer dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioDeIncorporacion = anioDeIncorporacion;
        this.numeroDeDespacho = numeroDeDespacho;
    }

    public void setAnioDeIncorporacion(Integer anioDeIncorporacion) {
        this.anioDeIncorporacion = anioDeIncorporacion;
    }

    public void setNumeroDeDespacho(Integer numeroDeDespacho) {
        this.numeroDeDespacho = numeroDeDespacho;
    }

    public Integer getAnioDeIncorporacion() {
        return anioDeIncorporacion;
    }

    public Integer getNumeroDeDespacho() {
        return numeroDeDespacho;
    }

    public void reasignacionDeDespacho(Integer numeroDeDespacho) {
        this.numeroDeDespacho = numeroDeDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Año de incorporación: " + anioDeIncorporacion + "\n"
                + "Número de despacho: " + numeroDeDespacho;
    }
}
