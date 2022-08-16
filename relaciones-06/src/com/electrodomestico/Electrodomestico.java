package com.electrodomestico;

public class Electrodomestico {

    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        precioBase = 1000;
        color = "BLANCO";
        consumoEnergetico = 'F';
        peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        color = "BLANCO";
        consumoEnergetico = 'F';
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(char consumoEnergetico) {
        consumoEnergetico = Character.toUpperCase(consumoEnergetico);

        if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D' || consumoEnergetico == 'E' || consumoEnergetico == 'F') {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {
        String[] colores = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        color = color.toUpperCase();

        for (int i = 0; i < colores.length; i++) {
            if (color.equals(colores[i])) {
                this.color = color;
                break;
            } else {
                this.color = "BLANCO";
            }
        }
    }

    public double precioFinal() {
        double precioPlusElectrodomestico = 0;

        switch (consumoEnergetico) {
            case 'A':
                precioPlusElectrodomestico += 1000;
                break;
            case 'B':
                precioPlusElectrodomestico += 800;
                break;
            case 'C':
                precioPlusElectrodomestico += 600;
                break;
            case 'D':
                precioPlusElectrodomestico += 500;
                break;
            case 'E':
                precioPlusElectrodomestico += 300;
                break;
            case 'F':
                precioPlusElectrodomestico += 100;
                break;
        }

        if (peso > 0 && peso < 20) {
            precioPlusElectrodomestico += 100;
        } else if (peso >= 20 && peso < 50) {
            precioPlusElectrodomestico += 500;
        } else if (peso >= 50 && peso < 80) {
            precioPlusElectrodomestico += 800;
        } else {
            precioPlusElectrodomestico += 1000;
        }

        return precioBase + precioPlusElectrodomestico;
    }

    @Override
    public String toString() {
        return "Precio base: " + precioBase + "\n"
                + "Color: " + color + "\n"
                + "Consumo energético: " + consumoEnergetico + "\n"
                + "Peso: " + peso;
    }
}
