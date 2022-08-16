package Ejercicio03;

public class Principal {

    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(8, 4);
        Fraccion fraccion2 = new Fraccion(2, 4);

        fraccion1.sumar(fraccion2);
        fraccion1.restar(fraccion2);
        fraccion1.multiplicar(fraccion2);
        fraccion1.dividir(fraccion2);
    }
}
