package Ejercicio01;

public class Principal {

    public static void main(String[] args) {
        PalabraService palabraService = new PalabraService();
        Palabra palabra;

        palabra = palabraService.crearPalabra();
        palabraService.leerVariablePalabra(palabra);
        palabraService.leerLongitud(palabra);
        System.out.println();
        palabraService.mostrarLista(palabra);
    }
}
