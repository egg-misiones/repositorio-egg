package com.principal;

import com.interfaz.Interface;

public class Principal {

    public static void main(String[] args) {
        Interface objetoInterface = new Interface();
        objetoInterface.setVisible(true);
        objetoInterface.setLocationRelativeTo(null);
    }
}
