package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import conexionBD.Conexion;
import modelo.Producto;

public class ProductoDAO {
    Conexion conexion = Conexion.getConexion();
    
    public boolean agregarProducto(Producto producto){
        boolean resultado;
        String sql="INSERT INTO Productos(Nombre, Marca, Precio, Stock, id_Proveedor, id_Categoria) VALUES (?, ?, ?, ?, ?, ?)";

        conexion.abrirConexion();
        resultado = conexion.ejecutarAlta(sql, producto);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public boolean eliminarProducto(int idProducto){
        boolean resultado;
        String sql="DELETE FROM Productos WHERE id_Producto = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarBaja(sql, idProducto);
        conexion.cerrarConexion();

        return resultado;
    }
	
    public boolean modificarProducto(Producto producto){
        boolean resultado;
        String sql="UPDATE Productos SET Nombre = ?, Marca = ?, Precio = ?, Stock = ?, id_Proveedor = ?, id_Categoria = ? WHERE id_Producto = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarModificacion(sql, producto);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public Producto buscarProducto(String idProducto){
        Producto producto = new Producto();
        String sql = "SELECT * FROM Productos WHERE id_Producto = ?";

        conexion.abrirConexion();
        ResultSet resultado = conexion.ejecutarConsultaID(sql, idProducto);
        try {
            resultado.last();
            producto.setIdProducto(resultado.getInt(1));
            producto.setNombre(resultado.getString(2));
            producto.setMarca(resultado.getString(3));
            producto.setPrecio(resultado.getDouble(4));
            producto.setStock(resultado.getInt(5));
            producto.SetIdProveedor(resultado.getInt(6));
            producto.SetIdCategoria(resultado.getInt(7));
        } catch (SQLException e) {return null;}
        finally {conexion.cerrarConexion();}

        return producto;
    }           
    
    public void generarGraficoStock(){
        conexion.abrirConexion();
        conexion.totalStock();
        conexion.cerrarConexion();
    }
}