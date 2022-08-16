package com.herencia;

public final class LoboMarino extends Animal {

    public LoboMarino() {
    }

    public LoboMarino(String nombre, double peso, double tamanio) {
        super(nombre, peso, tamanio);
        asignarHabilidades();
    }

    @Override
    public void asignarHabilidades() {
        habilidades.add("GIRAR");
        habilidades.add("SALTAR");
        habilidades.add("SALUDAR");
    }

    @Override
    public void alimentar(Stock stock, Integer habilidad) {
        switch (habilidad) {
            case 1:
                if ((Stock.getCangrejos() - 7.5) < 0) {
                    System.out.println("No hay suficiente alimento para realizar el truco solicitado");
                    System.out.println();
                } else {
                    Stock.setCangrejos(Stock.getCangrejos() - 7.5);
                    System.out.println(nombre + " puedo realizar el truco de " + habilidades.get(0));
                    System.out.println(nombre + " recibió 7.5 kg");
                    System.out.println();
                }
                break;
            case 2:
                if ((Stock.getCangrejos() - 5) < 0) {
                    System.out.println("No hay suficiente alimento para realizar el truco solicitado");
                    System.out.println();
                } else {
                    Stock.setCangrejos(Stock.getCangrejos() - 5);
                    System.out.println(nombre + " puedo realizar el truco de " + habilidades.get(1));
                    System.out.println(nombre + " recibió 5 kg");
                    System.out.println();
                }
                break;
            case 3:
                if ((Stock.getCangrejos() - 10) < 0) {
                    System.out.println("No hay suficiente alimento para realizar el truco solicitado");
                    System.out.println();
                } else {
                    Stock.setCangrejos(Stock.getCangrejos() - 10);
                    System.out.println(nombre + " puedo realizar el truco de " + habilidades.get(2));
                    System.out.println(nombre + " recibió 10 kg");
                    System.out.println();
                }
                break;
        }
    }
}
