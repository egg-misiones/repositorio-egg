package EjemploEmpleado;

public class Principal {

    public static void main(String[] args) {
        // Se crean objetos de las subclases
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Martín", "Bocci", "111-11-1111", 800.00);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Antonia", "Pardo", "222-22-2222", 16.75, 40);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Paola", "Bento", "333-33-3333", 10000, 0.06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Patricio", "Herrera", "444-44-4444", 5000, 0.04, 300);

        System.out.println("EMPLEADOS PROCESADOS POR SEPARADO");
        System.out.println(empleadoAsalariado.toString() + "Ingresos: " + empleadoAsalariado.ingresos() + "\n");
        System.out.println(empleadoPorHoras.toString() + "Ingresos: " + empleadoPorHoras.ingresos() + "\n");
        System.out.println(empleadoPorComision.toString() + "\n" + "Ingresos: " + empleadoPorComision.ingresos() + "\n");
        System.out.println(empleadoBaseMasComision.toString() + "Ingresos: " + empleadoBaseMasComision.ingresos() + "\n");

        // Se crea un vector Empleado de cuatro elementos
        Empleado[] empleados = new Empleado[4];

        // Se inicializa el vector con objetos Empleado
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        // Se procesa de forma genérica a cada elemento del arreglo empleados
        for (Empleado empleadoActual : empleados) {
            // Se determina si el objeto es una instancia de la clase EmpleadoBaseMasComision
            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                // Se convierte empleadoActual(de tipo Empleado) es un objeto de tipo EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
                double salarioBaseAnterior = empleado.getSalarioBase();
                empleado.setSalarioBase(1.10 * salarioBaseAnterior);
                System.out.println("El salario base actualizado (10% de aumento) es : " + empleado.getSalarioBase() + "\n");
            }
        }

        // Se imprime el nombre del tipo de cada objeto del arreglo
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("El empleado " + i + " es un " + empleados[i].getClass().getSimpleName());
        }
    }
}
