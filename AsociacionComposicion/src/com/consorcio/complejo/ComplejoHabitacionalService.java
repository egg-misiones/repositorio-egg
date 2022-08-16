package com.consorcio.complejo;

import com.consorcio.complejo.residencia.Residencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class ComplejoHabitacionalService {

    private HashMap<String, ComplejoHabitacional> complejos = new HashMap();

    public void setComplejos(HashMap<String, ComplejoHabitacional> complejos) {
        this.complejos = complejos;
    }

    public HashMap<String, ComplejoHabitacional> getComplejos() {
        return complejos;
    }

    public void crearComplejoHabitacional(String nombre, String direccion, String tipoComplejo) throws ComplejoHabitacionalExcepcion {
        try {
            if (nombre.isEmpty()) {
                throw new ComplejoHabitacionalExcepcion("Debe indicar el nombre del complejo");
            }

            if (direccion.isEmpty()) {
                throw new ComplejoHabitacionalExcepcion("Debe indicar la dirección del complejo");
            }

            if (tipoComplejo.isEmpty()) {
                throw new ComplejoHabitacionalExcepcion("Debe indicar el tipo de complejo");
            }

            ComplejoHabitacional complejo = new ComplejoHabitacional();

            complejo.setNombre(nombre);
            complejo.setDireccion(direccion);
            complejo.setTipoComplejo(tipoComplejo);
            complejo.setFechaAlta(new Date());

            guardarComplejoHabitacional(complejo);
        } catch (Exception error) {
            error.printStackTrace();
            throw new ComplejoHabitacionalExcepcion("Error de sistema");
        }
    }

    public void guardarComplejoHabitacional(ComplejoHabitacional complejo) {
        complejos.put(complejo.getNombre(), complejo);
    }

    public ComplejoHabitacional buscarComplejoHabitacional(String nombreComplejo) {
        return complejos.get(nombreComplejo);
    }

    public void agregarResidenciaAlComplejo(String nombreComplejo, Residencia residencia) throws ComplejoHabitacionalExcepcion {
        try {
            // Se busca el complejo
            ComplejoHabitacional complejoHabitacional = buscarComplejoHabitacional(nombreComplejo);

            // Se obtiene la lista de residencias del complejo
            ArrayList<Residencia> residencias = complejos.get(nombreComplejo).getResidencias();

            // Se agrega la residencia
            residencias.add(residencia);
            complejoHabitacional.setResidencias(residencias);

            // Se guarda el complejo
            guardarComplejoHabitacional(complejoHabitacional);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ComplejoHabitacionalExcepcion("Error en el sistema");
        }
    }

    public void imprimirResidenciaDeComplejoHabitacional(String nombre) throws ComplejoHabitacionalExcepcion {
        try {
            ComplejoHabitacional complejoHabitacional = buscarComplejoHabitacional(nombre);

            System.out.println(complejoHabitacional.getNombre());
            for (Residencia e : complejoHabitacional.getResidencias()) {
                System.out.println(e.getDuenioResidencia());
                System.out.println(e.getTipoResidencia());
                System.out.println(e.getNumeracionResidencia());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new ComplejoHabitacionalExcepcion("Error de sistema");
        }
    }

    public void eliminarComplejoHabitacional(String nombre) throws ComplejoHabitacionalExcepcion {
        try {
            // Se busca el complejo
            ComplejoHabitacional complejoHabitacional = buscarComplejoHabitacional(nombre);

            // Se eliminan las residencias
            complejoHabitacional.setResidencias(null);

            // Se elimina el complejo
            complejoHabitacional = null;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ComplejoHabitacionalExcepcion("Error de sistema");
        }
    }
}
