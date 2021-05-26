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
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author Acer
 */
public class PantallaPedido extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPedido
     */
    public PantallaPedido() {
        initComponents();
        transparenciaDelBoton();
        this.setLocationRelativeTo(null);
        
        
    }
     public PantallaPedido(String pUsuario) {
       initComponents();
        String usuarioa = pUsuario;
        nusuario.setText(usuarioa);
        this.setLocationRelativeTo(null);
        mostrarInformacionCliente();
        mostrarInformacionPedido();
        transparenciaDelBoton();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nusuario = new javax.swing.JLabel();
        resumen = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        direccion = new javax.swing.JTextField();
        jCheckBoxefectivo = new javax.swing.JCheckBox();
        inforest = new javax.swing.JLabel();
        restaurante = new java.awt.TextArea();
        usuario = new javax.swing.JTextField();
        costo = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        envio = new javax.swing.JLabel();
        jCheckBoxTarjetaLentti = new javax.swing.JCheckBox();
        jCheckBoxTarjeta = new javax.swing.JCheckBox();
        Fondo = new javax.swing.JLabel();
        BotonModificarDireccionCliente = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nusuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(nusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 270, 30));

        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        descripcion.setRows(5);
        resumen.setViewportView(descripcion);

        getContentPane().add(resumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 410, 70));

        direccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 380, 50));

        jCheckBoxefectivo.setText("Efectivo");
        jCheckBoxefectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxefectivoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxefectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 80, 20));

        inforest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(inforest, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 230, 30));

        restaurante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(restaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 320, 30));

        usuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 260, 40));

        costo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 180, 50));

        total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 210, 20));

        envio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(envio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 190, 50));

        jCheckBoxTarjetaLentti.setText("Tarjeta Lentti");
        jCheckBoxTarjetaLentti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTarjetaLenttiActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTarjetaLentti, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 90, 30));

        jCheckBoxTarjeta.setText("Tarjeta");
        getContentPane().add(jCheckBoxTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PedidoPro.png"))); // NOI18N
        Fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FondoMouseClicked(evt);
            }
        });
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BotonModificarDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarDireccionClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BotonModificarDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 50, 60));

        confirmar.setBackground(new java.awt.Color(204, 204, 255));
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 370, 60));

        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 120, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
