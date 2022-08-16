package com.redsocial.usuario.zona;

import java.util.Date;

public class Zona {

    private String descripcion;
    private Date fechaAlta;
    private Date fechaModificacion;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }
}
