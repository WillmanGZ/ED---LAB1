package Interfaz.Administrador.Citas;

import static Logica.Medicos.ArchivoMedicos.cargarMedicosDesdeArchivo;
import Logica.Medicos.Medico;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConsultarMedicos extends javax.swing.JFrame {

    public static String especialidad = "";

    public ConsultarMedicos(String especialidad) throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        // Aquí deberías reemplazar '1' con el número de la especialidad que quieres mostrar inicialmente
        GestionarCitas gestionarCitas = new GestionarCitas();
        mostrarMedicosPorEspecialidad(especialidad);
        this.especialidad = especialidad;
    }

    public static void mostrarConsultarMedicos(String especialidad) throws IOException {
        ConsultarMedicos consultarMedicos = new ConsultarMedicos(especialidad);
        consultarMedicos.setVisible(true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        info_medicos_texto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Medicos");
        setResizable(false);

        background.setBackground(new java.awt.Color(204, 204, 204));
        background.setLayout(null);

        info_medicos_texto.setEditable(false);
        info_medicos_texto.setColumns(20);
        info_medicos_texto.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        info_medicos_texto.setForeground(new java.awt.Color(0, 0, 0));
        info_medicos_texto.setRows(5);
        jScrollPane1.setViewportView(info_medicos_texto);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 400, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void mostrarMedicosPorEspecialidad(String especialidades) throws IOException {
        List<Medico> medicos = cargarMedicosDesdeArchivo("listamedicos.txt");
        List<Medico> medicosSeleccionados = new ArrayList<>();
        List<Integer> id = new ArrayList<>();
        int i = 1;
        for (Medico medico : medicos) {
            if (medico.getEspecialidad().equalsIgnoreCase(especialidades)) {
                medicosSeleccionados.add(medico);
                id.add(i);
            }
            i++;
        }
        // Actualiza el JTextArea con los médicos filtrados
        info_medicos_texto.setText(""); // Limpia el JTextArea
        info_medicos_texto.append(String.format("%-10s %-30s %s\n", "ID", "MEDICO", "ESPECIALIDAD"));

        int idMedico = 0; // Iniciar ID de médico
        for (Medico medico : medicosSeleccionados) {
            // Aumenta el espacio entre el nombre del médico y la especialidad ajustando %-30s
            info_medicos_texto.append(String.format("%-10d %-30s %s\n", id.get(idMedico++), medico.getNombres_apellidos(), medico.getEspecialidad()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTextArea info_medicos_texto;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
