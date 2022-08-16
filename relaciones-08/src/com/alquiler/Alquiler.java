package com.alquiler;

import com.barco.Barco;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alquiler {

    private String nombre;
    private Integer numeroDocumento;
    private Date fechaInicial;
    private Date fechaFinal;
    private Integer posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer numeroDocumento, Date fechaInicial, Date fechaFinal, Integer posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public double calcularAlquiler() {
        return diasDeOcupacion() * barco.calcularModulo() * 2;
    }

    public int diasDeOcupacion() {
        GregorianCalendar primeraFecha = new GregorianCalendar();
        GregorianCalendar ultimaFecha = new GregorianCalendar();
        primeraFecha.setTime(fechaInicial);
        ultimaFecha.setTime(fechaFinal);

        long milisegundos1 = primeraFecha.getTimeInMillis();
        long milisegundos2 = ultimaFecha.getTimeInMillis();

        int dias = (int) (Math.abs(milisegundos1 - milisegundos2) / (1000 * 60 * 60 * 24));

        return dias == 0 ? 1 : dias;
    }
}
