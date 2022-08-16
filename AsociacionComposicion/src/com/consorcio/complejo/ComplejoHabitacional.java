package com.consorcio.complejo;

import com.consorcio.complejo.residencia.Residencia;
import java.util.ArrayList;
import java.util.Date;

public class ComplejoHabitacional {

    private String nombre;
    private String direccion;
    private String tipoComplejo;
    private ArrayList<Residencia> residencias = new ArrayList();
    private Date fechaAlta;
    private Date fechaModificacion;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipoComplejo(String tipoComplejo) {
        this.tipoComplejo = tipoComplejo;
    }

    public void setResidencias(ArrayList<Residencia> residencias) {
        this.residencias = residencias;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipoComplejo() {
        return tipoComplejo;
    }

    public ArrayList<Residencia> getResidencias() {
        return residencias;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }
}
