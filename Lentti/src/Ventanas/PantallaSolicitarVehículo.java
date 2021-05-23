/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import javax.swing.JOptionPane;
import Controlador.consultasBaseDeDatos;
import Modelo.BaseDeDatos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tony
 */
public class PantallaSolicitarVehículo extends javax.swing.JFrame {

    String usuarioDomi;

    /**
     * Creates new form PantallaInconveniente
     */
    public PantallaSolicitarVehículo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public PantallaSolicitarVehículo(String pUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuarioDomi = pUsuario;
        DefaultTableModel model = (DefaultTableModel) jTableVehículosDisponibles.getModel();
        consultasBaseDeDatos consulta = new BaseDeDatos();
        ArrayList<ArrayList<Object>> data = consulta.ObtenerVehiculosDisponibles();
        int cont = data.size();
        int cont2 = data.get(0).size();
        Object[] data2 = new Object[cont2];

        for (int i = 0; i < cont; i++) {
            for (int j = 0; j < cont2; j++) {
                data2[j] = data.get(i).get(j);
            }
            model.addRow(data2);
        }

        jTableVehículosDisponibles.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVehículosDisponibles = new javax.swing.JTable();
        jButtonAtrás = new javax.swing.JButton();
        jButtonSolicitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 690));

        jTableVehículosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableVehículosDisponibles);

        jButtonAtrás.setText("Atrás");
        jButtonAtrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrásActionPerformed(evt);
            }
        });

        jButtonSolicitar.setText("Solicitar");
        jButtonSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolicitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAtrás)))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSolicitar)
                .addGap(360, 360, 360))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtrás)
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButtonSolicitar)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrásActionPerformed
        // TODO add your handling code here:
        PantallaPerfilDomiciliario p = new PantallaPerfilDomiciliario(usuarioDomi);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAtrásActionPerformed

    private void jButtonSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolicitarActionPerformed
        // TODO add your handling code here:
        if (jTableVehículosDisponibles.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un vehiculo");
        } else {
            int column = 0;
            int row = jTableVehículosDisponibles.getSelectedRow();
            String plaquita = (String) jTableVehículosDisponibles.getModel().getValueAt(row, column);
            consultasBaseDeDatos consulta = new BaseDeDatos();
            boolean pasar = consulta.VincularVehiculo(usuarioDomi, plaquita);
            if (pasar == true) {
                JOptionPane.showMessageDialog(null, "Se le ha asignado correctamente el vehiculo, por favor no olvide pasar a recogerlo lo mas pronto posible.");
                PantallaPerfilDomiciliario p = new PantallaPerfilDomiciliario(usuarioDomi);
                p.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButtonSolicitarActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaSolicitarVehículo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaSolicitarVehículo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaSolicitarVehículo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaSolicitarVehículo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaSolicitarVehículo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtrás;
    private javax.swing.JButton jButtonSolicitar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVehículosDisponibles;
    // End of variables declaration//GEN-END:variables
}
