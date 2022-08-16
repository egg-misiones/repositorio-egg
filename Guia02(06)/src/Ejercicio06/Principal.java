package Ejercicio06;

public class Principal {

    public static void main(String[] args) {
        Cancion cancion = new Cancion();

        cancion.setTitulo("Lift Off");
        cancion.setAutor("Tom Misch & Yussef Dayes");

        System.out.println("Título: " + cancion.getTitulo());
        System.out.println("Autor: " + cancion.getAutor());
    }
}
