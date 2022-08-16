package com.redsocial.principal;

/*
COLECCIONES - CONJUNTO
 */
import com.redsocial.mascota.Mascota;
import com.redsocial.mascota.MascotaService;

public class Principal {

    public static void main(String[] args) {
        // Se crea un objeto de tipo MascotaService
        MascotaService mascotaService = new MascotaService();

        // Se crean tres objetos de tipo Mascota
        mascotaService.crearMascota("BENJI", "PERRO", "BLANCO", "BULDOG", "MACHO", 4.2, 2.1, false, true, "12/05/2019");
        mascotaService.crearMascota("AMELIA", "PERRO", "GRIS", "CANICHE", "HEMBRE", 4.0, 2.5, true, true, "05/06/2016");
        mascotaService.crearMascota("REX", "PERRO", "NEGRO", "BOXER", "HEMBRE", 4.4, 2.0, true, false, "25/12/2020");

        // Se muestra la cantidad de objetos contenidos en el conjunto
        mascotaService.cantidadDeMascota();

        // Se muestran los datos de los objetos contenidos en el conjunto
        mascotaService.imprimirLista();

        // Se modifica la raza
        Mascota mascotaAuxiliar = mascotaService.buscarMascota("AMELIA");
        mascotaService.modificarMascota(mascotaAuxiliar, "PUG");
        mascotaService.imprimirMascota("AMELIA");

        // Se modifica la raza y el color
        mascotaService.modificarMascota(mascotaService.buscarMascotaIterador("REX"), "CHIHUAHUA", "BLANCO");
        mascotaService.imprimirMascota("REX");

        // Se elimina el conjunto de mascotas
        mascotaService.vaciarListaDeMascota();

        // Se muestran los datos de los objetos contenidos en el conjunto
        mascotaService.imprimirLista();

        /*
        DUPLICAR INFORMACIÓN
         */
        // Se crea un objeto de tipo Mascota
        mascotaService.crearMascota("BENJI", "PERRO", "BLANCO", "BULDOG", "MACHO", 4.2, 2.1, false, true, "12/05/2019");

        // Se muestran los datos de los objetos contenidos en el conjunto
        mascotaService.imprimirLista();

        // Se busca un objeto y se guarda en el conjunto
        mascotaService.guardarMascota(mascotaService.buscarMascota("BENJI"));

        // Se muestra la cantidad de objetos contenidos en el conjunto
        mascotaService.cantidadDeMascota();

        // Se muestran los datos de los objetos contenidos en el conjunto
        mascotaService.imprimirLista();
    }
}
