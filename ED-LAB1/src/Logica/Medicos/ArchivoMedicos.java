package Logica.Medicos;

import Logica.Usuario.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class ArchivoMedicos {

    List<Medico> medicos = new ArrayList<>();

    public static void escribirMedicosEnArchivo(String listamedicos, List<Medico> medicos) throws IOException {
        try (FileWriter fw = new FileWriter(listamedicos, true); // EL APPEND EN TRUE PARA QUE ESCRIBA SIEMPRE EN LA ULTIMA LINEA DEL ARCHIVO Y NO REEMPLACE INFORMACION
                 PrintWriter pw = new PrintWriter(fw)) {
            for (Medico medico : medicos) {
                pw.println(medico.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static void añadirMedicos(String nombres_apellidos, String cedula, String telefono, String correo, String especialidad) throws IOException {
        List<Medico> medicos = new ArrayList<>();
        medicos.add(new Medico(nombres_apellidos, cedula, telefono, correo, especialidad));
        escribirMedicosEnArchivo("listamedicos.txt", medicos);
    }

    public static int verificarYAgregarMedicos(String nombres_apellidos, String cedula, String telefono, String correo, String especialidad) throws IOException {
        // Cargar usuarios existentes del archivo
        List<Medico> medicosExistentes = cargarMedicosDesdeArchivo("listamedicos.txt");

        long conteoEspacios = nombres_apellidos.chars().filter(ch -> ch == (' ')).count();

        // Verificar nombres_apellidos
        if (!Pattern.matches("^[a-zA-Z ]{3,}$", nombres_apellidos.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "EL nombre digitado es invalido, el nombre y apellido solo puede contener letras, porfavor digite sus nombres y apellidos nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 1; //APELLIDOS FORMATO INVALIDO
        } else if (medicosExistentes.stream().anyMatch(u -> u.getNombres_apellidos().equalsIgnoreCase(nombres_apellidos.toLowerCase()))) {
            JOptionPane.showMessageDialog(null, "El nombre digitado ya se encuentra registrado, porfavor ingrese un nombre nuevo o contacte con nuestro equipo de soporte para recuperar su cuenta ya existente", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 2; //APELLIDO DUPLICADO 
        } else if (!(conteoEspacios >= 2 && conteoEspacios <= 3)) {
            JOptionPane.showMessageDialog(null, "El nombre digitado es invalido, el nombre debe tener minimo 1 nombre y 2 apellidos, porfavor digite un nombre valido", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 3; //NO TIENE LOS 3 o 4 ESPACIOS, ES DECIR, FALTA APELLIDOS O NOMBRE
        }

        // Verificar teléfono
        if (!Pattern.matches("^[0-9]{10}$", telefono)) {
            JOptionPane.showMessageDialog(null, "El numero de telefono digitado es invalido, el numero debe tener 10 digitos numericos, porfavor digite un numero de telefono valido", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 4; // EL TELEFONO NO CUMPLE EL FORMATO 
        } else if (medicosExistentes.stream().anyMatch(u -> u.getTelefono().equals(telefono))) {
            JOptionPane.showMessageDialog(null, "El numero de telefono digitado ya se encuentra registrado, porfavor digite un nuevo numero de telefono o contacte con nuestro equipo de soporte para recuperar su cuenta ya existente", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 5; //EL TELEFONO ESTÁ DUPLICADO
        }

        // Verificar cédula
        if (!Pattern.matches("^[0-9]{7,}$", cedula)) {
            JOptionPane.showMessageDialog(null, "La cedula digitada es invalida, la cedula debe contener solo numeros y tener minimo 7 digitos, porfavor digite un numero de cedula valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 6; // LA CEDULA NO TIENE SOLO NUMEROS

        } else if (medicosExistentes.stream().anyMatch(u -> u.getCedula().equals(cedula))) {
            JOptionPane.showMessageDialog(null, "La cedula digitada ya se encuentra registrada, porfavor digite un nuevo numero de cedula o contacte con nuestro equipo de soporte para recuperar su cuenta ya existente", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 7; //LA CEDULA ESTÁ DUPLICADA
        }

        // Verificar correo
        if (!Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", correo.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "El correo digitado es invalido, el correo debe seguir el siguiente formato : nombredeusuario@dominio.com, porfavor digite un correo valido", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 8; // EL CORREO 

        } else if (medicosExistentes.stream().anyMatch(u -> u.getCorreo().toLowerCase().equals(correo.toLowerCase()))) {
            JOptionPane.showMessageDialog(null, "El correo digitado ya se encuentra registrado, porfavor digite un correo nuevo o contacte con nuestro equipo de soporte para recuperar su cuenta ya existente", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 9; // EL CORREO ESTÁ DUPLICADO
        } else if (true) {
            String especialidadMin = especialidad.toLowerCase();

            List<String> especialidadesValidas = Arrays.asList(
                    "optometria ortoptica",
                    "cataratas",
                    "glaucoma",
                    "oftalmologia general",
                    "oftalmologia pediatrica",
                    "retina y vitreo"
            );

            if (!especialidadesValidas.contains(especialidadMin)) {
                JOptionPane.showMessageDialog(null, "La especialidad digitada es inválida. Por favor, elija una de las siguientes opciones: Optometría, Ortoptica, Cataratas, Glaucoma, Oftalmología General, Oftalmología Pediátrica, Retina y Vítreo.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return 10; // ESPECIALIDAD INVÁLIDA
            }
        }

        // Si todas las verificaciones pasan, añadir el registro
        añadirMedicos(nombres_apellidos, cedula, telefono, correo, especialidad.toLowerCase());
        JOptionPane.showMessageDialog(null, "EL REGISTRO HA SIDO EXITOSO", "MEDICO REGISTRADO!", JOptionPane.INFORMATION_MESSAGE);
        return 13;
    }

    public static List<Medico> cargarMedicosDesdeArchivo(String listamedicos) throws IOException {
        List<Medico> medicos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(listamedicos))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea por el delimitador para obtener los campos individuales
                String[] campos = linea.split(";");
                // Asumiendo el orden de los campos: usuario, contraseña, nombres y apellidos, cédula, teléfono, correo
                if (campos.length < 5) {  // Corrección: Si esperas 5 campos, debería ser < 5, no < 6
                    System.err.println("Línea ignorada por formato incorrecto: " + linea);
                    continue;
                } else {
                    String nombresApellidos = campos[0];
                    String cedula = campos[1];
                    String telefono = campos[2];
                    String correo = campos[3];
                    String especialidad = campos[4];

                    // Crear un nuevo objeto Usuario con los campos parseados
                    Medico nuevoMedico = new Medico(nombresApellidos, cedula, telefono, correo, especialidad);
                    // Añadir el nuevo usuario a la lista de usuarios
                    medicos.add(nuevoMedico);
                }
            }
        }
        return medicos;
    }

    public static int eliminarMedicos(String nombres_apellidos, String cedula) throws IOException {
        List<Medico> medicosExistentes = cargarMedicosDesdeArchivo("listamedicos.txt");
        boolean encontrado = false;

        for (Iterator<Medico> iterator = medicosExistentes.iterator(); iterator.hasNext();) {
            Medico medicoActual = iterator.next();
            if (medicoActual.getNombres_apellidos().equalsIgnoreCase(nombres_apellidos)
                    && medicoActual.getCedula().equals(cedula)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            try (FileWriter fw = new FileWriter("listamedicos.txt", false); PrintWriter pw = new PrintWriter(fw)) {
                for (Medico medicoEnLista : medicosExistentes) {
                    pw.println(medicoEnLista.toString());
                }
            }
            return 0; // Éxito
        } else {
            System.out.println("Médico no encontrado.");
            return 1; // Médico no encontrado
        }
    }
}
