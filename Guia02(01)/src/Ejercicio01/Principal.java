package Ejercicio01;

public class Principal {

    public static void main(String[] args) {
        Libro libro = new Libro("978-987-566-928-4", "1984", "George Orwell", 349);

        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Nº de páginas: " + libro.getNumeroDePaginas());
    }
}
