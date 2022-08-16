package Genericos;

public class MetodoGenerico01 {

    public static void main(String[] args) {
        Integer[] vectorInteger = {1, 2, 3, 4, 5, 6};
        Double[] vectorDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] vectorCharacter = {'H', 'O', 'L', 'A'};

        System.out.println("VECTOR INTEGER: ");
        mostrarVector(vectorInteger);
        System.out.println("VECTOR DOUBLE: ");
        mostrarVector(vectorDouble);
        System.out.println("VECTOR CHARACTER: ");
        mostrarVector(vectorCharacter);
    }

    public static void mostrarVector(Integer[] vector) {
        for (Integer e : vector) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void mostrarVector(Double[] vector) {
        for (Double e : vector) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void mostrarVector(Character[] vector) {
        for (Character e : vector) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
