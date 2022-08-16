package Excepciones;

/*
BLOQUE TRY

Lo primero que hay que hacer para que un método sea capaz de tratar una excepción
generada por la máquina virtual Java o por el propio programa mediante una instrucción
throw es encerrar las instrucciones susceptibles de generarla en un bloque try.

try {
    BloqueDeIntrucciones
}

Cualquier excepción que se produzca dentro del bloque try será analizada por el bloque o
bloques catch. En el momento en que se produzca la excepción, se abandona el bloque try,
y las instrucciones que sigan al punto donde se produjo la excepción no son ejecutadas.
Cada bloque try debe tener asociado por lo menos un bloque catch.

BLOQUE CATCH

Por cada bloque try pueden declararse uno o varios bloques catch, cada uno de ellos capaz
de tratar un tipo u otro de excepción. Para declarar el tipo de excepción que es capaz de
tratar un bloque catch, se declara un objeto cuya clase es la clase de la excepción que se
desea tratar o una de sus superclases.

try {
    BloqueDeIntrucciones
} catch (TipoExcepción nombreVariable) {
    BloqueCatch
} catch (TipoExcepción nombreVariable) {
    BloqueCatch
}

Al producirse la excepción dentro de un bloque try, la ejecución del programa se pasa al
primer bloque catch. Si la clase de la excepción se corresponde con la clase o alguna
subclase de la clase declarada en el bloque catch, se ejecuta el bloque de instrucciones
catch y a continuación se pasa el control del programa a la primera instrucción a partir de
los bloques try-catch.

RECOMENDACIÓN

Lo más adecuado es utilizar excepciones lo más cercanas al tipo de
error previsto, ya que lo que se pretende es recuperar al programa de alguna condición de
error y si “se meten todas las condiciones en la misma bolsa”, seguramente habrá que
averiguar después qué condición de error se produjo para poder dar una respuesta
adecuada.

BLOQUE FINALLY

El bloque finally se utiliza para ejecutar un bloque de instrucciones sea cual sea la excepción
que se produzca. Este bloque se ejecutará siempre, incluso si no se produce ninguna
excepción. Sirve para no tener que repetir código en el bloque try y en los bloques catch. El
bloque finally es un buen lugar en donde liberar los recursos tomados dentro del bloque de
intento.

try {
    BloqueDeIntrucciones
} catch (TipoExcepción nombreVariable) {
    BloqueCatch
} catch (TipoExcepción nombreVariable) {
    BloqueCatch
} …
} catch (TipoExcepción nombreVariable) {
    BloqueCatch
}
finally {
    BloqueFinally
}
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        // Cómo capturar excepciones individuales
        int primerValor = 5;
        System.out.println("El entero se inicializó en: " + primerValor);

        try {
            primerValor = Integer.valueOf("a");
            System.out.println("El número indicado es: " + primerValor);
        } catch (NumberFormatException excepcion) { // NumberFormatException es un tipo de excepción
            System.out.println("El valor indicado no es un número");
        }

        // Cómo capturar todas las excepciones
        int segundoValor = 10;
        System.out.println("El entero se inicializó en: " + segundoValor);

        try {
            segundoValor = Integer.valueOf("a");
            System.out.println("El número indicado es: " + segundoValor);
        } catch (Exception excepcion) { // Exception es la excepción padre de todas las excepciones
            System.out.println("El valor indicado no es un número");
        }

        // Finally
        int tercerValor = 15;
        int cuartoValor = 20;
        System.out.println("El entero se inicializó en: " + tercerValor);

        try {
            primerValor = Integer.valueOf("a");
            System.out.println("El número indicado es: " + primerValor);
        } catch (NumberFormatException excepcion) { // NumberFormatException es un tipo de excepción
            System.out.println("El valor indicado no es un número");
        } catch (Exception excepcion) { // Exception es la excepción padre de todas las excepciones
            System.out.println("El valor indicado no es un número");
        } finally { // Este bloque se ejecutará siempre independientemente de que se capture una excepción o no
            System.out.println("El número indicado es: " + cuartoValor);
        }
    }
}
