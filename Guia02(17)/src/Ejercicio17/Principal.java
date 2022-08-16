package Ejercicio17;

public class Principal {

    public static void main(String[] args) {
        MesesService mesesService = new MesesService();
        Meses meses;

        meses = mesesService.crearMeses();
        mesesService.leer(meses);
    }
}
