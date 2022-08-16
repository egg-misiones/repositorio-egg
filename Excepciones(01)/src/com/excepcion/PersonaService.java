package com.excepcion;

import java.util.Scanner;

public class PersonaService {

    public Persona crearPersona() {
        Persona persona = new Persona();

        return persona;
    }

    public Persona crearOtraPersona() {
        Persona persona = new Persona();

        persona.setNombre("Lorenzo");
        persona.setEdad(25);
        persona.setSexo('M');
        persona.setPeso(90);
        persona.setAltura(1.85);

        return persona;
    }

    public Persona leerPrimero(Persona persona) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        char sexo;
        double peso, altura;

        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.print("Ingrese su sexo: ");
        sexo = entrada.next().charAt(0);
        sexo = Character.toUpperCase(sexo);
        System.out.print("Ingrese su peso: ");
        peso = entrada.nextDouble();
        System.out.print("Ingrese su altura: ");
        altura = entrada.nextDouble();

        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setSexo(sexo);
        persona.setPeso(peso);
        persona.setAltura(altura);

        return persona;
    }

    public Persona leerSegundo(Persona persona) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        char sexo;

        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.print("Ingrese su sexo: ");
        sexo = entrada.next().charAt(0);
        sexo = Character.toUpperCase(sexo);

        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setSexo(sexo);
        persona.setPeso(85);
        persona.setAltura(1.80);

        return persona;
    }

    public int calcularIMC(Persona persona) {
        double resultado;

        resultado = persona.getPeso() / (Math.pow(persona.getAltura(), 2));

        if (resultado < 20) {
            return -1;
        } else if (resultado >= 20 && resultado <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(Persona persona) throws NullPointerException {
        if (persona.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void comprobarSexo(Persona persona) {
        switch (persona.getSexo()) {
            case 'H':
            case 'M':
            case 'O':
                System.out.println("El sexo ingresado es correcto");
                break;
            default:
                System.out.println("El sexo ingresado es incorrecto");
        }
    }

    public void imprimirDatos(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Sexo: " + persona.getSexo());
        System.out.println("Peso: " + persona.getPeso());
        System.out.println("Altura: " + persona.getAltura());
    }
}
