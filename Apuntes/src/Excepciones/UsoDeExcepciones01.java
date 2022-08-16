package Excepciones;

public class UsoDeExcepciones01 {

    public static void main(String[] args) {
        try {
            lanzaExcepcion();
        } catch (Exception e) {
            System.out.println("La excepción se manejó en el main");
            System.err.println("Tipo de excepción: " + e.getClass().getSimpleName());
        }

        noLanzaExcepcion();
    }

    public static void lanzaExcepcion() throws Exception {
        try {
            System.out.println("Método lanzaExcepcion");
            throw new Exception();
        } catch (Exception e) {
            System.err.println("La excepción se lanzó en el método lanzaExcepcion");
            throw e;
        } finally {
            System.out.println("Se ejecutó Finally en lanzaExcepcion");
        }
    }

    public static void noLanzaExcepcion() {
        try {
            System.out.println("Método noLanzaExcepcion");
        } catch (Exception e) {
            System.err.println("Tipo de excepción: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Se ejecutó Finally en noLanzaExcepcion");
        }

        System.out.println("Fin del método noLanzaExcepcion");
    }
}
