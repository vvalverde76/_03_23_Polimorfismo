package com.adecco.modelo;

public class ProductoLujo extends Producto{



    //Metodo abstracto de la clase producto=
    @Override
    public double calcularIva() {
        return precioProducto * 0.21;
    }

    @Override
    public String toString() {
        return "ProductoLujo{" +
                ", idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto=" + precioProducto +
                '}';
    }

    public ProductoLujo() {
    }

    public ProductoLujo(int idProducto, String nombreProducto, double precioProducto) {
        super(idProducto, nombreProducto, precioProducto);

    }
}
