package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import conexionBD.Conexion;
import modelo.Cliente;

public class ClienteDAO {   
    Conexion conexion = Conexion.getConexion();
    
    public boolean agregarCliente(Cliente cliente){
        boolean resultado;
        String sql="INSERT INTO Clientes(Nombre, Primer_Apellido, Segundo_Apellido, Telefono, Calle, Colonia, Municipio) VALUES (?, ?, ?, ?, ?, ?, ?)";

        conexion.abrirConexion();
        resultado = conexion.ejecutarAlta(sql, cliente);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public boolean eliminarCliente(int idCliente){
        boolean resultado;
        String sql = "DELETE FROM Clientes WHERE id_Cliente = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarBaja(sql, idCliente);
        conexion.cerrarConexion();

        return resultado;
    }
	
    public boolean modificarCliente(Cliente cliente){
        boolean resultado;
        String sql="UPDATE Clientes SET Nombre = ?, Primer_Apellido = ?, Segundo_Apellido = ?, Telefono = ?, Calle = ?, Colonia = ?, Municipio = ? WHERE id_Cliente = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarModificacion(sql, cliente);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public Cliente buscarCliente(String idCliente){
        Cliente cliente = new Cliente();
        String sql = "SELECT * FROM Clientes WHERE id_Cliente = ?";

        conexion.abrirConexion();
        ResultSet resultado = conexion.ejecutarConsultaID(sql, idCliente);
        try {
            resultado.last();
            cliente.setIdCliente(resultado.getInt(1));
            cliente.setNombre(resultado.getString(2));
            cliente.setPrimerApellido(resultado.getString(3));
            cliente.setSegundoApellido(resultado.getString(4));
            cliente.setTelefono(resultado.getString(5));
            cliente.setCalle(resultado.getString(6));
            cliente.setColonia(resultado.getString(6));
            cliente.setMunicipio(resultado.getString(6));
        } catch (SQLException e) {return null;}
        finally {conexion.cerrarConexion();}

        return cliente;
    }
}