package ProgramacionFuncional;

/*
TEORÍA

La programación funcional se logra con las expresiones lambda. Una expresión lambda representa a
un método anónimo; es decir, una notación abreviada para implementar una interfaz funcional, similar
a una clase interna anónima. El tipo de una expresión lambda es el tipo de la interfaz funcional
que implementa esa expresión lambda. Las expresiones lambda pueden usarse en cualquier parte en
donde se esperan interfaces funcionales.

SINTAXIS BÁSICA

Una lambda consiste en una lista de parámetros seguida del token flecha (->) y un cuerpo.

(listaParámetros) -> {instrucciones}

EJEMPLO

La siguiente lambda recibe dos valores int y devuelve su suma.

(int x, int y) -> {return x + y;}

En este caso, el cuerpo es un bloque de instrucciones que puede contener una o más instrucciones
encerradas entre llaves. Hay diversas variaciones de esta sintaxis. Por ejemplo, pueden omitirse
los tipos de parámetros.

(x, y) -> {return x + y;}

Cuando el cuerpo contiene sólo una expresión, se pueden omitir la palabra clave return y las llaves.

(x, y) -> x + y

En este caso, el valor de la expresión se devuelve implícitamente. Cuando la lista de parámetros
contiene sólo un parámetro, se pueden omitir los paréntesis.

valor -> System.out.printl(valor)

Para definir una lambda con una lista de parámetros vacía, especifique la lista de parámetros como
paréntesis vacíos a la izquierda del token flecha (->).

() -> System.out.println("Hola Mundo")
 */
import java.util.ArrayList;
import java.util.UUID;

public class Principal {

    public static void main(String[] args) {
        // EJEMPLO 1 - ALUMNOS
        
        String isbn = UUID.randomUUID().toString();
        isbn = isbn.replaceAll("[^0-9]", "");
        isbn = isbn.substring(0, 12);
        
        Long cambio = Long.parseLong("123456789542");
        
        System.out.println(cambio);
        
        Long long1 = new Long(151515);
        Long long2 = new Long(151515);
        
        if (long1.equals(long2)) {
            System.out.println(true);
        }
        
        
        String prueba = " ";
        prueba = prueba.trim();
        
        if (prueba == null) {
            System.out.println("t");
        } else {
            System.out.println("f");
        }
        
        String nombre = "Cristian Solis";
        if (nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println(isbn);
        
        String anio = "2240";
        if (!anio.matches("\\d{4}")) {
            System.out.println("Año incorrecto");
        } else {
            System.out.println("Año correcto");
        }

        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Fernando", "Marín", 25));
        alumnos.add(new Alumno("Cristian", "Orozco", 30));
        alumnos.add(new Alumno("Ángela", "Arce", 21));
        alumnos.add(new Alumno("Antonio", "Solís", 28));
        alumnos.add(new Alumno("Marta", "Baldaso", 18));

        // FOR EACH
        alumnos.forEach(alumno -> System.out.println(alumno.getNombre() + " " + alumno.getApellido()));

        System.out.println();

        /*
        ORDENAMIENTO TRADICIONAL
        
        Collections.sort(alumnos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno alumno1, Alumno alumno2) {
                return alumno1.getApellido().compareTo(alumno2.getApellido());
            }
        });
        
        ORDENAMIENTO SIMPLIFICADO
        
        Collections.sort(alumnos, (Alumno alumno1, Alumno alumno2) -> alumno1.getApellido().compareTo(alumno2.getApellido()));
        
         */
        // ORDENAMIENTO
        alumnos.sort((alumno1, alumno2) -> alumno1.getApellido().compareTo(alumno2.getApellido()));

        alumnos.forEach(alumno -> System.out.println(alumno.getApellido() + ", " + alumno.getNombre()));

        // EJEMPLO 2 - PROMEDIO
        /*
        
        IMPLEMENTACIÓN TRADICIONAL DE LA INTERFAZ PROMEDIO
        
        Promedio promedio = new Promedio() {
            @Override
            public double calcularPromedio(double valor1, double valor2) {
                return (valor1 + valor2) / 2;
            }
        };

        System.out.println(promedio.calcularPromedio(10, 5));
         */
        // IMPLEMENTACIÓN SIMPLIFICADA DE LA INTERFAZ PROMEDIO
        Promedio promedio = (double valor1, double valor2) -> (valor1 + valor2) / 2;

        System.out.println(promedio.calcularPromedio(10, 5));
    }
}
