package Logica.Citas;

public class Cita {

    private String cedulaPaciente;
    private String especialidad;
    private String idmedico; //posicion en el archivo
    private String fecha;
    private String hora;

    public Cita(String cedulaPaciente, String especialidad, String idmedico, String fecha, String hora) {
        this.cedulaPaciente = cedulaPaciente;
        this.especialidad = especialidad;
        this.idmedico = idmedico;
        this.fecha = fecha;
        this.hora = hora;

    }

    public String getCedulaPaciente() {
        return cedulaPaciente;
    }

    public void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    

    public String getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(String idmedico) {
        this.idmedico = idmedico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return cedulaPaciente + ";" + especialidad + ";" + idmedico + ";" + fecha + ";" + hora;
    }
}
