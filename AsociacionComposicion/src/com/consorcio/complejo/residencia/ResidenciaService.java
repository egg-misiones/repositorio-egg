package com.consorcio.complejo.residencia;

import java.util.Date;

public class ResidenciaService {

    public Residencia crearResidencia(String duenioResidencia, String tipoResidencia, String numeracionResidencia, double costoExpensas) throws ResidenciaExcepcion {
        try {
            if (duenioResidencia.isEmpty()) {
                throw new ResidenciaExcepcion("Debe indicar el dueño de la residencia");
            }

            if (tipoResidencia.isEmpty()) {
                throw new ResidenciaExcepcion("Debe indicar el tipo de residencia");
            }

            if (numeracionResidencia.isEmpty()) {
                throw new ResidenciaExcepcion("Debe indicar la numeración de la residencia");
            }

            if (costoExpensas < 0.0) {
                throw new ResidenciaExcepcion("Debe indicar el costo de las expensas");
            }

            Residencia residencia = new Residencia();

            residencia.setDuenioResidencia(duenioResidencia);
            residencia.setTipoResidencia(tipoResidencia);
            residencia.setNumeracionResidencia(numeracionResidencia);
            residencia.setCostoExpensas(costoExpensas);
            residencia.setFechaAlta(new Date());

            return residencia;
        } catch (ResidenciaExcepcion error) {
            throw error;
        } catch (Exception error) {
            error.printStackTrace();
            throw new ResidenciaExcepcion("Error de sistema");
        }
    }
}
