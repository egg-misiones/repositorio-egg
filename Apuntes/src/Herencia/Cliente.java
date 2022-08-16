package Herencia;

import java.util.Date;

public class Cliente extends Persona {

    private int idCliente;
    private Date fechaRegistro;
    private boolean esVip;
    private static int contadorClientes;

    public Cliente(Date fechaRegistro, boolean esVip) {
        this.idCliente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.esVip = esVip;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isEsVip() {
        return esVip;
    }

    public static int getContadorClientes() {
        return contadorClientes;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente\n"
                + "Id Cliente: " + idCliente + "\n" 
                + "Fecha Registro: " + fechaRegistro + "\n"
                + "Vip: " + esVip;
    }
}
