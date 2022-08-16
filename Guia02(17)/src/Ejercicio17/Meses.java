package Ejercicio17;

public class Meses {

    private String[] mesesAnio;
    private String mesSecreto;

    public Meses() {
        mesesAnio = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
        mesSecreto = mesesAnio[(int) (Math.random() * 12)];
    }

    public void setMesesAnio(String[] mesesAnio) {
        this.mesesAnio = mesesAnio;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMesesAnio() {
        return mesesAnio;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
}
