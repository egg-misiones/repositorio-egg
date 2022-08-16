package com.polideportivo;

import com.interfaz.Edificio;
import com.interfaz.InstalacionDeportiva;

public class Polideportivo implements InstalacionDeportiva, Edificio {

    private String nombre;
    private String tipoDeInstalacion;
    private double superficie;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoDeInstalacion, double superficie) {
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
        this.superficie = superficie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSuperficie() {
        return superficie;
    }

    @Override
    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }
}
