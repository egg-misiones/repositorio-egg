package Ejercicio08;

public class Cuenta {

    private String numeroCuenta;
    private int numeroDocumento;
    private double saldo;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, int numeroDocumento, double saldo, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.numeroDocumento = numeroDocumento;
        this.saldo = saldo;
        this.interes = interes;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return interes;
    }
}
