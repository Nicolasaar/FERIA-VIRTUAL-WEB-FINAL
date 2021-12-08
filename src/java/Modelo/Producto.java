package Modelo;

public class Producto {
    
    int id_producto;
    String nombre_producto;
    String color;
    double tamano;
    String fecha_importado;
    private int precio;
    int stock;
    String creador;

    public Producto() {
    }

    public Producto(int id_producto, String nombre_producto, String color, double tamano, String fecha_importado, int precio, int stock, String creador) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.color = color;
        this.tamano = tamano;
        this.fecha_importado = fecha_importado;
        this.precio = precio;
        this.stock = stock;
        this.creador = creador;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getFecha_importado() {
        return fecha_importado;
    }

    public void setFecha_importado(String fecha_importado) {
        this.fecha_importado = fecha_importado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    
    
    
}
