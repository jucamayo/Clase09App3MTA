package clase09app3nta;

import java.util.*;

public class Clase09App3NTA {

    public static void main(String[] args) {
        
        ArrayList<Producto> productos = new ArrayList<Producto>();
        System.out.println("Tamaño array:" + productos.size());
        //Modo 1
        productos.add(new Producto("Gaseosa", 10, 2));
        //Modo 2
        Producto p1 = new Producto();
        p1.setNombre("Galleta");
        p1.setCantidad(5);
        p1.setPrecio(0.5);
        productos.add(p1);
        //====
        productos.add(new Producto("Jugos", 2, 10));
        productos.add(new Producto("Tortas", 3, 20));
        productos.add(new Producto("Caramelo", 30, 0.20));
        
        double total = 0;
        for (Producto p : productos) {
            System.out.println(p.getNombre() + " \t" + p.getTotal());
            total += p.getTotal();
        }
        System.out.println("Total: \t" + total);
         
    }
    
}
