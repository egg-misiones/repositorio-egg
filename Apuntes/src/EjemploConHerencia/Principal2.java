package EjemploConHerencia;

public class Principal2 {

    public static void main(String[] args) {
        // Se crea un objeto de tipo EmpleadoBaseMasComision4
        EmpleadoBaseMasComision4 empleado = new EmpleadoBaseMasComision4("Mario", "Orozco", "666-66-6666", 5000, 0.08, 800);

        // Se imprimen los datos alojados en los atributos del objeto empleado
        System.out.println("Información del empleado obtenida por medio de los métodos getters");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido: " + empleado.getApellido());
        System.out.println("Nº de seguro social: " + empleado.getNumeroSeguroSocial());
        System.out.println("Ventas brutas: " + empleado.getVentasBrutas());
        System.out.println("Tarifa por comision: " + empleado.getTarifaComision());
        System.out.println("Salario base: " + empleado.getSalarioBase());

        // Se actualiza un atributo del objeto empleado por medio del método setter
        empleado.setSalarioBase(1800);

        System.out.println();

        // Se imprimen los datos actualizados del objeto empleado por medio del método toString
        System.out.println("Información del empleado obtenida por medio del método toString");
        System.out.println(empleado.toString());
    }
}
