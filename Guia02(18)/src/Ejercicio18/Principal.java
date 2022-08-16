package Ejercicio18;

public class Principal {

    public static void main(String[] args) {
        NumerosService numerosService = new NumerosService();
        Numeros numeros;

        numeros = numerosService.crearNumeros();
        numerosService.mostrarArreglos(numeros);
        numerosService.ordenarArreglos(numeros);
        System.out.println();
        numerosService.mostrarArreglos(numeros);
    }
}
