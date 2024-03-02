package Logica;

import LOGICA.ListaUsuario;
import java.util.Vector;

public class Admin {

    private String Usuario, Contraseña;

    public Admin() {

    }

    public Admin(String Usuario, String Contraseña) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public static int verificar(String usuario, String contraseña) {
        Vector lista = mostrar();
        Admin obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Admin) lista.elementAt(i);
            if (obj.getUsuario().equalsIgnoreCase(usuario) && obj.getContraseña().equalsIgnoreCase(contraseña)) {
                return i;
            }
        }
        return -1;
    }

    public static Vector mostrar() {
        return ListaUsuario.mostrar();
    }
}
