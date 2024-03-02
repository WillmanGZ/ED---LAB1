
package Logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MEDICOS {
    
    private long Celular, Cedula, Numero_de_citas;
    private String Especialidad_medica, Nombre;
    
    public MEDICOS (long Celular, long Cedula, long Numero_de_citas, String Especialidad_medica, String Nombre) {
        this.Celular = Celular;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Numero_de_citas = Numero_de_citas;
        this.Especialidad_medica= Especialidad_medica;
        
    }

    
    public long getCelular() {
        return Celular;
    }

    
    public void setCelular(long Celular) {
        this.Celular = Celular;
    }

    
    public long getCedula() {
        return Cedula;
    }

    
    public void setCedula(long Cedula) {
        this.Cedula = Cedula;
    }

    
    public long getNumero_de_citas() {
        return Numero_de_citas;
    }

    
    public void setNumero_de_citas(long Numero_de_citas) {
        this.Numero_de_citas = Numero_de_citas;
    }

    
    public String getEspecialidad_medica() {
        return Especialidad_medica;
    }

    
    public void setEspecialidad_medica(String Especialidad_medica) {
        this.Especialidad_medica = Especialidad_medica;
    }

    
    public String getNombre() {
        return Nombre;
    }

    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
