/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import BO.InsumoBO;
import BO.PedidoInsumoBO;
import BO.ProveedorBO;
import Entidades.Insumo;
import Entidades.PedidoInsumo;
import Entidades.Proveedor;
import com.placeholder.PlaceHolder;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Zuukens
 */
public class SolicitarInsumo extends javax.swing.JFrame {

    /**
     * Creates new form SolicitarInsumo
     */
    private PedidoInsumoBO pibo = new PedidoInsumoBO();
    private InsumoBO ibo = new InsumoBO();

    public SolicitarInsumo() {
        initComponents();
        listarInsumo();
        cargarComboInsumo();
        getMaxID();
        cargarComboProveedor();
        activo();
    }

    public void listarInsumo() {
        ibo.listarInsumoCantidad(tbInsumos);
        txtEstado.setEnabled(false);
    }

    public void listarPedido() {
        pibo.listarPedido(tbInsumos);
        txtEstado.setEnabled(true);
    }

    public void getMaxID() {
        txtID.setText(pibo.getMaxID() + "");
    }

    public void activo() {
        txtID.setEnabled(false);
        cboProveedor.setEnabled(true);
        cboInsumo.setEnabled(true);
        txtCantidad.setEnabled(true);
        txtID.setVisible(false);
        txtEstado.setVisible(false);
    }

