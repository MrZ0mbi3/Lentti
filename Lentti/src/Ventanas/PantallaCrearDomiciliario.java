/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Controlador.consultasBaseDeDatos;
import Modelo.BaseDeDatos;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author juank
 */
public class PantallaCrearDomiciliario extends javax.swing.JFrame {

    String usuario = "";
    JFileChooser seleccionador;
    File imagen;

    /**
     * Creates new form PantallaCrearDomiciliario
     */
    public PantallaCrearDomiciliario() {
        initComponents();
        this.setLocationRelativeTo(null);
        Transparencia();
    }

    public PantallaCrearDomiciliario(String usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        Transparencia();
        this.usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImagen = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jButtonSeleccionarImagen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDocumento = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldContrasena = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 130, 120));

        jTextFieldCorreo.setBorder(null);
        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 480, 40));

        jButtonSeleccionarImagen.setText("Seleccionar...");
        jButtonSeleccionarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarImagenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSeleccionarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 100, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 50, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 65, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));
        getContentPane().add(jTextFieldDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 480, 40));

        jTextFieldTelefono.setBorder(null);
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 480, 40));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, -1, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 480, 40));

        jTextFieldContrasena.setBorder(null);
        jTextFieldContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 480, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IPantallaCrearDomiciliario.png"))); // NOI18N
        jLabel8.setText("Creación de nuevo domiciliario");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 90, 50));

        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 50));

        jLabel1.setText("Creación de nuevo domiciliario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        PantallaGestionDomiciliarios pantalla = new PantallaGestionDomiciliarios(usuario);
        pantalla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        consultasBaseDeDatos consulta = new BaseDeDatos();
        boolean resultado = false;
        if (this.jTextFieldDocumento.getText().isEmpty() || this.jTextFieldNombre.getText().isEmpty() || this.jTextFieldTelefono.getText().isEmpty() || this.jTextFieldContrasena.getText().isEmpty() || this.seleccionador.getSelectedFile() == null) {
            JOptionPane.showMessageDialog(null, "Hay un campo vacio.");
        } else {
            String documento = this.jTextFieldDocumento.getText();
            String nombre = this.jTextFieldNombre.getText();
            String telefono = this.jTextFieldTelefono.getText();
            String contrasena = this.jTextFieldContrasena.getText();
            String correo = this.jTextFieldCorreo.getText();
            if (!consulta.correoCorrecto(correo)) {
                JOptionPane.showMessageDialog(null, "el correo no es valido");
            } else {
                resultado = consulta.CrearDomiciliario(usuario, documento, nombre, telefono, imagen, contrasena, correo);

                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "El domiciliario se creo correctamente");
                    PantallaGestionDomiciliarios pantalla = new PantallaGestionDomiciliarios(usuario);
                    pantalla.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error, por favor intentelo nuevamente");
                }
            }
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jTextFieldContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContrasenaActionPerformed

    private void jButtonSeleccionarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarImagenActionPerformed
        // TODO add your handling code here:
        this.seleccionador = new JFileChooser();
        this.seleccionador.setMultiSelectionEnabled(false);
        this.seleccionador.setDialogTitle("Buscar Imagen del domiciliario");
        if (this.seleccionador.showOpenDialog(this) == JFileChooser.APPROVE_OPTION && !this.seleccionador.isDirectorySelectionEnabled()) {
            if (this.seleccionador.getSelectedFile().toString().endsWith(".jpg") || this.seleccionador.getSelectedFile().toString().endsWith(".png")) {
                System.out.println("archivo -> " + this.seleccionador.getSelectedFile().toString());
                this.imagen = new File(this.seleccionador.getSelectedFile().toString());
                ImageIcon imagenIcono = new ImageIcon(this.imagen.toString());
                Icon icono = new ImageIcon(imagenIcono.getImage().getScaledInstance(this.jLabelImagen.getWidth(), this.jLabelImagen.getHeight(), Image.SCALE_SMOOTH));
                this.jLabelImagen.setIcon(icono);
            } else {
                JOptionPane.showMessageDialog(null, "No es un formato aceptado, debe ser jpg o png");
            }
        }
    }//GEN-LAST:event_jButtonSeleccionarImagenActionPerformed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Transparencia() {
        jButtonAceptar.setOpaque(false);
        jButtonAceptar.setBackground(new Color(0, 0, 0, 0));
        jButtonCancelar.setOpaque(false);
        jButtonCancelar.setBackground(new Color(0, 0, 0, 0));
    }

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
            java.util.logging.Logger.getLogger(PantallaCrearDomiciliario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCrearDomiciliario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCrearDomiciliario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCrearDomiciliario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCrearDomiciliario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSeleccionarImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JTextField jTextFieldContrasena;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDocumento;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
