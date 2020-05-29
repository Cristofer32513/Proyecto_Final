package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import conexionBD.Conexion;
import modelo.Usuario;

public class UsuarioDAO {
    Conexion conexion=Conexion.getConexion();
    
    public boolean agregarUsuario(Usuario usuario){
        boolean resultado;
        String sql="INSERT INTO Usuarios(id_Empleado, Usuario, Contraseña) VALUES (?, ?, ?)";

        conexion.abrirConexion();
        resultado = conexion.ejecutarAlta(sql, usuario);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public boolean eliminarUsuario(int usuario){
        boolean resultado;
        String sql="DELETE FROM Usuarios WHERE id_Empleado = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarBaja(sql, usuario);
        conexion.cerrarConexion();

        return resultado;
    }
	
    public boolean modificarUsuario(Usuario usuario){
        boolean resultado;
        String sql="UPDATE Usuarios SET Usuario = ?, Contraseña = ? WHERE id_Empleado = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarModificacion(sql, usuario);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public Usuario buscarUsuario(String usuario, String contraseña){
        Usuario usua = new Usuario ();
        String sql="SELECT * FROM Usuarios WHERE Usuario = ? AND Contraseña = ?";

        conexion.abrirConexion();
        ResultSet resultado=conexion.ejecutarConsultaUsuarios(sql, usuario, contraseña);
        try {
                resultado.last();
                usua.setIdEmpleado(resultado.getInt(1));
                usua.setUsuario(resultado.getString(2));
                usua.setContraseña(resultado.getString(3));
        }
        catch (SQLException e) {return null;}
        finally {conexion.cerrarConexion();}

        return usua;
    }
    
    public Usuario buscarUsuario(int idEmpleado){
        Usuario usua=new Usuario ();
        String sql="SELECT * FROM Usuarios WHERE Id_Empleado = ?";

        conexion.abrirConexion();
        ResultSet resultado=conexion.ejecutarConsultaUsuarios(sql, idEmpleado);
        try {
                resultado.last();
                usua.setIdEmpleado(resultado.getInt(1));
                usua.setUsuario(resultado.getString(2));
                usua.setContraseña(resultado.getString(3));
        }
        catch (SQLException e) {return null;}
        finally {conexion.cerrarConexion();}

        return usua;
    }
}