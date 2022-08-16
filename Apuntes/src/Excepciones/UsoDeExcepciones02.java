package Excepciones;

public class UsoDeExcepciones02 {

    public static void main(String[] args) {
        try {
            lanzaExcepcion();
        } catch (Exception e) {
            System.out.println("La excepción se manejó en el main");
            System.err.println("Tipo de excepción: " + e.getClass().getSimpleName());
        }
    }

    public static void lanzaExcepcion() throws Exception {
        try {
            System.out.println("Método lanzaExcepcion");
            throw new Exception();
        } catch (RuntimeException e) {
            System.err.println("La excepción se lanzó en el método lanzaExcepcion");
            throw e;
        } finally {
            System.out.println("Se ejecutó Finally en lanzaExcepcion");
        }
    }
}
