package com.personal.servicio;

import com.empleado.Empleado;

public class PersonalDeServicio extends Empleado {

    private String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, Integer anioDeIncorporacion, Integer numeroDeDespacho, String nombre, String apellido, Integer dni, String estadoCivil) {
        super(anioDeIncorporacion, numeroDeDespacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void trasladoDeSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Sección: " + seccion;
    }
}
