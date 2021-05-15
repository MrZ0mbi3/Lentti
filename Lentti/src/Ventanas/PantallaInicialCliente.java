/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Controlador.consultasBaseDeDatos;
import Modelo.BaseDeDatos;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author samyf
 */
public class PantallaInicialCliente extends javax.swing.JFrame {

    /**
     * Creates new form PantallaInicialCliente
     */
    public PantallaInicialCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciaDelBoton();
    }
    
    public PantallaInicialCliente(String pUsuario) {
        initComponents();
        String usuario = pUsuario;
        L_bienvenidoNombreUsuario.setText(usuario);
        this.setLocationRelativeTo(null);
        mostrarInformacionCliente();
        transparenciaDelBoton();
    }
    
     public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/lentti.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pedidos = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        L_bienvenidoNombreUsuario = new javax.swing.JLabel();
        BotonModificarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA_informacionCliente = new javax.swing.JTextArea();
        BotonCaritoCompra = new javax.swing.JButton();
        BotonBuscarAlgoParaPedir = new javax.swing.JButton();
        jButtonVerRestaurantesFavoritos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pedidos.setBackground(new java.awt.Color(102, 102, 255));
        Pedidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pedidos.setForeground(new java.awt.Color(255, 255, 255));
        Pedidos.setText("Mis Pedidos");
        Pedidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosActionPerformed(evt);
            }
        });
        getContentPane().add(Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 180, 50));

        jButtonCerrarSesion.setBorder(null);
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 23, 200, 60));

        L_bienvenidoNombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        L_bienvenidoNombreUsuario.setText("nombreUsuario");
        getContentPane().add(L_bienvenidoNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 170, 30));

        BotonModificarCliente.setBorder(null);
        BotonModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BotonModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 23, 200, 60));

        TA_informacionCliente.setEditable(false);
        TA_informacionCliente.setColumns(20);
        TA_informacionCliente.setRows(5);
        TA_informacionCliente.setWrapStyleWord(true);
        TA_informacionCliente.setBorder(null);
        jScrollPane2.setViewportView(TA_informacionCliente);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 250, 260));

        BotonCaritoCompra.setBorder(null);
        BotonCaritoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCaritoCompraActionPerformed(evt);
            }
        });
        getContentPane().add(BotonCaritoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 310, 60));

        BotonBuscarAlgoParaPedir.setBorder(null);
        BotonBuscarAlgoParaPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarAlgoParaPedirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBuscarAlgoParaPedir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 310, 60));

        jButtonVerRestaurantesFavoritos.setBorder(null);
        jButtonVerRestaurantesFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerRestaurantesFavoritosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerRestaurantesFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 310, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfilUsuario.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        // TODO add your handling code here:
        this.dispose();
        InicioSesion iniciador= new InicioSesion();
        iniciador.setVisible(true);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void BotonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarClienteActionPerformed
        // TODO add your handling code here:
        
        PantallaModificarCliente pantalla = new PantallaModificarCliente(L_bienvenidoNombreUsuario.getText());
                    pantalla.setVisible(true);
                    this.dispose();
                    
                    
    }//GEN-LAST:event_BotonModificarClienteActionPerformed

    private void BotonBuscarAlgoParaPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarAlgoParaPedirActionPerformed
        // TODO add your handling code here:
        PantallaBusquedaPR pantalla = new PantallaBusquedaPR(L_bienvenidoNombreUsuario.getText());
        pantalla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonBuscarAlgoParaPedirActionPerformed

    private void BotonCaritoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCaritoCompraActionPerformed
        // TODO add your handling code here:
        PantallaCarroCompras pantalla = new PantallaCarroCompras(L_bienvenidoNombreUsuario.getText());
        pantalla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonCaritoCompraActionPerformed

    private void PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosActionPerformed
        // TODO add your handling code here:
        PantallaVerPedidos p = new PantallaVerPedidos(L_bienvenidoNombreUsuario.getText());
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PedidosActionPerformed

    private void jButtonVerRestaurantesFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerRestaurantesFavoritosActionPerformed
        // TODO add your handling code here:
        ListaDeRestaurantesFavoritos lrf = new ListaDeRestaurantesFavoritos(L_bienvenidoNombreUsuario.getText());
        lrf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVerRestaurantesFavoritosActionPerformed


    private void mostrarInformacionCliente()
    {
        //revisar verificar usuario
        consultasBaseDeDatos consulta = new BaseDeDatos();
        ArrayList<String> datosCliente = consulta.darCliente(L_bienvenidoNombreUsuario.getText());
        int tam = datosCliente.size();
        for(int i = 0; i < tam; i++)
        {
            TA_informacionCliente.append(datosCliente.get(i));
            TA_informacionCliente.append("\n");
            
        }
        
    }
    
    public void transparenciaDelBoton()
    {
        BotonBuscarAlgoParaPedir.setOpaque(false);
        BotonBuscarAlgoParaPedir.setBackground(new Color(0,0,0,0));
        
        BotonCaritoCompra.setOpaque(false);
        BotonCaritoCompra.setBackground(new Color(0,0,0,0));
        
        BotonModificarCliente.setOpaque(false);
        BotonModificarCliente.setBackground(new Color(0,0,0,0));
        
        jButtonVerRestaurantesFavoritos.setOpaque(false);
        jButtonVerRestaurantesFavoritos.setBackground(new Color(0,0,0,0));
        
        jButtonCerrarSesion.setOpaque(false);
        jButtonCerrarSesion.setBackground(new Color(0,0,0,0));
    }
    
    
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
            java.util.logging.Logger.getLogger(PantallaInicialCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicialCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicialCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicialCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicialCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscarAlgoParaPedir;
    private javax.swing.JButton BotonCaritoCompra;
    private javax.swing.JButton BotonModificarCliente;
    private javax.swing.JLabel L_bienvenidoNombreUsuario;
    private javax.swing.JButton Pedidos;
    private javax.swing.JTextArea TA_informacionCliente;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonVerRestaurantesFavoritos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
