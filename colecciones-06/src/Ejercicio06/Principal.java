package Ejercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ProductoService productoService = new ProductoService();
        String producto;
        int precio, respuesta;

        productoService.crearProducto("Guitarra", 75000);
        productoService.crearProducto("Piano", 45000);
        productoService.crearProducto("Bajo", 40000);
        productoService.crearProducto("Saxofón", 65000);
        productoService.crearProducto("Micrófono", 20000);

        do {
            System.out.println("Elija una opcion: ");
            System.out.println("1. Ingresar un producto");
            System.out.println("2. Modificar un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Salir");
            respuesta = entrada.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.print("Indique el producto que desea ingresar: ");
                    producto = entrada.next();
                    System.out.print("Indique el precio del producto ingresado: ");
                    precio = entrada.nextInt();
                    productoService.crearProducto(producto, precio);
                    break;
                case 2:
                    System.out.print("Indique el producto al que le desea modificar el precio: ");
                    producto = entrada.next();
                    System.out.print("Ingrese la actualización del precio: ");
                    precio = entrada.nextInt();
                    productoService.modificarProducto(productoService.buscarProducto(producto), precio);
                    break;
                case 3:
                    System.out.print("Indique el producto que desea eliminar: ");
                    producto = entrada.next();
                    productoService.eliminarProducto(producto);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Sesión finalizada");
                    break;
                default:
                    System.out.println("La opción ingresada es inválida");
                    break;
            }
        } while (respuesta != 4);

        productoService.mostrarDatos();
    }
}
