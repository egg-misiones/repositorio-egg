package Ejercicio04;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {

    private String nombre;
    private String apellido;
    private int nroLegajo;
    private char sexo;
    private String condicion;
    private int notaFinal;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.apellido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int nroLegajo, char sexo, String condicion, int notaFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroLegajo = nroLegajo;
        this.sexo = sexo;
        this.condicion = condicion;
        this.notaFinal = notaFinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public char getSexo() {
        return sexo;
    }

    public String getCondicion() {
        return condicion;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    @Override
    public int compareTo(Alumno alumno) {
        if (notaFinal > alumno.notaFinal) {
            return -1;
        } else if (notaFinal < alumno.notaFinal) {
            return 1;
        } else {
            return 0;
        }
    }
}
