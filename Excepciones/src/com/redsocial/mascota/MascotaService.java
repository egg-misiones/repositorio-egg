package com.redsocial.mascota;

import com.redsocial.utilidad.Utilidad;
import java.util.ArrayList;
import java.util.Date;

public class MascotaService {

    // Lista de mascotas
    private ArrayList<Mascota> listaMascota = new ArrayList();

    public void setListaMascota(ArrayList<Mascota> listaMascota) {
        this.listaMascota = listaMascota;
    }

    public ArrayList<Mascota> getListaMascota() {
        return listaMascota;
    }

    public void crearMascota(String nombre, String tipoMascota, String color, String raza, String sexo, double peso, double altura, boolean vacuna, boolean desparasitada, String fechaNacimientoMascota) throws MascotaExcepcion {
        try {
            if (nombre.isEmpty()) {
                throw new MascotaExcepcion("Debe indicar el nombre de la mascota");
            }

            if (tipoMascota.isEmpty()) {
                throw new MascotaExcepcion("Debe indicar el tipo de mascota");
            }

            if (color.isEmpty()) {
                throw new MascotaExcepcion("Debe indicar el color de la mascota");
            }

            if (raza.isEmpty()) {
                throw new MascotaExcepcion("Debe indicar la raza de la mascota");
            }

            if (sexo.isEmpty()) {
                throw new MascotaExcepcion("Debe indicar la raza de la mascota");
            }

            if (peso <= 0.0) {
                throw new MascotaExcepcion("El peso de la mascota no puede ser menor o igual a cero");
            }

            if (altura <= 0.0) {
                throw new MascotaExcepcion("La altura de la mascota no puede ser menor o igual a cero");
            }

            if (fechaNacimientoMascota.isEmpty()) {
                throw new MascotaExcepcion("Debe indicar la fecha de nacimiento de la mascota");
            }

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

            // Se guarda el objeto de tipo Mascota en la lista
            guardarMascota(mascota);
        } catch (MascotaExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new MascotaExcepcion("Error de sistema");
        }
    }

    public void modificarMascota(Mascota mascota, String raza) {
        // Se elimina el objeto de tipo Mascota
        eliminarMascota(mascota);

        // Se modifica la raza del objeto de tipo Mascota
        mascota.setRaza(raza);
        mascota.setFechaModificacion(new Date());

        // Se guarda el objeto de tipo Mascota en la lista
        guardarMascota(mascota);
    }

    public void modificarMascota(Mascota mascota, String raza, String color) {
        // Se elimina el objeto de tipo Mascota
        eliminarMascota(mascota);

        // Se modifica la raza y el color del objeto de tipo Mascota
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setFechaModificacion(new Date());

        // Se guarda el objeto de tipo Mascota en la lista
        guardarMascota(mascota);
    }

    public void eliminarMoscota(Mascota mascota) {
        listaMascota.remove(mascota);
    }

    public void vaciarListaDeMascota() {
        listaMascota.clear();
    }

    public Mascota buscarMascota(String nombre) throws MascotaExcepcion {
        try {
            if (nombre.isEmpty()) {
                throw new MascotaExcepcion("Debe indicar el nombre de la mascota");
            }

            Mascota mascotaEncontrada = null;

            for (Mascota m : listaMascota) {
                if (m.getNombre().equals(nombre)) {
                    mascotaEncontrada = m;
                    break;
                }
            }

            if (mascotaEncontrada == null) {
                throw new MascotaExcepcion("No se encontró una mascota con el nombre indicado");
            }

            return mascotaEncontrada;
        } catch (MascotaExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new MascotaExcepcion("Error de sistema");
        }
    }

    public void imprimirLista() throws MascotaExcepcion {
        try {
            if (listaMascota.isEmpty()) {
                throw new MascotaExcepcion("La lista se encuentra vacía");
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
        } catch (MascotaExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new MascotaExcepcion("Error de sistema");
        }
    }

    public void imprimirMascota(String nombre) throws MascotaExcepcion {
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
