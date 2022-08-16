package com.lavadora;

import com.electrodomestico.Electrodomestico;

public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
        super();
        carga = 5;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        carga = 5;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precioPlusLavadora = 0;

        if (carga > 0 && carga <= 30) {
            precioPlusLavadora = super.precioFinal();
        } else {
            precioPlusLavadora = super.precioFinal() + 500;
        }

        return precioPlusLavadora;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Carga: " + carga;
    }
}
