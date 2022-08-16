package Guia01;

import java.util.ArrayList;

public class Ejemplo02 {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Franco");
        nombres.add("Cristian");
        nombres.add("Andrea");
        nombres.add("Mauro");
        nombres.add("Antonio");

        nombres.forEach((valor) -> System.out.println(valor));

        System.out.println();
        nombres.sort((valor1, valor2) -> (valor1.compareTo(valor2)));

        nombres.forEach((valor) -> System.out.println(valor));

        String nombreYApellido = "Lorena Riorda";
        String nombre = "";
        String apellido = "";

        for (int i = 0; i < nombreYApellido.length(); i++) {
            nombre += nombreYApellido.substring(i, i + 1);
            if (nombreYApellido.substring(i, i + 1).equalsIgnoreCase(" ")) {
                break;
            }
        }

        for (int i = nombre.length(); i < nombreYApellido.length(); i++) {
            apellido += nombreYApellido.substring(i, i + 1);
        }

        System.out.println(nombre);
        System.out.println(apellido);
    }
}
