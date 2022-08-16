package EjemploEstatico;

public class Principal {

    public static void main(String[] args) {
        // Se imprime el atributo estático antes de la creación de objetos
        System.out.println("Cantidad de empleados: " + Empleado.getCantidadEmpleados());

        // Se crean dos objetos de tipo Empleado
        Empleado primerEmpleado = new Empleado("Cristian", "Solís");
        Empleado segundoEmpleado = new Empleado("Martín", "Maldonado");

        // Se muestra la cantidad de objetos creados y sus respectivos atributos
        System.out.println("Cantidad de empleados: " + Empleado.getCantidadEmpleados());
        System.out.println("Empleado 1: " + primerEmpleado.getNombre() + " " + primerEmpleado.getApellido());
        System.out.println("Empleado 2: " + segundoEmpleado.getNombre() + " " + segundoEmpleado.getApellido());
    }
}
