package Ejercicio03;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void sumar(Fraccion fraccion2) {
        int numeradorFinal, denominadorFinal;
        if (denominador == fraccion2.getDenominador()) {
            numeradorFinal = numerador + fraccion2.getNumerador();
            denominadorFinal = denominador;
            System.out.println("La suma resultante es: " + numeradorFinal + "/" + denominadorFinal);
        } else {
            numeradorFinal = (numerador * fraccion2.getDenominador()) + (fraccion2.getNumerador() * denominador);
            denominadorFinal = denominador * fraccion2.getDenominador();
            System.out.println("La suma resultante es: " + numeradorFinal + "/" + denominadorFinal);
        }
    }

    public void restar(Fraccion fraccion2) {
        int numeradorFinal, denominadorFinal;
        if (denominador == fraccion2.getDenominador()) {
            numeradorFinal = numerador - fraccion2.getNumerador();
            denominadorFinal = denominador;
            System.out.println("La resta resultante es: " + numeradorFinal + "/" + denominadorFinal);
        } else {
            numeradorFinal = (numerador * fraccion2.getDenominador()) - (fraccion2.getNumerador() * denominador);
            denominadorFinal = denominador * fraccion2.getDenominador();
            System.out.println("La resta resultante es: " + numeradorFinal + "/" + denominadorFinal);
        }
    }

    public void multiplicar(Fraccion fraccion2) {
        int numeradorFinal, denominadorFinal;
        numeradorFinal = numerador * fraccion2.getNumerador();
        denominadorFinal = denominador * fraccion2.getDenominador();
        System.out.println("La multiplicación resultante es: " + numeradorFinal + "/" + denominadorFinal);
    }

    public void dividir(Fraccion fraccion2) {
        int numeradorFinal, denominadorFinal;
        numeradorFinal = numerador * fraccion2.getDenominador();
        denominadorFinal = denominador * fraccion2.getNumerador();
        System.out.println("La división resultante es: " + numeradorFinal + "/" + denominadorFinal);
    }
}