    public void cargarComboInsumo() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) this.cboInsumo.getModel();
        modelo.removeAllElements();
        ArrayList<Insumo> insu = new ArrayList<Insumo>();
        InsumoBO in = new InsumoBO();
        insu = in.cargarNombreInsumo();
        modelo.addElement("Seleccione");
        for (Insumo temp : insu) {
            modelo.addElement(temp);
        }
    }

    public void cargarComboProveedor() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) this.cboProveedor.getModel();
        modelo.removeAllElements();
        ArrayList<Proveedor> pro = new ArrayList<Proveedor>();
        ProveedorBO prov = new ProveedorBO();
        pro = prov.CargarComboProveedor();
        modelo.addElement("Seleccione");
        for (Proveedor temp : pro) {
            modelo.addElement(temp);
        }
    }

    public Insumo rescatoInsumo() {
        Insumo insu = new Insumo();
        insu = (Insumo) this.cboInsumo.getSelectedItem();
        return insu;
    }

    public Proveedor rescatoProveedor() {
        Proveedor prov = new Proveedor();
        prov = (Proveedor) this.cboProveedor.getSelectedItem();
        return prov;
    }

    public void limpiar() {
        txtID.setText("");
        cboProveedor.setSelectedIndex(0);
        cboInsumo.setSelectedIndex(0);
        txtCantidad.setText("");
    }

    public Boolean validarCantidad() {
        if (txtCantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese Cantidad");
            return false;
        } else if (!txtCantidad.getText().matches("[0-9]{1,20}")) {
            JOptionPane.showMessageDialog(null, "Ingrese Digitos en Cantidad");
            return false;
        } else {
            return true;
        }
    }

    public Boolean validarProveedor() {
        if (cboProveedor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione Proveedor");
            return false;
        } else {
            return true;
        }
    }

    public Boolean validarInsumo() {
        if (cboInsumo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione Insumo");
            return false;
        } else {
            return true;
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

        jPanel1 = new javax.swing.JPanel();
        cboProveedor = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        cboInsumo = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        btnSolicitar = new javax.swing.JButton();
        btnInsumos = new javax.swing.JButton();
        txtEstado = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInsumos = new javax.swing.JTable();
        btnPedidos = new javax.swing.JButton();
        btnAtras2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboProveedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cboProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(cboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 160, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar Pedido.jpg"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar pedido 2.jpg"))); // NOI18N
        btnCancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar pedido 2.jpg"))); // NOI18N
        btnCancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar pedido 2.jpg"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        cboInsumo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cboInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboInsumoActionPerformed(evt);
            }
        });
        jPanel1.add(cboInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 160, -1));

        txtCantidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCantidad.setBorder(null);
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 160, -1));

        btnSolicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Solicitar.jpg"))); // NOI18N
        btnSolicitar.setBorder(null);
        btnSolicitar.setBorderPainted(false);
        btnSolicitar.setContentAreaFilled(false);
        btnSolicitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSolicitar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Solicitar 2.jpg"))); // NOI18N
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        btnInsumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Insumos Chicos.jpg"))); // NOI18N
        btnInsumos.setBorder(null);
        btnInsumos.setBorderPainted(false);
        btnInsumos.setContentAreaFilled(false);
        btnInsumos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsumos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Insumos Chicos 2.jpg"))); // NOI18N
        btnInsumos.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Insumos Chicos 2.jpg"))); // NOI18N
        btnInsumos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Insumos Chicos 2.jpg"))); // NOI18N
        btnInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsumosActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, -1));
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 30, -1));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 30, -1));

        tbInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbInsumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInsumosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbInsumos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 530, 260));

        btnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pedidos Chico 2.jpg"))); // NOI18N
        btnPedidos.setBorder(null);
        btnPedidos.setBorderPainted(false);
        btnPedidos.setContentAreaFilled(false);
        btnPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pedidos Chico.jpg"))); // NOI18N
        btnPedidos.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pedidos Chico.jpg"))); // NOI18N
        btnPedidos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pedidos Chico.jpg"))); // NOI18N
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        jPanel1.add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        btnAtras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atrás.png"))); // NOI18N
        btnAtras2.setBorderPainted(false);
        btnAtras2.setContentAreaFilled(false);
        btnAtras2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atrás 2.png"))); // NOI18N
        btnAtras2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atrás 2.png"))); // NOI18N
        btnAtras2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atrás 2.png"))); // NOI18N
        btnAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 40, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Linda Sonrisa.jpg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 100));

        jLabel26.setBackground(new java.awt.Color(102, 153, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 153, 255));
        jLabel26.setText("Cantidad");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 70, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 100, 10));

        jLabel11.setBackground(new java.awt.Color(102, 153, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 153, 255));
        jLabel11.setText("Pedidos Insumos");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 310, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 160, 10));

        jLabel27.setBackground(new java.awt.Color(102, 153, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 153, 255));
        jLabel27.setText("Linda Sonrisa");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 100, -1));

        jLabel28.setBackground(new java.awt.Color(102, 153, 255));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 153, 255));
        jLabel28.setText("Proveedor");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, -1));

        jLabel29.setBackground(new java.awt.Color(102, 153, 255));
        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 153, 255));
        jLabel29.setText("Insumo");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboInsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboInsumoActionPerformed

    private void cboProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProveedorActionPerformed

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        if (validarProveedor() == false || validarInsumo() == false || validarCantidad() == false) {
        } else {

            PedidoInsumo ped = new PedidoInsumo();

            ped.setId_pedido(Integer.parseInt(txtID.getText()));
            ped.setCantidad(Integer.parseInt(txtCantidad.getText()));
            ped.setEstado("EN CURSO");
            ped.setId_proovedor(rescatoProveedor().getId_proveedor());
            ped.setId_insumo(rescatoInsumo().getId_insumo());
            ped.setNombreInsumo(rescatoInsumo().getNom_insumo());

            String mensaje = pibo.AgregarPedido(ped);
            JOptionPane.showMessageDialog(null, mensaje);

            listarPedido();
            limpiar();
            getMaxID();
        }
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (txtEstado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un pedido en Curso para cancelar");
        } else {
            PedidoInsumo ped = new PedidoInsumo();
            ped.setId_pedido(Integer.parseInt(txtID.getText()));
            ped.setEstado("CANCELADO");

            String mensaje = pibo.modificarEstado(ped);
            JOptionPane.showMessageDialog(null, mensaje);
            listarPedido();
            getMaxID();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        listarPedido();
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumosActionPerformed
        listarInsumo();
    }//GEN-LAST:event_btnInsumosActionPerformed

    private void tbInsumosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInsumosMouseClicked
        if (txtEstado.isEnabled()) {
            int seleccion = tbInsumos.rowAtPoint(evt.getPoint());
            txtID.setText(tbInsumos.getValueAt(seleccion, 0) + "");
            txtEstado.setText(tbInsumos.getValueAt(seleccion, 2) + "");
        } else {
            JOptionPane.showMessageDialog(null, "Solo puede seleccionar Pedidos");
        }

    }//GEN-LAST:event_tbInsumosMouseClicked

    private void btnAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras2ActionPerformed
        MenuInsumos srb = new MenuInsumos();
        srb.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtras2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SolicitarInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitarInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitarInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitarInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolicitarInsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInsumos;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JComboBox<String> cboInsumo;
    private javax.swing.JComboBox<String> cboProveedor;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbInsumos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
