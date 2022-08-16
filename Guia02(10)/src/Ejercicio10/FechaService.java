package Ejercicio10;

import java.util.Scanner;

public class FechaService {

    public Fecha crearFecha(int dia, int mes, int anio) {
        Fecha fecha = new Fecha(dia, mes, anio);

        return fecha;
    }

    public Fecha leer() {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, anio;

        System.out.print("Ingrese un día (1 al 31): ");
        dia = entrada.nextInt();
        System.out.print("Ingrese un mes (1 al 12): ");
        mes = entrada.nextInt();
        System.out.print("Ingrese un día (1900 al 2050): ");
        anio = entrada.nextInt();

        return crearFecha(dia, mes, anio);
    }

    public void validar(Fecha fecha) {
        if (fecha.getAnio() >= 1900 && fecha.getAnio() <= 2050) {
            System.out.println("El año ingresado es válido ");
        } else {
            System.out.println("El año ingresado es inválido");
            fecha.setAnio(1900);
        }

        if (fecha.getMes() >= 1 && fecha.getMes() <= 12) {
            System.out.println("El mes ingresado es válido");
            if (fecha.getDia() >= 1 && fecha.getDia() <= diasMes(fecha.getMes(), fecha.getAnio())) {
                System.out.println("El día ingresada es válida");
            } else {
                System.out.println("El día ingresado es inválido");
                fecha.setDia(1);
            }
        } else {
            System.out.println("El mes ingresado es inválido");
            fecha.setMes(1);
            if (fecha.getDia() >= 1 && fecha.getDia() <= 31) {
                System.out.println("El día ingresada es válida");
            } else {
                System.out.println("El día ingresado es inválido");
                fecha.setDia(1);
            }
        }
    }

    public void mostrarDatos(Fecha fecha1, Fecha fecha2) {
        System.out.println("El mes ingresado por el usuario tiene " + diasMes(fecha1.getMes(), fecha1.getAnio()) + " días");
        diasTranscurridos(fecha1);
        if (fecha1.getAnio() < fecha2.getAnio()) {
            diasEntre(fecha1, fecha2);
        } else {
            diasEntre(fecha2, fecha1);
        }
        diaAnterior(fecha1);
        diaSiguiente(fecha1);
    }

    public boolean bisiesto(int fecha) {
        if ((fecha % 4 == 0) && (fecha % 100 != 0)) {
            return true;
        } else if ((fecha % 100 == 0) && (fecha % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public int diasMes(int mes, int anio) {
        switch (mes) {
            case 2:
                if (bisiesto(anio)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public void diasTranscurridos(Fecha fecha) {
        int dias;
        dias = 0;

        for (int i = 1900; i < fecha.getAnio(); i++) {
            if (bisiesto(i)) {
                dias += 366;
            } else {
                dias += 365;
            }
        }

        if (fecha.getMes() > 1) {
            for (int i = 1; i < fecha.getMes(); i++) {
                dias += diasMes(i, fecha.getAnio());
            }
        }

        dias += fecha.getDia();
        System.out.println("Días transcurridos (desde 1/1/1990 hasta " + fecha.getDia() + "/" + fecha.getMes() + "/" + fecha.getAnio() + "): " + dias);
    }

    public void diasEntre(Fecha fecha1, Fecha fecha2) {
        int dias, diasMenos;
        dias = 0;
        diasMenos = 0;

        for (int i = fecha1.getAnio(); i < fecha2.getAnio(); i++) {
            if (bisiesto(i)) {
                dias += 366;
            } else {
                dias += 365;
            }
        }

        if (fecha2.getMes() > 1) {
            for (int i = 1; i < fecha2.getMes(); i++) {
                dias += diasMes(i, fecha2.getAnio());
            }
        }

        dias += fecha2.getDia();

        if (fecha1.getMes() > 1) {
            for (int i = 1; i < fecha1.getMes(); i++) {
                diasMenos += diasMes(i, fecha1.getAnio());
            }
        }

        diasMenos += fecha1.getDia();
        dias -= diasMenos;
        System.out.println("Días transcurridos (desde " + fecha1.getDia() + "/" + fecha1.getMes() + "/" + fecha1.getAnio() + " hasta " + fecha2.getDia() + "/" + fecha2.getMes() + "/" + fecha2.getAnio() + "): " + dias);
    }

    public void diaAnterior(Fecha fecha) {
        if (fecha.getDia() > 1) {
            System.out.println("Fecha anterior: " + (fecha.getDia() - 1) + "/" + fecha.getMes() + "/" + fecha.getAnio());
        } else if (fecha.getDia() == 1 && fecha.getMes() > 1) {
            System.out.println("Fecha anterior: " + (diasMes(fecha.getMes(), fecha.getAnio()) - 1) + "/" + (fecha.getMes() - 1) + "/" + fecha.getAnio());
        } else {
            System.out.println("Fecha anterior: 31/12/" + (fecha.getAnio() - 1));
        }
    }

    public void diaSiguiente(Fecha fecha) {
        if (fecha.getDia() < diasMes(fecha.getMes(), fecha.getAnio())) {
            System.out.println("Fecha siguiente: " + (fecha.getDia() + 1) + "/" + fecha.getMes() + "/" + fecha.getAnio());
        } else if (fecha.getDia() == diasMes(fecha.getMes(), fecha.getAnio()) && fecha.getMes() < 12) {
            System.out.println("Fecha siguiente: 1/" + (fecha.getMes() + 1) + "/" + fecha.getAnio());
        } else {
            System.out.println("Fecha siguiente: 1/1/" + (fecha.getAnio() + 1));
        }
    }
}
