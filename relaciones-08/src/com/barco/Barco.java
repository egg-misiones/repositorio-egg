package com.barco;

public class Barco {

    protected Integer matricula;
    protected double eslora;
    protected Integer anioFabricacion;

    public Barco() {
    }

    public Barco(Integer matricula, double eslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public double calcularModulo() {
        return 10 * eslora;
    }

    @Override
    public String toString() {
        return "BARCO" + "\n"
                + "Matrícula: " + matricula + "\n"
                + "Eslora: " + eslora + "\n"
                + "Año de fabricación: " + anioFabricacion;
    }
}
