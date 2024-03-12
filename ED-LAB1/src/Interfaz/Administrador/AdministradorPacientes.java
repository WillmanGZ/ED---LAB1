/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz.Administrador;

import javax.swing.ImageIcon;

/**
 *
 * @author Andrea
 */
public class AdministradorPacientes extends javax.swing.JFrame {

    /**
     * Creates new form AdministradorPacientes
     */
    public AdministradorPacientes() {
        initComponents();
        this.setResizable(false);
        // Opcional: Configura la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
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
        boton_agregar_paciente = new javax.swing.JButton();
        boton_eliminar_paciente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        boton_agregar_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministradorPaciente/AgPacienteDef.png"))); // NOI18N
        boton_agregar_paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_agregar_pacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_agregar_pacienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_agregar_pacienteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton_agregar_pacienteMouseReleased(evt);
            }
        });
        boton_agregar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregar_pacienteActionPerformed(evt);
            }
        });
        jPanel1.add(boton_agregar_paciente);
        boton_agregar_paciente.setBounds(110, 200, 310, 170);

        boton_eliminar_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministradorPaciente/ElPacienteDef.png"))); // NOI18N
        boton_eliminar_paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_eliminar_pacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_eliminar_pacienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_eliminar_pacienteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton_eliminar_pacienteMouseReleased(evt);
            }
        });
        boton_eliminar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminar_pacienteActionPerformed(evt);
            }
        });
        jPanel1.add(boton_eliminar_paciente);
        boton_eliminar_paciente.setBounds(540, 200, 310, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministradorPaciente/Registros pacientes.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_agregar_pacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_agregar_pacienteMouseEntered
<<<<<<< Updated upstream
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministradorPaciente/AgPacienteOver.png"));
=======
ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministradorPaciente/AgPacienteOver.png"));
>>>>>>> Stashed changes
        boton_agregar_paciente.setIcon(II);
    }//GEN-LAST:event_boton_agregar_pacienteMouseEntered

    private void boton_agregar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregar_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_agregar_pacienteActionPerformed

    private void boton_agregar_pacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_agregar_pacienteMouseExited
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministradorPaciente/AgPacienteDef.png"));
        boton_agregar_paciente.setIcon(II);
    }//GEN-LAST:event_boton_agregar_pacienteMouseExited

    private void boton_agregar_pacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_agregar_pacienteMousePressed
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministradorPaciente/AgPacientePressed.png"));
        boton_agregar_paciente.setIcon(II);
    }//GEN-LAST:event_boton_agregar_pacienteMousePressed

    private void boton_agregar_pacienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_agregar_pacienteMouseReleased
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministradorPaciente/AgPacienteOver.png"));
        boton_agregar_paciente.setIcon(II);
    }//GEN-LAST:event_boton_agregar_pacienteMouseReleased

    private void boton_eliminar_pacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_pacienteMouseEntered
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministradorPaciente/ElPacienteOver.png"));
        boton_eliminar_paciente.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_pacienteMouseEntered

    private void boton_eliminar_pacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_pacienteMouseExited
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministradorPaciente/ElPacienteDef.png"));
        boton_eliminar_paciente.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_pacienteMouseExited

    private void boton_eliminar_pacienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_pacienteMouseReleased
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministradorPaciente/ElPacienteOver.png"));
        boton_eliminar_paciente.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_pacienteMouseReleased

    private void boton_eliminar_pacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_pacienteMousePressed
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministradorPaciente/ElPacientePressed.png"));
        boton_eliminar_paciente.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_pacienteMousePressed

    private void boton_eliminar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminar_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_eliminar_pacienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdministradorPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregar_paciente;
    private javax.swing.JButton boton_eliminar_paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
