package com.redsocial.principal;

/*
ASOCIACIÓN SIMPLE
 */
import com.redsocial.mascota.MascotaService;
import com.redsocial.usuario.UsuarioService;

public class Principal {

    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();
        MascotaService mascotaService = new MascotaService();

        try {
            // USUARIO
            usuarioService.crearUsuario("programacionegg@gmail.com", "codejava");
            usuarioService.crearUsuario("eggprogramacion@gmail.com", "javacode");
            usuarioService.imprimirUsuarios();

            // MASCOTA
            mascotaService.crearMascota("REX", "PERRO", "NEGRO", "BOXER", "HEMBRE", 4.4, 2.0, true, false, "25/12/2020", usuarioService.buscarUsuario("eggprogramacion@gmail.com"));
            mascotaService.crearMascota("BENJI", "PERRO", "BLANCO", "BULDOG", "MACHO", 4.2, 2.1, false, true, 2019, 05, 12, usuarioService.buscarUsuario("programacionegg@gmail.com"));
            mascotaService.imprimirLista();
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
