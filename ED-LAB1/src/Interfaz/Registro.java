package Interfaz;

import static Interfaz.Instrucciones.mostrarInstrucciones;
import static Interfaz.Login.mostrarLogin;
import static Logica.ArchivoUsuarios.añadirRegistros;
import static Logica.ArchivoUsuarios.verificarYAgregarUsuario;
import Logica.Usuario;
import java.awt.Cursor;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        this.setResizable(false);
        // Establece el comportamiento de cierre (terminar la aplicación cuando se cierra la ventana)
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Opcional: Configura la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
    }

    public static void mostrarRegistro() {
        Registro registro = new Registro(); //MUESTRA LA VENTANA REGISTRO
        registro.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        nombres_apellidos_campo = new javax.swing.JTextField();
        telefono_campo = new javax.swing.JTextField();
        cedula_campo = new javax.swing.JTextField();
        correo_campo = new javax.swing.JTextField();
        usuario_campo = new javax.swing.JTextField();
        contraseña_campo = new javax.swing.JTextField();
        registrarse_boton = new javax.swing.JButton();
        inicio_sesion_back_boton = new javax.swing.JButton();
        terminos_condiciones_boton = new javax.swing.JButton();
        registro_screen = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_bar = new javax.swing.JMenu();
        instrucciones_menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 460));
        getContentPane().setLayout(null);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(null);

        nombres_apellidos_campo.setBackground(new java.awt.Color(255, 255, 255));
        nombres_apellidos_campo.setForeground(new java.awt.Color(0, 0, 0));
        nombres_apellidos_campo.setBorder(null);
        Background.add(nombres_apellidos_campo);
        nombres_apellidos_campo.setBounds(380, 60, 280, 20);

        telefono_campo.setBackground(new java.awt.Color(255, 255, 255));
        telefono_campo.setForeground(new java.awt.Color(0, 0, 0));
        telefono_campo.setBorder(null);
        Background.add(telefono_campo);
        telefono_campo.setBounds(380, 110, 280, 20);

        cedula_campo.setBackground(new java.awt.Color(255, 255, 255));
        cedula_campo.setForeground(new java.awt.Color(0, 0, 0));
        cedula_campo.setBorder(null);
        Background.add(cedula_campo);
        cedula_campo.setBounds(380, 160, 280, 20);

        correo_campo.setBackground(new java.awt.Color(255, 255, 255));
        correo_campo.setForeground(new java.awt.Color(0, 0, 0));
        correo_campo.setBorder(null);
        Background.add(correo_campo);
        correo_campo.setBounds(390, 210, 270, 20);

        usuario_campo.setBackground(new java.awt.Color(255, 255, 255));
        usuario_campo.setForeground(new java.awt.Color(0, 0, 0));
        usuario_campo.setBorder(null);
        Background.add(usuario_campo);
        usuario_campo.setBounds(390, 266, 260, 20);

        contraseña_campo.setBackground(new java.awt.Color(255, 255, 255));
        contraseña_campo.setForeground(new java.awt.Color(0, 0, 0));
        contraseña_campo.setBorder(null);
        Background.add(contraseña_campo);
        contraseña_campo.setBounds(390, 316, 270, 20);

        registrarse_boton.setBorderPainted(false);
        registrarse_boton.setContentAreaFilled(false);
        registrarse_boton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                registrarse_botonMouseMoved(evt);
            }
        });
        registrarse_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarse_botonMouseExited(evt);
            }
        });
        registrarse_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarse_botonActionPerformed(evt);
            }
        });
        Background.add(registrarse_boton);
        registrarse_boton.setBounds(420, 375, 210, 35);

        inicio_sesion_back_boton.setBorderPainted(false);
        inicio_sesion_back_boton.setContentAreaFilled(false);
        inicio_sesion_back_boton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                inicio_sesion_back_botonMouseMoved(evt);
            }
        });
        inicio_sesion_back_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inicio_sesion_back_botonMouseExited(evt);
            }
        });
        inicio_sesion_back_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicio_sesion_back_botonActionPerformed(evt);
            }
        });
        Background.add(inicio_sesion_back_boton);
        inicio_sesion_back_boton.setBounds(540, 420, 60, 10);

        terminos_condiciones_boton.setBorder(null);
        terminos_condiciones_boton.setBorderPainted(false);
        terminos_condiciones_boton.setContentAreaFilled(false);
        terminos_condiciones_boton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                terminos_condiciones_botonMouseMoved(evt);
            }
        });
        terminos_condiciones_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                terminos_condiciones_botonMouseExited(evt);
            }
        });
        terminos_condiciones_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminos_condiciones_botonActionPerformed(evt);
            }
        });
        Background.add(terminos_condiciones_boton);
        terminos_condiciones_boton.setBounds(540, 355, 120, 10);

        registro_screen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Register Screen.png"))); // NOI18N
        Background.add(registro_screen);
        registro_screen.setBounds(0, -40, 720, 520);

        getContentPane().add(Background);
        Background.setBounds(0, 0, 700, 456);

        menu_bar.setText("Opciones");

        instrucciones_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/ICON2.png"))); // NOI18N
        instrucciones_menu.setText("Instrucciones");
        instrucciones_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrucciones_menuActionPerformed(evt);
            }
        });
        menu_bar.add(instrucciones_menu);

        jMenuBar1.add(menu_bar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicio_sesion_back_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicio_sesion_back_botonActionPerformed
        dispose(); //CIERRA LA VENTANA REGISTRO Y ABRE LA VENTANA LOGIN
        mostrarLogin();
    }//GEN-LAST:event_inicio_sesion_back_botonActionPerformed

    private void inicio_sesion_back_botonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_sesion_back_botonMouseMoved
        this.setCursor(new Cursor(Cursor.HAND_CURSOR)); //HACE QUE CUANDO PASES EL MOUSE POR ENCIMA DEL BOTON "INICIA SESION" SE CONVIERTA EN MANITO
    }//GEN-LAST:event_inicio_sesion_back_botonMouseMoved

    private void inicio_sesion_back_botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_sesion_back_botonMouseExited
        this.setCursor(DEFAULT_CURSOR); //HACE QUE CUANDO EL CURSOR SE ALEJE DEL BOTON "INICIA SESION" VUELVA A SER EL MOUSE NORMAL
    }//GEN-LAST:event_inicio_sesion_back_botonMouseExited

    private void instrucciones_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrucciones_menuActionPerformed
        mostrarInstrucciones(); //MUESTRA LA VENTANA DE INSTRUCCIONES
    }//GEN-LAST:event_instrucciones_menuActionPerformed

    private void registrarse_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarse_botonActionPerformed
        String nombres_apellidos = nombres_apellidos_campo.getText(); //EXTRAE LOS TEXTOS DE LOS CAMPOS DE TEXTO
        String telefono = telefono_campo.getText();
        String cedula = cedula_campo.getText();
        String correo = correo_campo.getText();
        String usuario = usuario_campo.getText();
        String contraseña = contraseña_campo.getText();
        try {
            verificarYAgregarUsuario(nombres_apellidos, telefono, cedula, correo, usuario, contraseña);
            dispose();
            mostrarLogin();
        } catch (IOException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(nombres_apellidos + " " + telefono + " " + cedula + " " + correo + " " + usuario + " " + contraseña);
    }//GEN-LAST:event_registrarse_botonActionPerformed

    private void registrarse_botonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarse_botonMouseMoved
        this.setCursor(new Cursor(Cursor.HAND_CURSOR)); //HACE QUE CUANDO PASES EL MOUSE POR ENCIMA DEL BOTON "REGISTRARSE" SE CONVIERTA EN MANITO   
    }//GEN-LAST:event_registrarse_botonMouseMoved

    private void registrarse_botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarse_botonMouseExited
        this.setCursor(DEFAULT_CURSOR); //HACE QUE CUANDO EL CURSOR SE ALEJE DEL BOTON "REGISTRARSE" VUELVA A SER EL MOUSE NORMAL

    }//GEN-LAST:event_registrarse_botonMouseExited

    private void terminos_condiciones_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminos_condiciones_botonActionPerformed
        try {
            // Intenta abrir el enlace en el navegador predeterminado
            Desktop.getDesktop().browse(new URI("https://cofca.com/proteccion-de-datos-personales/"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_terminos_condiciones_botonActionPerformed

    private void terminos_condiciones_botonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terminos_condiciones_botonMouseMoved
        this.setCursor(new Cursor(Cursor.HAND_CURSOR)); //HACE QUE CUANDO PASES EL MOUSE POR ENCIMA DEL BOTON "TERMINOS Y CONDICIONES" SE CONVIERTA EN MANITO
    }//GEN-LAST:event_terminos_condiciones_botonMouseMoved

    private void terminos_condiciones_botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terminos_condiciones_botonMouseExited
        this.setCursor(DEFAULT_CURSOR); //HACE QUE CUANDO EL CURSOR SE ALEJE DEL BOTON "REGISTRARSE" VUELVA A SER EL MOUSE NORMAL
    }//GEN-LAST:event_terminos_condiciones_botonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JTextField cedula_campo;
    private javax.swing.JTextField contraseña_campo;
    private javax.swing.JTextField correo_campo;
    private javax.swing.JButton inicio_sesion_back_boton;
    private javax.swing.JMenuItem instrucciones_menu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu_bar;
    private javax.swing.JTextField nombres_apellidos_campo;
    private javax.swing.JButton registrarse_boton;
    private javax.swing.JLabel registro_screen;
    private javax.swing.JTextField telefono_campo;
    private javax.swing.JButton terminos_condiciones_boton;
    private javax.swing.JTextField usuario_campo;
    // End of variables declaration//GEN-END:variables
}
