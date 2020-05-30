package modelo;

import java.text.DecimalFormat;

public class Producto {
    private int idProducto;
    private String nombre;
    private String marca;
    private double precio;
    private int stock;
    private int idProveedor;
    private int idCategoria;
    @SuppressWarnings("FieldMayBeFinal")
    private DecimalFormat formatoMoneda = new DecimalFormat("######0.00");

    public Producto() {
        super();
        this.idProducto = 0;
        this.nombre = null;
        this.marca = null;
        this.precio = 0.0;
        this.stock = 0;
        this.idProveedor = 0;
        this.idCategoria = 0;
    }

    public Producto(int idProducto, String nombre, String marca, double precio, int stock, int idProveedor, int idCategoria) {
        super();
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = Double.parseDouble(formatoMoneda.format(precio));
        this.stock = stock;
        this.idProveedor = idProveedor;
        this.idCategoria = idCategoria;
    }


    public int getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public int getIdProveedor() {
        return idProveedor;
    }
    public void SetIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    public int getIdCategoria() {
        return idCategoria;
    }
    public void SetIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
    @Override
    public String toString() {
        return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", marca=" + marca + ", precio="
            + precio + ", stock=" + stock + ", idProveedor=" + idProveedor + ", idCategoria=" + idCategoria + "]";
    }
}