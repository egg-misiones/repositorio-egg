package EjemploConHerencia;

public class Principal {

    public static void main(String[] args) {
        // Se crea un objeto de tipo EmpleadoBaseMasComision3
        EmpleadoBaseMasComision3 empleado = new EmpleadoBaseMasComision3("Matías", "Ferro", "444-44-4444", 20000, 0.05, 500);

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
