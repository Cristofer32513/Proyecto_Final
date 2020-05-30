package modelo;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String calle;
    private String colonia;
    private String municipio;

    public Cliente() {
        super();
        this.idCliente = 0;
        this.nombre = null;
        this.primerApellido = null;
        this.segundoApellido = null;
        this.telefono = null;
        this.calle = null;
        this.colonia = null;
        this.municipio = null;
    }

    public Cliente(int idCliente, String nombre, String primerApellido, String segundoApellido, String telefono, String calle, String colon, String munic) {
        super();
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.calle = calle;
        this.colonia = colon;
        this.municipio = munic;
    }


    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    
    
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", telefono=" + telefono + ", calle=" + calle + ", colonia=" + colonia + ", municipio=" + municipio + '}';
    }
}