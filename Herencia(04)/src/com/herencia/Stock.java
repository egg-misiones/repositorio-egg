package com.herencia;

public class Stock {

    private static double calamares;
    private static double pulpos;
    private static double cangrejos;

    public Stock() {
    }

    public static void setCalamares(double calamares) {
        Stock.calamares = calamares;
    }

    public static void setPulpos(double pulpos) {
        Stock.pulpos = pulpos;
    }

    public static void setCangrejos(double cangrejos) {
        Stock.cangrejos = cangrejos;
    }

    public static double getCalamares() {
        return calamares;
    }

    public static double getPulpos() {
        return pulpos;
    }

    public static double getCangrejos() {
        return cangrejos;
    }

    @Override
    public String toString() {
        return "STOCK" + "\n"
                + "Calamares: " + calamares + " kg" + "\n"
                + "Pulpos: " + pulpos + " kg" + "\n"
                + "Cangrejos: " + cangrejos + " kg";
    }
}
