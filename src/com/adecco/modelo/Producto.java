package com.adecco.modelo;

public abstract class Producto {
    //Atributos
    protected int idProducto;
    protected String nombreProducto;
    protected double precioProducto;

    //Metodos
    //Metodo abstract no tiene ninguna linea de implementacion, es para hacer polimorfismo.
    // Las clases abstract no se pueden instanciar, no se pueden crear objetos
    public abstract double calcularIva();


    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto=" + precioProducto +
                '}';
    }

    //Constructores
    public Producto() {
    }
    public Producto(int idProducto, String nombreProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }
    //Set&Get
    public int getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public double getPrecioProducto() {
        return precioProducto;
    }
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
}
