package Logica.Citas;

import java.io.*;
import java.util.*;

public class ArchivoCitas {

    public static void añadirCita(String especialidad, String nombresApellidosMedico, String fecha, String hora) throws IOException {
        List<Cita> citas = cargarCitasDesdeArchivo("listacitas.txt");
        citas.add(new Cita(especialidad, nombresApellidosMedico, fecha, hora));
        escribirCitasEnArchivo("listacitas.txt", citas);
    }

    public static void escribirCitasEnArchivo(String archivoCitas, List<Cita> citas) throws IOException {
        try (FileWriter fw = new FileWriter(archivoCitas, false); PrintWriter pw = new PrintWriter(fw)) {
            for (Cita cita : citas) {
                pw.println(cita.toString());
            }
        }
    }

    public static List<Cita> cargarCitasDesdeArchivo(String archivoCitas) throws IOException {
        List<Cita> citas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCitas))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                if (campos.length == 4) {
                    Cita cita = new Cita(campos[0], campos[1], campos[2], campos[3]);
                    citas.add(cita);
                }
            }
        }
        return citas;
    }
    
}
