package com.redsocial.usuario.zona;

import com.redsocial.usuario.Usuario;
import java.util.ArrayList;
import java.util.Date;

public class Zona {

    private String descripcion;
    private ArrayList<Usuario> usuarios = new ArrayList();
    private Date fechaAlta;
    private Date fechaModificacion;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
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

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }
}
