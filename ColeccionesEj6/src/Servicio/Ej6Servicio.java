package Servicio;

import Entidad.Ej6Producto;
import java.util.*;

public class Ej6Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> listaProductos = new HashMap();

    public void crearProducto() {
        Ej6Producto producto = new Ej6Producto();
        String nombre;
        Integer precio;

        System.out.println("Producto");
        producto.setNombre(nombre = leer.next());
        System.out.println("Precio");
        producto.setPrecio(precio = leer.nextInt());
        listaProductos.put(producto.getNombre(), producto.getPrecio());

//        agregarProducto(producto);
        System.out.println("Agregar producto? S/N");
        String op = leer.next().toUpperCase();
        if (op.equals("S")) {
            crearProducto();
        } else {
            mostrarProducto();
        }
    }
//    public void agregarProducto(Ej6Producto p) {
//        listaProductos.put(p.getNombre(), p.getPrecio());
//    }

    public void mostrarProducto() {
        System.out.println("Productos");
        for (Map.Entry<String, Integer> aux : listaProductos.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            System.out.println("Producto final: " + key + " $ " + value);
        }
    }

    public void modificarPrecio() {
        String nombre;
        Integer nprecio;
        System.out.println("Producto a modificar el precio");
        nombre = leer.next();
        System.out.println("Nuevo precio");
        nprecio = leer.nextInt();

        for (Map.Entry<String, Integer> aux : listaProductos.entrySet()) {
            listaProductos.replace(nombre, nprecio);
        }
    }

    public void eliminarProducto() {
        String nombre;
        System.out.println("Producto a eliminar de la lista");
        nombre = leer.next();        
        listaProductos.remove(nombre);
    }

    public void menu() {
        int op;

        do {
            System.out.println("MENU");
            System.out.println("1- Agregar productos");
            System.out.println("2- Eliminar Producto");
            System.out.println("3- Modificar precio de un producto");
            System.out.println("4- Mostrar listado");
            System.out.println("5- Salir");

            op = leer.nextInt();
            switch (op) {
                case 1:
                    crearProducto();
                    break;
                case 2:
                    eliminarProducto();
                    break;
                case 3:
                    modificarPrecio();
                    break;
                case 4:
                    mostrarProducto();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (op < 5);
                
    }
}

        
     
        
    
            
    
    
    
    
    
    
    
    
    
    
}
