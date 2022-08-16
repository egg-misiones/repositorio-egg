package Ejercicio13;

public class Principal {

    public static void main(String[] args) {
        AhorcadoService ahorcadoService = new AhorcadoService();
        Ahorcado ahorcado;
        String palabra = "JAVASCRIPT";

        ahorcado = ahorcadoService.crearAhorcado(palabra);
        ahorcadoService.leer(ahorcado);
    }
}
