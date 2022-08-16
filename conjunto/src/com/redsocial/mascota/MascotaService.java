package com.redsocial.mascota;

import com.redsocial.utilidad.Utilidad;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class MascotaService {

    // Conjunto de mascotas
    private HashSet<Mascota> listaMascota = new HashSet();

    public void setListaMascota(HashSet<Mascota> listaMascota) {
        this.listaMascota = listaMascota;
    }

    public HashSet<Mascota> getListaMascota() {
        return listaMascota;
    }

    public void crearMascota(String nombre, String tipoMascota, String color, String raza, String sexo, double peso, double altura, boolean vacuna, boolean desparasitada, int anioNacimiento, int mesNacimiento, int diaNacimiento) {
        Date fechaNacimiento = Utilidad.convertirAnioMesDiaEnDate(anioNacimiento, mesNacimiento, diaNacimiento);

        // Se crea un objeto de tipo Mascota
        Mascota mascota = new Mascota();

        // Se asignan valores al objeto de tipo Mascota
        nombre = Utilidad.borrarTilde(nombre);
        mascota.setNombre(nombre);
        mascota.setTipoMascota(tipoMascota);
        mascota.setColor(color);
        mascota.setRaza(raza);
        mascota.setSexo(sexo);
        mascota.setPeso(peso);
        mascota.setAltura(altura);
        mascota.setVacuna(vacuna);
        mascota.setDesparasitada(desparasitada);
        mascota.setFechaNacimiento(fechaNacimiento);
        mascota.setFechaAlta(new Date());

        // Se guarda el objeto de tipo Mascota en el conjunto
        guardarMascota(mascota);
    }

    public void crearMascota(String nombre, String tipoMascota, String color, String raza, String sexo, double peso, double altura, boolean vacuna, boolean desparasitada, String fechaNacimientoMascota) {
        Date fechaNacimiento = Utilidad.convertirStringEnDate(fechaNacimientoMascota);

        // Se crea un objeto de tipo Mascota
        Mascota mascota = new Mascota();

        // Se asignan valores al objeto de tipo Mascota
        nombre = Utilidad.borrarTilde(nombre);
        mascota.setNombre(nombre);
        mascota.setTipoMascota(tipoMascota);
        mascota.setColor(color);
        mascota.setRaza(raza);
        mascota.setSexo(sexo);
        mascota.setPeso(peso);
        mascota.setAltura(altura);
        mascota.setVacuna(vacuna);
        mascota.setDesparasitada(desparasitada);
        mascota.setFechaNacimiento(fechaNacimiento);
        mascota.setFechaAlta(new Date());

        // Se guarda el objeto de tipo Mascota en el conjunto
        guardarMascota(mascota);
    }

    public void modificarMascota(Mascota mascota, String raza) {
        // Se modifica la raza del objeto de tipo Mascota
        mascota.setRaza(raza);
        mascota.setFechaModificacion(new Date());

        // Se guarda el objeto de tipo Mascota en el conjunto
        guardarMascota(mascota);
    }

    public void modificarMascota(Mascota mascota, String raza, String color) {
        // Se modifica la raza y el color del objeto de tipo Mascota
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setFechaModificacion(new Date());

        // Se guarda el objeto de tipo Mascota en el conjunto
        guardarMascota(mascota);
    }

    public void eliminarMoscota(Mascota mascota) {
        listaMascota.remove(mascota);
    }

    public void vaciarListaDeMascota() {
        listaMascota.clear();
    }

    public Mascota buscarMascota(String nombre) {
        Mascota mascotaEncontrada = null;

        for (Mascota m : listaMascota) {
            if (m.getNombre().equals(nombre)) {
                mascotaEncontrada = m;
                break;
            }
        }

        return mascotaEncontrada;
    }

    public Mascota buscarMascotaIterador(String nombre) {
        Mascota mascotaEncontrada = null;

        // Se obtiene el iterador
        Iterator iterador = listaMascota.iterator();

        // Se recorre el conjunto
        while (iterador.hasNext()) {
            Mascota m = (Mascota) iterador.next();
            if (m.getNombre().equals(nombre)) {
                mascotaEncontrada = m;
                break;
            }
        }

        return mascotaEncontrada;
    }

    public void imprimirLista() {
        if (listaMascota.isEmpty()) {
            System.out.println("La lista se encuentra vacía");
        } else {
            for (Mascota m : listaMascota) {
                System.out.println("***INICIO***");
                System.out.println(m.getNombre());
                System.out.println(m.getTipoMascota());
                System.out.println(m.getColor());
                System.out.println(m.getRaza());
                System.out.println(m.getSexo());
                System.out.println(m.getPeso());
                System.out.println(m.isVacuna());
                System.out.println(m.isDesparasitada());
                System.out.println(Utilidad.convertirDateEnString(m.getFechaNacimiento()));
                System.out.println(Utilidad.convertirDateEnString(m.getFechaAlta()));
                System.out.println("***CIERRE***");
            }
        }
    }

    public void imprimirMascota(String nombre) {
        Mascota mascotaBuscada = buscarMascota(nombre);

        System.out.println("***INICIO***");
        System.out.println(mascotaBuscada.getNombre());
        System.out.println(mascotaBuscada.getTipoMascota());
        System.out.println(mascotaBuscada.getColor());
        System.out.println(mascotaBuscada.getRaza());
        System.out.println(mascotaBuscada.getSexo());
        System.out.println(mascotaBuscada.getPeso());
        System.out.println(mascotaBuscada.isVacuna());
        System.out.println(mascotaBuscada.isDesparasitada());
        System.out.println(Utilidad.convertirDateEnString(mascotaBuscada.getFechaNacimiento()));
        System.out.println(Utilidad.convertirDateEnString(mascotaBuscada.getFechaAlta()));
        System.out.println("***CIERRE***");
    }

    public void eliminarMascota(Mascota mascota) {
        mascota = null;
    }

    public void cantidadDeMascota() {
        int cantidad = 0;

        cantidad = listaMascota.size();

        System.out.println("Cantidad de mascotas: " + cantidad);
    }

    public void guardarMascota(Mascota mascota) {
        listaMascota.add(mascota);
    }
}
