package EjemploSinHerencia2do;

public class Principal {

    public static void main(String[] args) {
        // Se crea un objeto de tipo EmpleadoBaseMasComision
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision("Carlos", "Fontana", "333-33-3333", 5000, 0.04, 300);

        // Se imprimen los datos alojados en los atributos del objeto empleado
        System.out.println("Información del empleado obtenida por medio de los métodos getters");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido: " + empleado.getApellido());
        System.out.println("Nº de seguro social: " + empleado.getNumeroSeguroSocial());
        System.out.println("Ventas brutas: " + empleado.getVentasBrutas());
        System.out.println("Tarifa por comision: " + empleado.getTarifaComision());
        System.out.println("Salario base: " + empleado.getSalarioBase());

        // Se actualiza un atributo del objeto empleado por medio del método setter
        empleado.setSalarioBase(1000);

        System.out.println();

        // Se imprimen los datos actualizados del objeto empleado por medio del método toString
        System.out.println("Información del empleado obtenida por medio del método toString");
        System.out.println(empleado.toString());
    }
}
