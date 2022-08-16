package EjemploInterfaz;

/*
TEORÍA
Cuando una clase implementa a una interfaz, se aplica la misma relación “es un” que proporciona la herencia.
Por tanto, un objeto de una clase que implemente a una interfaz puede considerarse como un objeto del tipo
de la interfaz.
Asimismo, los objetos de cualquier subclase de la clase que implementa a la interfaz también pueden considerarse
como objetos del tipo de la interfaz.

EJEMPLO
La clase Empleado implementa a PorPagar, por lo que podemos decir que un objeto Empleado es un objeto PorPagar.
De hecho, los objetos de cualquier clase que extienda a Empleado son también objetos PorPagar. Los objetos
EmpleadoAsalariado son objetos PorPagar. Por ende, así como podemos asignar la referencia de un objeto
EmpleadoAsalariado a una variable de la superclase Empleado, también podemos asignar la referencia de un
objeto EmpleadoAsalariado a una variable de la interfaz PorPagar. Factura implementa a PorPagar, por lo
que un objeto Factura también es un objeto PorPagar, y podemos asignar la referencia de un objeto Factura a
una variable PorPagar.
 */
public class Principal {

    public static void main(String[] args) {
        // Se crea un vector de tipo PorPagar de cuatro elementos
        PorPagar[] objetosPorPagar = new PorPagar[4];

        // Se llena el vector con objetos que implementan la interfaz PorPagar
        objetosPorPagar[0] = new Factura("01234", "Motor", 2, 950.00);
        objetosPorPagar[1] = new Factura("56789", "Espejo", 4, 100.00);
        objetosPorPagar[2] = new EmpleadoAsalariado("Lorenzo", "Solaro", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Leandro", "Vega", "888-88-8888", 1200.00);

        System.out.println("FACTURAS Y EMPLEADOS PROCESADOS EN FORMA POLIFÓRMICA");

        for (PorPagar porPagarActual : objetosPorPagar) {
            System.out.println(porPagarActual.toString());
            System.out.println("Pago vencido: " + porPagarActual.obtenerMontoPago());
        }
    }
}
