package Guia01;

import java.util.stream.IntStream;

public class Ejemplo06 {

    public static void main(String[] args) {
        int[] array = {5, 8, 0, -10, 44, 89, 1, 3, 7, 77, 12, -3, 4};
        System.out.printf("Max: %d%n", IntStream.of(array).max().getAsInt());
    }
}
