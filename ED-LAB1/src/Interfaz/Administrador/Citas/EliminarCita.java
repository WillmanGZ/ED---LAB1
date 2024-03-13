package Interfaz.Administrador.Citas;

import static Interfaz.Administrador.Administrador.mostrarAdmin;
import static Logica.Citas.ArchivoCitas.cargarCitasDesdeArchivo;
import Logica.Citas.Cita;
import static Logica.Pacientes.ArchivoPacientes.obtenerCorreoPacientePorCedula;
import static Logica.Pacientes.ArchivoPacientes.obtenerNombreApellidoPacientePorCedula;
import static Logica.Pacientes.ArchivoPacientes.obtenerUsuarioPacientePorCedula;
import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EliminarCita extends javax.swing.JFrame {

    public EliminarCita() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public static void mostrarEliminarCita() {
        EliminarCita eliminarcita = new EliminarCita();
        eliminarcita.setVisible(true);
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
        dia_cita_jcombobox = new javax.swing.JComboBox<>();
        agregarcedula_boton = new javax.swing.JButton();
        eliminarcita_boton = new javax.swing.JButton();
        hora_jcombobox = new javax.swing.JComboBox<>();
        nombre_apellidos_label = new javax.swing.JLabel();
        usuario_label = new javax.swing.JLabel();
        correo_label = new javax.swing.JLabel();
        volver_boton = new javax.swing.JButton();
        cedula_campo = new javax.swing.JTextField();
        agregar_boton = new javax.swing.JButton();
        eliminar_cita_boton = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar Cita");
        setPreferredSize(new java.awt.Dimension(785, 630));
        setResizable(false);

        background.setMaximumSize(new java.awt.Dimension(779, 630));
        background.setMinimumSize(new java.awt.Dimension(779, 630));
        background.setPreferredSize(new java.awt.Dimension(779, 630));
        background.setLayout(null);

        dia_cita_jcombobox.setBackground(new java.awt.Color(197, 220, 244));
        dia_cita_jcombobox.setForeground(new java.awt.Color(0, 0, 0));
        dia_cita_jcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione dia", "01 de Junio", "02 de Junio", "03 de Junio", "04 de Junio", "05 de Junio", "06 de Junio", "07 de Junio", "08 de Junio", "09 de Junio", "10 de Junio", "11 de Junio", "12 de Junio", "13 de Junio", "14 de Junio", "15 de Junio", "16 de Junio", "17 de Junio", "18 de Junio", "19 de Junio", "20 de Junio", "21 de Junio", "22 de Junio", "23 de Junio", "24 de Junio", "25 de Junio", "26 de Junio", "27 de Junio", "28 de Junio", "29 de Junio", "30 de Junio" }));
        dia_cita_jcombobox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        background.add(dia_cita_jcombobox);
        dia_cita_jcombobox.setBounds(360, 360, 270, 40);

        agregarcedula_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/BotonesAG_ELCitas/agdef.png"))); // NOI18N
        agregarcedula_boton.setBorderPainted(false);
        agregarcedula_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarcedula_botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarcedula_botonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarcedula_botonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                agregarcedula_botonMouseReleased(evt);
            }
        });
        agregarcedula_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarcedula_botonActionPerformed(evt);
            }
        });
        background.add(agregarcedula_boton);
        agregarcedula_boton.setBounds(110, 280, 120, 40);

        eliminarcita_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/BotonesAG_ELCitas/elidef.png"))); // NOI18N
        eliminarcita_boton.setBorderPainted(false);
        eliminarcita_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarcita_botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarcita_botonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eliminarcita_botonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eliminarcita_botonMouseReleased(evt);
            }
        });
        eliminarcita_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarcita_botonActionPerformed(evt);
            }
        });
        background.add(eliminarcita_boton);
        eliminarcita_boton.setBounds(500, 470, 110, 40);

        hora_jcombobox.setBackground(new java.awt.Color(197, 220, 244));
        hora_jcombobox.setForeground(new java.awt.Color(0, 0, 0));
        hora_jcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione hora", "08:00 AM", "09:00 AM", "10:00 AM", "11:00 AM", "14:00 PM", "15:00 PM", "16:00 PM", "17:00 PM", "18:00 PM", "19:00 PM", "20:00 PM" }));
        hora_jcombobox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        hora_jcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hora_jcomboboxActionPerformed(evt);
            }
        });
        background.add(hora_jcombobox);
        hora_jcombobox.setBounds(360, 230, 270, 40);

        nombre_apellidos_label.setForeground(new java.awt.Color(0, 0, 0));
        background.add(nombre_apellidos_label);
        nombre_apellidos_label.setBounds(50, 380, 230, 40);

        usuario_label.setForeground(new java.awt.Color(0, 0, 0));
        background.add(usuario_label);
        usuario_label.setBounds(50, 450, 230, 40);

        correo_label.setForeground(new java.awt.Color(0, 0, 0));
        background.add(correo_label);
        correo_label.setBounds(50, 520, 230, 40);

        volver_boton.setBorderPainted(false);
        volver_boton.setContentAreaFilled(false);
        volver_boton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                volver_botonMouseMoved(evt);
            }
        });
        volver_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volver_botonMouseExited(evt);
            }
        });
        volver_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_botonActionPerformed(evt);
            }
        });
        background.add(volver_boton);
        volver_boton.setBounds(0, 550, 40, 40);

        cedula_campo.setForeground(new java.awt.Color(0, 0, 0));
        cedula_campo.setBorder(null);
        cedula_campo.setOpaque(false);
        background.add(cedula_campo);
        cedula_campo.setBounds(60, 210, 230, 40);

        agregar_boton.setBorderPainted(false);
        agregar_boton.setContentAreaFilled(false);
        background.add(agregar_boton);
        agregar_boton.setBounds(110, 280, 120, 40);

        eliminar_cita_boton.setBorderPainted(false);
        eliminar_cita_boton.setContentAreaFilled(false);
        background.add(eliminar_cita_boton);
        eliminar_cita_boton.setBounds(500, 470, 110, 40);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/AdministracionEliminarCita/elimcita (1).png"))); // NOI18N
        background.add(fondo);
        fondo.setBounds(0, 0, 780, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hora_jcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hora_jcomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hora_jcomboboxActionPerformed

    private void agregarcedula_botonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarcedula_botonMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/BotonesAG_ELCitas/agover.png"));
        agregarcedula_boton.setIcon(II);
    }//GEN-LAST:event_agregarcedula_botonMouseEntered

    private void agregarcedula_botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarcedula_botonMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/BotonesAG_ELCitas/agdef.png"));
        agregarcedula_boton.setIcon(II);
    }//GEN-LAST:event_agregarcedula_botonMouseExited

    private void agregarcedula_botonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarcedula_botonMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/BotonesAG_ELCitas/agpressed.png"));
        agregarcedula_boton.setIcon(II);
    }//GEN-LAST:event_agregarcedula_botonMousePressed

    private void agregarcedula_botonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarcedula_botonMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/BotonesAG_ELCitas/agover.png"));
        agregarcedula_boton.setIcon(II);
    }//GEN-LAST:event_agregarcedula_botonMouseReleased

    private void eliminarcita_botonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarcita_botonMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/BotonesAG_ELCitas/eliover.png"));
        eliminarcita_boton.setIcon(II);
    }//GEN-LAST:event_eliminarcita_botonMouseEntered

    private void eliminarcita_botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarcita_botonMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/BotonesAG_ELCitas/elidef.png"));
        eliminarcita_boton.setIcon(II);
    }//GEN-LAST:event_eliminarcita_botonMouseExited

    private void eliminarcita_botonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarcita_botonMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/BotonesAG_ELCitas/elipressed.png"));
        eliminarcita_boton.setIcon(II);
    }//GEN-LAST:event_eliminarcita_botonMousePressed

    private void eliminarcita_botonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarcita_botonMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Interfaz/Imagenes/BotonesAG_ELCitas/eliover.png"));
        eliminarcita_boton.setIcon(II);
    }//GEN-LAST:event_eliminarcita_botonMouseReleased

    private void agregarcedula_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarcedula_botonActionPerformed
        String cedula = cedula_campo.getText();
        try {
            nombre_apellidos_label.setText(obtenerNombreApellidoPacientePorCedula(cedula));
            usuario_label.setText(obtenerUsuarioPacientePorCedula(cedula));
            correo_label.setText(obtenerCorreoPacientePorCedula(cedula));
        } catch (IOException ex) {
            Logger.getLogger(GestionarCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_agregarcedula_botonActionPerformed

    private void volver_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_botonActionPerformed
        dispose();
        mostrarAdmin();
    }//GEN-LAST:event_volver_botonActionPerformed

    private void volver_botonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver_botonMouseMoved
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_volver_botonMouseMoved

    private void volver_botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver_botonMouseExited
        this.setCursor(DEFAULT_CURSOR);
    }//GEN-LAST:event_volver_botonMouseExited

    private void eliminarcita_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarcita_botonActionPerformed
        String cedulaPaciente = cedula_campo.getText();
        String hora = (String) hora_jcombobox.getSelectedItem();
        String dia = (String) dia_cita_jcombobox.getSelectedItem();
        String archivo = "listacitas.txt";
        if (verificarDatos(cedulaPaciente, hora, dia)) {
            if (verificarCitaExistente(cedulaPaciente, dia, hora, archivo)) {
                try {
                    eliminarCita(cedulaPaciente, dia, hora, archivo);
                    JOptionPane.showMessageDialog(null, "Se ha eliminado la cita con exito.", "EXITO!", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    mostrarAdmin();

                } catch (IOException ex) {
                    Logger.getLogger(EliminarCita.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }//GEN-LAST:event_eliminarcita_botonActionPerformed

    public static boolean verificarCitaExistente(String cedulaPaciente, String fecha, String hora, String archivoCitas) {
        try {
            List<Cita> citas = cargarCitasDesdeArchivo(archivoCitas);

            for (Cita cita : citas) {
                if (cita.getCedulaPaciente().equals(cedulaPaciente) && cita.getFecha().equals(fecha) && cita.getHora().equals(hora)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "La cita no fué encontrada.", "ERROR", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    public static void eliminarCita(String cedulaPaciente, String fecha, String hora, String archivoCitas) throws IOException {
        List<Cita> citas = cargarCitasDesdeArchivo(archivoCitas);
        boolean citaEncontrada = false;
        String cedulaMedicoEliminado = "";

        // Buscar la cita a eliminar y guardar la cédula del médico
        for (int i = 0; i < citas.size(); i++) {
            Cita cita = citas.get(i);
            if (cita.getCedulaPaciente().trim().equals(cedulaPaciente.trim()) && cita.getFecha().trim().equals(fecha.trim()) && cita.getHora().trim().equals(hora.trim())) {
                cedulaMedicoEliminado = cita.getCedulaMedico();
                citas.remove(i);
                citaEncontrada = true;
                break;
            }
        }

        if (!citaEncontrada) {
            JOptionPane.showMessageDialog(null, "La cita no fué encontrada.", "", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Actualizar el archivo de citas
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCitas))) {
            for (Cita cita : citas) {
                bw.write(cita.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de citas.");
            e.printStackTrace();
        }

        // Restar agendar cita con la cédula del médico del registro eliminado
        if (!cedulaMedicoEliminado.isEmpty()) {
            restarAgendarCita(cedulaMedicoEliminado);
        }
    }

    public static void restarAgendarCita(String cedulaMedico) {
        try {
            File archivoMedicos = new File("listamedicos.txt");
            File archivoTemporal = new File("MedicosTemporal.txt");

            BufferedReader br = new BufferedReader(new FileReader(archivoMedicos));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal));
            String cedulaMedic = cedulaMedico; // Extrae la segunda posicion de la linea del medico que se escogio, es decir, su nombre
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.contains(cedulaMedic)) {

                    String[] partes = linea.split(";");

                    int numeroCitas = Integer.parseInt(partes[5]) - 1;

                    partes[5] = String.valueOf(numeroCitas);
                    linea = String.join(";", partes);
                }

                bw.write(linea);
                bw.newLine();
            }

            br.close();
            bw.close();

            archivoMedicos.delete();
            archivoTemporal.renameTo(archivoMedicos);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar actualizar el archivo de médicos.", "Error de actualización", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

    }

    private boolean verificarDatos(String cedulaPaciente, String hora, String dia) {
        if (cedulaPaciente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de la cédula del paciente no puede estar vacío.");
            return false;
        }

        // Asumiendo que los valores "0" o equivalentes representan "no seleccionado" en tus JComboBox
        if (hora == null || hora.equals("Seleccione hora")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una hora válida para la cita.");
            return false;
        }

        if (dia == null || dia.equals("Seleccione dia")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un día válido para la cita.");
            return false;
        }
        return true;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_boton;
    private javax.swing.JButton agregarcedula_boton;
    private javax.swing.JPanel background;
    private javax.swing.JTextField cedula_campo;
    private javax.swing.JLabel correo_label;
    private javax.swing.JComboBox<String> dia_cita_jcombobox;
    private javax.swing.JButton eliminar_cita_boton;
    private javax.swing.JButton eliminarcita_boton;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> hora_jcombobox;
    private javax.swing.JLabel nombre_apellidos_label;
    private javax.swing.JLabel usuario_label;
    private javax.swing.JButton volver_boton;
    // End of variables declaration//GEN-END:variables
}