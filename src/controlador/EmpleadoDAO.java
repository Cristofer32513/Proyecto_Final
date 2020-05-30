package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import conexionBD.Conexion;
import modelo.Empleado;

public class EmpleadoDAO {
    Conexion conexion = Conexion.getConexion();
    
    public boolean agregarEmpleado(Empleado empleado){
        boolean resultado;
        String sql="INSERT INTO Empleados(Nombre, Primer_Apellido, Segundo_Apellido, Cargo, Calle, Colonia, Municipio, Telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        conexion.abrirConexion();
        resultado = conexion.ejecutarAlta(sql, empleado);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public boolean eliminarEmpleado(int idEmpleado){
        boolean resultado;
        String sql = "DELETE FROM Empleados WHERE id_Empleado = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarBaja(sql, idEmpleado);
        conexion.cerrarConexion();

        return resultado;
    }
	
    public boolean modificarEmpleado(Empleado empleado){
        boolean resultado;
        String sql="UPDATE Empleados SET Nombre = ?, Primer_Apellido = ?, Segundo_Apellido = ?, Cargo = ?, Calle = ?, Colonia = ?, Municipio = ?, Telefono = ? WHERE id_Empleado = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarModificacion(sql, empleado);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public Empleado buscarEmpleado(String idEmpleado){
        Empleado empleado = new Empleado();
        String sql = "SELECT * FROM Empleados WHERE id_Empleado = ?";

        conexion.abrirConexion();
        ResultSet resultado = conexion.ejecutarConsultaID(sql, idEmpleado);
        try {
            resultado.last();
            empleado.setIdEmpleado(resultado.getInt(1));
            empleado.setNombre(resultado.getString(2));
            empleado.setPrimerApellido(resultado.getString(3));
            empleado.setSegundoApellido(resultado.getString(4));
            empleado.setCargo(resultado.getString(5));
            empleado.setCalle(resultado.getString(6));
            empleado.setColonia(resultado.getString(7));
            empleado.setMunicipio(resultado.getString(8));
            empleado.setTelefono(resultado.getString(9));
        }
        catch (SQLException e) {return null;}
        finally {conexion.cerrarConexion();}

        return empleado;
    }
    
    public Empleado buscarEmpleado(String nombre, String primerAp, String segundoAp, String cargo, String calle, String colonia, String municipio, String telefono){
        Empleado empleado = new Empleado();
        String sql = "SELECT * FROM Empleados WHERE Nombre = ? AND Primer_Apellido = ? AND Segundo_Apellido = ? AND Cargo = ? AND Calle = ? AND Colonia = ? AND Municipio = ? AND Telefono = ?";

        conexion.abrirConexion();
        ResultSet resultado = conexion.ejecutarConsultaID(sql, nombre, primerAp, segundoAp, cargo, calle, colonia, municipio, telefono);
        try {
            resultado.last();
            empleado.setIdEmpleado(resultado.getInt(1));
            empleado.setNombre(resultado.getString(2));
            empleado.setPrimerApellido(resultado.getString(3));
            empleado.setSegundoApellido(resultado.getString(4));
            empleado.setCargo(resultado.getString(5));
            empleado.setCalle(resultado.getString(6));
            empleado.setColonia(resultado.getString(7));
            empleado.setMunicipio(resultado.getString(8));
            empleado.setTelefono(resultado.getString(9));
        }
        catch (SQLException e) {return null;}
        finally {conexion.cerrarConexion();}

        return empleado;
    }
}