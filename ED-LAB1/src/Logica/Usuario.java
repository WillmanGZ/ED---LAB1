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

    @Override
    public String toString() {
        return usuario + ";" + contraseña + ";" + nombres_apellidos + ";" + cedula + ";" + telefono + ";" + correo;
    }

}
