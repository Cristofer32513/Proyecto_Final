package modelo;

import java.util.Calendar;


public class Venta {
    private int idVenta;
    private int idEmpleado;
    private int idCliente;
    private String nombreCliente;
    private int idProducto;
    private String nombreProducto;
    private int cantidad;
    private String fecha;
    private Calendar cal;

    public Venta() {
        super();
        this.idVenta = 0;
        this.idEmpleado = 0;
        this.idCliente = 0;
        this.nombreCliente = null;
        this.idProducto = 0;
        this.nombreProducto = null;
        this.cantidad = 0;
        this.fecha = null;
    }

    public Venta(int idVenta, int idEmp, int idCli, String nomCli, int idProd, String nomProd, int cant) {
        super();
        cal = Calendar.getInstance();
        this.idVenta = idVenta;
        this.idEmpleado = idEmp;
        this.idCliente = idCli;
        this.nombreCliente = nomCli;
        this.idProducto = idProd;
        this.nombreProducto = nomProd;
        this.cantidad = cant;
        String d1, d2, d3;
        d1 = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
        d2 = String.valueOf(cal.get(Calendar.MONTH)+1);
        d3 = String.valueOf(cal.get(Calendar.YEAR));
        if(d1.length() < 2)
            d1 = "0" + d1;
        if(d2.length() < 2)
            d2 = "0" + d2;
        this.fecha = d3 + "-" + d2 + "-" + d1;
    }


    public int getIdVenta() {
        return idVenta;
    }
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void SetNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    public void SetCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    
    @Override
    public String toString() {
        return "Venta [idVenta=" + idVenta + ", idEmpleado=" + idEmpleado + ", idCliente=" + idCliente + ", nombreCliente="
            + nombreCliente + ", idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", cantidad=" + cantidad + ", fecha=" + fecha + "]";
    }
}