package com.herencia;

import java.util.ArrayList;

public class Cuidador extends Empleado {

    private Integer cantidadDeAnimales;
    private ArrayList<Animal> animales;
    private Stock stock;

    public Cuidador() {
        animales = new ArrayList<>();
    }

    public Cuidador(String nombre, String horarioDeEntrada, String horarioDeSalida, Integer cantidadDeAnimales, Stock stock) {
        super(nombre, horarioDeEntrada, horarioDeSalida);
        this.cantidadDeAnimales = cantidadDeAnimales;
        animales = new ArrayList<>();
        this.stock = stock;
    }

    public void setCantidadDeAnimales(Integer cantidadDeAnimales) {
        this.cantidadDeAnimales = cantidadDeAnimales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Integer getCantidadDeAnimales() {
        return cantidadDeAnimales;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public Stock getStock() {
        return stock;
    }
}
