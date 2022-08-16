package Ejercicio04;

public class Punto {

    private int coordenadaX;
    private int coordenadaY;

    public Punto(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public double calcular(Punto punto2) {
        double distancia;
        int X, Y;

        X = coordenadaX - punto2.getCoordenadaX();
        Y = coordenadaY - punto2.getCoordenadaY();
        X = (int) Math.pow(X, 2);
        Y = (int) Math.pow(Y, 2);
        distancia = X + Y;
        distancia = Math.sqrt(distancia);

        return distancia;
    }
}