//Confirmar pedido
        consultasBaseDeDatos consulta = new BaseDeDatos();
        float precio = consulta.darCostoEnvioRest(restaurante.getText());
                precio += Float.parseFloat(costo.getText());  
        int id;
        boolean metodoPagoAceptado = false;
        if( !(jCheckBoxTarjeta.isSelected() || jCheckBoxTarjetaLentti.isSelected() || jCheckBoxefectivo.isSelected()))
        {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado un método de pago");
        }
        else if( (jCheckBoxTarjeta.isSelected() && jCheckBoxefectivo.isSelected()) || (jCheckBoxTarjeta.isSelected() && jCheckBoxTarjetaLentti.isSelected()) || (jCheckBoxTarjetaLentti.isSelected() && jCheckBoxefectivo.isSelected()) || (jCheckBoxTarjeta.isSelected() && jCheckBoxTarjetaLentti.isSelected() &&jCheckBoxefectivo.isSelected() ) )
        {
            JOptionPane.showMessageDialog(null, "Solo se puede seleccionar un medio de pago");
        }
        else
            metodoPagoAceptado = true;
        if(metodoPagoAceptado)
        {
            if ( consulta.CrearPedido(nusuario.getText(), "0", precio , "en curso"))
            {                
                JOptionPane.showMessageDialog(null, "Se recibió tu pedido");
                id = consulta.DarIdPedido(nusuario.getText()); //Tengo el ID
                restaurante.getText(); //Tengo el nombre del restaurante         
                ArrayList<String> datosCarrito = consulta.darCarroCompras(nusuario.getText());
                for(int i=0;i<datosCarrito.size();i++)
                {
                    String[] nr = datosCarrito.get(i).split(",");
                    int q = (int) consulta.darCantidad(nusuario.getText(), nr[0], nr[1]);
                    float costo = consulta.darPrecioPlato(restaurante.getText(),nr[1]);
                    consulta.CrearPxP(id,nr[0],nr[1],q,costo);    
                    System.out.println(id + nr[0] + nr[1] + q + costo);
                }
                PantallaVerPedidos vp = new PantallaVerPedidos(nusuario.getText(),restaurante.getText()); 
                vp.setVisible(true);
                this.dispose();
            } else 
            {
                JOptionPane.showMessageDialog(null, "No se ha podido crear tu pedido");
            }
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void jCheckBoxefectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxefectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxefectivoActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void FondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FondoMouseClicked

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void BotonModificarDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarDireccionClienteActionPerformed
 consultasBaseDeDatos consulta = new BaseDeDatos();
 ArrayList<String> datosCliente = consulta.darCliente(nusuario.getText());
 
        if(consulta.ModificarDireccionCliente(nusuario.getText(), direccion.getText()))
        {                    
            JOptionPane.showMessageDialog(null, "Se modifico la dirección del cliente con exito");
            mostrarInformacionCliente();
        }
       
      
    }//GEN-LAST:event_BotonModificarDireccionClienteActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        PantallaClienteInicio pantalla = new PantallaClienteInicio(nusuario.getText());
        pantalla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void jCheckBoxTarjetaLenttiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTarjetaLenttiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxTarjetaLenttiActionPerformed
  public void transparenciaDelBoton(){
       atras.setOpaque(false);
       atras.setBackground(new Color(0,0,0,0));
       confirmar.setOpaque(false);
       confirmar.setBackground(new Color(0,0,0,0));
       BotonModificarDireccionCliente.setOpaque(false);
       BotonModificarDireccionCliente.setBackground(new Color(0,0,0,0));
       direccion.setOpaque(false);
       direccion.setBackground(new Color(0,0,0,0));
       
       
  }
  private void mostrarInformacionCliente()
    {
        consultasBaseDeDatos consulta = new BaseDeDatos();
       ArrayList<String> datosCliente = consulta.darCliente(nusuario.getText());
            usuario.setText("Recibe: " + datosCliente.get(0) + " " + datosCliente.get(1));
            usuario.setEditable(false);
            direccion.setText(datosCliente.get(2));
            direccion.setEditable(true);

                    
    }
  private void mostrarInformacionPedido()
    {
               consultasBaseDeDatos consulta = new BaseDeDatos();
        ArrayList<String> datosCarrito = consulta.darCarroCompras(nusuario.getText());
        
        String[] nrestaurante = datosCarrito.get(0).split(","); // Separar por ","
        restaurante.setText(nrestaurante[0]); //Nombre del restaurante
        float presio = 0;
        envio.setText(String.valueOf(consulta.darCostoEnvioRest(restaurante.getText())));
        inforest.setText(consulta.darDireccionRest(restaurante.getText()));
        descripcion.append(consulta.darDescripcionPlato(nrestaurante[0], nrestaurante[1]));
        String cantidad = String.valueOf(consulta.darCantidad(nusuario.getText(), restaurante.getText(), nrestaurante[1]));
      
        descripcion.append(" cantidad " + cantidad + "\n");
        presio += calcularCosto(nrestaurante[0], nrestaurante[1]);
      
                 
     
for(int i=1;i<datosCarrito.size();i++){
String[] nr = datosCarrito.get(i).split(",");
if(nrestaurante[0].equals(nr[0])){
        descripcion.append( consulta.darDescripcionPlato(nr[0], nr[1]));
        descripcion.append(" cantidad " + String.valueOf(consulta.darCantidad(nusuario.getText(), nr[0], nr[1])) + "\n" );
        presio += calcularCosto(nr[0],nr[1]);
}
    
}

        costo.setText(String.valueOf(presio));

        restaurante.setEditable(false);
        descripcion.setEditable(false);
        direccion.setEditable(true);
        
    }
   
   
   
  
  private float calcularCosto(String rest, String plato){
      
          consultasBaseDeDatos consulta = new BaseDeDatos();
       float cantidad = consulta.darCantidad(nusuario.getText(), rest, plato);
       float pPlato = consulta.darPrecioPlato(rest, plato);
        float pTotal = (pPlato*cantidad);// Cantidad de items * Precio.
        return pTotal;
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
            java.util.logging.Logger.getLogger(PantallaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonModificarDireccionCliente;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton atras;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel costo;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField direccion;
    private javax.swing.JLabel envio;
    private javax.swing.JLabel inforest;
    private javax.swing.JCheckBox jCheckBoxTarjeta;
    private javax.swing.JCheckBox jCheckBoxTarjetaLentti;
    private javax.swing.JCheckBox jCheckBoxefectivo;
    private javax.swing.JLabel nusuario;
    private java.awt.TextArea restaurante;
    private javax.swing.JScrollPane resumen;
    private javax.swing.JLabel total;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
