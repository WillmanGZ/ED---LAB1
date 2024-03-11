package Logica.Citas;

import Logica.Medicos.Medico;
import Logica.Usuario.Paciente;
import java.util.Date;

public class Cita {

    private String especialidad;
    private String nombresApellidosMedico; // Nombre y apellido del médico
    private String fecha;
    private String hora;

    public Cita(String especialidad, String nombresApellidosMedico, String fecha, String hora) {
        this.especialidad = especialidad;
        this.nombresApellidosMedico = nombresApellidosMedico;
        this.fecha = fecha;
        this.hora = hora;

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombresApellidosMedico() {
        return nombresApellidosMedico;
    }

    public void setNombresApellidosMedico(String nombresApellidosMedico) {
        this.nombresApellidosMedico = nombresApellidosMedico;
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
        return especialidad + ";" + nombresApellidosMedico + ";" + fecha + ";" + hora;
    }
}
