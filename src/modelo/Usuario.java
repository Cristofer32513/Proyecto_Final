package modelo;

public class Usuario {
    private int idEmpleado;
    private String usuario;
    private String contraseña;
    
    public Usuario() {
        super();
        this.idEmpleado = 0;
        this.usuario = null;
        this.contraseña = null;
    }

    public Usuario(int idEmpleado, String usuario, String contraeña) {
        super();
        this.idEmpleado = idEmpleado;
        this.usuario = usuario;
        this.contraseña = contraeña;
    }

    
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    @Override
    public String toString() {
        return "Usuario [idEmpleado = " + idEmpleado + ", usuario=" + usuario + ", contraseña=" + contraseña + "]";
    }
}