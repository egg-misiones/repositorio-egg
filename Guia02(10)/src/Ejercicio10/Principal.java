package Ejercicio10;

public class Principal {

    public static void main(String[] args) {
        FechaService fechaService = new FechaService();
        Fecha fecha1;
        Fecha fecha2;

        fecha1 = fechaService.leer();
        System.out.println();
        fecha2 = fechaService.crearFecha(25, 5, 2010);
        System.out.println("Fecha ingresada por el ususario: ");
        fechaService.validar(fecha1);
        System.out.println();
        System.out.println("Fecha parametrizada: ");
        fechaService.validar(fecha2);
        System.out.println();
        fechaService.mostrarDatos(fecha1, fecha2);
    }
}
