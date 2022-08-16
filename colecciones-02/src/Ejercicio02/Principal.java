package Ejercicio02;

public class Principal {

    public static void main(String[] args) {
        NumeroService numeroService = new NumeroService();
        Numero numero;

        numero = numeroService.crearNumero();
        numeroService.leerValores(numero);
        numeroService.mostrarResultados(numero);
    }
}
