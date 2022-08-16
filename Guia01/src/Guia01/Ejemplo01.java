package Guia01;

public class Ejemplo01 {

    public static void main(String[] args) {
        String[][] sala = new String[8][9];
        int contador = 8;

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[0].length; j++) {
                switch (j) {
                    case 0:
                        sala[i][j] = contador + "A";
                        break;
                    case 1:
                        sala[i][j] = contador + "B";
                        break;
                    case 2:
                        sala[i][j] = contador + "C";
                        break;
                    case 3:
                        sala[i][j] = contador + "D";
                        break;
                    case 4:
                        sala[i][j] = contador + "E";
                        break;
                    case 5:
                        sala[i][j] = contador + "F";
                        break;
                    case 6:
                        sala[i][j] = contador + "G";
                        break;
                    case 7:
                        sala[i][j] = contador + "H";
                        break;
                    case 8:
                        sala[i][j] = contador + "I";
                        break;
                }
            }
            contador--;
        }

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[0].length; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }
    }
}
