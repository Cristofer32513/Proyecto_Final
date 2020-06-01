package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import conexionBD.Conexion;
import modelo.Proveedor;

public class ProveedorDAO {
    Conexion conexion = Conexion.getConexion();
    
    public boolean agregarProvedor(Proveedor proveedor){
        boolean resultado;
        String sql="INSERT INTO Proveedores(Nombre, Primer_Apellido, Segundo_Apellido, Telefono) VALUES (?, ?, ?, ?)";

        conexion.abrirConexion();
        resultado = conexion.ejecutarAlta(sql, proveedor);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public boolean eliminarProveedor(int idProveedor){
        boolean resultado;
        String sql = "DELETE FROM Proveedores WHERE id_Proveedor = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarBaja(sql, idProveedor);
        conexion.cerrarConexion();

        return resultado;
    }
	
    public boolean modificarProveedor(Proveedor proveedor){
        boolean resultado;
        String sql="UPDATE Proveedores SET Nombre = ?, Primer_Apellido = ?, Segundo_Apellido = ?, Telefono = ? WHERE id_Proveedor = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarModificacion(sql, proveedor);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public Proveedor buscarProveedor(int idProveedor){
        Proveedor proveedor = new Proveedor();
        String sql = "SELECT * FROM Proveedores WHERE id_Proveedor = ?";

        conexion.abrirConexion();
        ResultSet resultado = conexion.ejecutarConsultaID(sql, idProveedor);
        try {
            resultado.last();
            proveedor.setIdProveedor(resultado.getInt(1));
            proveedor.setNombre(resultado.getString(2));
            proveedor.setPrimerApellido(resultado.getString(3));
            proveedor.setSegundoApellido(resultado.getString(4));
            proveedor.setTelefono(resultado.getString(5));
        } catch (SQLException e) {return null;}
        finally {conexion.cerrarConexion();}

        return proveedor;
    }
}