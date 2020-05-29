package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

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
}