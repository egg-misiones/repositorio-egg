package OperadorTernario;

public class Ejemplo {

    public static void main(String[] args) {
        /*
        ACLARACIÓN
        El operador ternario puede devolver cualquier tipo de dato.
         */
        // Ejemplo 1 -> Forma simplificada
        int primerValor = 18;
        String primeraRespuesta = primerValor >= 18 ? "Es mayor de edad" : "Es menor de edad";

        System.out.println(primeraRespuesta);

        // Ejemplo 1 -> Forma tradicional
        int segundoValor = 15;

        if (segundoValor >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        // Ejemplo 2 -> Forma simplificada
        int tercerValor = 10;
        String segundaRespuesta = tercerValor % 2 == 0 ? "Es par" : "Es impar";

        System.out.println(segundaRespuesta);

        //Ejemplo 2 -> Forma tradicional
        int cuartoValor = 11;

        if (cuartoValor % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
