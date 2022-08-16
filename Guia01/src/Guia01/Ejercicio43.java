package Guia01;

public class Ejercicio43 {

    public static void main(String[] args) {
        int[][] matriz = {{6, 5, 9, 19, 11}, {45, 23, 21, 17, 30}, {15, 7, 23, 25, 2},
        {75, 26, 38, 49, 19}, {2, 15, 76, 1, 45}, {92, 82, 4, 20, 13}};
        int filas = 6, columnas = 5, mayor1, menor1, mayor2, menor2, i1, i2, j1, j2;
        int[] fases = new int[columnas];
        int[] maquinas = new int[filas];
        String letra1, letra2;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                maquinas[i] = maquinas[i] + matriz[i][j];
            }
        }

        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                fases[i] = fases[i] + matriz[j][i];
            }
        }

        mayor1 = maquinas[0];
        menor1 = maquinas[0];
        i1 = 1;
        i2 = 1;

        for (int i = 0; i < filas; i++) {
            if (maquinas[i] > mayor1) {
                mayor1 = maquinas[i];
                i1 = (i + 1);
            }
            if (maquinas[i] < menor1) {
                menor1 = maquinas[i];
                i2 = (i + 1);
            }
        }

        mayor2 = fases[0];
        menor2 = fases[0];
        j1 = 1;
        j2 = 1;

        for (int i = 0; i < columnas; i++) {
            if (fases[i] > mayor2) {
                mayor2 = fases[i];
                j1 = (i + 1);
            }
            if (fases[i] < menor2) {
                menor2 = fases[i];
                j2 = (i + 1);
            }
        }

        letra1 = fase(j1);
        letra2 = fase(j2);

        System.out.println("En cuanto a las máquinas, el costo máximo es " + mayor1 + " (máquina " + i1 + ")");
        System.out.println("En cuanto a las máquinas, el costo mínimo es " + menor1 + " (máquina " + i2 + ")");
        System.out.println("En cuanto a las fases, el costo máximo es " + mayor2 + " (fase " + letra1 + ")");
        System.out.println("En cuanto a las fases, el costo mínimo es " + menor2 + " (fase " + letra2 + ")");
    }

    public static String fase(int valor) {
        String letra;

        switch (valor) {
            case 1:
                letra = "A";
                break;
            case 2:
                letra = "B";
                break;
            case 3:
                letra = "C";
                break;
            case 4:
                letra = "D";
                break;
            default:
                letra = "E";
        }

        return letra;
    }
}
