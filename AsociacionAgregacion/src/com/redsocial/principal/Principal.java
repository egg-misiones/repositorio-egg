package com.redsocial.principal;

/*
ASOCIACIÓN DE AGREGACIÓN
 */
import com.redsocial.usuario.UsuarioService;
import com.redsocial.usuario.zona.ZonaService;

public class Principal {

    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();
        ZonaService zonaService = new ZonaService();

        try {
            // ZONA
            zonaService.crearZona("Argentina - Mendoza - Capital");

            // USUARIO
            usuarioService.crearUsuario("programacionegg@gmail.com", "codejava");
            usuarioService.crearUsuario("eggprogramacion@gmail.com", "javacode");

            // AGREGACIÓN
            zonaService.agregarUsuario("Argentina - Mendoza - Capital", usuarioService.buscarUsuario("programacionegg@gmail.com"));
            zonaService.agregarUsuario("Argentina - Mendoza - Capital", usuarioService.buscarUsuario("eggprogramacion@gmail.com"));
            zonaService.imprimirUsuarioDeZona("Argentina - Mendoza - Capital");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
