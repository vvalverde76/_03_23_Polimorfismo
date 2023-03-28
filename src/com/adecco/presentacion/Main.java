package com.adecco.presentacion;

import com.adecco.modelo.Producto;
import com.adecco.modelo.ProductoLujo;
import com.adecco.modelo.ProductoPrimeraNecesidad;

public class Main {
    public static void main(String[] args) {
        //Instanciar
        Producto p1 = new ProductoLujo();

        p1.setIdProducto(1);
        p1.setNombreProducto("Teclado");
        p1.setPrecioProducto(10);
        System.out.println("Id del producto= "+ p1.getIdProducto());
        System.out.println("Nombre del producto= "+ p1.getNombreProducto());
        System.out.println("Precio del producto= "+ p1.getPrecioProducto() + "€");
        System.out.println(p1.toString());
        //el metodo por defecto es toString()
        System.out.println(p1);
        System.out.println("Calculo del iva "+ p1.calcularIva());

        Producto p2= new ProductoLujo(2,"Raton Inalambrico",20.5);
        System.out.println(p2.toString());
        System.out.println("Calculo del iva "+ p2.calcularIva());

        ProductoPrimeraNecesidad pn1 = new ProductoPrimeraNecesidad();
        pn1.setPrecioProducto(2);
        System.out.println("Calculo del iva "+ pn1.calcularIva());

        //Polimorfismo y sobreescritura de metodo
        Producto p3 = new ProductoPrimeraNecesidad();
        p3.setPrecioProducto(1);
        System.out.println("Calculo del iva "+ p3.calcularIva());

        //los constructores no se heredan
        Producto p4 = new ProductoPrimeraNecesidad(2,"platano",1);
        System.out.println("Calculo del iva "+ p4.calcularIva());
        System.out.println(p4.toString());

        ProductoLujo pl1 = new ProductoLujo(8,"Bicicleta",500);
        System.out.println("Calculo del iva "+ pl1.calcularIva());
        System.out.println(pl1.toString());

    }
}