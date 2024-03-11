package Logica.Administradores;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArchivoAdministradores {

    public static int verificarUsuarioContraseña(String usuario, String contraseña) throws FileNotFoundException {
        String listausuarios = "listausuarios.txt";
        File archivo = new File(listausuarios);
        Scanner scanner = new Scanner(archivo);

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] campos = linea.split(";");
            if (campos.length >= 2) { // Asegurar que la línea tiene al menos dos partes
                String usuarioArchivo = campos[0];
                String contraseñaArchivo = campos[1];
                // No necesitamos usar los demás datos para la verificación de usuario y contraseña
                if (usuarioArchivo.toLowerCase().equalsIgnoreCase(usuario.toLowerCase()) && contraseñaArchivo.toLowerCase().equalsIgnoreCase(contraseña.toLowerCase())) {
                    return 2;
                }
            }
        }
        return 3; // Usuario o contraseña incorrectos o el archivo no contiene los datos
    }
}
