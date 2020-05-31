package controlador;

import conexionBD.Conexion;
import modelo.Venta;

public class VentaDAO {
    Conexion conexion = Conexion.getConexion();
    
    public boolean agregarVenta(Venta venta){
        boolean resultado;
        String sql="INSERT INTO Ventas(id_Empleado, id_Cliente, Nombre_Cliente, id_Producto, Nombre_Producto, Cantidad, Fecha) VALUES (?, ?, ?, ?, ?, ?, ?)";

        conexion.abrirConexion();
        resultado = conexion.ejecutarAlta(sql, venta);
        conexion.cerrarConexion();
                
        return resultado;
    }
        
    public boolean agregarTiene(int idProducto){
        boolean resultado;
        String sql="INSERT INTO Tiene(id_Producto) VALUES(?)";

        conexion.abrirConexion();
        resultado = conexion.ejecutarAlta(sql, idProducto);
        conexion.cerrarConexion();
       
        return resultado;
    }
    
    public boolean agregarRealiza(int idCliente){
        boolean resultado;
        String sql="INSERT INTO Realiza(id_Cliente) VALUES(?)";

        conexion.abrirConexion();
        resultado = conexion.ejecutarAlta(sql, idCliente);
        conexion.cerrarConexion();
       
        return resultado;
    }
    
    public boolean agregarEfectua(int idEmpleado){
        boolean resultado;
        String sql="INSERT INTO Efectua(id_Empleado) VALUES(?)";

        conexion.abrirConexion();
        resultado = conexion.ejecutarAlta(sql, idEmpleado);
        conexion.cerrarConexion();
       
        return resultado;
    }
}