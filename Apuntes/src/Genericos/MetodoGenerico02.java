package Genericos;

/*
TEORÍA

Todas las declaraciones de métodos genéricos tienen una sección de parámetros de tipo,
delimitada por signos < y > que se anteponen al tipo de valor de retorno del método.
Cada sección de parámetro de tipo contiene uno o más parámetros de tipo, separados por
comas. Un parámetro de tipo es un identificador que especifica el nombre de un tipo
genérico.

Los parámetros de tipo se pueden utilizar para declarar el tipo de valor de retorno,
los tipos de los parámetros y los tipos de las variables locales en la declaración de
un método genérico, y actúan como receptáculos para los tipos de los argumentos que se
pasan al método genérico, que conocemos como argumentos de tipos actuales. El cuerpo
de un método genérico se declara como el de cualquier otro método.

Los parámetros de tipo sólo pueden representar tipos por referencia, y no tipos primitivos
(como int, double y char). Además, los nombres de los parámetros de tipo en la declaración
del método deben coincidir con los que están declarados en la sección de parámetros de tipo.
Asimismo, un parámetro de tipo puede declararse sólo una vez en la sección de parámetros de
tipo, pero puede aparecer más de una vez en la lista de parámetros del método.

Al declarar un método genérico, si no se coloca una sección de parámetros de tipo antes del
tipo de valor de retorno de un método, se produce un error de sintaxis; el compilador no
comprenderá el nombre del parámetro de tipo cuando lo encuentre en el método.

 */
public class MetodoGenerico02 {

    public static void main(String[] args) {
        Integer[] vectorInteger = {1, 2, 3, 4, 5, 6};
        Double[] vectorDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] vectorCharacter = {'H', 'O', 'L', 'A'};

        System.out.println("VECTOR INTEGER: ");
        mostrarVector(vectorInteger);
        System.out.println("VECTOR DOUBLE: ");
        mostrarVector(vectorDouble);
        System.out.println("VECTOR CHARACTER: ");
        mostrarVector(vectorCharacter);
    }

    public static <E> void mostrarVector(E[] vector) {
        for (E e : vector) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
