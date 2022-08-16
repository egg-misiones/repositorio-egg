package Guia01;

public class Ejercicio42 {

    public static void main(String[] args) {
        int tres = 3, diez = 10, inicio1, inicio2, fin1, fin2, k, l, contador, X1, X2;
        int[][] mayor = new int[diez][diez];
        int[][] menor = new int[tres][tres];
        X1 = 0;
        X2 = 0;

        rellenar(mayor, diez);
        rellenar(menor, tres);
        System.out.println("Matriz 10x10: ");
        visualizar(mayor, diez);
        System.out.println("Matriz 3x3: ");
        visualizar(menor, tres);

        inicio1 = 0;
        fin1 = 3;

        do {
            inicio2 = 0;
            fin2 = 3;
            do {
                k = 0;
                contador = 0;
                for (int i = inicio1; i < fin1; i++) {
                    l = 0;
                    for (int j = inicio2; j < fin2; j++) {
                        if (mayor[i][j] == menor[k][l]) {
                            if (contador == 0) {
                                X1 = i;
                                X2 = j;
                            }
                            contador++;
                        }
                        l++;
                    }
                    k++;
                }
                if ((tres * tres) == contador) {
                    break;
                }
                inicio2++;
                fin2++;
            } while (fin2 <= 10);
            if ((tres * tres) == contador) {
                break;
            }
            inicio1++;
            fin1++;
        } while (fin1 <= 10);

        if ((tres * tres) == contador) {
            System.out.println("La ubicación en la que comienza la submatriz es: [" + X1 + ", " + X2 + "]");
        } else {
            System.out.println("No existe una submatriz que contenga los mismos valores que la matriz de 3x3");
        }
    }

    public static void rellenar(int[][] matriz, int nro) {
        for (int i = 0; i < nro; i++) {
            for (int j = 0; j < nro; j++) {
                matriz[i][j] = (int) (Math.random() * 2 + 1);
            }
        }
    }

    public static void visualizar(int[][] matriz, int nro) {
        for (int i = 0; i < nro; i++) {
            for (int j = 0; j < nro; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
