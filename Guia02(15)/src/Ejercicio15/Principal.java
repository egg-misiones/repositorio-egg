package Ejercicio15;

public class Principal {

    public static void main(String[] args) {
        CadenaService cadenaService = new CadenaService();
        Cadena cadena;

        cadena = cadenaService.leerFrase();
        cadenaService.cantidadVocales(cadena);
        cadenaService.invertirFrase(cadena);
        cadenaService.vecesRepetido(cadena);
        cadenaService.compararLongitud(cadena);
        cadenaService.unirFrases(cadena);
        cadenaService.reemplazar(cadena);
    }
}
