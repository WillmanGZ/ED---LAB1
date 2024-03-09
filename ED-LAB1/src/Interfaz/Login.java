package Interfaz;

import static Interfaz.Especialidades.mostrarEspecialidades;
import static Interfaz.Instrucciones.mostrarInstrucciones;
import static Interfaz.Registro.mostrarRegistro;
import static Logica.ArchivoUsuarios.verificarUsuarioContraseña;
import java.awt.Cursor;
import java.awt.TextField;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    public Login() {
        //ATRIBUTOS
        initComponents();
        this.setResizable(false);
        // Opcional: Configura la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
    }

   /* public static void mostrarLogin() { //MUESTRA LA VENTANA LOGIN
        Login login = new Login();
        login.setVisible(true);
    }
    */

    public static void cerrarLogin() { //CIERRA LA VENTANA LOGIN
        Login login = new Login();
        login.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        registrate_boton = new javax.swing.JButton();
        inicio_sesion_boton = new javax.swing.JButton();
        campo_usuario = new javax.swing.JTextField();
        campo_contraseña = new javax.swing.JTextField();
        login_screen = new javax.swing.JLabel();
        menu_barra = new javax.swing.JMenuBar();
        menu_opciones = new javax.swing.JMenu();
        menu_instrucciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        registrate_boton.setBackground(new java.awt.Color(51, 51, 51));
        registrate_boton.setBorderPainted(false);
        registrate_boton.setContentAreaFilled(false);
        registrate_boton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                registrate_botonMouseMoved(evt);
            }
        });
        registrate_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrate_botonMouseExited(evt);
            }
        });
        registrate_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrate_botonActionPerformed(evt);
            }
        });
        background.add(registrate_boton);
        registrate_boton.setBounds(550, 108, 51, 10);

        inicio_sesion_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/sesiondefault1.png"))); // NOI18N
        inicio_sesion_boton.setBorderPainted(false);
        inicio_sesion_boton.setContentAreaFilled(false);
        inicio_sesion_boton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                inicio_sesion_botonMouseMoved(evt);
            }
        });
        inicio_sesion_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inicio_sesion_botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inicio_sesion_botonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inicio_sesion_botonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                inicio_sesion_botonMouseReleased(evt);
            }
        });
        inicio_sesion_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicio_sesion_botonActionPerformed(evt);
            }
        });
        background.add(inicio_sesion_boton);
        inicio_sesion_boton.setBounds(440, 330, 166, 35);

        campo_usuario.setBackground(new java.awt.Color(255, 255, 255));
        campo_usuario.setForeground(new java.awt.Color(0, 0, 0));
        campo_usuario.setBorder(null);
        background.add(campo_usuario);
        campo_usuario.setBounds(410, 170, 230, 30);

        campo_contraseña.setBackground(new java.awt.Color(255, 255, 255));
        campo_contraseña.setForeground(new java.awt.Color(0, 0, 0));
        campo_contraseña.setBorder(null);
        background.add(campo_contraseña);
        campo_contraseña.setBounds(410, 246, 230, 30);

        login_screen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Login Screen.png"))); // NOI18N
        background.add(login_screen);
        login_screen.setBounds(0, -20, 730, 480);

        menu_opciones.setText("Opciones");

        menu_instrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Instrucciones Icono.png"))); // NOI18N
        menu_instrucciones.setText("Instrucciones");
        menu_instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_instruccionesActionPerformed(evt);
            }
        });
        menu_opciones.add(menu_instrucciones);

        menu_barra.add(menu_opciones);

        setJMenuBar(menu_barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void menu_instruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_instruccionesActionPerformed
        mostrarInstrucciones();  //MUESTRA LAS INSTRUCCIONES CLICKEANDO EN EL BOTON INSTRUCCIONES DEL MENU DE BARRA
    }//GEN-LAST:event_menu_instruccionesActionPerformed

    private void registrate_botonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrate_botonMouseMoved
        this.setCursor(new Cursor(Cursor.HAND_CURSOR)); //HACE QUE CUANDO PASES EL MOUSE POR ENCIMA DEL BOTON "REGISTRARSE" CAMBIE A LA MANITO
    }//GEN-LAST:event_registrate_botonMouseMoved

    private void registrate_botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrate_botonMouseExited
        this.setCursor(DEFAULT_CURSOR); //HACE QUE CUANDO EL CURSOR SE ALEJE DEL BOTON "REGISTRARSE" VUELVA A SER EL MOUSE NORMAL
    }//GEN-LAST:event_registrate_botonMouseExited

    private void registrate_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrate_botonActionPerformed
        dispose(); //CIERRA LA VENTANA LOGIN Y LUEGO ABRE LA VENTANA REGISTRO
        mostrarRegistro();
    }//GEN-LAST:event_registrate_botonActionPerformed

    private void inicio_sesion_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicio_sesion_botonActionPerformed
        String usuario = campo_usuario.getText(); //EXTRAE EL TEXTO DE LOS CAMPOS Y LOS ALMACENA EN EL STRING
        String contraseña = campo_contraseña.getText();
        try {
            if (verificarUsuarioContraseña(usuario, contraseña) == 2) {
                JOptionPane.showMessageDialog(null, "Usted ha iniciado sesión correctamente", "INICIO DE SESIóN EXITOSO", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                mostrarEspecialidades();
                JOptionPane.showMessageDialog(null, "Bienvenido a nuestro sistema de citas.", "BIENVENIDO", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Por favor elija la especialidad a la cual desea dirijirse.", "BIENVENIDO", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_inicio_sesion_botonActionPerformed

    private void inicio_sesion_botonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_sesion_botonMouseMoved
        this.setCursor(new Cursor(Cursor.HAND_CURSOR)); //HACE QUE CUANDO EL CURSOR PASE POR ENCIMA DEL BOTON "INICIO DE SESION", SE TRANSFORME EN LA MANITO
    }//GEN-LAST:event_inicio_sesion_botonMouseMoved

    private void inicio_sesion_botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_sesion_botonMouseExited
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/sesiondefault1.png"));
        inicio_sesion_boton.setIcon(II); //Hace que cuando el cursor se aleje del botón, se cambie la foto de vuelta a la original
        this.setCursor(DEFAULT_CURSOR); //HACE QUE CUANDO EL CURSOR SE ALEJE DEL BOTON "INICIO DE SESION" VUELVA A SER EL MOUSE NORMAL
    }//GEN-LAST:event_inicio_sesion_botonMouseExited

    private void inicio_sesion_botonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_sesion_botonMouseEntered
<<<<<<< Updated upstream
        //Hace que cuando el cursor esté por encima del botón, se cambie la foto
=======
>>>>>>> Stashed changes
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/sesionover1.png"));
        inicio_sesion_boton.setIcon(II);
    }//GEN-LAST:event_inicio_sesion_botonMouseEntered

<<<<<<< Updated upstream
    private void inicio_sesion_botonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_sesion_botonMousePressed
        //Hace que cuando el cursor esté presionando del botón, se cambie la foto
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/sesionpressed1.png"));
        inicio_sesion_boton.setIcon(II);
    }//GEN-LAST:event_inicio_sesion_botonMousePressed

    private void inicio_sesion_botonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_sesion_botonMouseReleased
       //Hace que cuando el cursor suelte el botón, se cambie la foto
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/sesiondefault1.png"));
        inicio_sesion_boton.setIcon(II);
    }//GEN-LAST:event_inicio_sesion_botonMouseReleased

=======
>>>>>>> Stashed changes

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTextField campo_contraseña;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JButton inicio_sesion_boton;
    private javax.swing.JLabel login_screen;
    private javax.swing.JMenuBar menu_barra;
    private javax.swing.JMenuItem menu_instrucciones;
    private javax.swing.JMenu menu_opciones;
    private javax.swing.JButton registrate_boton;
    // End of variables declaration//GEN-END:variables
}
