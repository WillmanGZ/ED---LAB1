package Logica;

public class Usuario {

    private String usuario;
    private String contraseña;
    private String nombres_apellidos;
    private String cedula;
    private String telefono;
    private String correo;

    public Usuario(String usuario, String contraseña, String nombres_apellidos, String cedula, String telefono, String correo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombres_apellidos = nombres_apellidos;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
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

    public String getNombres_apellidos() {
        return nombres_apellidos;
    }

    public void setNombres_apellidos(String nombres_apellidos) {
        this.nombres_apellidos = nombres_apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return usuario + ";" + contraseña + ";" + nombres_apellidos + ";" + cedula + ";" + telefono + ";" + correo;
    }

}
