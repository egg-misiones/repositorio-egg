package Ejercicio03;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        CantanteFamosoService cantanteFamosoService = new CantanteFamosoService();
        ArrayList<CantanteFamoso> listaCantantesFamosos = new ArrayList<>();
        String nombre, discoConMasVentas;
        int respuesta;

        cantanteFamosoService.crearCantanteFamoso(listaCantantesFamosos, "Tom Misch", "Geography");
        cantanteFamosoService.crearCantanteFamoso(listaCantantesFamosos, "John Mayer", "Continuum");
        cantanteFamosoService.crearCantanteFamoso(listaCantantesFamosos, "King Krule", "Man Alive!");
        cantanteFamosoService.crearCantanteFamoso(listaCantantesFamosos, "Tame Impala", "Currents");
        cantanteFamosoService.crearCantanteFamoso(listaCantantesFamosos, "Mac DeMarco", "Salad Days");

        cantanteFamosoService.mostrarLista(listaCantantesFamosos);
        System.out.println();

        System.out.print("Ingrese el nombre de un cantante: ");
        nombre = entrada.next();
        System.out.print("Ingrese su disco con más ventas: ");
        discoConMasVentas = entrada.next();
        cantanteFamosoService.crearCantanteFamoso(listaCantantesFamosos, nombre, discoConMasVentas);
        System.out.println();
        cantanteFamosoService.mostrarLista(listaCantantesFamosos);
        System.out.println();

        do {
            System.out.println("Elija una opcion: ");
            System.out.println("1. Seguir ingresando datos de cantantes");
            System.out.println("2. Editar un cantante");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            respuesta = entrada.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.print("Ingrese el nombre de un cantante: ");
                    nombre = entrada.next();
                    System.out.print("Ingrese su disco con más ventas: ");
                    discoConMasVentas = entrada.next();
                    cantanteFamosoService.crearCantanteFamoso(listaCantantesFamosos, nombre, discoConMasVentas);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del cantante que desea modificar: ");
                    nombre = entrada.next();
                    System.out.print("Ingrese el nuevo disco con más ventas: ");
                    discoConMasVentas = entrada.next();
                    cantanteFamosoService.modificarCantanteFamoso(listaCantantesFamosos, cantanteFamosoService.buscarCantanteFamoso(listaCantantesFamosos, nombre), discoConMasVentas);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del cantante que desea eliminar: ");
                    nombre = entrada.next();
                    cantanteFamosoService.eliminarCantanteFamoso(listaCantantesFamosos, cantanteFamosoService.buscarCantanteFamoso(listaCantantesFamosos, nombre));
                    break;
                case 4:
                    System.out.println("Sesión finalizada");
                    break;
                default:
                    System.out.println("La opción ingresada es inválida");
                    break;
            }
        } while (respuesta != 4);

        System.out.println();
        cantanteFamosoService.mostrarLista(listaCantantesFamosos);
    }
}
