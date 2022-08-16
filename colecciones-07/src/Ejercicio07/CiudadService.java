package Ejercicio07;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CiudadService {

    private HashMap<Integer, Ciudad> listaCiudad = new HashMap<>();

    public void setListaCiudad(HashMap<Integer, Ciudad> listaCiudad) {
        this.listaCiudad = listaCiudad;
    }

    public HashMap<Integer, Ciudad> getListaCiudad() {
        return listaCiudad;
    }

    public void crearCiudad(Integer codigoPostal, String variableCiudad) {
        Ciudad ciudad = new Ciudad();

        ciudad.setCodigoPostal(codigoPostal);
        ciudad.setCiudad(variableCiudad);

        guardarCiudad(ciudad);
    }

    public void modificarCiudad(Ciudad ciudad, Integer codigoPostal) {
        ciudad.setCodigoPostal(codigoPostal);

        guardarCiudad(ciudad);
    }

    public void leer() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Integer codigoPostal;
        String ciudad;

        do {
            System.out.print("Ingrese el nombre de una ciudad: ");
            ciudad = entrada.next();
            System.out.print("Ingrese el código postal correspondiente: ");
            codigoPostal = entrada.nextInt();
            crearCiudad(codigoPostal, ciudad);
        } while (listaCiudad.size() < 10);

    }

    public Ciudad buscarCiudad(Integer codigoPostal) {
        Ciudad ciudad = null;

        for (Integer c : listaCiudad.keySet()) {
            if (c.equals(codigoPostal)) {
                ciudad = listaCiudad.get(c);
                break;
            }
        }

        return ciudad;
    }

    public Integer buscarCodigoPostal(String variableCiudad) {
        Integer codigoPostal = 0;

        for (Ciudad c : listaCiudad.values()) {
            if (c.getCiudad().equalsIgnoreCase(variableCiudad)) {
                codigoPostal = c.getCodigoPostal();
                break;
            }
        }

        return codigoPostal;
    }

    public void guardarCiudad(Ciudad ciudad) {
        listaCiudad.put(ciudad.getCodigoPostal(), ciudad);
    }

    public void eliminarCiudad(Integer codigoPostal) {
        listaCiudad.remove(codigoPostal);
    }

    public void eliminarCiudades() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String ciudad;

        while (listaCiudad.size() > 8) {
            System.out.print("Ingrese el nombre de una ciudad que desee eliminar: ");
            ciudad = entrada.next();
            eliminarCiudad(buscarCodigoPostal(ciudad));
        }
    }

    public void mostrarCiudad(Ciudad ciudad) {
        System.out.println(ciudad.getCiudad() + " (" + ciudad.getCodigoPostal() + ")");
    }

    public void mostrarDatos() {
        System.out.println("LISTA DE CIUDADES: ");

        for (Ciudad c : listaCiudad.values()) {
            System.out.println(c.getCiudad() + " (" + c.getCodigoPostal() + ")");
        }
    }
}
