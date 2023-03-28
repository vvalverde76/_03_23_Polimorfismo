package com.adecco.modelo;

public class ProductoLujo extends Producto{

    private int stock;
    @Override
    public double calcularIva() {
        return precioProducto * 0.21;
    }

    @Override
    public String toString() {
        return "ProductoLujo{" +
                "stock=" + stock +
                ", idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto=" + precioProducto +
                '}';
    }

    public ProductoLujo() {
    }

    public ProductoLujo(int idProducto, String nombreProducto, double precioProducto, int stock) {
        super(idProducto, nombreProducto, precioProducto);
        this.stock = stock;
    }
}
