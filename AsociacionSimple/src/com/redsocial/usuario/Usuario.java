package com.redsocial.usuario;

import java.util.Date;

public class Usuario {

    private String correoElectronico;
    private String clave;
    private Date fechaAlta;
    private Date fechaModificacion;

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getClave() {
        return clave;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }
}
