package com.mycompany.patronstrategy01;

public class Producto {
    private int codigoProducto;
    private int stock;
    private double precio;

    public Producto(int codigoProducto, int stock, double precio) {
        this.codigoProducto = codigoProducto;
        this.stock = stock;
        this.precio = precio;
    }
    
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
