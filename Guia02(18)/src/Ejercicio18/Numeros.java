package Ejercicio18;

public class Numeros {

    private double[] arregloMayor;
    private double[] arregloMenor;

    public Numeros() {
        arregloMayor = new double[50];
        for (int i = 0; i < arregloMayor.length; i++) {
            arregloMayor[i] = (int) (Math.random() * 50);
        }
        arregloMenor = new double[20];
        for (int i = 0; i < arregloMenor.length; i++) {
            arregloMenor[i] = (int) (Math.random() * 20);
        }
    }

    public void setArregloMayor(double[] arregloMayor) {
        this.arregloMayor = arregloMayor;
    }

    public void setArregloMenor(double[] arregloMenor) {
        this.arregloMenor = arregloMenor;
    }

    public double[] getArregloMayor() {
        return arregloMayor;
    }

    public double[] getArregloMenor() {
        return arregloMenor;
    }
}
