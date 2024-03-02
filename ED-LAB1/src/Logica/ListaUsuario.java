package LOGICA;

import Logica.Admin;
import java.util.Vector;

public class ListaUsuario {

    private static final Vector<Admin> Datos = new Vector<>();

    public static void agregar(Admin obj) {
        Datos.addElement(obj);
    }

    public static Vector mostrar() {
        return Datos;
    }
}
