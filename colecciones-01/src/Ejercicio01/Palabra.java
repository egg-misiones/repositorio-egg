package Ejercicio01;

import java.util.ArrayList;

public class Palabra {

    private ArrayList<String> palabras = new ArrayList<>();

    public void setPalabras(ArrayList<String> palabras) {
        this.palabras = palabras;
    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }
}
