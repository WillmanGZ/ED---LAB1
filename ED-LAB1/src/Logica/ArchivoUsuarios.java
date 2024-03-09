package Logica;

import Interfaz.Login;
//import static Interfaz.Login.mostrarLogin;
import static Interfaz.Registro.cerrarRegistro;
import Logica.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
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

    public static void añadirRegistrosNormal(String usuario, String contraseña, String nombres_apellidos, String cedula, String telefono, String correo, String estado) throws IOException {
        List<Usuario> usuarios = new ArrayList<>();
        estado = "paciente"; // Aquí fijas el estado a "paciente"
        usuarios.add(new Usuario(usuario, contraseña, nombres_apellidos, cedula, telefono, correo, estado));
        escribirUsuariosEnArchivo("listausuarios.txt", usuarios);
    }

    public static int verificarYAgregarUsuario(String usuario, String contraseña, String nombres_apellidos, String cedula, String telefono, String correo, String estado) throws IOException {
        // Cargar usuarios existentes del archivo
        List<Usuario> usuariosExistentes = cargarUsuariosDesdeArchivo("listausuarios.txt");

        long conteoEspacios = nombres_apellidos.chars().filter(ch -> ch == (' ')).count();

        // Verificar nombres_apellidos
        if (!Pattern.matches("^[a-zA-Z ]{3,}$", nombres_apellidos.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "El nombre digitado es inválido. El nombre y apellido solo puede contener letras, por favor digite sus nombres y apellidos nuevamente.", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 1; //APELLIDOS FORMATO INVALIDO
        } else if (usuariosExistentes.stream().anyMatch(u -> u.getNombres_apellidos().equalsIgnoreCase(nombres_apellidos.toLowerCase()))) {
            JOptionPane.showMessageDialog(null, "El nombre digitado ya se encuentra registrado. Por favor ingrese un nombre nuevo o contacte con nuestro equipo de soporte para recuperar su cuenta.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 2; //APELLIDO DUPLICADO 
        } else if (!(conteoEspacios >= 2 && conteoEspacios <= 3)) {
            JOptionPane.showMessageDialog(null, "El nombre digitado es inválido. El nombre debe tener mínimo 1 nombre y 2 apellidos, por favor digite un nombre válido.", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 3; //NO TIENE LOS 3 o 4 ESPACIOS, ES DECIR, FALTA APELLIDOS O NOMBRE
        }

        // Verificar teléfono
        if (!Pattern.matches("^[0-9]{10}$", telefono)) {
            JOptionPane.showMessageDialog(null, "El número de teléfono digitado es inválido. El número debe tener 10 digitos numéricos, por favor digite un número de teléfono válido.", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 4; // EL TELEFONO NO CUMPLE EL FORMATO 
        } else if (usuariosExistentes.stream().anyMatch(u -> u.getTelefono().equals(telefono))) {
            JOptionPane.showMessageDialog(null, "El número de teléfono digitado ya se encuentra registrado. Por favor digite un nuevo número de telefono o contacte con nuestro equipo de soporte para recuperar su cuenta.", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 5; //EL TELEFONO ESTÁ DUPLICADO
        }

        // Verificar cédula
        if (!Pattern.matches("^[0-9]{7,}$", cedula)) {
            JOptionPane.showMessageDialog(null, "La cédula digitada es inválida, la cédula debe contener solo números y tener mínimo 7 dígitos. Por favor digite un número de cédula válida.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 6; // LA CEDULA NO TIENE SOLO NUMEROS

        } else if (usuariosExistentes.stream().anyMatch(u -> u.getCedula().equals(cedula))) {
            JOptionPane.showMessageDialog(null, "La cédula digitada ya se encuentra registrada. Por favor digite un nuevo número de cédula o contacte con nuestro equipo de soporte para recuperar su cuenta.", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 7; //LA CEDULA ESTÁ DUPLICADA
        }

        // Verificar correo
        if (!Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", correo.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "El correo digitado es inválido. El correo debe seguir el siguiente formato : nombredeusuario@dominio.com, por favor digite un correo válido", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 8; // EL CORREO 

        } else if (usuariosExistentes.stream().anyMatch(u -> u.getCorreo().toLowerCase().equals(correo.toLowerCase()))) {
            JOptionPane.showMessageDialog(null, "El correo digitado ya se encuentra registrado. Por favor digite un correo nuevo o contacte con nuestro equipo de soporte para recuperar su cuenta.", "ERROR", JOptionPane.ERROR_MESSAGE);

            return 9; // EL CORREO ESTÁ DUPLICADO
        }

        // Verificar que el usuario no exista y que cumpla con los requisitos de formato
        if (usuariosExistentes.stream().anyMatch(u -> u.getUsuario().toLowerCase().equals(usuario.toLowerCase()))) {
            JOptionPane.showMessageDialog(null, "El usuario digitado ya se encuentra registrado. Por favor ingrese un nuevo usuario o contacte con nuestro equipo de soporte para recuperar su cuenta.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 10; //USUARIO DUPLICADO
        } else if (!Pattern.matches("^[a-zA-Z0-9]{5,12}$", usuario)) {
            JOptionPane.showMessageDialog(null, "El usuario digitado es inválido. El nombre de usuario solo puede contener letras y números, y debe tener de 5-12 dígitos, por favor digite un usuario válido.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 11; // USUARIO NO CUMPLE CON EL FORMATO
        }

        // Verificar que la contraseña sea hexadecimal, sin espacios y de máximo 16 dígitos
        if (!Pattern.matches("^[a-zA-Z0-9]{4,16}$", contraseña)) {
            JOptionPane.showMessageDialog(null, "La contraseña digitada es inválida, la contraseña solo puede contener letras y números, y debe tener de 4-16 dígitos, por favor digite una contraseña válida.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 12; // CONTRASEÑA NO VÁLIDA
        }

        // Si todas las verificaciones pasan, añadir el registro
        añadirRegistrosNormal(usuario, contraseña, nombres_apellidos, cedula, telefono, correo, estado);
        System.out.println(estado);
        JOptionPane.showMessageDialog(null, "Tu cuenta ha sido registrada con éxito.", "BIENVENIDO!", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Serás redirijido a nuestra ventana de inicio de sesión, donde podrás ingresar con la cuenta que has registrado.", "Inicia Sesión", JOptionPane.INFORMATION_MESSAGE);
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
                if (campos.length < 7) {
                    // Manejar el error adecuadamente, por ejemplo, saltando esta línea o mostrando un mensaje de error
                    continue; // Esto saltará al siguiente ciclo del bucle si no hay suficientes campos
                } else {
                    String usuario = campos[0];
                    String contraseña = campos[1];
                    String nombresApellidos = campos[2];
                    String cedula = campos[3];
                    String telefono = campos[4];
                    String correo = campos[5];
                    String estado = campos[6];

                    // Crear un nuevo objeto Usuario con los campos parseados
                    Usuario nuevoUsuario = new Usuario(usuario, contraseña, nombresApellidos, cedula, telefono, correo, estado);
                    // Añadir el nuevo usuario a la lista de usuarios
                    usuarios.add(nuevoUsuario);
                }
            }
        }
        return usuarios;
    }

    public static int verificarUsuarioContraseña(String usuario, String contraseña) throws FileNotFoundException {
        String listausuarios = "listausuarios.txt";
        File archivo = new File(listausuarios);
        Scanner scanner = new Scanner(archivo);

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] partes = linea.split(";");
            if (partes.length >= 7) { // Asegurar que la línea tiene al menos seis partes
                String usuarioArchivo = partes[0];
                String contraseñaArchivo = partes[1];
                // No necesitamos usar los demás datos para la verificación de usuario y contraseña
                if (usuarioArchivo.toLowerCase().equals(usuario.toLowerCase()) && contraseñaArchivo.toLowerCase().equals(contraseña.toLowerCase())) {
                    String estadoArchivo = partes[6];
                    if (estadoArchivo == "admin") {
                        return 1;
                    }
                    return 2; // Usuario y contraseña verificados
                }
            }
        }
        return 3; // Usuario o contraseña incorrectos o el archivo no contiene los datos
    }

}
