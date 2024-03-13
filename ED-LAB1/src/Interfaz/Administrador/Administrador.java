package Interfaz.Administrador;

import static Interfaz.Administrador.AdministradorMedicos.mostrarAdminMedicos;
import static Interfaz.Administrador.AdministradorPacientes.mostrarAdminPacientes;
import static Interfaz.Administrador.Citas.EliminarCita.mostrarEliminarCita;
import static Interfaz.Administrador.Citas.GestionarCitas.mostrarGestionarCitas;
import static Interfaz.Login.mostrarLogin;
import java.awt.Cursor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Administrador extends javax.swing.JFrame {

    public Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Administracion");

    }

    public static void mostrarAdmin() {
        Administrador administrador = new Administrador();
        administrador.setVisible(true);
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
        asignar_eliminar_registros_pacientes = new javax.swing.JButton();
        boton_asignar_cita = new javax.swing.JButton();
        boton_eliminar_cita = new javax.swing.JButton();
        asignar_eliminar_registros_medicos = new javax.swing.JButton();
        reiniciar_archivos_medicos = new javax.swing.JButton();
        back_boton = new javax.swing.JButton();
        administrador_screen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(204, 204, 204));
        background.setLayout(null);

        asignar_eliminar_registros_pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionAEPacientes/Pacientesdefault.png"))); // NOI18N
        asignar_eliminar_registros_pacientes.setBorderPainted(false);
        asignar_eliminar_registros_pacientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                asignar_eliminar_registros_pacientesMouseDragged(evt);
            }
        });
        asignar_eliminar_registros_pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                asignar_eliminar_registros_pacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                asignar_eliminar_registros_pacientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                asignar_eliminar_registros_pacientesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                asignar_eliminar_registros_pacientesMouseReleased(evt);
            }
        });
        asignar_eliminar_registros_pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignar_eliminar_registros_pacientesActionPerformed(evt);
            }
        });
        background.add(asignar_eliminar_registros_pacientes);
        asignar_eliminar_registros_pacientes.setBounds(230, 310, 230, 130);

        boton_asignar_cita.setBackground(new java.awt.Color(204, 204, 204));
        boton_asignar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionFeedAsignar/Asignardefault.png"))); // NOI18N
        boton_asignar_cita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_asignar_cita.setBorderPainted(false);
        boton_asignar_cita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_asignar_citaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_asignar_citaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_asignar_citaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton_asignar_citaMouseReleased(evt);
            }
        });
        boton_asignar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_asignar_citaActionPerformed(evt);
            }
        });
        background.add(boton_asignar_cita);
        boton_asignar_cita.setBounds(110, 140, 240, 130);

        boton_eliminar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionEliminarCita/Eliminardefault.png"))); // NOI18N
        boton_eliminar_cita.setBorderPainted(false);
        boton_eliminar_cita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_eliminar_citaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_eliminar_citaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_eliminar_citaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton_eliminar_citaMouseReleased(evt);
            }
        });
        boton_eliminar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminar_citaActionPerformed(evt);
            }
        });
        background.add(boton_eliminar_cita);
        boton_eliminar_cita.setBounds(380, 140, 240, 130);

        asignar_eliminar_registros_medicos.setBackground(new java.awt.Color(255, 255, 255));
        asignar_eliminar_registros_medicos.setForeground(new java.awt.Color(28, 19, 82));
        asignar_eliminar_registros_medicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionAEMedicos/Medicosdefault.png"))); // NOI18N
        asignar_eliminar_registros_medicos.setBorder(null);
        asignar_eliminar_registros_medicos.setBorderPainted(false);
        asignar_eliminar_registros_medicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                asignar_eliminar_registros_medicosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                asignar_eliminar_registros_medicosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                asignar_eliminar_registros_medicosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                asignar_eliminar_registros_medicosMouseReleased(evt);
            }
        });
        asignar_eliminar_registros_medicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignar_eliminar_registros_medicosActionPerformed(evt);
            }
        });
        background.add(asignar_eliminar_registros_medicos);
        asignar_eliminar_registros_medicos.setBounds(650, 140, 230, 130);

        reiniciar_archivos_medicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionReiniciarMedicos/Reiniciardefault.png"))); // NOI18N
        reiniciar_archivos_medicos.setBorderPainted(false);
        reiniciar_archivos_medicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reiniciar_archivos_medicosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reiniciar_archivos_medicosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reiniciar_archivos_medicosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                reiniciar_archivos_medicosMouseReleased(evt);
            }
        });
        reiniciar_archivos_medicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciar_archivos_medicosActionPerformed(evt);
            }
        });
        background.add(reiniciar_archivos_medicos);
        reiniciar_archivos_medicos.setBounds(500, 310, 230, 130);

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
        background.add(back_boton);
        back_boton.setBounds(0, 530, 30, 40);

        administrador_screen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Administracion/Administración feed.png"))); // NOI18N
        background.add(administrador_screen);
        administrador_screen.setBounds(0, -30, 970, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_asignar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_asignar_citaActionPerformed
        dispose();
        try {
            mostrarGestionarCitas();
        } catch (IOException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boton_asignar_citaActionPerformed

    private void boton_eliminar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminar_citaActionPerformed
        dispose();
        mostrarEliminarCita();
    }//GEN-LAST:event_boton_eliminar_citaActionPerformed

    private void asignar_eliminar_registros_medicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignar_eliminar_registros_medicosActionPerformed
        dispose();
        mostrarAdminMedicos();
    }//GEN-LAST:event_asignar_eliminar_registros_medicosActionPerformed

    private void reiniciar_archivos_medicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciar_archivos_medicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reiniciar_archivos_medicosActionPerformed

    private void boton_asignar_citaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_asignar_citaMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionFeedAsignar/Asignarover.png"));
        boton_asignar_cita.setIcon(II);
    }//GEN-LAST:event_boton_asignar_citaMouseEntered

    private void boton_asignar_citaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_asignar_citaMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionFeedAsignar/Asignardefault.png"));
        boton_asignar_cita.setIcon(II);
    }//GEN-LAST:event_boton_asignar_citaMouseExited

    private void boton_asignar_citaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_asignar_citaMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionFeedAsignar/Asignarpressed.png"));
        boton_asignar_cita.setIcon(II);
    }//GEN-LAST:event_boton_asignar_citaMousePressed

    private void boton_asignar_citaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_asignar_citaMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionFeedAsignar/Asignarover.png"));
        boton_asignar_cita.setIcon(II);
    }//GEN-LAST:event_boton_asignar_citaMouseReleased

    private void boton_eliminar_citaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_citaMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionEliminarCita/Eliminarover.png"));
        boton_eliminar_cita.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_citaMouseEntered

    private void boton_eliminar_citaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_citaMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionEliminarCita/Eliminardefault.png"));
        boton_eliminar_cita.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_citaMouseExited

    private void boton_eliminar_citaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_citaMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionEliminarCita/Eliminarpressed.png"));
        boton_eliminar_cita.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_citaMousePressed

    private void boton_eliminar_citaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_citaMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionEliminarCita/Eliminarover.png"));
        boton_eliminar_cita.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_citaMouseReleased

    private void asignar_eliminar_registros_medicosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignar_eliminar_registros_medicosMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionAEMedicos/Medicosdefault.png"));
        asignar_eliminar_registros_medicos.setIcon(II);
    }//GEN-LAST:event_asignar_eliminar_registros_medicosMouseExited

    private void asignar_eliminar_registros_medicosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignar_eliminar_registros_medicosMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionAEMedicos/Medicosover.png"));
        asignar_eliminar_registros_medicos.setIcon(II);
    }//GEN-LAST:event_asignar_eliminar_registros_medicosMouseEntered

    private void asignar_eliminar_registros_medicosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignar_eliminar_registros_medicosMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionAEMedicos/Medicosover.png"));
        asignar_eliminar_registros_medicos.setIcon(II);
    }//GEN-LAST:event_asignar_eliminar_registros_medicosMouseReleased

    private void asignar_eliminar_registros_medicosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignar_eliminar_registros_medicosMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionAEMedicos/Medicospressed.png"));
        asignar_eliminar_registros_medicos.setIcon(II);
    }//GEN-LAST:event_asignar_eliminar_registros_medicosMousePressed

    private void asignar_eliminar_registros_pacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignar_eliminar_registros_pacientesMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionAEPacientes/Pacientesover.png"));
        asignar_eliminar_registros_pacientes.setIcon(II);
    }//GEN-LAST:event_asignar_eliminar_registros_pacientesMouseEntered

    private void asignar_eliminar_registros_pacientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignar_eliminar_registros_pacientesMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionAEPacientes/Pacientesover.png"));
        asignar_eliminar_registros_pacientes.setIcon(II);
    }//GEN-LAST:event_asignar_eliminar_registros_pacientesMouseReleased

    private void asignar_eliminar_registros_pacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignar_eliminar_registros_pacientesMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionAEPacientes/Pacientesdefault.png"));
        asignar_eliminar_registros_pacientes.setIcon(II);
    }//GEN-LAST:event_asignar_eliminar_registros_pacientesMouseExited

    private void asignar_eliminar_registros_pacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignar_eliminar_registros_pacientesMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionAEPacientes/Pacientespressed.png"));
        asignar_eliminar_registros_pacientes.setIcon(II);
    }//GEN-LAST:event_asignar_eliminar_registros_pacientesMousePressed

    private void reiniciar_archivos_medicosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reiniciar_archivos_medicosMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionReiniciarMedicos/Reiniciarover.png"));
        reiniciar_archivos_medicos.setIcon(II);
    }//GEN-LAST:event_reiniciar_archivos_medicosMouseEntered

    private void reiniciar_archivos_medicosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reiniciar_archivos_medicosMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionReiniciarMedicos/Reiniciardefault.png"));
        reiniciar_archivos_medicos.setIcon(II);
    }//GEN-LAST:event_reiniciar_archivos_medicosMouseExited

    private void reiniciar_archivos_medicosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reiniciar_archivos_medicosMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionReiniciarMedicos/Reiniciarpressed.png"));
        reiniciar_archivos_medicos.setIcon(II);
    }//GEN-LAST:event_reiniciar_archivos_medicosMousePressed

    private void reiniciar_archivos_medicosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reiniciar_archivos_medicosMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionReiniciarMedicos/Reiniciarover.png"));
        reiniciar_archivos_medicos.setIcon(II);
    }//GEN-LAST:event_reiniciar_archivos_medicosMouseReleased

    private void asignar_eliminar_registros_pacientesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignar_eliminar_registros_pacientesMouseDragged

    }//GEN-LAST:event_asignar_eliminar_registros_pacientesMouseDragged

    private void asignar_eliminar_registros_pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignar_eliminar_registros_pacientesActionPerformed
        dispose();
        mostrarAdminPacientes();
    }//GEN-LAST:event_asignar_eliminar_registros_pacientesActionPerformed

    private void back_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_botonActionPerformed
        dispose();
        mostrarLogin();
    }//GEN-LAST:event_back_botonActionPerformed

    private void back_botonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_botonMouseMoved
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_back_botonMouseMoved

    private void back_botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_botonMouseExited
        this.setCursor(DEFAULT_CURSOR);
    }//GEN-LAST:event_back_botonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel administrador_screen;
    private javax.swing.JButton asignar_eliminar_registros_medicos;
    private javax.swing.JButton asignar_eliminar_registros_pacientes;
    private javax.swing.JButton back_boton;
    private javax.swing.JPanel background;
    private javax.swing.JButton boton_asignar_cita;
    private javax.swing.JButton boton_eliminar_cita;
    private javax.swing.JButton reiniciar_archivos_medicos;
    // End of variables declaration//GEN-END:variables
}
