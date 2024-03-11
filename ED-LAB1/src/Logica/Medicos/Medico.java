package Logica.Medicos;

public class Medico {

    private String nombres_apellidos;
    private String cedula;
    private String telefono;
    private String correo;
    private String especialidad;

    public Medico(String nombres_apellidos, String cedula, String telefono, String correo, String especialidad) {
        this.nombres_apellidos = nombres_apellidos;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
        return nombres_apellidos + ";" + cedula + ";" + telefono + ";" + correo + ";" + especialidad;
    }

}
