package Ejercicio18;

import java.util.Arrays;

public class NumerosService {

    public Numeros crearNumeros() {
        Numeros numeros = new Numeros();

        return numeros;
    }

    public void mostrarArreglos(Numeros numeros) {
        for (int i = 0; i < numeros.getArregloMayor().length; i++) {
            System.out.print("[" + numeros.getArregloMayor()[i] + "]");
        }
        System.out.println();
        for (int i = 0; i < numeros.getArregloMenor().length; i++) {
            System.out.print("[" + numeros.getArregloMenor()[i] + "]");
        }
        System.out.println();
    }
    
    
    
    
    
    

    
    public void ordenarArreglos(Numeros numeros) {
        Arrays.sort(numeros.getArregloMayor());
        numeros.setArregloMenor(Arrays.copyOf(numeros.getArregloMayor(), 20));
        Arrays.fill(numeros.getArregloMenor(), 10, 20, 0.5);
    }
}
