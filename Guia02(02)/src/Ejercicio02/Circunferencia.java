package Ejercicio02;

public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void area() {
        double area;
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("Área: " + area);
    }

    public void perimetro() {
        double perimetro;
        perimetro = 2 * Math.PI * radio;
        System.out.println("Perímetro: " + perimetro);
    }
}
