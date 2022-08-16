package com.revolver;

public class RevolverService {

    public Revolver crearRevolver() {
        return new Revolver();
    }

    public boolean disparar(Revolver revolver) {
        if (revolver.getPosicionBala() == revolver.getPosicionActual()) {
            return true;
        }

        return false;
    }

    public void siguienteBala(Revolver revolver) {
        if (revolver.getPosicionActual() == 6) {
            revolver.setPosicionActual(1);
        } else {
            revolver.setPosicionActual(revolver.getPosicionActual() + 1);
        }
    }

    public void mostrarDatos(Revolver revolver) {
        System.out.println(revolver.toString());
    }
}
