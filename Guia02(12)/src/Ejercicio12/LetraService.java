package Ejercicio12;

import java.util.Scanner;

public class LetraService {

    public Letra crearLetra() {
        Letra letra = new Letra();

        return letra;
    }

    public Letra leer(Letra letra) {
        Scanner entrada = new Scanner(System.in);
        int nro;
        String conversion;

        do {
            System.out.print("Ingrese su DNI: ");
            nro = entrada.nextInt();
            conversion = String.valueOf(nro);
        } while (conversion.length() != 8);

        letra.setDni(nro);
        letra.setLetra(asignarLetra(nro));

        return letra;
    }

    public String asignarLetra(int dni) {
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D",
            "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        return letras[dni % 23];
    }

    public void mostrarDatos(Letra letra) {
        System.out.println("DIF: " + letra.getDni() + "-" + letra.getLetra());
    }
}
