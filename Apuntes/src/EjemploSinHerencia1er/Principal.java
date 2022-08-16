package EjemploSinHerencia1er;

public class Principal {

    public static void main(String[] args) {
        // Se crea un objeto de tipo EmpleadoPorComision
        EmpleadoPorComision empleado = new EmpleadoPorComision("Pablo", "Pérez", "222-22-2222", 10000, 0.06);

        // Se imprimen los datos alojados en los atributos del objeto empleado
        System.out.println("Información del empleado obtenida por medio de los métodos getters");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido: " + empleado.getApellido());
        System.out.println("Nº de seguro social: " + empleado.getNumeroSeguroSocial());
        System.out.println("Ventas brutas: " + empleado.getVentasBrutas());
        System.out.println("Tarifa por comision: " + empleado.getTarifaComision());

        // Se actualizan 2 atributos del objeto empleado por medio de los métodos setters
        empleado.setVentasBrutas(500);
        empleado.setTarifaComision(0.10);

        System.out.println();

        // Se imprimen los datos actualizados del objeto empleado por medio del método toString
        System.out.println("Información del empleado obtenida por medio del método toString");
        System.out.println(empleado.toString());
    }
}
