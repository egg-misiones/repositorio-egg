package Ejercicio12;

public class Letra {

    private int dni;
    private String letra;

    public Letra() {
        dni = 0;
        letra = "";
    }

    public Letra(int dni) {
        this.dni = dni;
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D",
            "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        this.letra = letras[dni % 23];
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getDni() {
        return dni;
    }

    public String getLetra() {
        return letra;
    }
}
