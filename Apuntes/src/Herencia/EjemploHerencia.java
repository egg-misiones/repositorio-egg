package Herencia;

import java.util.Date;

/*
- SINTAXIS BÁSICA:

class Persona {...} // Definición de la clase padre

class Empleado extends Persona {} // Definición de la clase hija

class Gerente extends Empleado {} // Definición de otra clase hija

Aclaración: En Java, todas las clases son hijas de la clase Object de manera
directa o indirecta.

- USO DE SUPER Y THIS:

class Persona { // Definición de la clase padre
    
    public Persona(String nombre) { // Constructor
        this.nombre = nombre;
    }
}

class Empleado extends Persona { // Definición de la clase hija
    
    public Empleado(String nombre, double sueldo) { // Constructor
        super(nombre); // Super debe ser la primera línea
        this.sueldo = sueldo;
    }

    public static void main(String[] args) { //Creación de un objeto Empleado
        Empleado primerEmpleado = new Empleado("Pablo", 40000);
    }
}

- TOSTRING Y SUPER:

public class Persona {
    
    @Override
    public String toString() { // Método toString
        return "Persona {idPersona = " + idPersona
                         + ", nombre = " + nombre
                         + ", edad = " + edad + "}";
    }
}

Primero, invocamos el método toString de la clase Persona

public class Empleado extends Persona {

    @Override
    public String toString() { // Método toString
        return super.toString() + "Empleado {sueldo = " + sueldo + "}";
    }
}

 */
public class EjemploHerencia {

    public static void main(String[] args) {
        Empleado primerEmpleado = new Empleado("Juan", 5000);

        primerEmpleado.setEdad(25);
        primerEmpleado.setGenero('M');
        primerEmpleado.setDireccion("Juan B. Justo 532");

        System.out.println(primerEmpleado);
        System.out.println();

        Cliente primerCliente = new Cliente(new Date(), true);

        primerCliente.setNombre("Andrés");
        primerCliente.setGenero('F');
        primerCliente.setEdad(22);
        primerCliente.setDireccion("Vicente López 820");

        System.out.println(primerCliente);
    }
}
