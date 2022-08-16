package Ejercicio13;

public class Ahorcado {

    private String[] palabra;
    private int intentos;

    public Ahorcado(String palabra) {
        this.palabra = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            this.palabra[i] = palabra.substring(i, i + 1);
        }
        intentos = 4;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public int getIntentos() {
        return intentos;
    }
}
