package Ejercicio12;

public class Principal {

    public static void main(String[] args) {
        LetraService letraService = new LetraService();
        Letra letra;

        letra = letraService.crearLetra();
        letraService.leer(letra);
        letraService.mostrarDatos(letra);
    }
}
