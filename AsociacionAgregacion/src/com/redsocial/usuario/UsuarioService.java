package com.redsocial.usuario;

import java.util.Date;
import java.util.HashMap;

public class UsuarioService {

    private HashMap<String, Usuario> usuarios = new HashMap();

    public void setUsuarios(HashMap<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void crearUsuario(String correoElectronico, String clave) throws UsuarioExcepcion {
        try {
            if (correoElectronico.isEmpty()) {
                throw new UsuarioExcepcion("Debe indicar el correo electrónico");
            }

            if (correoElectronico.contains("@") == false) {
                throw new UsuarioExcepcion("El correo electrónico es inválido");
            }

            if (clave.isEmpty()) {
                throw new UsuarioExcepcion("Debe indicar la clave del usuario");
            }

            if (clave.length() < 8) {
                throw new UsuarioExcepcion("La clave no puede tener menos de 8 caracteres");
            }

            try {
                buscarUsuario(correoElectronico);
                throw new UsuarioExcepcion("Ya existe un usuario con el correo electrónico ingresado");
            } catch (UsuarioExcepcion error) {
                Usuario usuario = new Usuario();

                usuario.setCorreoElectronico(correoElectronico);
                usuario.setClave(clave);
                usuario.setFechaAlta(new Date());

                guardarUsuario(usuario);
            }
        } catch (UsuarioExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new UsuarioExcepcion("Error de sistema");
        }
    }

    public void modificarUsuario(String correoElectronico, String claveActual, String nuevaClave) throws UsuarioExcepcion {
        try {
            Usuario usuario = buscarUsuario(correoElectronico);

            if (claveActual.isEmpty()) {
                throw new UsuarioExcepcion("Debe indicar la clave actual");
            }

            if (!usuario.getClave().equals(claveActual)) {
                throw new UsuarioExcepcion("La clave actual no es la registrada en el sistema");
            }

            if (nuevaClave.isEmpty()) {
                throw new UsuarioExcepcion("Debe indicar la nueva clave");
            }

            usuario.setClave(nuevaClave);
            usuario.setFechaModificacion(new Date());

            guardarUsuario(usuario);
        } catch (UsuarioExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new UsuarioExcepcion("Error de sistema");
        }
    }

    public void guardarUsuario(Usuario usuario) {
        usuarios.put(usuario.getCorreoElectronico(), usuario);
    }

    public Usuario buscarUsuario(String correoElectronico) throws UsuarioExcepcion {
        try {
            if (correoElectronico.isEmpty()) {
                throw new UsuarioExcepcion("Debe indicar el correo electrónico");
            }

            Usuario usuarioEncontrada = usuarios.get(correoElectronico);

            if (usuarioEncontrada == null) {
                throw new UsuarioExcepcion("No se encontró usuario con el correro electrónico indicado");
            }

            return usuarioEncontrada;
        } catch (UsuarioExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new UsuarioExcepcion("Error de sistema");
        }
    }

    public void imprimirUsuarios() throws UsuarioExcepcion {
        try {
            if (usuarios.isEmpty()) {
                throw new UsuarioExcepcion("No existen usuarios para imprimir");
            } else {
                for (Usuario u : usuarios.values()) {
                    System.out.println(u.getCorreoElectronico());
                    System.out.println(u.getClave());
                }
            }
        } catch (UsuarioExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new UsuarioExcepcion("Error de sistema");
        }
    }

    public void imprimirUsuario(String correoElectronico) throws UsuarioExcepcion {
        try {
            Usuario usuario = buscarUsuario(correoElectronico);

            System.out.println(usuario.getCorreoElectronico());
            System.out.println(usuario.getClave());
        } catch (Exception error) {
            error.printStackTrace();
            throw new UsuarioExcepcion("Error de sistema");
        }
    }
}
