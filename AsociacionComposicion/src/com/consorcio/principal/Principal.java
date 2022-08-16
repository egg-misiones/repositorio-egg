package com.consorcio.principal;

import com.consorcio.complejo.ComplejoHabitacionalExcepcion;
import com.consorcio.complejo.ComplejoHabitacionalService;
import com.consorcio.complejo.residencia.Residencia;
import com.consorcio.complejo.residencia.ResidenciaExcepcion;
import com.consorcio.complejo.residencia.ResidenciaService;

public class Principal {

    public static void main(String[] args) {
        ResidenciaService residenciaService = new ResidenciaService();
        ComplejoHabitacionalService complejoHabitacionalService = new ComplejoHabitacionalService();

        try {
            // COMPLEJO
            complejoHabitacionalService.crearComplejoHabitacional("TOWER", "San Martín 1589", "EDIFICIO");

            // RESIDENCIA
            Residencia residencia1 = residenciaService.crearResidencia("PEDRO RAMOS", "DEPARTAMENTO", "PISO 1 DPTO A", 5500);
            complejoHabitacionalService.agregarResidenciaAlComplejo("TOWER", residencia1);
            
            Residencia residencia2 = residenciaService.crearResidencia("CRISTIAN SOLIS", "DEPARTAMENTO", "PISO 1 DPTO B", 5000);
            complejoHabitacionalService.agregarResidenciaAlComplejo("TOWER", residencia2);
            
            Residencia residencia3 = residenciaService.crearResidencia("MARTIN BELLO", "DEPARTAMENTO", "PISO 1 DPTO C", 5500);
            complejoHabitacionalService.agregarResidenciaAlComplejo("TOWER", residencia3);
            
            complejoHabitacionalService.imprimirResidenciaDeComplejoHabitacional("TOWER");

        } catch (ResidenciaExcepcion | ComplejoHabitacionalExcepcion error) {
            System.out.println(error.getMessage());
        }
    }
}
