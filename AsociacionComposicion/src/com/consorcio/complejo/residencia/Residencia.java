package com.consorcio.complejo.residencia;

import java.util.Date;

public class Residencia {

    private String duenioResidencia;
    private String tipoResidencia;
    private String numeracionResidencia;
    private double costoExpensas;
    private Date fechaAlta;
    private Date fechaModificacion;

    public void setDuenioResidencia(String duenioResidencia) {
        this.duenioResidencia = duenioResidencia;
    }

    public void setTipoResidencia(String tipoResidencia) {
        this.tipoResidencia = tipoResidencia;
    }

    public void setNumeracionResidencia(String numeracionResidencia) {
        this.numeracionResidencia = numeracionResidencia;
    }

    public void setCostoExpensas(double costoExpensas) {
        this.costoExpensas = costoExpensas;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getDuenioResidencia() {
        return duenioResidencia;
    }

    public String getTipoResidencia() {
        return tipoResidencia;
    }

    public String getNumeracionResidencia() {
        return numeracionResidencia;
    }

    public double getCostoExpensas() {
        return costoExpensas;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }
}
