package Ejercicio08;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        CuentaService cuentaService = new CuentaService();
        Cuenta cuenta;
        double monto1, monto2;

        cuenta = cuentaService.crearCuenta("7841 4561 1265 9868", 36955652, 5000, 15);

        cuentaService.actualizarSaldo(cuenta);

        System.out.print("Indique el monto que desea ingresar: ");
        monto1 = entrada.nextDouble();
        cuentaService.ingresar(cuenta, monto1);

        System.out.print("Indique el monto que desea retirar: ");
        monto2 = entrada.nextDouble();
        cuentaService.retirar(cuenta, monto2);

        cuentaService.consultarSaldo(cuenta);
        cuentaService.mostrarDatos(cuenta);
    }
}
