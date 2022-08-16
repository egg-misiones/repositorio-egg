package Guia01;

public class Ejercicio35 {

    public static void main(String[] args) {
        int[] vector = new int[100];

        for (int i = 0; i <= 99; i++) {
            vector[i] = i + 1;
        }

        for (int i = 99; i >= 0; i--) {
            if (i == 0) {
                System.out.println(vector[i] + ".");
            } else {
                System.out.print(vector[i] + ", ");
            }
        }
    }
}
