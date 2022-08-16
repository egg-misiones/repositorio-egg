package Ejercicio06;

import java.util.HashMap;

public class ProductoService {

    private HashMap<String, Producto> listaProducto = new HashMap<>();

    public void setListaProducto(HashMap<String, Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public HashMap<String, Producto> getListaProducto() {
        return listaProducto;
    }

    public void crearProducto(String nombre, double precio) {
        Producto producto = new Producto();

        producto.setNombre(nombre);
        producto.setPrecio(precio);

        guardarProducto(producto);
    }

    public void guardarProducto(Producto producto) {
        listaProducto.put(producto.getNombre(), producto);
    }

    public Producto buscarProducto(String nombre) {
        Producto productoEncontrado = listaProducto.get(nombre);

        return productoEncontrado;
    }

    public void modificarProducto(Producto producto, int precio) {
        producto.setPrecio(precio);

        guardarProducto(producto);
    }

    public void eliminarProducto(String nombre) {
        listaProducto.remove(nombre);
    }

    public void mostrarDatos() {
        System.out.println("LISTA DE PRODUCTOS: ");

        for (Producto i : listaProducto.values()) {
            System.out.println(i.getNombre() + " ($" + i.getPrecio() + ")");
        }
    }
}
