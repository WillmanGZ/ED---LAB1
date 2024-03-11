package Logica.Medicos;

public class Medico {

    private String nombres_apellidos;
    private String cedula;
    private String telefono;
    private String correo;
    private String especialidad;
    private String citas_agendadas;

    public Medico(String nombres_apellidos, String cedula, String telefono, String correo, String especialidad, String citas_agendadas) {
        this.nombres_apellidos = nombres_apellidos;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
        this.citas_agendadas = citas_agendadas;
    }

    public String getCitas_agendadas() {
        return citas_agendadas;
    }

    public void setCitas_agendadas(String citas_agendadas) {
        this.citas_agendadas = citas_agendadas;
    }

    public int getEspecialidadNumerica() {
        switch (this.especialidad) {
            case "Optometria Ortoptica":
                return 1;
            case "Glaucoma":
                return 2;
            case "Cataratas":
                return 3;
            case "Oftalmologia General":
                return 4;
            case "Oftalmologia Pediatrica":
                return 5;
            case "Retina y Vitreo":
                return 6;
            default:
                return 0; // En caso de que no coincida con ninguna especialidad conocida
        }
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
        return nombres_apellidos + ";" + cedula + ";" + telefono + ";" + correo + ";" + especialidad + ";" + citas_agendadas;
    }

}
