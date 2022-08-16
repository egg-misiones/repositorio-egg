package Ejercicio03;

import java.util.ArrayList;

public class CantanteFamosoService {

    public void crearCantanteFamoso(ArrayList<CantanteFamoso> listaCantantesFamosos, String nombre, String discoConMasVentas) {
        CantanteFamoso cantanteFamoso = new CantanteFamoso();

        cantanteFamoso.setNombre(nombre);
        cantanteFamoso.setDiscoConMasVentas(discoConMasVentas);

        guardarCantanteFamoso(listaCantantesFamosos, cantanteFamoso);
    }

    public void modificarCantanteFamoso(ArrayList<CantanteFamoso> listaCantantesFamosos, CantanteFamoso cantanteFamoso, String discoConMasVentas) {
        eliminarCantanteFamoso(listaCantantesFamosos, cantanteFamoso);

        cantanteFamoso.setDiscoConMasVentas(discoConMasVentas);

        guardarCantanteFamoso(listaCantantesFamosos, cantanteFamoso);
    }

    public void guardarCantanteFamoso(ArrayList<CantanteFamoso> listaCantantesFamosos, CantanteFamoso cantanteFamoso) {
        listaCantantesFamosos.add(cantanteFamoso);
    }

    public void eliminarCantanteFamoso(ArrayList<CantanteFamoso> listaCantantesCantanteFamosos, CantanteFamoso cantanteFamoso) {
        listaCantantesCantanteFamosos.remove(cantanteFamoso);
    }

    public void mostrarLista(ArrayList<CantanteFamoso> listaCantantesFamosos) {
        System.out.println("LISTA: ");

        for (CantanteFamoso c : listaCantantesFamosos) {
            System.out.println(c.getNombre() + " - " + c.getDiscoConMasVentas());
        }
    }

    public CantanteFamoso buscarCantanteFamoso(ArrayList<CantanteFamoso> listaCantantesFamosos, String nombre) {
        CantanteFamoso cantanteFamosoEncontrado = null;

        for (CantanteFamoso c : listaCantantesFamosos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                cantanteFamosoEncontrado = c;
                break;
            }
        }

        return cantanteFamosoEncontrado;
    }
}
