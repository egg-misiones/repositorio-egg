package Ejercicio08;

public class CuentaService {

    public Cuenta crearCuenta(String numeroCuenta, int numeroDocumento, double saldo, double interes) {
        Cuenta cuenta = new Cuenta();

        cuenta.setNumeroCuenta(numeroCuenta);
        cuenta.setNumeroDocumento(numeroDocumento);
        cuenta.setSaldo(saldo);
        cuenta.setInteres(interes);

        return cuenta;
    }

    public void actualizarSaldo(Cuenta cuenta) {
        double saldoActualizado;
        saldoActualizado = (cuenta.getSaldo() * cuenta.getInteres()) / 365;
        saldoActualizado = saldoActualizado + cuenta.getSaldo();
        cuenta.setSaldo(saldoActualizado);
    }

    public void ingresar(Cuenta cuenta, double monto) {
        double saldoActualizado;
        saldoActualizado = cuenta.getSaldo() + monto;
        cuenta.setSaldo(saldoActualizado);
    }

    public void retirar(Cuenta cuenta, double monto) {
        double saldoActualizado;
        saldoActualizado = cuenta.getSaldo() - monto;
        if (saldoActualizado < 0) {
            System.out.println("Usted no dispone de esa cantidad en su cuenta");
        } else {
            cuenta.setSaldo(saldoActualizado);
        }
    }

    public void consultarSaldo(Cuenta cuenta) {
        System.out.println("Usted dispone de: $" + cuenta.getSaldo());
    }

    public void mostrarDatos(Cuenta cuenta) {
        System.out.println("Nº de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI: " + cuenta.getNumeroDocumento());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Interés: " + cuenta.getInteres() + "%");
    }
}
