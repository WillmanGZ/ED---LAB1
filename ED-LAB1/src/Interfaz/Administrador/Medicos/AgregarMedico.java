package Interfaz.Administrador.Medicos;

import static Interfaz.Administrador.AdministradorMedicos.mostrarAdminMedicos;
import static Interfaz.Administrador.AdministradorPacientes.mostrarAdminPacientes;
import static Logica.Medicos.ArchivoMedicos.verificarYAgregarMedicos;
import java.awt.Cursor;
import java.io.IOException;
import javax.swing.ImageIcon;

public class AgregarMedico extends javax.swing.JFrame {

    public AgregarMedico() {
        initComponents();
        this.setResizable(false);
        // Opcional: Configura la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        this.setTitle("Agregar Nuevo Medico");
    }

    public static void mostrarAgregarMedico() { //MUESTRA LA VENTANA LOGIN
        AgregarMedico agregarMedico = new AgregarMedico();
        agregarMedico.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        boton_agregar_medico = new javax.swing.JButton();
        nombres_apellidos_campo = new javax.swing.JTextField();
        telefono_campo = new javax.swing.JTextField();
        cedula_campo = new javax.swing.JTextField();
        correo_campo = new javax.swing.JTextField();
        especialidad_campo = new javax.swing.JTextField();
        back_boton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        boton_agregar_medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/AgregarMedicoFeed/Agregardef.png"))); // NOI18N
        boton_agregar_medico.setText("jButton1");
        boton_agregar_medico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_agregar_medicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_agregar_medicoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_agregar_medicoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton_agregar_medicoMouseReleased(evt);
            }
        });
        boton_agregar_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregar_medicoActionPerformed(evt);
            }
        });
        jPanel2.add(boton_agregar_medico);
        boton_agregar_medico.setBounds(150, 470, 170, 40);

        nombres_apellidos_campo.setForeground(new java.awt.Color(0, 0, 0));
        nombres_apellidos_campo.setBorder(null);
        nombres_apellidos_campo.setOpaque(false);
        jPanel2.add(nombres_apellidos_campo);
        nombres_apellidos_campo.setBounds(70, 92, 350, 30);

        telefono_campo.setForeground(new java.awt.Color(0, 0, 0));
        telefono_campo.setBorder(null);
        telefono_campo.setOpaque(false);
        jPanel2.add(telefono_campo);
        telefono_campo.setBounds(70, 172, 350, 30);

        cedula_campo.setForeground(new java.awt.Color(0, 0, 0));
        cedula_campo.setBorder(null);
        cedula_campo.setOpaque(false);
        jPanel2.add(cedula_campo);
        cedula_campo.setBounds(70, 250, 340, 40);

        correo_campo.setForeground(new java.awt.Color(0, 0, 0));
        correo_campo.setBorder(null);
        correo_campo.setOpaque(false);
        jPanel2.add(correo_campo);
        correo_campo.setBounds(70, 330, 350, 40);

        especialidad_campo.setForeground(new java.awt.Color(0, 0, 0));
        especialidad_campo.setBorder(null);
        especialidad_campo.setOpaque(false);
        jPanel2.add(especialidad_campo);
        especialidad_campo.setBounds(70, 412, 350, 40);

        back_boton.setBorder(null);
        back_boton.setBorderPainted(false);
        back_boton.setContentAreaFilled(false);
        back_boton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                back_botonMouseMoved(evt);
            }
        });
        back_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back_botonMouseExited(evt);
            }
        });
        back_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_botonActionPerformed(evt);
            }
        });
        jPanel2.add(back_boton);
        back_boton.setBounds(10, 500, 30, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/AgregarMedicoFeed/AgregarMedicos.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 490, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_agregar_medicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_agregar_medicoMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AgregarMedicoFeed/Agregarover.png"));
        boton_agregar_medico.setIcon(II);
    }//GEN-LAST:event_boton_agregar_medicoMouseEntered

    private void boton_agregar_medicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_agregar_medicoMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AgregarMedicoFeed/Agregardef.png"));
        boton_agregar_medico.setIcon(II);
    }//GEN-LAST:event_boton_agregar_medicoMouseExited

    private void boton_agregar_medicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_agregar_medicoMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AgregarMedicoFeed/Agregarpressed.png"));
        boton_agregar_medico.setIcon(II);
    }//GEN-LAST:event_boton_agregar_medicoMousePressed

    private void boton_agregar_medicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_agregar_medicoMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AgregarMedicoFeed/Agregarover.png"));
        boton_agregar_medico.setIcon(II);
    }//GEN-LAST:event_boton_agregar_medicoMouseReleased

    private void boton_agregar_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregar_medicoActionPerformed
        String nombres_apellidos = nombres_apellidos_campo.getText(); //EXTRAE LOS TEXTOS DE LOS CAMPOS DE TEXTO
        String telefono = telefono_campo.getText();
        String cedula = cedula_campo.getText();
        String correo = correo_campo.getText();
        String especialidad = especialidad_campo.getText();
        try {
            if (verificarYAgregarMedicos(nombres_apellidos.trim().toLowerCase(), cedula, telefono, correo, especialidad) == 13) {
                dispose();
                mostrarAdminMedicos();
            }

        } catch (IOException ex) {

        }

    }//GEN-LAST:event_boton_agregar_medicoActionPerformed

    private void back_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_botonActionPerformed
        dispose();
        mostrarAdminMedicos();
    }//GEN-LAST:event_back_botonActionPerformed

    private void back_botonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_botonMouseMoved
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_back_botonMouseMoved

    private void back_botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_botonMouseExited
        this.setCursor(DEFAULT_CURSOR);
    }//GEN-LAST:event_back_botonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_boton;
    private javax.swing.JButton boton_agregar_medico;
    private javax.swing.JTextField cedula_campo;
    private javax.swing.JTextField correo_campo;
    private javax.swing.JTextField especialidad_campo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombres_apellidos_campo;
    private javax.swing.JTextField telefono_campo;
    // End of variables declaration//GEN-END:variables
}
