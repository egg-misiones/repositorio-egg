package Ejercicio04;

public class Principal {

    public static void main(String[] args) {
        Punto punto1 = new Punto(7, 4);
        Punto punto2 = new Punto(1, 2);
        double distancia;
        
        distancia = punto1.calcular(punto2);

        System.out.println("La distancia existente entre los puntos 1 y 2 es: " + distancia);
    }
}
