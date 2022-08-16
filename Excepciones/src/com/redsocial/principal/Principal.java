package com.redsocial.principal;

/*
EXCEPCIONES
 */
import com.redsocial.mascota.MascotaExcepcion;
import com.redsocial.mascota.MascotaService;

public class Principal {

    public static void main(String[] args) {
        // Se crea un objeto de tipo MascotaService
        MascotaService mascotaService = new MascotaService();

        try {
            // Se crea un objeto de tipo Mascota
            mascotaService.crearMascota("BENJI", "PERRO", "BLANCO", "BULDOG", "MACHO", 4.2, 2.1, false, true, "25/05/2020");
            /*
            // Se crea otro objeto de tipo Mascota
            mascotaService.crearMascota("REX", "", "NEGRO", "BOXER", "HEMBRE", 4.4, 2.0, true, false, "20/10/2020");
            
            // Se busca un objeto de tipo Mascota
            mascotaService.buscarMascota("AMELIA");
            
            // Se elimina la lista de mascotas
            mascotaService.vaciarListaDeMascota();
             */
            // Se muestran los datos de los objetos contenidos en la lista
            mascotaService.imprimirLista();
        } catch (MascotaExcepcion error) {
            System.out.println(error.getMessage());
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
