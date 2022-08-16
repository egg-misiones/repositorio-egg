package com.herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Animal> animales = new ArrayList<>();
        ArrayList<Animal> animalesShow = new ArrayList<>();
        animales.add(new Delfin("PUPI", 35, 1.20));
        animales.add(new Delfin("ROCKY", 35, 1.25));
        animales.add(new Delfin("PERLA", 40, 1.30));
        animales.add(new Delfin("DOLLY", 45, 1.35));
        animales.add(new LoboMarino("TOM", 40, 1.48));
        animales.add(new LoboMarino("RICK", 50, 1.52));
        animales.add(new LoboMarino("ROCO", 60, 1.64));
        animales.add(new LoboMarino("MORTY", 70, 1.70));
        animales.add(new Orca("AMELIA", 75, 1.72));
        animales.add(new Orca("PÍA", 80, 1.78));
        animales.add(new Orca("FLUFFY", 85, 1.82));
        animales.add(new Orca("CAROL", 90, 1.88));
        int primeraRespuesta = 0;

        do {
            if (animales.isEmpty()) {
                System.out.println("Ya no quedan más animales");
                System.out.println();
                break;
            } else {
                System.out.println("ANIMALES");
                System.out.println();
                for (int i = 0; i < animales.size(); i++) {
                    if (animales.get(i) instanceof Delfin) {
                        System.out.println((i + 1) + ". " + animales.get(i).getNombre() + " (DELFÍN)");
                    }
                    if (animales.get(i) instanceof LoboMarino) {
                        System.out.println((i + 1) + ". " + animales.get(i).getNombre() + " (LOBO MARINO)");
                    }
                    if (animales.get(i) instanceof Orca) {
                        System.out.println((i + 1) + ". " + animales.get(i).getNombre() + " (ORCA)");
                    }
                }
                System.out.println((animales.size() + 1) + ". SALIR");
                System.out.println();
                System.out.println("Seleccione los animales que participarán de show: ");
                primeraRespuesta = entrada.nextInt();
                if (primeraRespuesta >= 1 && primeraRespuesta <= animales.size()) {
                    animalesShow.add(animales.get(primeraRespuesta - 1));
                    animales.remove(primeraRespuesta - 1);
                    primeraRespuesta--;
                } else if (primeraRespuesta == animales.size() + 1) {
                    System.out.println("Operación finalizada");
                    System.out.println();
                } else {
                    System.out.println("El número ingresado es inválido");
                    System.out.println();
                }
            }
        } while (primeraRespuesta != (animales.size() + 1));

        ArrayList<Entrenador> entrenadores = new ArrayList<>();
        crearListaEntrenadores(entrenadores, animalesShow.size());
        asignarEntrenador(entrenadores, animalesShow);

        ArrayList<Cuidador> cuidadores = new ArrayList<>();
        Stock stock = new Stock();
        Stock.setCalamares(65);
        Stock.setCangrejos(45);
        Stock.setPulpos(55);
        cuidadores.add(new Cuidador("Ramiro", "10:00", "18.00", 4, stock));
        cuidadores.add(new Cuidador("Jeremías", "10:00", "18.00", 4, stock));
        cuidadores.add(new Cuidador("Sebastián", "10:00", "18.00", 4, stock));
        asignarCuidadores(cuidadores, animalesShow);
        int segundaRespuesta = 0;
        int terceraRespuesta = 0;

        do {
            System.out.println("MUNDO MARINO");
            System.out.println();
            for (int i = 0; i < animalesShow.size(); i++) {
                if (animalesShow.get(i) instanceof Delfin) {
                    System.out.println((i + 1) + ". " + animalesShow.get(i).getNombre() + " (DELFÍN)");
                }
                if (animalesShow.get(i) instanceof LoboMarino) {
                    System.out.println((i + 1) + ". " + animalesShow.get(i).getNombre() + " (LOBO MARINO)");
                }
                if (animalesShow.get(i) instanceof Orca) {
                    System.out.println((i + 1) + ". " + animalesShow.get(i).getNombre() + " (ORCA)");
                }
            }
            System.out.println((animalesShow.size() + 1) + ". SALIR");
            System.out.println();
            System.out.println("Elija un animal: ");
            segundaRespuesta = entrada.nextInt();
            if (segundaRespuesta >= 1 && segundaRespuesta <= animalesShow.size()) {
                do {
                    System.out.println("HABILIDADES");
                    System.out.println();
                    for (int i = 0; i < animalesShow.get(segundaRespuesta - 1).habilidades.size(); i++) {
                        System.out.println((i + 1) + ". " + animalesShow.get(segundaRespuesta - 1).habilidades.get(i));
                    }
                    System.out.println((animalesShow.get(segundaRespuesta - 1).habilidades.size() + 1) + ". SALIR");
                    System.out.println();
                    System.out.println("Elija una habilidad: ");
                    terceraRespuesta = entrada.nextInt();
                    if (terceraRespuesta >= 1 && terceraRespuesta <= animalesShow.get(segundaRespuesta - 1).habilidades.size()) {
                        System.out.println(cuidadores.get(0).getStock());
                        System.out.println();
                        for (int i = 0; i < cuidadores.size(); i++) {
                            for (int j = 0; j < cuidadores.get(i).getAnimales().size(); j++) {
                                if (cuidadores.get(i).getAnimales().get(j).nombre.equalsIgnoreCase(animalesShow.get(segundaRespuesta - 1).nombre)) {
                                    cuidadores.get(i).getAnimales().get(j).alimentar(cuidadores.get(i).getStock(), terceraRespuesta);
                                    System.out.println(cuidadores.get(i).getStock());
                                    System.out.println();
                                    break;
                                }
                            }
                        }
                    } else if (terceraRespuesta == animalesShow.get(0).habilidades.size() + 1) {
                        System.out.println("Operación finalizada");
                        System.out.println();
                    } else {
                        System.out.println("El número ingresado es inválido");
                        System.out.println();
                    }
                } while (terceraRespuesta != animalesShow.get(segundaRespuesta - 1).habilidades.size() + 1);
            } else if (segundaRespuesta == animalesShow.size() + 1) {
                System.out.println("Operación finalizada");
                System.out.println();
            } else {
                System.out.println("El número ingresado es inválido");
                System.out.println();
            }
        } while (segundaRespuesta != animalesShow.size() + 1);
    }

    public static void crearListaEntrenadores(ArrayList<Entrenador> entrenadores, int tamanio) {
        String[] nombres = {"Cristian", "Matías", "Mario", "Roberto", "Esteban",
            "Rodrigo", "Daniel", "Darío", "Gabriel", "Andrés", "Pedro", "Ricardo"};

        for (int i = 0; i < tamanio; i++) {
            entrenadores.add(new Entrenador(nombres[i], "08:00", "16:00", 2));
        }
    }

    public static void asignarEntrenador(ArrayList<Entrenador> entrenadores, ArrayList<Animal> animalesShow) {
        for (int i = 0; i < animalesShow.size(); i++) {
            animalesShow.get(i).setEntrenador(entrenadores.get(i));
            entrenadores.get(i).setAnimal(animalesShow.get(i));
        }
    }

    public static void asignarCuidadores(ArrayList<Cuidador> cuidadores, ArrayList<Animal> animalesShow) {
        int contador = 0;

        for (int i = 0; i < animalesShow.size(); i++) {
            if (cuidadores.get(contador).getAnimales().size() == cuidadores.get(contador).getCantidadDeAnimales()) {
                contador++;
            }
            cuidadores.get(contador).getAnimales().add(animalesShow.get(i));
            animalesShow.get(i).setCuidador(cuidadores.get(contador));
        }
    }
}
