package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class Conexion {
    public static Connection conexion;
    private PreparedStatement pstm;
    private final static String DRIVER="com.mysql.cj.jdbc.Driver";
    private final static String URL="jdbc:mysql://localhost/Ferreteria?useTimezone=true&serverTimezone=UTC";
    ResultSet rs=null;
    private static Conexion conexionB;
    Statement stm;
    
    public static Conexion getConexion() {
        if (conexionB==null)
            conexionB=new Conexion();
        
        return conexionB;
    }
    
    private Conexion(){
        abrirConexion();
    }
    
    public final void abrirConexion() {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL, "Cristofer", "casas");			
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encontro el controlador.\n" + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conctar al servidor.\n" + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
        } finally {}
    }
    
    public void cerrarConexion(){
        try {
            pstm.close();
            conexion.close();
        }
        catch(SQLException e){}
    } 
    
    public boolean ejecutarAlta(String sql, Usuario usuario) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setInt(1, usuario.getIdEmpleado());
            pstm.setString(2, usuario.getUsuario());
            pstm.setString(3, usuario.getContraseña());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
    
    public boolean ejecutarBaja(String sql, int id) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setInt(1, id);
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
	
    public boolean ejecutarModificacion(String sql, Usuario usuario) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, usuario.getUsuario());
            pstm.setString(2, usuario.getContraseña());
            pstm.setInt(3, usuario.getIdEmpleado());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
    
    public ResultSet ejecutarConsultaUsuarios(String sql, String usuario, String contraseña) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, contraseña);
            rs=pstm.executeQuery();
        }
        catch(SQLException e) {}
        
        return rs;
    }
    
    public ResultSet ejecutarConsultaUsuarios(String sql, int idEmpleado) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setInt(1, idEmpleado);
            rs=pstm.executeQuery();
        }
        catch(SQLException e) {}
       
        return rs;
    }
    
    
}