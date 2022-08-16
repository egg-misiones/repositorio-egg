package Ejercicio07;

public class Rectangulo {

    private double alto;
    private double largo;

    public Rectangulo() {
    }

    public Rectangulo(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }

    public void superficie() {
        double superficie;

        superficie = largo * alto;
        System.out.println("Superficie: " + superficie);
    }

    public void perimetro() {
        double perimetro;

        perimetro = (largo + alto) * 2;
        System.out.println("Perímetro: " + perimetro);
    }

    public void visualizar() {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < largo; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
