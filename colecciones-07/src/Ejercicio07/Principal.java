package Ejercicio07;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        CiudadService ciudadService = new CiudadService();
        String ciudad;
        Integer codigoPostalActual, codigoPostalNuevo, codigoPostal;

        ciudadService.leer();
        ciudadService.mostrarDatos();

        System.out.print("Ingrese un código postal: ");
        codigoPostalActual = entrada.nextInt();
        Ciudad ciudadAuxiliar = ciudadService.buscarCiudad(codigoPostalActual);
        while (ciudadAuxiliar == null) {
            System.out.println("El código postal ingresado no existe");
            System.out.print("Ingrese otro código postal: ");
            codigoPostalActual = entrada.nextInt();
            ciudadAuxiliar = ciudadService.buscarCiudad(codigoPostalActual);
        }
        ciudadService.mostrarCiudad(ciudadAuxiliar);
        System.out.print("Ingrese el nuevo código postal de la ciudad indicada: ");
        codigoPostalNuevo = entrada.nextInt();
        ciudadService.eliminarCiudad(codigoPostalActual);
        ciudadService.modificarCiudad(ciudadAuxiliar, codigoPostalNuevo);
        ciudadService.mostrarCiudad(ciudadAuxiliar);
        System.out.print("Ingrese el nombre de una ciudad: ");
        ciudad = entrada.next();
        System.out.print("Ingrese el código postal correspondiente: ");
        codigoPostal = entrada.nextInt();
        ciudadService.crearCiudad(codigoPostal, ciudad);
        ciudadService.eliminarCiudades();
        ciudadService.mostrarDatos();
    }
}
