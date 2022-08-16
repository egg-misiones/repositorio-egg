package Guia01;

public class Ejemplo05 {

    public static void main(String[] args) {
        int numero = 15;

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz");
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
