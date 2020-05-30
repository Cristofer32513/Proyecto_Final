package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Prod;
import modelo.Producto;
import modelo.Proveedor;
import modelo.Usuario;
import modelo.Venta;

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
    
    public boolean ejecutarAlta(String sql, Categoria categoria) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, categoria.getNombre());
            pstm.setString(2, categoria.getDescripcion());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
	
    public boolean ejecutarModificacion(String sql, Categoria categoria) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, categoria.getNombre());
            pstm.setString(2, categoria.getDescripcion());
            pstm.setInt(3, categoria.getIdCategoria());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
    
    public ResultSet ejecutarConsultaID(String sql, String id) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, id);
            rs=pstm.executeQuery();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo ejecutar la consulta SQL" + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        
        return rs;
    }
    
    public boolean ejecutarAlta(String sql, Cliente cliente) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, cliente.getNombre());
            pstm.setString(2, cliente.getPrimerApellido());
            pstm.setString(3, cliente.getSegundoApellido());
            pstm.setString(4, cliente.getTelefono());
            pstm.setString(5, cliente.getCalle());
            pstm.setString(6, cliente.getColonia());
            pstm.setString(7, cliente.getMunicipio());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
    
    public boolean ejecutarModificacion(String sql, Cliente cliente) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, cliente.getNombre());
            pstm.setString(2, cliente.getPrimerApellido());
            pstm.setString(3, cliente.getSegundoApellido());
            pstm.setString(4, cliente.getTelefono());
            pstm.setString(5, cliente.getCalle());
            pstm.setString(6, cliente.getColonia());
            pstm.setString(7, cliente.getMunicipio());
            pstm.setInt(8, cliente.getIdCliente());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
    
    public boolean ejecutarAlta(String sql, Empleado empleado) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, empleado.getNombre());
            pstm.setString(2, empleado.getPrimerApellido());
            pstm.setString(3, empleado.getSegundoApellido());
            pstm.setString(4, empleado.getCargo());
            pstm.setString(5, empleado.getCalle());
            pstm.setString(6, empleado.getColonia());
            pstm.setString(7, empleado.getMunicipio());
            pstm.setString(8, empleado.getTelefono());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
    
    public boolean ejecutarModificacion(String sql, Empleado empleado) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, empleado.getNombre());
            pstm.setString(2, empleado.getPrimerApellido());
            pstm.setString(3, empleado.getSegundoApellido());
            pstm.setString(4, empleado.getCargo());
            pstm.setString(5, empleado.getCalle());
            pstm.setString(6, empleado.getColonia());
            pstm.setString(7, empleado.getMunicipio());
            pstm.setString(8, empleado.getTelefono());
            pstm.setInt(9, empleado.getIdEmpleado());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;}
    }
    
    public ResultSet ejecutarConsultaID(String sql, String nombre, String primerAp, String segundoAp, String cargo, String calle, String colonia, String municipio, String telefono) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, nombre);
            pstm.setString(2, primerAp);
            pstm.setString(3, segundoAp);
            pstm.setString(4, cargo);
            pstm.setString(5, calle);
            pstm.setString(6, colonia);
            pstm.setString(7, municipio);
            pstm.setString(8, telefono);
            rs=pstm.executeQuery();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo ejecutar la consulta SQL" + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        
        return rs;
    }
    
    public boolean ejecutarAlta(String sql, Proveedor proveedor) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, proveedor.getNombre());
            pstm.setString(2, proveedor.getPrimerApellido());
            pstm.setString(3, proveedor.getSegundoApellido());
            pstm.setString(4, proveedor.getTelefono());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
	
    public boolean ejecutarModificacion(String sql, Proveedor proveedor) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, proveedor.getNombre());
            pstm.setString(2, proveedor.getPrimerApellido());
            pstm.setString(3, proveedor.getSegundoApellido());
            pstm.setString(4, proveedor.getTelefono());
            pstm.setInt(5, proveedor.getIdProveedor());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
    
    public boolean ejecutarAlta(String sql, Producto producto) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, producto.getNombre());
            pstm.setString(2, producto.getMarca());
            pstm.setDouble(3, producto.getPrecio());
            pstm.setInt(4, producto.getStock());
            pstm.setInt(5, producto.getIdProveedor());
            pstm.setInt(6, producto.getIdCategoria());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
	
    public boolean ejecutarModificacion(String sql, Producto producto) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, producto.getNombre());
            pstm.setString(2, producto.getMarca());
            pstm.setDouble(3, producto.getPrecio());
            pstm.setInt(4, producto.getStock());
            pstm.setInt(5, producto.getIdProveedor());
            pstm.setInt(6, producto.getIdCategoria());
            pstm.setInt(7, producto.getIdProducto());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
    
    public boolean ejecutarAlta(String sql, Venta venta) {
        try {
            pstm=conexion.prepareStatement(sql);
            conexion.setAutoCommit(false);
            pstm.setInt(1, venta.getIdEmpleado());
            pstm.setInt(2, venta.getIdCliente());
            pstm.setString(3, venta.getNombreCliente());
            pstm.setInt(4, venta.getIdProducto());
            pstm.setString(5, venta.getNombreProducto());
            pstm.setInt(6, venta.getCantidad());
            pstm.setString(7, venta.getFecha());
            
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            conexion.commit();
            return ejecucion==1;
        }
        catch(SQLException e){
            try {
                conexion.rollback();
                conexion.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
    }
    
    public boolean ejecutarAlta(String sql, int campo1) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setInt(1, campo1);
                        
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){
            System.out.println(e);
            return false;}
    }
    
    
    
    
}