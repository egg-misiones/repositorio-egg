package EjemploInterfaz;

/*
TEORÍA
La interfaz PorPagar contiene el método public abstract obtenerMontoPago.
Observe que este método no puede declararse en forma explícita como public o abstract.
Los métodos de una interfaz deben ser public y abstract, por lo cual no necesitan declararse como tales.
La interfaz PorPagar sólo tiene un método; las interfaces pueden tener cualquier número de métodos.
Además, el método obtenerMontoPago no tiene parámetros, pero los métodos de las
interfaces pueden tener parámetros.
 */
public interface PorPagar {

    double obtenerMontoPago();
}
