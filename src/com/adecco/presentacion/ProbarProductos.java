package com.adecco.presentacion;

import com.adecco.modelo.Producto;
import com.adecco.modelo.ProductoLujo;
import com.adecco.modelo.ProductoPrimeraNecesidad;

import java.util.Arrays;

public class ProbarProductos {
    public static void main(String[] args) {
        //instanciar de la clase producto de primera necesidad y de la producto de lujo

        Producto[] productos = new Producto[4];
        ProductoPrimeraNecesidad p1 = new ProductoPrimeraNecesidad(1, "Arroz", 2);
        ProductoPrimeraNecesidad p2 = new ProductoPrimeraNecesidad(2, "Quinoa", 4);
        ProductoLujo p3 = new ProductoLujo(3, "Raton", 12);
        ProductoLujo p4 = new ProductoLujo(4, "Teclado", 20);

        productos[0] = p1;
        productos[1] = p2;
        productos[2] = p3;
        productos[3] = p4;

        System.out.println(Arrays.toString(productos));

        //El array se recorre con bucles (for, while, do while, for each)
        // el bucle for se separa por ; ( inicio;condicion;incremento)
        for (int i = 0; i < productos.length; i++) {

            System.out.println("Calculo del IVA con for "+productos[i].calcularIva());

        }
        //BUCLE FOREACH, 1.necesito una variable de referencia 2.dos puntos y luego una conexion
        for (Producto elemento: productos
             ) {
            System.out.println("Calculo del IVA con bucle Foreach "+ elemento.calcularIva());
        }
    }
}
