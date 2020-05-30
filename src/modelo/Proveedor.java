package modelo;

public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;

    public Proveedor() {
        super();
        this.idProveedor = 0;
        this.nombre = null;
        this.primerApellido = null;
        this.segundoApellido = null;
        this.telefono = null;
    }

    public Proveedor(int idProveedor, String nombre, String primerApellido, String segundoApellido, String telefono) {
        super();
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
    }


    public int getIdProveedor() {
        return idProveedor;
    }
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerAp) {
        this.primerApellido = primerAp;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoAp) {
        this.segundoApellido = segundoAp;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String carrera) {
        this.telefono = carrera;
    }
    
    
    @Override
    public String toString() {
        return "Proveedor [idProveedor=" + idProveedor + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
            + segundoApellido + ", telefono=" + telefono + "]";
    }
}