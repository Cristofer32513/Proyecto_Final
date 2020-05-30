package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import conexionBD.Conexion;
import modelo.Categoria;

public class CategoriaDAO {
    Conexion conexion=Conexion.getConexion();
   
    public boolean agregarCategoria(Categoria categoria){
        boolean resultado;
        String sql="INSERT INTO Categorias(Nombre, Descripcion) VALUES (?, ?)";

        conexion.abrirConexion();
        resultado = conexion.ejecutarAlta(sql, categoria);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public boolean eliminarCategoria(int idCategoria){
        boolean resultado;
        String sql="DELETE FROM Categorias WHERE id_Categoria = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarBaja(sql, idCategoria);
        conexion.cerrarConexion();

        return resultado;
    }
	
    public boolean modificarCategoria(Categoria categoria){
        boolean resultado;
        String sql="UPDATE Categorias SET Nombre = ?, Descripcion = ? WHERE id_Categoria = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarModificacion(sql, categoria);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public Categoria buscarCategoria(String idCategoria){
        Categoria categoria = new Categoria();
        String sql = "SELECT * FROM Categorias WHERE id_Categoria = ?";

        conexion.abrirConexion();
        ResultSet resultado = conexion.ejecutarConsultaID(sql, idCategoria);
        try {
            resultado.last();
            categoria.setIdCategoria(resultado.getInt(1));
            categoria.setNombre(resultado.getString(2));
            categoria.setDescripcion(resultado.getString(3));
        } catch (SQLException e) {return null;}
        finally {conexion.cerrarConexion();}

        return categoria;
    }
}