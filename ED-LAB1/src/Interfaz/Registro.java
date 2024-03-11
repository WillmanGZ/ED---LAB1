package Interfaz;

import static Interfaz.Login.mostrarLogin;
import static Logica.Usuario.ArchivoUsuarios.añadirRegistrosNormal;
import static Logica.Usuario.ArchivoUsuarios.verificarYAgregarUsuario;
import Logica.Usuario.Usuario;
import java.awt.Cursor;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
        this.setTitle("Registro");
    }

    public static void mostrarRegistro() {
        Registro registro = new Registro(); //MUESTRA LA VENTANA REGISTRO
        registro.setVisible(true);
    }

    public static void cerrarRegistro() { //CIERRA LA VENTANA REGISTRO
        Registro registro = new Registro();
        registro.dispose();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 460));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(null);

        nombres_apellidos_campo.setBackground(new java.awt.Color(255, 255, 255));
        nombres_apellidos_campo.setForeground(new java.awt.Color(0, 0, 0));
        nombres_apellidos_campo.setBorder(null);
        nombres_apellidos_campo.setOpaque(false);
        Background.add(nombres_apellidos_campo);
        nombres_apellidos_campo.setBounds(390, 50, 270, 30);

        telefono_campo.setBackground(new java.awt.Color(255, 255, 255));
        telefono_campo.setForeground(new java.awt.Color(0, 0, 0));
        telefono_campo.setBorder(null);
        telefono_campo.setOpaque(false);
        Background.add(telefono_campo);
        telefono_campo.setBounds(390, 100, 270, 30);

        cedula_campo.setBackground(new java.awt.Color(255, 255, 255));
        cedula_campo.setForeground(new java.awt.Color(0, 0, 0));
        cedula_campo.setBorder(null);
        cedula_campo.setOpaque(false);
        Background.add(cedula_campo);
        cedula_campo.setBounds(390, 150, 270, 30);

        correo_campo.setBackground(new java.awt.Color(255, 255, 255));
        correo_campo.setForeground(new java.awt.Color(0, 0, 0));
        correo_campo.setBorder(null);
        correo_campo.setOpaque(false);
        Background.add(correo_campo);
        correo_campo.setBounds(390, 210, 270, 30);

        usuario_campo.setBackground(new java.awt.Color(255, 255, 255));
        usuario_campo.setForeground(new java.awt.Color(0, 0, 0));
        usuario_campo.setBorder(null);
        usuario_campo.setOpaque(false);
        Background.add(usuario_campo);
        usuario_campo.setBounds(390, 256, 260, 30);

        contraseña_campo.setBackground(new java.awt.Color(255, 255, 255));
        contraseña_campo.setForeground(new java.awt.Color(0, 0, 0));
        contraseña_campo.setBorder(null);
        contraseña_campo.setOpaque(false);
        Background.add(contraseña_campo);
        contraseña_campo.setBounds(390, 306, 270, 30);

        registrarse_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Registro/regdefault.png"))); // NOI18N
        registrarse_boton.setBorderPainted(false);
        registrarse_boton.setContentAreaFilled(false);
        registrarse_boton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                registrarse_botonMouseMoved(evt);
            }
        });
        registrarse_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarse_botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarse_botonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarse_botonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                registrarse_botonMouseReleased(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

    private void registrarse_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarse_botonActionPerformed
        String nombres_apellidos = nombres_apellidos_campo.getText(); //EXTRAE LOS TEXTOS DE LOS CAMPOS DE TEXTO
        String telefono = telefono_campo.getText();
        String cedula = cedula_campo.getText();
        String correo = correo_campo.getText();
        String usuario = usuario_campo.getText();
        String contraseña = contraseña_campo.getText();
        String estado = "paciente";
        try {
            if (verificarYAgregarUsuario(usuario, contraseña, nombres_apellidos.trim(), cedula, telefono, correo, estado) == 13) {
                dispose();
                mostrarLogin();
            }

        } catch (IOException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registrarse_botonActionPerformed

    private void registrarse_botonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarse_botonMouseMoved
        this.setCursor(new Cursor(Cursor.HAND_CURSOR)); //HACE QUE CUANDO PASES EL MOUSE POR ENCIMA DEL BOTON "REGISTRARSE" SE CONVIERTA EN MANITO   
    }//GEN-LAST:event_registrarse_botonMouseMoved

    private void registrarse_botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarse_botonMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/Registro/regdefault.png"));
        registrarse_boton.setIcon(II);
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

    private void registrarse_botonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarse_botonMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/Registro/regover.png"));
        registrarse_boton.setIcon(II);
    }//GEN-LAST:event_registrarse_botonMouseEntered

    private void registrarse_botonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarse_botonMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/Registro/regpressed.png"));
        registrarse_boton.setIcon(II);
    }//GEN-LAST:event_registrarse_botonMousePressed

    private void registrarse_botonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarse_botonMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/Registro/regover.png"));
        registrarse_boton.setIcon(II);
    }//GEN-LAST:event_registrarse_botonMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JTextField cedula_campo;
    private javax.swing.JTextField contraseña_campo;
    private javax.swing.JTextField correo_campo;
    private javax.swing.JButton inicio_sesion_back_boton;
    private javax.swing.JTextField nombres_apellidos_campo;
    private javax.swing.JButton registrarse_boton;
    private javax.swing.JLabel registro_screen;
    private javax.swing.JTextField telefono_campo;
    private javax.swing.JButton terminos_condiciones_boton;
    private javax.swing.JTextField usuario_campo;
    // End of variables declaration//GEN-END:variables
}
