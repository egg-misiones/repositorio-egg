package Guia01;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad, i, contador;
        double estatura, promedio1, promedio2, suma1, suma2;

        do {
            System.out.println("Indique la cantidad de estaturas que desea ingresar: ");
            System.out.println("Aclaración: el número debe ser mayor a 0");
            cantidad = entrada.nextInt();
        } while (cantidad <= 0);

        i = 1;
        contador = 0;
        suma1 = 0;
        suma2 = 0;

        do {
            System.out.print("Ingrese la estatura " + i + ": ");
            estatura = entrada.nextDouble();
            if (estatura < 1.60) {
                suma1 = suma1 + estatura;
                contador++;
            }
            suma2 = suma2 + estatura;
            i++;
        } while (i <= cantidad);

        promedio1 = suma1 / contador;
        promedio2 = suma2 / cantidad;
        
        System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 es: " + promedio1);
        System.out.println("El promedio de estaturas en general es: " + promedio2);
    }
}
