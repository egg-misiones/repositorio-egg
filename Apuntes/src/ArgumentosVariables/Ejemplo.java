package ArgumentosVariables;

public class Ejemplo {

    public static void main(String[] args) {
        // Imprimimos varios números
        imprimirNumeros(10, 15, 20, 25, 30, 35, 40);
        System.out.println();

        imprimirNumerosForEach(2, 4, 6, 8, 10, 12, 14);
        System.out.println();

        variosParametros("Juan", true, 10, 18, 22);
    }

    public static void imprimirNumeros(int... numeros) {
        // Recorremos cada elemento
        int elemento;
        for (int i = 0; i < numeros.length; i++) {
            elemento = numeros[i];
            System.out.println("Elemento " + (i + 1) + ": " + elemento);
        }
    }

    public static void imprimirNumerosForEach(int... numeros) {
        // Usamos un forEach en lugar de un for normal
        for (int numero : numeros) {
            System.out.println("El número es: " + numero);
        }
    }

    public static void variosParametros(String nombre, boolean valido, int... numeros) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Válido: " + valido);
        // Usamos forEach
        for (int numero : numeros) {
            System.out.println("El número es: " + numero);
        }
    }
}
