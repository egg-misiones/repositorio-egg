package com.principal;

import com.edificio.de.oficinas.EdificioDeOficinas;
import com.polideportivo.Polideportivo;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Polideportivo> edificios1 = new ArrayList<>();
        ArrayList<EdificioDeOficinas> edificios2 = new ArrayList<>();

        edificios1.add(new Polideportivo("Polideportivo Maipú", "Instalación deportiva", 5000));
        edificios1.add(new Polideportivo("Polideportivo Godoy Cruz", "Instalación deportiva", 6500));
        edificios1.add(new Polideportivo("Polideportivo Belgrano", "Instalación deportiva", 4500));
        edificios2.add(new EdificioDeOficinas(50, 7500));
        edificios2.add(new EdificioDeOficinas(20, 3500));

        Iterator<Polideportivo> it1 = edificios1.iterator();
        while (it1.hasNext()) {
            Polideportivo polideportivo = it1.next();
            System.out.println("POLIDEPORTIVOS");
            System.out.println("Nombre: " + polideportivo.getNombre());
            System.out.println("Tipo de instalación: " + polideportivo.getTipoDeInstalacion());
            System.out.println("Superficie del edificio: " + polideportivo.getSuperficieEdificio());
            System.out.println();
        }

        Iterator<EdificioDeOficinas> it2 = edificios2.iterator();
        while (it2.hasNext()) {
            EdificioDeOficinas edificioDeOficinas = it2.next();
            System.out.println("EDIFICIOS DE OFICINAS");
            System.out.println("Número de oficinas: " + edificioDeOficinas.getNumeroDeOficinas());
            System.out.println("Superficie del edificio: " + edificioDeOficinas.getSuperficieEdificio());
            System.out.println();
        }
    }
}
