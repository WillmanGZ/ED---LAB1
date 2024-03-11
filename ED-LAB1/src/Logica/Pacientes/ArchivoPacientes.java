package Logica.Pacientes;

import Logica.Pacientes.Paciente;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class ArchivoPacientes {

    List<Paciente> pacientes = new ArrayList<>();

    public static void escribirPacientesEnArchivo(String listapacientes, List<Paciente> pacientes) throws IOException {
        try (FileWriter fw = new FileWriter(listapacientes, true); // EL APPEND EN TRUE PARA QUE ESCRIBA SIEMPRE EN LA ULTIMA LINEA DEL ARCHIVO Y NO REEMPLACE INFORMACION
                 PrintWriter pw = new PrintWriter(fw)) {
            for (Paciente paciente : pacientes) {
                pw.println(paciente.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static void añadirRegistrosAdmin(String usuario, String contraseña, String nombres_apellidos, String cedula, String telefono, String correo) throws IOException {
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente(usuario, contraseña, nombres_apellidos, cedula, telefono, correo));
        escribirPacientesEnArchivo("listapacientes.txt", pacientes);
    }

    public static int verificarYAgregarPacienteAdmin(String usuario, String contraseña, String nombres_apellidos, String cedula, String telefono, String correo) throws IOException {
        // Cargar usuarios existentes del archivo
        List<Paciente> pacientesExistentes = cargarPacientesDesdeArchivo("listapacientes.txt");

        long conteoEspacios = nombres_apellidos.chars().filter(ch -> ch == (' ')).count();

        // Verificar nombres_apellidos
        if (!Pattern.matches("^[a-zA-Z ]{3,}$", nombres_apellidos.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "EL nombre digitado es invalido, el nombre y apellido solo puede contener letras, porfavor digite sus nombres y apellidos nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 1; //APELLIDOS FORMATO INVALIDO
        } else if (pacientesExistentes.stream().anyMatch(u -> u.getNombres_apellidos().equalsIgnoreCase(nombres_apellidos.toLowerCase()))) {
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
        } else if (pacientesExistentes.stream().anyMatch(u -> u.getTelefono().equals(telefono))) {
            JOptionPane.showMessageDialog(null, "El numero de telefono digitado ya se encuentra registrado, porfavor digite un nuevo numero de telefono o contacte con nuestro equipo de soporte para recuperar su cuenta ya existente", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 5; //EL TELEFONO ESTÁ DUPLICADO
        }

        // Verificar cédula
        if (!Pattern.matches("^[0-9]{7,}$", cedula)) {
            JOptionPane.showMessageDialog(null, "La cedula digitada es invalida, la cedula debe contener solo numeros y tener minimo 7 digitos, porfavor digite un numero de cedula valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 6; // LA CEDULA NO TIENE SOLO NUMEROS

        } else if (pacientesExistentes.stream().anyMatch(u -> u.getCedula().equals(cedula))) {
            JOptionPane.showMessageDialog(null, "La cedula digitada ya se encuentra registrada, porfavor digite un nuevo numero de cedula o contacte con nuestro equipo de soporte para recuperar su cuenta ya existente", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 7; //LA CEDULA ESTÁ DUPLICADA
        }

        // Verificar correo
        if (!Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", correo.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "El correo digitado es invalido, el correo debe seguir el siguiente formato : nombredeusuario@dominio.com, porfavor digite un correo valido", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 8; // EL CORREO 

        } else if (pacientesExistentes.stream().anyMatch(u -> u.getCorreo().toLowerCase().equals(correo.toLowerCase()))) {
            JOptionPane.showMessageDialog(null, "El correo digitado ya se encuentra registrado, porfavor digite un correo nuevo o contacte con nuestro equipo de soporte para recuperar su cuenta ya existente", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 9; // EL CORREO ESTÁ DUPLICADO
        }

        // Verificar que el usuario no exista y que cumpla con los requisitos de formato
        if (pacientesExistentes.stream().anyMatch(u -> u.getUsuario().toLowerCase().equals(usuario.toLowerCase()))) {
            JOptionPane.showMessageDialog(null, "El usuario digitado ya se encuentra registrado, porfavor ingrese un nuevo usuario o contacte con nuestro equipo de soporte para recuperar su cuenta ya existente", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 10; //USUARIO DUPLICADO
        } else if (!Pattern.matches("^[a-zA-Z0-9]{5,12}$", usuario)) {
            JOptionPane.showMessageDialog(null, "El usuario digitado es invalido, el nombre de usuario solo puede contener letras y numeros, y debe tener de 5-12 digitos, porfavor digite un usuario valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 11; // USUARIO NO CUMPLE CON EL FORMATO
        }

        // Verificar que la contraseña sea hexadecimal, sin espacios y de máximo 16 dígitos
        if (!Pattern.matches("^[a-zA-Z0-9]{4,16}$", contraseña)) {
            JOptionPane.showMessageDialog(null, "La contraseña digitada es invalida, la contraseña solo puede contener letras y números, y debe tener de 4-16 dígitos, por favor digite una contraseña válida", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 12; // CONTRASEÑA NO VÁLIDA
        }

        // Si todas las verificaciones pasan, añadir el registro
        añadirRegistrosAdmin(usuario, contraseña, nombres_apellidos, cedula, telefono, correo);
        JOptionPane.showMessageDialog(null, "La cuenta ha sido registrada exitosamente", "REGISTRADO!", JOptionPane.INFORMATION_MESSAGE);
        return 14;
    }

    public static List<Paciente> cargarPacientesDesdeArchivo(String listapacientes) throws IOException {
        List<Paciente> pacientes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(listapacientes))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea por el delimitador para obtener los campos individuales
                String[] campos = linea.split(";");
                // Asumiendo el orden de los campos: usuario, contraseña, nombres y apellidos, cédula, teléfono, correo
                if (campos.length < 6) {
                    // Manejar el error adecuadamente, por ejemplo, saltando esta línea o mostrando un mensaje de error
                    continue; // Esto saltará al siguiente ciclo del bucle si no hay suficientes campos
                } else {
                    String usuario = campos[0];
                    String contraseña = campos[1];
                    String nombresApellidos = campos[2];
                    String cedula = campos[3];
                    String telefono = campos[4];
                    String correo = campos[5];

                    // Crear un nuevo objeto Usuario con los campos parseados
                    Paciente nuevoPaciente = new Paciente(usuario, contraseña, nombresApellidos, cedula, telefono, correo);
                    // Añadir el nuevo usuario a la lista de usuarios
                    pacientes.add(nuevoPaciente);
                }
            }
        }
        return pacientes;
    }

    public static int eliminarPacientes(String cedula, String usuario, String contraseña) throws IOException {
        List<Paciente> PacientesExistentes = cargarPacientesDesdeArchivo("listapacientes.txt");
        boolean encontrado = false;

        for (Iterator<Paciente> iterator = PacientesExistentes.iterator(); iterator.hasNext();) {
            Paciente pacientesActual = iterator.next();
            if (pacientesActual.getUsuario().equalsIgnoreCase(usuario)
                    && pacientesActual.getContraseña().equals(contraseña)
                    && pacientesActual.getCedula().equals(cedula)) {
                iterator.remove(); // Elimina el usuario de la lista
                encontrado = true;
                break; // Sal del ciclo una vez encontrado y eliminado el usuario
            }
        }

        if (encontrado) {
            // Reescribir el archivo sin el usuario eliminado
            try (FileWriter fw = new FileWriter("listapacientes.txt", false); // false para sobreescribir el archivo
                     PrintWriter pw = new PrintWriter(fw)) {
                for (Paciente PacientesEnLista : PacientesExistentes) {
                    pw.println(PacientesEnLista.toString());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error al escribir el archivo: " + e.getMessage());
                return 2; // Error al escribir en el archivo
            }

            return 0; // Éxito
        } else {
            return 1; // Usuario no encontrado
        }
    }

    public static String obtenerNombreApellidoPacientePorCedula(String cedula) throws IOException {
        Paciente paciente = buscarPacientePorCedula(cedula);
        if (paciente != null) {
            return paciente.getNombres_apellidos();
        } else {
            return "Paciente no encontrado";
        }
    }

    public static String obtenerUsuarioPacientePorCedula(String cedula) throws IOException {
        Paciente paciente = buscarPacientePorCedula(cedula);
        if (paciente != null) {
            return paciente.getUsuario();
        } else {
            return "Paciente no encontrado";
        }
    }

    public static String obtenerCorreoPacientePorCedula(String cedula) throws IOException {
        Paciente paciente = buscarPacientePorCedula(cedula);
        if (paciente != null) {
            return paciente.getCorreo();
        } else {
            return "Paciente no encontrado";
        }
    }

    private static Paciente buscarPacientePorCedula(String cedula) throws IOException {
        List<Paciente> pacientes = cargarPacientesDesdeArchivo("listapacientes.txt");
        for (Paciente paciente : pacientes) {
            if (paciente.getCedula().equals(cedula)) {
                return paciente; // Paciente encontrado
            }
        }
        return null; // No se encontró el paciente
    }

}
