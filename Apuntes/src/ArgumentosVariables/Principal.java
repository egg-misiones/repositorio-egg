package ArgumentosVariables;

/*
ACLARACIÓN

Para el uso de los argumentos variables, es necesario que sea el último de los
argumentos declarados en un método.
 */
public class Principal {

    public static void main(String[] args) {
        variosParametros("Juan", true, 10, 18, 22);
    }

    public static void variosParametros(String nombre, boolean valido, int... numeros) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Válido: " + valido);

        for (int numero : numeros) {
            System.out.println("El número es: " + numero);
        }
    }
}
