package com.excepcion;

public class Principal {

    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();
        Persona persona1;
        Persona persona2;
        Persona persona3;
        Persona personaExcepcion = null;

        try {
            personaService.esMayorDeEdad(personaExcepcion);
        } catch (NullPointerException e) {
            System.err.println("Tipo de excepción: " + e.getClass().getSimpleName());
        }

        persona1 = personaService.crearPersona();
        persona2 = personaService.crearPersona();
        persona3 = personaService.crearOtraPersona();
        persona1 = personaService.leerPrimero(persona1);
        System.out.println();
        persona2 = personaService.leerSegundo(persona2);
        System.out.println();
        imc(personaService.calcularIMC(persona1), 1);
        imc(personaService.calcularIMC(persona2), 2);
        imc(personaService.calcularIMC(persona3), 3);
        System.out.println();
        edad(personaService.esMayorDeEdad(persona1), 1);
        edad(personaService.esMayorDeEdad(persona2), 2);
        edad(personaService.esMayorDeEdad(persona3), 3);
        System.out.println();
        personaService.imprimirDatos(persona1);
        System.out.println();
        personaService.imprimirDatos(persona2);
        System.out.println();
        personaService.imprimirDatos(persona3);
    }

    public static void imc(int nro, int nroObjeto) {
        switch (nro) {
            case -1:
                System.out.println("Nivel de peso: Bajo peso (Persona " + nroObjeto + ")");
                break;
            case 0:
                System.out.println("Nivel de peso: Normal (Persona " + nroObjeto + ")");
                break;
            case 1:
                System.out.println("Nivel de peso: Sobrepeso (Persona " + nroObjeto + ")");
                break;
        }
    }

    public static void edad(boolean valor, int nroObjeto) {
        if (valor) {
            System.out.println("Es mayor de edad (Persona " + nroObjeto + ")");
        } else {
            System.out.println("Es menor de edad (Persona " + nroObjeto + ")");
        }
    }
}
