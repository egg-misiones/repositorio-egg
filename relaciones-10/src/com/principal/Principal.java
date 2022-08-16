package com.principal;

import com.alojamiento.Alojamiento;
import com.camping.Camping;
import com.hotel.cinco.estrellas.HotelCincoEstrellas;
import com.hotel.cuatro.estrellas.HotelCuatroEstrellas;
import com.hotel.general.Hotel;
import com.hotel.tres.estrellas.HotelTresEstrellas;
import com.residencia.Residencia;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        alojamientos.add(new HotelTresEstrellas("Diplomatic", "San Martín 1452", "Cuidad de Mendoza", "Roberto Pérez", 35, 48, 3));
        alojamientos.add(new HotelTresEstrellas("Huentala", "Belgrano 852", "Maipú", "Ricardo Motta", 32, 40, 2));
        alojamientos.add(new HotelCuatroEstrellas("Sheraton", "Gral. Paz 1008", "Ciudad de Mendoza", "Pablo Ramírez", 40, 55, 4, "A", "La Brasas", 45));
        alojamientos.add(new HotelCuatroEstrellas("Park Hyatt", "San Juan 821", "Maipú", "Nicolás Perea", 42, 52, 4, "B", "Bon Apetit", 42));
        alojamientos.add(new HotelCincoEstrellas("Aconcagua", "Buenos Aires 785", "Ciudad de Mendoza", "Susana Porta", 60, 75, 5, "A", "Le Petite Bistro", 50, 10, 10, 5));
        alojamientos.add(new HotelCincoEstrellas("Intercontinental", "Ozamis 527", "Godoy Cruz", "Fernando Portillo", 63, 72, 5, "A", "Pasta Real", 53, 15, 12, 4));
        alojamientos.add(new Camping("Cristal", "Sarmiento 636", "Maipú", "Lorena Cassio", true, 2000, 12, 10, true));
        alojamientos.add(new Camping("Oasis", "Emilio Civit 1402", "San Martín", "Franco Palao", true, 2500, 10, 12, true));
        alojamientos.add(new Residencia("Praderas Verdes", "Posadas 451", "Godoy Cruz", "Laura Domínguez", false, 2450, 25, true, true));
        alojamientos.add(new Residencia("El Remanso", "Urquiza 965", "Guaymallén", "Ramiro Pinto", true, 2200, 20, true, false));
        Integer primeraRespuesta = 0;
        Integer primerContador = 0;
        Integer segundoContador = 0;
        String segundaRespuesta, terceraRespuesta;

        do {
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Todos los alojamientos");
            System.out.println("2. Todos los hoteles de una determinada localidad");
            System.out.println("3. Todos los campings de una determinada localidad");
            System.out.println("4. Salir");
            primeraRespuesta = entrada.nextInt();
            switch (primeraRespuesta) {
                case 1:
                    alojamientos.forEach(a -> System.out.println(a + "\n"));
                    break;
                case 2:
                    System.out.println("Ingrese una localidad: ");
                    segundaRespuesta = entrada.next();
                    for (Alojamiento a : alojamientos) {
                        if (a instanceof Hotel) {
                            if (segundaRespuesta.equalsIgnoreCase(a.getLocalidad())) {
                                System.out.println(a);
                                System.out.println();
                                primerContador++;
                            }
                        }
                    }
                    if (primerContador.equals(0)) {
                        System.out.println("No hay hoteles disponibles en la localidad indicada");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Ingrese una localidad: ");
                    terceraRespuesta = entrada.next();
                    for (Alojamiento a : alojamientos) {
                        if (a instanceof Camping) {
                            if (terceraRespuesta.equalsIgnoreCase(a.getLocalidad())) {
                                System.out.println(a);
                                System.out.println();
                                segundoContador++;
                            }
                        }
                    }
                    if (segundoContador.equals(0)) {
                        System.out.println("No hay campings disponibles en la localidad indicada");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Consulta finalizada");
                    System.out.println();
                    break;
                default:
                    System.out.println("El número ingresado es inválido");
                    System.out.println();
                    break;
            }
        } while (primeraRespuesta != 4);
    }
}
