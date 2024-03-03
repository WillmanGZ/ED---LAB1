package Logica;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Archivo {
    
    public static void añadirRegistros(String usuario, String contraseña, String nombres_apellidos, String cedula, String telefono, String correo){
        List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario(usuario, contraseña, nombres_apellidos, cedula, telefono, correo));
    }
    
}

