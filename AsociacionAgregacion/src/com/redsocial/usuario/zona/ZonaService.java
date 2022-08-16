package com.redsocial.usuario.zona;

import com.redsocial.usuario.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class ZonaService {

    private HashMap<String, Zona> zonas = new HashMap();

    public void setZonas(HashMap<String, Zona> zonas) {
        this.zonas = zonas;
    }

    public HashMap<String, Zona> getZonas() {
        return zonas;
    }

    public void crearZona(String descripcion) throws ZonaExcepcion {
        try {
            if (descripcion.isEmpty()) {
                throw new ZonaExcepcion("Debe indicar la descripción de la zona");
            }

            Zona zona = new Zona();

            zona.setDescripcion(descripcion);
            zona.setFechaAlta(new Date());

            guardarZona(zona);
        } catch (ZonaExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new ZonaExcepcion("Error de sistema");
        }
    }

    public void modificarZona(String descripcionZona, String nuevaDescripcion) throws ZonaExcepcion {
        try {
            if (descripcionZona.isEmpty()) {
                throw new ZonaExcepcion("Debe indicar la descripcion de la zona que desea modificar");
            }

            Zona zona = buscarZona(descripcionZona);

            if (nuevaDescripcion.isEmpty()) {
                throw new ZonaExcepcion("Debe indicar la nueva descripcion de la zona");
            }

            zona.setDescripcion(nuevaDescripcion);
            zona.setFechaModificacion(new Date());

            guardarZona(zona);
        } catch (ZonaExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new ZonaExcepcion("Error de sistema");
        }
    }

    public void guardarZona(Zona zona) {
        zonas.put(zona.getDescripcion(), zona);
    }

    public Zona buscarZona(String descripcion) {
        Zona zonaEncontrada = zonas.get(descripcion);

        return zonaEncontrada;
    }

    public void imprimirZonas() throws ZonaExcepcion {
        try {
            if (zonas.isEmpty()) {
                throw new ZonaExcepcion("No existen zonas para imprimir");
            } else {
                for (Zona z : zonas.values()) {
                    System.out.println(z.getDescripcion());
                }
            }
        } catch (ZonaExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new ZonaExcepcion("Error de sistema");
        }
    }

    public void imprimirZona(String descripcion) throws ZonaExcepcion {
        try {
            if (descripcion.isEmpty()) {
                throw new ZonaExcepcion("Debe indicar la descripcion de la zona que desea imprimir");
            }

            Zona zonaBuscada = buscarZona(descripcion);

            System.out.println(zonaBuscada.getDescripcion());
        } catch (ZonaExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new ZonaExcepcion("Error de sistema");
        }
    }

    public void agregarUsuario(String nombre, Usuario usuario) throws ZonaExcepcion {
        try {
            // Se busca la zona
            Zona zona = buscarZona(nombre);

            // Se obtienen los usuarios que ya tiene la lista
            ArrayList<Usuario> usuarios = zona.getUsuarios();

            // Se agrega el usuario a la zona
            usuarios.add(usuario);

            // Se actualiza la zona con el nuevo usuario
            zona.setUsuarios(usuarios);

            // Se guarda la zona
            guardarZona(zona);
        } catch (Exception error) {
            error.printStackTrace();
            throw new ZonaExcepcion("Error de sistema");
        }
    }

    public void imprimirUsuarioDeZona(String descripcion) throws ZonaExcepcion {
        try {
            // Se busca la zona
            Zona zona = buscarZona(descripcion);

            System.out.println(zona.getDescripcion());

            for (Usuario u : zona.getUsuarios()) {
                System.out.println(u.getCorreoElectronico());
            }
        } catch (Exception error) {
            error.printStackTrace();
            throw new ZonaExcepcion("Error de sistema");
        }
    }
}
