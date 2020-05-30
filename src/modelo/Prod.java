package modelo;

public class Prod {
    private String nombre;
    private int stock;
    
    public Prod() {
        super();
        this.nombre = null;
        this.stock = 0;
    }

    public Prod(int idProducto, String nombre, String marca, double precio, int stock, int idProveedor, int idCategoria) {
        super();
        this.nombre = nombre;
        this.stock = stock;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", stock=" + stock + "]";
    }
}