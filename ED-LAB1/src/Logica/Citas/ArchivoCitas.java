package Logica.Citas;

import static Logica.Medicos.ArchivoMedicos.cargarMedicosDesdeArchivo;
import Logica.Medicos.Medico;
import static Logica.Usuario.ArchivoUsuarios.cargarUsuariosDesdeArchivo;
import Logica.Usuario.Usuario;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class ArchivoCitas {

    private static final String archivoCitas = "listacitas.txt";
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    // Supongamos que estas listas están disponibles para verificar la existencia de usuarios y médicos.
    // En una aplicación real, probablemente consultarías a una base de datos o un archivo separado.
    private static final List<Usuario> usuariosExistentes;

    static {
        List<Usuario> tempUsuarios;
        try {
            tempUsuarios = cargarUsuariosDesdeArchivo("listausuarios.txt");
        } catch (IOException e) {
            tempUsuarios = new ArrayList<>();
            // Manejo de la excepción, por ejemplo, registrando el error.
            // Esto dependerá de cómo desees manejar este tipo de errores en tu aplicación.
            e.printStackTrace();
        }
        usuariosExistentes = tempUsuarios;
    } // Implementar este método

    private static final List<Medico> medicosExistentes;

    static {
        List<Medico> tempMedicos;
        try {
            tempMedicos = cargarMedicosDesdeArchivo("listamedicos.txt");
        } catch (IOException e) {
            tempMedicos = new ArrayList<>();
            // Dependiendo de tu aplicación, puedes querer registrar este error o tomar otras acciones.
            e.printStackTrace();
        }
        medicosExistentes = tempMedicos;
    }
    // Implementar este método

    public static void añadirCita(String idCita, Date fechaHora, String usuarioCedula, String medicoCedula, String estado) throws ParseException {
        try {
            Usuario usuario = buscarUsuarioPorCedula(usuarioCedula);
            Medico medico = buscarMedicoPorCedula(medicoCedula);

            if (usuario == null || medico == null) {
                JOptionPane.showMessageDialog(null, "Usuario o médico no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            List<Cita> citas = cargarCitasDesdeArchivo();

            // Verificar disponibilidad de la hora para el médico especificado
            if (!horaDisponible(fechaHora, medicoCedula, citas)) {
                JOptionPane.showMessageDialog(null, "La hora no está disponible para el médico seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Cita nuevaCita = new Cita(idCita, fechaHora, usuario, medico, estado);
            citas.add(nuevaCita);
            citas.sort(Comparator.comparing(Cita::getIdCita));

            escribirCitasEnArchivo(citas);
            JOptionPane.showMessageDialog(null, "La cita ha sido añadida exitosamente.", "Cita Añadida", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder al archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método ficticio para buscar un usuario por cédula
    private static Usuario buscarUsuarioPorCedula(String cedula) {
        for (Usuario usuario : usuariosExistentes) {
            if (usuario.getCedula().equals(cedula)) {
                return usuario;
            }
        }
        return null;
    }

    // Método ficticio para buscar un médico por cédula
    private static Medico buscarMedicoPorCedula(String cedula) {
        for (Medico medico : medicosExistentes) {
            if (medico.getCedula().equals(cedula)) {
                return medico;
            }
        }
        return null;
    }

    // Método ficticio para verificar la disponibilidad de una hora para un médico específico
    private static boolean horaDisponible(Date fechaHora, String medicoCedula, List<Cita> citas) {
        for (Cita cita : citas) {
            if (cita.getMedico().getCedula().equals(medicoCedula) && cita.getFechaHora().equals(fechaHora)) {
                return false;
            }
        }
        return true;
    }

    public static void escribirCitasEnArchivo(List<Cita> citas) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("listacitas.txt", false))) {
            for (Cita cita : citas) {
                String fechaHoraStr = sdf.format(cita.getFechaHora());
                String linea = String.format("%s;%s;%s;%s;%s;%s",
                        cita.getIdCita(),
                        fechaHoraStr,
                        cita.getUsuario().getCedula(), // Asumiendo que necesitamos la cédula del usuario
                        cita.getMedico().getCedula(), // Asumiendo que necesitamos la cédula del médico
                        cita.getEstado(),
                        cita.getUsuario().getNombres_apellidos() + "," + cita.getMedico().getNombres_apellidos());  // Ejemplo de cómo podrías querer guardar más info
                bw.write(linea);
                bw.newLine();
            }
        }
    }

    public static List<Cita> cargarCitasDesdeArchivo() {
        List<Cita> citas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("listacitas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                String idCita = datos[0];
                Date fechaHora = sdf.parse(datos[1]);  // Asumiendo que la fecha está en el segundo campo

                // Asumiendo que tienes métodos para buscar usuarios y médicos por su cédula.
                Usuario usuario = buscarUsuarioPorCedula(datos[2]);
                Medico medico = buscarMedicoPorCedula(datos[3]);

                String estado = datos[4];

                // Verifica que usuario y medico no sean nulos antes de añadir la cita
                if (usuario != null && medico != null) {
                    Cita cita = new Cita(idCita, fechaHora, usuario, medico, estado);
                    citas.add(cita);
                } else {
                    // Maneja el caso donde el usuario o médico no se encuentra
                    System.err.println("Usuario o Médico no encontrado para la cita con ID: " + idCita);
                }
            }
        } catch (IOException | ParseException e) {
            // Manejo adecuado de las excepciones
            e.printStackTrace();
        }

        return citas;
    }
}
