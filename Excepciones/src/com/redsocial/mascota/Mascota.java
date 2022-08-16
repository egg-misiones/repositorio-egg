package com.redsocial.mascota;

import java.util.Date;

public class Mascota {

    private String nombre;
    private String tipoMascota;
    private String color;
    private String raza;
    private String sexo;
    private double peso;
    private double altura;
    private boolean vacuna;
    private boolean desparasitada;
    private Date fechaNacimiento;
    private Date fechaAlta;
    private Date fechaModificacion;

    public Mascota() {
    }

    public Mascota(String nombre, String tipoMascota, String color, String raza, String sexo, double peso, double altura, boolean vacuna, boolean desparasitada, Date fechaNacimiento) {
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.vacuna = vacuna;
        this.desparasitada = desparasitada;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }

    public void setDesparasitada(boolean desparasitada) {
        this.desparasitada = desparasitada;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public String getTipoMascota() {
        return tipoMascota;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isVacuna() {
        return vacuna;
    }

    public boolean isDesparasitada() {
        return desparasitada;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }
}
