package com.principal;

import com.alquiler.Alquiler;
import com.barco.Barco;
import com.embarcacion.deportiva.EmbarcacionDeportiva;
import com.utilidad.Utilidad;
import com.velero.Velero;
import com.yate.Yate;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Barco barco = new Barco(55555, 200, 2000);
        Yate yate = new Yate(5, 5, 22222, 150, 1995);
        EmbarcacionDeportiva embarcacion = new EmbarcacionDeportiva(6, 11111, 175, 1990);
        Velero velero = new Velero(4, 77777, 100, 2010);
        ArrayList<Alquiler> alquileres = new ArrayList<>();

        alquileres.add(new Alquiler("Ana", 33444555, Utilidad.convertirStringEnDate("10/02/2021"), Utilidad.convertirStringEnDate("10/02/2021"), 1, barco));
        alquileres.add(new Alquiler("Pablo", 33444555, Utilidad.convertirStringEnDate("07/09/2021"), Utilidad.convertirStringEnDate("14/09/2021"), 2, yate));
        alquileres.add(new Alquiler("Franco", 33444555, Utilidad.convertirStringEnDate("05/05/2020"), Utilidad.convertirStringEnDate("09/05/2020"), 3, embarcacion));
        alquileres.add(new Alquiler("Lorena", 33444555, Utilidad.convertirStringEnDate("04/01/2021"), Utilidad.convertirStringEnDate("04/01/2021"), 4, velero));

        for (Alquiler a : alquileres) {
            System.out.println("Nombre: " + a.getNombre());
            System.out.println("DNI: " + a.getNumeroDocumento());
            System.out.println("Fecha de ingreso: " + Utilidad.convertirDateEnString(a.getFechaInicial()));
            System.out.println("Fecha de egreso: " + Utilidad.convertirDateEnString(a.getFechaFinal()));
            System.out.println("Posición del amarre: " + a.getPosicionAmarre());
            System.out.println(a.getBarco());
            System.out.println("Precio del alquiler: $" + a.calcularAlquiler());
            System.out.println();
        }
    }
}
