package Ejercicio16;

public class Principal {

    public static void main(String[] args) {
        MatematicaService matematicaService = new MatematicaService();
        Matematica matematica;
        String respuesta;

        matematica = matematicaService.leer();
        respuesta = matematicaService.devolverMayor(matematica);
        System.out.println(respuesta);
        matematicaService.calcularPotencia(matematica);
        matematicaService.calcularRaiz(matematica);
        matematicaService.sumarAngulos(matematica);
    }
}
