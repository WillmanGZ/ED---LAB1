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
public class EliminarMedico extends javax.swing.JFrame {

    /**
     * Creates new form EliminarMedico
     */
    public EliminarMedico() {
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
        boton_eliminar_medico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        boton_eliminar_medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/EliminarMedicoFeed/Eliminardef.png"))); // NOI18N
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
        jPanel1.add(boton_eliminar_medico);
        boton_eliminar_medico.setBounds(180, 290, 130, 40);

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
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/EliminarMedicoFeed/Eliminarover.png"));
        boton_eliminar_medico.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_medicoMouseEntered

    private void boton_eliminar_medicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_medicoMouseExited
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/EliminarMedicoFeed/Eliminardef.png"));
        boton_eliminar_medico.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_medicoMouseExited

    private void boton_eliminar_medicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_medicoMousePressed
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/EliminarMedicoFeed/Eliminarpressed.png"));
        boton_eliminar_medico.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_medicoMousePressed

    private void boton_eliminar_medicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminar_medicoMouseReleased
        ImageIcon II= new ImageIcon(getClass().getResource("/Interfaz/Imagenes/EliminarMedicoFeed/Eliminarover.png"));
        boton_eliminar_medico.setIcon(II);
    }//GEN-LAST:event_boton_eliminar_medicoMouseReleased

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
            java.util.logging.Logger.getLogger(EliminarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_eliminar_medico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
