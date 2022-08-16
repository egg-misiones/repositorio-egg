package com.herencia;

public final class Delfin extends Animal {

    public Delfin() {
    }

    public Delfin(String nombre, double peso, double tamanio) {
        super(nombre, peso, tamanio);
        asignarHabilidades();
    }

    @Override
    public void asignarHabilidades() {
        habilidades.add("CANTAR");
        habilidades.add("SALTAR");
        habilidades.add("SALUDAR");
    }

    @Override
    public void alimentar(Stock stock, Integer habilidad) {
        switch (habilidad) {
            case 1:
                if ((Stock.getPulpos() - 10) < 0) {
                    System.out.println("No hay suficiente alimento para realizar el truco solicitado");
                    System.out.println();
                } else {
                    Stock.setPulpos(Stock.getPulpos() - 10);
                    System.out.println(nombre + " puedo realizar el truco de " + habilidades.get(0));
                    System.out.println(nombre + " recibió 10 kg");
                    System.out.println();
                }
                break;
            case 2:
                if ((Stock.getPulpos() - 5) < 0) {
                    System.out.println("No hay suficiente alimento para realizar el truco solicitado");
                    System.out.println();
                } else {
                    Stock.setPulpos(Stock.getPulpos() - 5);
                    System.out.println(nombre + " puedo realizar el truco de " + habilidades.get(1));
                    System.out.println(nombre + " recibió 5 kg");
                    System.out.println();
                }
                break;
            case 3:
                if ((Stock.getPulpos() - 8) < 0) {
                    System.out.println("No hay suficiente alimento para realizar el truco solicitado");
                    System.out.println();
                } else {
                    Stock.setPulpos(Stock.getPulpos() - 8);
                    System.out.println(nombre + " puedo realizar el truco de " + habilidades.get(2));
                    System.out.println(nombre + " recibió 8 kg");
                    System.out.println();
                }
                break;
        }
    }
}
