package com.adecco.modelo;

public class ProductoPrimeraNecesidad extends Producto{
    //Sobreescribir el metodo de calcular iva
    //1 opcion es sobreescribir
    //2 opcion es complementarlo

    @Override
    public double calcularIva() {
        return precioProducto * 0.04;
    }

    public ProductoPrimeraNecesidad() {
    }

    public ProductoPrimeraNecesidad(int idProducto, String nombreProducto, double precioProducto) {
        super(idProducto, nombreProducto, precioProducto);
    }

    @Override
    public String toString() {
        return "ProductoPrimeraNecesidad{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto=" + precioProducto +
                '}';
    }
}
