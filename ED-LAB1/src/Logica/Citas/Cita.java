package Logica.Citas;

import Logica.Medicos.Medico;
import Logica.Usuario.Usuario;
import java.util.Date;

public class Cita {

    private String idCita;
    private Date fechaHora;
    private Usuario usuario;
    private Medico medico;
    private String estado;

    public Cita(String idCita, Date fechaHora, Usuario paciente, Medico medico, String estado) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.usuario = usuario;
        this.medico = medico;
        this.estado = estado;
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        // Asumiendo que Usuario y Medico tienen implementado toString adecuadamente
        return idCita + ";" + fechaHora + ";" + usuario.toString() + ";" + medico.toString() + ";" + estado;
    }

}
