package com.herencia;

public final class Orca extends Animal {

    public Orca() {
    }

    public Orca(String nombre, double peso, double tamanio) {
        super(nombre, peso, tamanio);
        asignarHabilidades();
    }

    @Override
    public void asignarHabilidades() {
        habilidades.add("HABLAR");
        habilidades.add("SALTAR");
        habilidades.add("SALUDAR");
    }

    @Override
    public void alimentar(Stock stock, Integer habilidad) {
        switch (habilidad) {
            case 1:
                if ((Stock.getCalamares() - 12) < 0) {
                    System.out.println("No hay suficiente alimento para realizar el truco solicitado");
                    System.out.println();
                } else {
                    Stock.setCalamares(Stock.getCalamares() - 12);
                    System.out.println(nombre + " puedo realizar el truco de " + habilidades.get(0));
                    System.out.println(nombre + " recibió 12 kg");
                    System.out.println();
                }
                break;
            case 2:
                if ((Stock.getCalamares() - 5) < 0) {
                    System.out.println("No hay suficiente alimento para realizar el truco solicitado");
                    System.out.println();
                } else {
                    Stock.setCalamares(Stock.getCalamares() - 5);
                    System.out.println(nombre + " puedo realizar el truco de " + habilidades.get(1));
                    System.out.println(nombre + " recibió 5 kg");
                    System.out.println();
                }
                break;
            case 3:
                if ((Stock.getCalamares() - 7.5) < 0) {
                    System.out.println("No hay suficiente alimento para realizar el truco solicitado");
                    System.out.println();
                } else {
                    Stock.setCalamares(Stock.getCalamares() - 7.5);
                    System.out.println(nombre + " puedo realizar el truco de " + habilidades.get(2));
                    System.out.println(nombre + " recibió 7.5 kg");
                    System.out.println();
                }
                break;
        }
    }
}
