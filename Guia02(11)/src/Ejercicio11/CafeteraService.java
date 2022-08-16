package Ejercicio11;

public class CafeteraService {

    public Cafetera crearCafetera() {
        Cafetera cafetera = new Cafetera();

        return cafetera;
    }

    public Cafetera llenarCafetera(Cafetera cafetera) {
        cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());

        return cafetera;
    }

    public Cafetera servirTaza(Cafetera cafetera, int cantidad) {
        int cafeteraActualizada;
        cafeteraActualizada = cafetera.getCapacidadActual() - cantidad;

        if (cafeteraActualizada < 0) {
            cafetera.setCapacidadActual(0);
        } else {
            cafetera.setCapacidadActual(cafeteraActualizada);

        }

        return cafetera;
    }

    public Cafetera vaciarCafetera(Cafetera cafetera) {
        cafetera.setCapacidadActual(0);

        return cafetera;
    }

    public Cafetera agregarCafe(Cafetera cafetera, int cafe) {
        int capacidadActualizada;
        capacidadActualizada = (cafetera.getCapacidadActual() + cafe);

        if (capacidadActualizada > cafetera.getCapacidadMaxima()) {
            cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
        } else {
            cafetera.setCapacidadActual(capacidadActualizada);
        }

        return cafetera;
    }
}
