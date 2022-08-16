package Genericos;

/*
EJEMPLO

El método genérico maximo utiliza el parámetro T como el tipo de valor de retorno del método,
como el tipo de los parámetros x, y y z del método, y como el tipo de la variable local max.

La sección de parámetros de tipo especifica que T extiende a Comparable<T>. En este caso,
Comparable se conoce como el límite superior del parámetro de tipo. De manera predeterminada,
Object es el límite superior. Las declaraciones de los parámetros de tipo que delimitan el
parámetro siempre utilizan la palabra clave extends, sin importar que el parámetro de tipo
extienda a una clase o implemente a una interfaz.

El método maximo asume que su primer argumento (x) es el mayor, y lo asigna a la variable
local max. A continuación, la instrucción if determina si y es mayor que max. La condición
invoca al método compareTo de y con la expresión y.compareTo( max ), que devuelve -1, 0 o 1,
para determinar la relación de y con max. Si el valor de retorno de compareTo es mayor que 0,
entonces y es mayor y se asigna a la variable max. De manera similar, la instrucción if determina
si z es mayor que max. Si es así, se asigna z a max. Después, se devuelve max al método que hizo
la llamada.

FUNCIONAMIENTO

En main se hace una llamada a maximo con los enteros 3, 4 y 5. Cuando el compilador encuentra esta
llamada, primero busca un método maximo que reciba tres argumentos de tipo int.

No hay un método así, por lo cual el compilador busca un método genérico que pueda utilizarse, y
encuentra el método genérico maximo. Sin embargo, recuerde que los argumentos para un método genérico
deben ser de un tipo de referencia. Por lo tanto, el compilador realiza la conversión autoboxing de los
tres valores int en objetos Integer, y especifica que estos tres objetos Integer se pasen a maximo.

Observe que la clase Integer implementa a la interfaz Comparable<Integer> de tal forma que el método
compareTo compara los valores int en dos objetos Integer. Por lo tanto, los objetos Integer son argumentos
válidos para el método maximo.

Cuando el compilador traduce el método genérico maximo en códigos byte de Java, utiliza el borrado
para reemplazar los parámetros de tipo con tipos reales. Todos los tipos genéricos se reemplazaron
con el tipo Object. En realidad, todos los parámetros de tipo se reemplazan con el límite superior
del parámetro de tipo, a menos que se especifique lo contrario. Object es el límite superior
predeterminado.

El límite superior de un parámetro de tipo se especifica en la sección de parámetros de tipo.
Para indicar el límite superior, coloque después del nombre del parámetro de tipo la palabra clave
extends y el nombre de la clase o interfaz que representa el límite superior. En la sección de parámetros
de tipo del método maximo, especificamos el límite superior como el tipo Comparable<T>. Por ende,
sólo pueden pasarse objetos Comparable<T> como argumentos para maximo; cualquier cosa que no sea
Comparable<T> producirá errores de compilación.

public static Comparable maximo(Comparable x, Comparable y, Comparable z) {
    Comparable max = x;

    if (y.compareTo(max) > 0) {
        max = y;
    }

    if (z.compareTo(max) > 0) {
        max = z;
    }

    return max;
}

Después del borrado, la versión compilada del método maximo especifica que devuelve el tipo Comparable.
Sin embargo, el método que hace la llamada no espera recibir un objeto Comparable. Espera recibir un
objeto del mismo tipo que se pasó a maximo como argumento: Integer, Double o String en este ejemplo.

Cuando el compilador reemplaza la información del parámetro de tipo con el tipo del límite superior
en la declaración del método, también inserta operaciones de conversión explícitas en frente de cada
llamada al método, para asegurar que el valor devuelto sea del tipo esperado por el método que hizo
la llamada. Así, la llamada a maximo va antecedida por una conversión a Integer, por citar un caso.

(Integer) maximo( 3, 4, 5 )

 */
public class MetodoGenerico03 {

    public static void main(String[] args) {
        System.out.println("Máximo de 3, 4, 5 es " + maximo(3, 4, 5));
        System.out.println("Máximo de 6.6, 8.8, 7.7 es " + maximo(6.6, 8.8, 7.7));
        System.out.println("Máximo de pera, manzana, naranja es " + maximo("pera", "manzana", "naranja"));
    }

    // SE DETERMINA EL MAYOR DE 3 OBJETOS COMPARABLE
    public static <T extends Comparable<T>> T maximo(T x, T y, T z) {
        T max = x; // SE ASUME QUE X ES MAYOR

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }
}
