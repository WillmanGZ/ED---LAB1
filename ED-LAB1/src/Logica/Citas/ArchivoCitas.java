package Logica.Citas;

import java.io.*;
import java.util.*;

public class ArchivoCitas {

    public static void añadirCita(String cedulaPaciente, String especialidad, String idmedico, String fecha, String hora) throws IOException {
        List<Cita> citas = cargarCitasDesdeArchivo("listacitas.txt");
        citas.add(new Cita(cedulaPaciente, especialidad, idmedico, fecha, hora));
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
                if (campos.length == 5) {
                    Cita cita = new Cita(campos[0], campos[1], campos[2], campos[3], campos[4]);
                    citas.add(cita);
                }
            }
        }
        return citas;
    }

}
