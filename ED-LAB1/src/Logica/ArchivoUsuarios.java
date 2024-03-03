package Logica;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

}
