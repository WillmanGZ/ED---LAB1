package Logica;

import Logica.Usuario;
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

public class ArchivoUsuarios {

    List<Usuario> usuarios = new ArrayList<>();

    public static void escribirUsuariosEnArchivo(String listausuarios, List<Usuario> usuarios) throws IOException {
        try (FileWriter fw = new FileWriter(listausuarios, true); // EL APPEND EN TRUE PARA QUE ESCRIBA SIEMPRE EN LA ULTIMA LINEA DEL ARCHIVO Y NO REEMPLACE INFORMACION
                 PrintWriter pw = new PrintWriter(fw)) {
            for (Usuario usuario : usuarios) {
                pw.println(usuario.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static void añadirRegistros(String usuario, String contraseña, String nombres_apellidos, String cedula, String telefono, String correo) throws IOException {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(usuario, contraseña, nombres_apellidos, cedula, telefono, correo));
        escribirUsuariosEnArchivo("listausuarios.txt", usuarios);
    }

    public static int verificarYAgregarUsuario(String usuario, String contraseña, String nombres_apellidos, String cedula, String telefono, String correo) throws IOException {
        // Cargar usuarios existentes del archivo
        List<Usuario> usuariosExistentes = cargarUsuariosDesdeArchivo("listausuarios.txt");

        // Verificar que el usuario no exista y que cumpla con los requisitos de formato
        if (usuariosExistentes.stream().anyMatch(u -> u.getUsuario().equals(usuario))) {
            JOptionPane.showMessageDialog(null, "El usuario digitado ya se encuentra registrado, porfavor ingrese un nuevo usuario o contacte con nuestro equipo de soporte para recuperar su cuenta ya existente", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            return 1; //USUARIO DUPLICADO
        } else if (!Pattern.matches("^[a-zA-Z0-9]*$", usuario)) {
            JOptionPane.showMessageDialog(null, "El usuario digitado es invalido, el nombre de usuario solo puede contener letras y numeros, porfavor digite un usuario valido", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            return 2; // USUARIO NO CUMPLE CON EL FORMATO
        }

        // Verificar que la contraseña sea hexadecimal, sin espacios y de máximo 16 dígitos
        if (!Pattern.matches("^[0-9a-fA-F]{1,16}$", contraseña)) {
            JOptionPane.showMessageDialog(null, "La contraseña digitada es invalida, la contraseña solo puede contener letras y numeros, y tener maximo 16 digitos, porfavor digite una contraseña valida", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            return 3; //CONTRASEÑA NO VALIDA
        }
        long conteoEspacios = nombres_apellidos.chars().filter(ch -> ch == ' ').count();

        // Verificar nombres_apellidos
        if (!Pattern.matches("^[a-zA-Z ]{3,}$", nombres_apellidos.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "EL nombre digitado es invalido, el nombre y apellido solo puede contener letras, porfavor digite sus nombres y apellidos nuevamente", "ERROR", JOptionPane.INFORMATION_MESSAGE);

            return 4; //APELLIDOS FORMATO INVALIDO
        } else if (usuariosExistentes.stream().anyMatch(u -> u.getNombres_apellidos().equalsIgnoreCase(nombres_apellidos))) {
            JOptionPane.showMessageDialog(null, "El nombre digitado ya se encuentra registrado, porfavor ingrese un nombre nuevo o contacte con nuestro equipo de soporte para recuperar su cuenta ya existente", "ERROR", JOptionPane.INFORMATION_MESSAGE);

            return 5; //APELLIDO DUPLICADO 
        } else if (!(conteoEspacios >= 2 && conteoEspacios <= 3)) {
            JOptionPane.showMessageDialog(null, "El nombre digitado es invalido, el nombre debe tener minimo 1 nombre y 2 apellidos, porfavor digite un nombre valido", "ERROR", JOptionPane.INFORMATION_MESSAGE);

            return 6; //NO TIENE LOS 3 o 4 ESPACIOS, ES DECIR, FALTA APELLIDOS O NOMBRE
        }

        // Verificar cédula
        if (!Pattern.matches("^[0-9]{7,}$", cedula)) {
            JOptionPane.showMessageDialog(null, "La cedula digitada es invalida, la cedula debe contener solo numeros y tener minimo 7 digitos, porfavor digite un numero de cedula valida", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            return 7; // LA CEDULA NO TIENE SOLO NUMEROS

        } else if (usuariosExistentes.stream().anyMatch(u -> u.getCedula().equals(cedula))) {
            JOptionPane.showMessageDialog(null, "La cedula digitada ya se encuentra registrada, porfavor digite un nuevo numero de cedula o contacte con nuestro equipo de soporte para recuperar su cuenta ya existente", "ERROR", JOptionPane.INFORMATION_MESSAGE);

            return 8; //LA CEDULA ESTÁ DUPLICADA
        }

        // Verificar teléfono
        if (!Pattern.matches("^[0-9]{10}$", telefono)) {
            JOptionPane.showMessageDialog(null, "El numero de telefono digitado es invalido, el numero debe tener 10 digitos numericos, porfavor digite un numero de telefono valido", "ERROR", JOptionPane.INFORMATION_MESSAGE);

            return 9; // EL TELEFONO NO CUMPLE EL FORMATO 
        } else if (usuariosExistentes.stream().anyMatch(u -> u.getTelefono().equals(telefono))) {
            JOptionPane.showMessageDialog(null, "El numero de telefono digitado ya se encuentra registrado, porfavor digite un nuevo numero de telefono o contacte con nuestro equipo de soporte para recuperar su cuenta ya existente", "ERROR", JOptionPane.INFORMATION_MESSAGE);

            return 10; //EL TELEFONO ESTÁ DUPLICADO
        }

        // Verificar correo
        if (!Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", correo)) {
            JOptionPane.showMessageDialog(null, "El correo digitado es invalido, el correo debe seguir el siguiente formato : example@provider.com, porfavor digite un correo valido", "ERROR", JOptionPane.INFORMATION_MESSAGE);

            return 11; // EL CORREO 

        } else if (usuariosExistentes.stream().anyMatch(u -> u.getCorreo().equals(correo))) {
            JOptionPane.showMessageDialog(null, "El correo digitado ya se encuentra registrado, porfavor digite un correo nuevo o contacte con nuestro equipo de soporte para recuperar su cuenta ya existente", "ERROR", JOptionPane.INFORMATION_MESSAGE);

            return 12; // EL CORREO ESTÁ DUPLICADO
        }

        // Si todas las verificaciones pasan, añadir el registro
        añadirRegistros(usuario, contraseña, nombres_apellidos, cedula, telefono, correo);
        JOptionPane.showMessageDialog(null, "Tu cuenta ha sido registrada con exito", "BIENVENIDO!", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Seras redirijido a nuestra ventana de inicio de sesion, ahora puedes ingresar con la cuenta que has registrado", "Inicia Sesion", JOptionPane.INFORMATION_MESSAGE);

        return 13;
    }

    private static List<Usuario> cargarUsuariosDesdeArchivo(String listausuarios) throws IOException {
        List<Usuario> usuarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(listausuarios))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea por el delimitador para obtener los campos individuales
                String[] campos = linea.split(";");
                // Asumiendo el orden de los campos: usuario, contraseña, nombres y apellidos, cédula, teléfono, correo
                String usuario = campos[0];
                String contraseña = campos[1];
                String nombresApellidos = campos[2];
                String cedula = campos[3];
                String telefono = campos[4];
                String correo = campos[5];

                // Crear un nuevo objeto Usuario con los campos parseados
                Usuario nuevoUsuario = new Usuario(usuario, contraseña, nombresApellidos, cedula, telefono, correo);
                // Añadir el nuevo usuario a la lista de usuarios
                usuarios.add(nuevoUsuario);
            }
        }
        return usuarios;
    }
}
