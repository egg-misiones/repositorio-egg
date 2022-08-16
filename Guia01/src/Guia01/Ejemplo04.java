package Guia01;

public class Ejemplo04 {

    public static void main(String[] args) {
        Prueba04 a1 = new Prueba04();
        Prueba04 a2 = new Prueba04();

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        int x = 10;
        int y = 0;

        while (y < x) {
            y += x;
        }

        System.out.println(y);
    }
}

class Prueba04 {
}
