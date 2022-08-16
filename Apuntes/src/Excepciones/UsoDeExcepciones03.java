package Excepciones;

public class UsoDeExcepciones03 {

    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            System.err.println(e.getMessage());

            StackTraceElement[] elementosRastreo = e.getStackTrace();

            System.out.println("Rastreo de la pila de getStackTrace: ");
            System.out.println("Clase\t\t\t\tArchivo\t\t\tLínea\tMétodo");

            for (StackTraceElement elemento : elementosRastreo) {
                System.out.printf("%s\t", elemento.getClassName());
                System.out.printf("%s\t", elemento.getFileName());
                System.out.printf("%s\t", elemento.getLineNumber());
                System.out.printf("%s\n", elemento.getMethodName());
            }
        }
    }

    public static void metodo1() throws Exception {
        metodo2();
    }

    public static void metodo2() throws Exception {
        metodo3();
    }

    public static void metodo3() throws Exception {
        throw new Exception("La excepción se manejo en método 3");
    }
}
