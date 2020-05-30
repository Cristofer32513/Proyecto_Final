package modelo;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String cargo;
    private String calle;
    private String colonia;
    private String municipio;
    private String telefono;
    

    public Empleado() {
        super();
        this.idEmpleado = 0;
        this.nombre = null;
        this.primerApellido = null;
        this.segundoApellido = null;
        this.cargo = null;
        this.calle = null;
        this.colonia = null;
        this.municipio = null;
        this.telefono = null;
    }

    public Empleado(int idEmpleado, String nombre, String primerApellido, String segundoApellido, String cargo, String calle, String colon, String munic, String telefono) {
        super();
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cargo = cargo;
        this.calle = calle;
        this.colonia = colon;
        this.municipio = munic;
        this.telefono = telefono;
    }


    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
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
    
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String carrera) {
        this.telefono = carrera;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", cargo=" + cargo + ", calle=" + calle + ", colonia=" + colonia + ", municipio=" + municipio + ", telefono=" + telefono + '}';
    }
}