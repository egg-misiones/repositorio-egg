package Ejercicio17;

import java.util.Scanner;

public class MesesService {

    public Meses crearMeses() {
        Meses meses = new Meses();

        return meses;
    }

    public void leer(Meses meses) {
        Scanner entrada = new Scanner(System.in);
        String mes;

        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        mes = entrada.nextLine();

        while (!meses.getMesSecreto().equals(mes)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            mes = entrada.nextLine();
        }

        System.out.println("¡Ha acertado!");
    }
}
