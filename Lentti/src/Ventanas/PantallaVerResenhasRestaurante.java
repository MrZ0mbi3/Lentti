/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Controlador.consultasBaseDeDatos;
import Modelo.BaseDeDatos;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tony
 */
public class PantallaVerResenhasRestaurante extends javax.swing.JFrame {

    String restUser;
    /**
     * Creates new form PantallaVerResenhasRestaurante
     */
    public PantallaVerResenhasRestaurante() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jButtonAtrás.setOpaque(false);
        this.jButtonAtrás.setBackground(new Color(0, 0, 0, 0));
    }
    
    public PantallaVerResenhasRestaurante(String rest) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jButtonAtrás.setOpaque(false);
        this.jButtonAtrás.setBackground(new Color(0, 0, 0, 0));
        this.restUser = rest;
        this.DarModelo();
    }
    
    public void DarModelo() {
        DefaultTableModel model = (DefaultTableModel) this.jTableResenha.getModel();
        consultasBaseDeDatos consulta = new BaseDeDatos();
        ArrayList<ArrayList<Object>> data = consulta.ObtenerResenhasRestaurante(restUser);
        if (data.size() == 0) {
            this.jTableResenha.setModel(model);
        } else {
            int cont = data.size();
            int cont2 = data.get(0).size();
            Object[] data2 = new Object[cont2];
            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < cont2; j++) {
                    data2[j] = data.get(i).get(j);
                }
                model.addRow(data2);
            }
            this.jTableResenha.setModel(model);
        }
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
        jTableResenha = new javax.swing.JTable();
        jButtonAtrás = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 690));
        setMinimumSize(new java.awt.Dimension(800, 690));
        setPreferredSize(new java.awt.Dimension(800, 690));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        jTableResenha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedido", "Cliente", "Calificación", "Reseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableResenha);
        if (jTableResenha.getColumnModel().getColumnCount() > 0) {
            jTableResenha.getColumnModel().getColumn(0).setMinWidth(80);
            jTableResenha.getColumnModel().getColumn(0).setMaxWidth(80);
            jTableResenha.getColumnModel().getColumn(1).setMinWidth(150);
            jTableResenha.getColumnModel().getColumn(1).setMaxWidth(150);
            jTableResenha.getColumnModel().getColumn(2).setMinWidth(80);
            jTableResenha.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 720, 420));

        jButtonAtrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrásActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtrás, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 70, 90));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PantallaVerResenhasRestaurante.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrásActionPerformed
        // TODO add your handling code here:
        PantallaInicialRestaurante p = new PantallaInicialRestaurante(this.restUser);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAtrásActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaVerResenhasRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaVerResenhasRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaVerResenhasRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaVerResenhasRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaVerResenhasRestaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtrás;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResenha;
    // End of variables declaration//GEN-END:variables
}
