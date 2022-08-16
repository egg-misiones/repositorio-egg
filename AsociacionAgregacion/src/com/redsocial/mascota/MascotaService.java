package com.redsocial.mascota;

import com.redsocial.usuario.Usuario;
import com.redsocial.utilidad.Utilidad;
import java.util.Date;
import java.util.HashSet;

public class MascotaService {

    private HashSet<Mascota> listaMascota = new HashSet();

    public void setListaMascota(HashSet<Mascota> listaMascota) {
        this.listaMascota = listaMascota;
    }

    public HashSet<Mascota> getListaMascota() {
        return listaMascota;
    }

    public void crearMascota(String nombre, String tipoMascota, String color, String raza, String sexo, double peso, double altura, boolean vacuna, boolean desparasitada, int anioNacimiento, int mesNacimiento, int diaNacimiento, Usuario usuario) throws MascotaExcepcion {
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
                throw new MascotaExcepcion("Debe indicar el sexo de la mascota");
            }

            if (peso <= 0.0) {
                throw new MascotaExcepcion("El peso no puede ser menor o igual a 0");
            }

            if (altura <= 0.0) {
                throw new MascotaExcepcion("La altura no puede ser menor o igual a 0");
            }

            if (usuario == null) {
                throw new MascotaExcepcion("Debe indicar un usuario de la mascota");
            }

            Date fechaNacimiento = Utilidad.convertirAnioMesDiaEnDate(anioNacimiento, mesNacimiento, diaNacimiento);

            Mascota mascota = new Mascota();

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
            mascota.setUsuario(usuario);

            guardarMascota(mascota);
        } catch (MascotaExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new MascotaExcepcion("Error de sistema");
        }
    }

    public void crearMascota(String nombre, String tipoMascota, String color, String raza, String sexo, double peso, double altura, boolean vacuna, boolean desparasitada, String fechaNacimientoMascota, Usuario usuario) throws MascotaExcepcion {
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
                throw new MascotaExcepcion("Debe indicar el sexo de la mascota");
            }

            if (peso <= 0.0) {
                throw new MascotaExcepcion("El peso no puede ser menor o igual a 0");
            }

            if (altura <= 0.0) {
                throw new MascotaExcepcion("La altura no puede ser menor o igual a 0");
            }

            if (usuario == null) {
                throw new MascotaExcepcion("Debe indicar un usuario de la mascota");
            }

            Date fechaNacimiento = Utilidad.convertirStringEnDate(fechaNacimientoMascota);

            Mascota mascota = new Mascota();

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
            mascota.setUsuario(usuario);

            guardarMascota(mascota);
        } catch (MascotaExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new MascotaExcepcion("Error de sistema");
        }
    }

    public void modificarMascota(Mascota mascota, String raza) throws MascotaExcepcion {
        try {
            if (mascota == null) {
                throw new MascotaExcepcion("Debe indicar la mascota que desea modificar");
            }

            if (raza.isEmpty()) {
                throw new MascotaExcepcion("Debe indicar la raza de la mascota");
            }

            mascota.setRaza(raza);
            mascota.setFechaModificacion(new Date());

            guardarMascota(mascota);
        } catch (MascotaExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new MascotaExcepcion("Error de sistema");
        }
    }

    public void modificarMascota(Mascota mascota, String raza, String color) throws MascotaExcepcion {
        try {
            if (mascota == null) {
                throw new MascotaExcepcion("Debe indicar la mascota que desea modificar");
            }

            if (raza.isEmpty()) {
                throw new MascotaExcepcion("Debe indicar la raza de la mascota");
            }

            if (color.isEmpty()) {
                throw new MascotaExcepcion("Debe indicar el color de la mascota");
            }

            mascota.setRaza(raza);
            mascota.setColor(color);
            mascota.setFechaModificacion(new Date());

            guardarMascota(mascota);
        } catch (MascotaExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new MascotaExcepcion("Error de sistema");
        }
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
                    System.out.println(m.getUsuario().getCorreoElectronico());
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
        try {
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
        } catch (Exception error) {
            error.printStackTrace();
            throw new MascotaExcepcion("Error de sistema");
        }
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
