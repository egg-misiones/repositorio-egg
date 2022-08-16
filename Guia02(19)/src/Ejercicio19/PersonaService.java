package Ejercicio19;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PersonaService {

    public Persona crearPersona(String nombre, int anio, int mes, int dia) {
        Date fecha = convertirEnDate(anio, mes, dia);
        Persona persona = new Persona(nombre, fecha);

        return persona;
    }

    public Date convertirEnDate(int anio, int mes, int dia) {
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.set(anio, mes, dia, 0, 0);
        Date fecha = calendario.getTime();

        return fecha;
    }

    public String convertirEnString(Date fecha) {
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setTime(fecha);
        String fechaString;
        int dia, mes, anio;

        dia = calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH);
        mes = mes + 1;
        anio = calendario.get(Calendar.YEAR);

        fechaString = dia + "/" + mes + "/" + anio;

        return fechaString;
    }

    public Persona leer() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int dia, mes, anio;

        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Indique su fecha de nacimiento: ");
        System.out.print("Día: ");
        dia = entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        mes = mes - 1;
        System.out.print("Año: ");
        anio = entrada.nextInt();

        return crearPersona(nombre, anio, mes, dia);
    }

    public void imprimirDatos(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + convertirEnString(persona.getFechaNacimiento()));
    }

    public void calcularEdad(Persona persona) {
        GregorianCalendar fechaActual = new GregorianCalendar();
        GregorianCalendar fechaNacimiento = new GregorianCalendar();
        fechaNacimiento.setTime(persona.getFechaNacimiento());
        int dia, mes, anio;

        dia = fechaActual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);
        mes = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
        anio = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);

        if (mes < 0 || mes == 0 && dia < 0) {
            anio--;
        }

        System.out.println("Edad: " + anio + " años (" + persona.getNombre() + ")");
    }

    public void calcularMenor(Persona persona1, Persona persona2) {
        GregorianCalendar calendario1 = new GregorianCalendar();
        GregorianCalendar calendario2 = new GregorianCalendar();
        calendario1.setTime(persona1.getFechaNacimiento());
        calendario2.setTime(persona2.getFechaNacimiento());
        int dia, mes, anio;

        dia = calendario1.get(Calendar.DATE) - calendario2.get(Calendar.DATE);
        mes = calendario1.get(Calendar.MONTH) - calendario2.get(Calendar.MONTH);
        anio = calendario1.get(Calendar.YEAR) - calendario2.get(Calendar.YEAR);

        if (dia == 0 && mes == 0 && anio == 0) {
            System.out.println(persona1.getNombre() + " tiene la misma edad que " + persona2.getNombre());
        } else if (persona1.getFechaNacimiento().after(persona2.getFechaNacimiento())) {
            System.out.println(persona1.getNombre() + " es menor que " + persona2.getNombre());
        } else {
            System.out.println(persona2.getNombre() + " es menor que " + persona1.getNombre());
        }
    }
}
