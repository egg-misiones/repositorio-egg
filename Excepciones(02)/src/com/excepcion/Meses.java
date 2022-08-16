package com.excepcion;

public class Meses {

    private final String[] mesesDelAnio;

    public Meses() {
        mesesDelAnio = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
    }

    public String[] getMesesDelAnio() {
        return mesesDelAnio;
    }

    public void mostrarVector() throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < mesesDelAnio.length + 1; i++) {
            System.out.println(mesesDelAnio[i].toUpperCase());
        }
    }
}
