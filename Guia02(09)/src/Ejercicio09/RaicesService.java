package Ejercicio09;

public class RaicesService {

    public Raices crearRaices(double A, double B, double C) {
        Raices raices = new Raices();

        raices.setA(A);
        raices.setB(B);
        raices.setC(C);

        return raices;
    }

    public void obtenerRaices(Raices raices) {
        double X1, X2;
        X1 = (-raices.getB() - Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
        X2 = (-raices.getB() + Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
        System.out.println("Dado que el discriminante es mayor que 0, las dos raíces son reales y distintas");
        System.out.println("X1: " + X1);
        System.out.println("X2: " + X2);
    }

    public void obtenerRaiz(Raices raices) {
        double X1, X2;
        X1 = -raices.getB() / (2 * raices.getA());
        X2 = X1;
        System.out.println("Dado que el discriminante es igual a 0, las dos raíces son reales e iguales");
        System.out.println("X1: " + X1);
        System.out.println("X2: " + X2);
    }

    public double getDiscriminante(Raices raices) {
        double discriminante;
        discriminante = Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC();
        return discriminante;
    }

    public boolean tieneRaices(Raices raices) {
        if (getDiscriminante(raices) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz(Raices raices) {
        if (getDiscriminante(raices) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void calcular(Raices raices) {
        if (tieneRaices(raices)) {
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("Dado que el discriminante es menor que 0, las dos raíces son complejas conjugadas");
        }
    }
}
