package Interfaz.Administrador.Medicos;

import static Interfaz.Administrador.Administrador.mostrarAdmin;
import static Interfaz.Administrador.AdministradorMedicos.mostrarAdminMedicos;
import static Interfaz.Administrador.AdministradorPacientes.mostrarAdminPacientes;
import static Logica.Medicos.ArchivoMedicos.eliminarMedicos;
import java.awt.Cursor;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static Logica.Pacientes.ArchivoPacientes.eliminarPacientes;

public class EliminarMedico extends javax.swing.JFrame {

    public EliminarMedico() {
        initComponents();
        this.setResizable(false);
        // Opcional: Configura la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        this.setTitle("Eliminar Medico");
    }

    public static void mostrarEliminarMedicos() {
        EliminarMedico eliminarMedico = new EliminarMedico();
        eliminarMedico.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton_eliminar_medico = new javax.swing.JButton();
        nombres_apellidos_campo = new javax.swing.JTextField();
        cedula_campo = new javax.swing.JTextField();
        back_boton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        boton_eliminar_medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/EliminarMedicoFeed/Eliminardef.png"))); // NOI18N
        boton_eliminar_medico.setBorderPainted(false);
        boton_eliminar_medico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_eliminar_medicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_eliminar_medicoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_eliminar_medicoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton_eliminar_medicoMouseReleased(evt);
            }
        });
        boton_eliminar_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminar_medicoActionPerformed(evt);
            }
        });
        jPanel1.add(boton_eliminar_medico);
        boton_eliminar_medico.setBounds(180, 290, 130, 40);

        nombres_apellidos_campo.setForeground(new java.awt.Color(0, 0, 0));
        nombres_apellidos_campo.setBorder(null);
        nombres_apellidos_campo.setOpaque(false);
        jPanel1.add(nombres_apellidos_campo);
        nombres_apellidos_campo.setBounds(70, 120, 350, 40);

        cedula_campo.setForeground(new java.awt.Color(0, 0, 0));
        cedula_campo.setBorder(null);
        cedula_campo.setOpaque(false);
        jPanel1.add(cedula_campo);
        cedula_campo.setBounds(70, 210, 350, 30);

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
        jPanel1.add(back_boton);
        back_boton.setBounds(10, 330, 30, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/EliminarMedicoFeed/EliminarMedico.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 460, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_eliminar_medicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_medicoMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/EliminarMedicoFeed/Eliminarover.png"));
        boton_eliminar_medico.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_medicoMouseEntered

    private void boton_eliminar_medicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_medicoMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/EliminarMedicoFeed/Eliminardef.png"));
        boton_eliminar_medico.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_medicoMouseExited

    private void boton_eliminar_medicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_medicoMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/EliminarMedicoFeed/Eliminarpressed.png"));
        boton_eliminar_medico.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_medicoMousePressed

    private void boton_eliminar_medicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_medicoMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/EliminarMedicoFeed/Eliminarover.png"));
        boton_eliminar_medico.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_medicoMouseReleased

    private void boton_eliminar_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminar_medicoActionPerformed
        String nombres_apellidos = nombres_apellidos_campo.getText();
        String cedula = cedula_campo.getText();

        try {
            int resultado = eliminarMedicos(nombres_apellidos.trim().toLowerCase(), cedula.trim());

            if (resultado == 0) {
                JOptionPane.showMessageDialog(this, "El medico ha sido eliminado exitosamente.", "Usuario Eliminado", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                mostrarAdminMedicos();
            } else if (resultado == 1) {
                JOptionPane.showMessageDialog(this, "No se encontró un medico que coincida con los datos proporcionados.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (resultado == 2) {
                JOptionPane.showMessageDialog(this, "Hubo un problema al escribir en el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al acceder al archivo de usuarios.", "Error de archivo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton_eliminar_medicoActionPerformed

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
    private javax.swing.JButton boton_eliminar_medico;
    private javax.swing.JTextField cedula_campo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombres_apellidos_campo;
    // End of variables declaration//GEN-END:variables
}
