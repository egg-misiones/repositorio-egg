package com.redsocial.utilidad;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utilidad {

    public static String borrarTilde(String cadena) {
        cadena = cadena.replaceAll("Á", "A");
        cadena = cadena.replaceAll("É", "E");
        cadena = cadena.replaceAll("Í", "I");
        cadena = cadena.replaceAll("Ó", "O");
        cadena = cadena.replaceAll("Ú", "U");
        cadena = cadena.replaceAll("á", "a");
        cadena = cadena.replaceAll("é", "e");
        cadena = cadena.replaceAll("í", "i");
        cadena = cadena.replaceAll("ó", "o");
        cadena = cadena.replaceAll("ú", "u");

        return cadena;
    }

    public static Date convertirAnioMesDiaEnDate(int anio, int mes, int dia) {
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.set(anio, mes - 1, dia, 0, 0);
        Date fecha = calendario.getTime();

        return fecha;
    }

    public static Date convertirStringEnDate(String fecha) {
        String diaString = fecha.substring(0, 2);
        String mesString = fecha.substring(3, 5);
        String anioString = fecha.substring(6, fecha.length());

        int diaNumero = Integer.valueOf(diaString);
        int mesNumero = Integer.valueOf(mesString);
        int anioNumero = Integer.valueOf(anioString);

        GregorianCalendar calendario = new GregorianCalendar();
        calendario.set(anioNumero, mesNumero - 1, diaNumero, 0, 0);
        Date fechaRetorno = calendario.getTime();

        return fechaRetorno;
    }

    public static String convertirDateEnString(Date fecha) {
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setTime(fecha);

        int anio = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DATE);

        String fechaString = dia + "/" + (mes + 1) + "/" + anio;

        return fechaString;
    }
}
